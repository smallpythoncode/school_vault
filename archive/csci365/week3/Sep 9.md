Chapter 3 - Describing Syntax and Semantics

Syntax - form and structure
Semantics - the meaning of the expressions, statements, and program units

These two items provide a lang.'s definition

# Terminology
Sentence - a string of chars. over some alphabet
Language - a set of sentences
Lexeme - the lowest level syntactic unit of a lang.
- E.g., sum, begin, asterisk
Token - a category of lexems (e.g., identifier)
- index = 2 * count + 17;

# Formal Definitions of Languages
## Three viewpoints
- computing model that recognizes the language
- Grammar
- Lang. Category

Recognizers (for Regular Language)
- a computing device that reads input strings over the alphabet of the lang. and decides whether the input strings belong to the lang
	- The whole topic of CSCI 435
Generators
- a device that generates senteces of a lang
- it can decide if the sintax of  sentest si syntactically correct
-

alphabet -  a set of symbols
string - a finite sequence of symbols
operations of strings
- concatenation, revers, repetition

sigma asterisk - a set of all strings formed

A string in a lange is also called a sentence of the lang.

# Grammar
- a rule to describe the strings in a lang
- A Grammar G is defined as G = (V, T, S, P)
	- V: a finite set of variable or non-terminal symbols
	- T: a finite set of terminal symbols
	- S: A variable called the start symbol
	- P: A finite set of rules (aka productions)

sentential - a string of terminals

Two grammars are logically equivalent if they generate the same language

# Application
The syntax of constructs in a lang. is described w/ grammar
- Assume that in a hypothetical a lang
	- identifiers consists of digits and letters
	- identifiers must begin w/ a letter

# Formal Methods of Describing Syntax
## Context-Free Grammar
- Developed by Noam Chomsky in the mid 50s

##  Backus-Naur Form
- a notation for describing syntax
- a metalanguage for programming langs.
- abstractions are used to represent syntactic structures
- Terminals
	- lexemes or tokens
- Non-terminals
	- syntactic variable, often enclosed `< >`
- Start symbol - a special element of the nonterminals of a grammar

### Describing lists
syntactic lists are described using recursion
- a derivation is a repeated application of rules, starting with the start symbol and ending a sentence

`Why do I give a shit about derivations?`

Derivations are either leftmost or rightmost
- okay...

For every variable, there must be a rule that defines the variable
- something something parse tree

