# Parse tree
- hierarchical representation of derivation

# Ambiguity in Grammars
A grammar is ambiguous if an only if it generates a sentential form that has two or more distinct parse trees

# An Unambiguous Expression Grammar
if we use the parse tree to indicate precedence levels of the operators, we cannot have ambiguity

Derivation w/ unambiguous grammar results in a unique parse tree

# Associativity of Operators
Associativity - A semantic rule to specify which operator should have precedence when an expression includes two operators that have the same precedence
- correct associativity may be essential

## Left Recursive Rule vs Right Recursive Rule
LRR specifies left associativity
RRR specifies right "
- exponentiation, as an example

Parentheses are important

Operative associativity can also be indicated by grammar

# Unambiguous grammar for if-else
- Rules for unambiguous grammar for if-else
	- an `else` clause, when present, is matched w/ the nearest previous unmatched `then` clause
	- So, there can't be an `if` statement w/out an else between `then` clause and its matching `else`








