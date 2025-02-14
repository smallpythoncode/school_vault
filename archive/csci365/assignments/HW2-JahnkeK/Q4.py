"""
Kenneth Jahnke

0808831

CSCI 365 - Organization of Programming Languages

Fall 2024

Assignment 2 - Question 4

Task:
    Implement the lexical analyzer to handle the short program below. Write it
    in Python or in Java – not in C because its codes are available in the
    textbook. Input file: a program below.

```

input(a)\n
input(b)\n
input(c)\n
total = a + b + c /* get a sum of three inputs */\n
average = total / 3 /* compute an average */\n
print(total)\n
print(average)\n

```

Notes:
    - It is assumed that there are newline characters at the end of each line.
    - Use of a proper lookup table mechanism (say, a dictionary) was decided
      against given the specific input file within assignment instructions.
      `LOOKUP_TABLE` in the below comment was used merely as a reference.
    - Lexemes absent from the input file specified in the assignment
      instructions were not accounted for (e.g., `-`, `%`, `>=`).
    - It is assumed identifiers start with an alphabetic character and contain
      only alphanumeric characters afterward.
    - It is assumed (based on input file specified in assignment instructions)
      will be used as lexemes for `<number>` tokens. Input of floating point
      numbers, negative numbers, and floating point numbers greater than negative
      one and less than one without a leading zero (e.g., '-.2', '.69') is
      possible, but not implemented in this program's version.



"""

"""
# Unused - for reference only
# token: lexeme
LOOKUP_TABLE = {
    "input": "input",
    "id": "",  # placeholder for token only
    "lparen": "(",
    "add_op": "+",
    "comment": "",  # placeholder for token only --> "/* */"
    "output": "print",
    "number": "",  # placeholder for token only --> [420, 6.9]
    "rparen": ")",
    "mult_op": "/",
    "error":  "",  # placeholder for token only
    "assign_op": "="
}
"""


def tokens_lexemes(ifs):  # input file string
    i = 0
    while i < len(ifs):
        if str.isspace(ifs[0]):
            i += 1
            continue

        if ifs[i:i + 2] == "/*":
            comment_start_i = i
            i += 2
            while i < len(ifs) and ifs[i:i + 2] != "*/":
                i += 1
            comment_end_i = i + 1
            comment = ifs[comment_start_i:comment_end_i + 1]
            print(f"<comment>, {comment}")
            i += 2
            continue

        if str.isalpha(ifs[i]):
            alpha_start_i = i
            while i < len(ifs) and str.isalnum(ifs[i]):
                i += 1
            target = ifs[alpha_start_i:i]
            if target == "input":
                print(f"<input>, input")
            elif target == "print":
                print(f"<output>, print")
            else:
                print(f"<id>, {target}")
            continue

        if str.isdigit(ifs[i]):
            num_start_i = i
            while i < len(ifs) and str.isdigit(ifs[i]):
                i += 1
            num = ifs[num_start_i:i]
            print(f"<number>, {num}")
            continue

        if ifs[i] == "=":
            print(f"<assign_op>, =")
            i += 1
            continue

        if ifs[i] == "+":
            print(f"<add_op>, +")
            i += 1
            continue

        if ifs[i] == "/":
            print(f"<mult_op>, /")
            i += 1
            continue

        if ifs[i] == "(":
            print(f"<lparen>, (")
            i += 1
            continue

        if ifs[i] == ")":
            print(f"<rparen>, )")
            i += 1
            continue

        i += 1


if __name__ == '__main__':
    input_file = (
        "input(a)\n"
        "input(b)\n"
        "input(c)\n"
        "total = a + b + c /* get a sum of three inputs */\n"
        "average = total / 3 /* compute an average */\n"
        "print(total)\n"
        "print(average)\n")

    tokens_lexemes(input_file)
