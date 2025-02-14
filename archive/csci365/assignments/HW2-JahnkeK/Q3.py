"""
Kenneth Jahnke

0808831

CSCI 365 - Organization of Programming Languages

Fall 2024

Assignment 2 - Question 4

Task:
    Write a Python program to test the code to implement the state diagram of
    Q1. Test your program with the following inputs and give the outputs.

Notes:
    - Regarding note stating "Refer to the codes in 'front.c' that identify the
      identifiers and integer literals": These codes were deemed to have poor
      applicability for this assignment. Custom globals were declared to
      specify the beginning and end of comments.
    - Implementation assumes that the only inputs into the program are the ones
      specified in the assignment instructions. There is exception handling to
      cover any input not specified in the assignment instructions.


"""

# RETURN STRINGS
COMMENT = "COMMENT"
SLASH_CODE = "SLASH CODE"

# COMMENT_LEXEMES
COMMENT_START = "/*"
COMMENT_END = "*/"


def test_cases(comment_cases):
    case_verdicts = {}

    for case in comment_cases:
        case_verdicts[case] = COMMENT

        if case[:2] != COMMENT_START:
            case_verdicts[case] = SLASH_CODE
            continue

        else:
            i = 2  # start of scan index after valid comment
            close_comment = False
            close_comment_index = 2
            overreach = False
            while i < len(case):
                if case[i:i + 2] == COMMENT_END:
                    close_comment = True
                    close_comment_index = i + 1
                    i += 2
                    continue
                if i > close_comment_index and close_comment:
                    overreach = True

                i += 1

            if not close_comment:
                case_verdicts[case] = SLASH_CODE

            if overreach:
                case_verdicts[case] = SLASH_CODE

    return case_verdicts


def print_verdicts(case_verdicts):
    header_a = "COMMENT"
    a_width = len(header_a)
    header_b = "RETURN"
    b_width = len(header_b)

    comments = case_verdicts.keys()
    for c in comments:
        if len(c) > a_width:
            a_width = len(c)
    verdicts = case_verdicts.values()
    for v in verdicts:
        if len(v) > b_width:
            b_width = len(v)

    total_width = a_width + b_width + 3

    print(f"{header_a:<{a_width}}" + " | " + f"{header_b:>{b_width}}")
    print("=" * total_width)
    for k, v in case_verdicts.items():
        print(f"{str(k):<{a_width}}" + " | " + f"{str(v):>{b_width}}")


if __name__ == '__main__':
    cases = [
        "/* this is a comment */",  # correct
        "// this is a comment //",  # incorrect
        "// this is a comment */",  # incorrect
        "/* this is a comment /*",  # incorrect
        "*/ this is a comment */",  # incorrect
        "*/ this is a comment */",  # incorrect, double
        "/* this is a */ comment */"  # incorrect
    ]

    print_verdicts(test_cases(cases))
