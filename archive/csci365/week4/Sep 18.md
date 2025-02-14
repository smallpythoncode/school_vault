# Lexical and Syntax Analysis

A syntax analyzer utilizes tokens (somehow)

Lexical analyzer feeds into syntax analyzer

Chapter 4 shit

# Syntax Analysis
- syntax analysis portion of a lang. processor nearly always consist of two parts
	- lexical analyzer (scanner) - a low-level part
		- mathematically, a Finite Automaton based on Regular Grammar
	- syntax analyzer (parser) - high level
		- mathematically, a Push-Down Finite Automaton based on Context-Free Grammar in BNF
	- This is CSCI 435 shit apparently

Advantages of BNF in describing Syntax
- provides a clear and concise syntax description
- the parser can be based directly on the BNF
- parsers based on BNF are easy to maintain

# Why separate Lexical and Syntax analysis
- lower vs higher parts
- simplicity
	- less complex approaches can be used for lexical
- efficiency
	- separation allows optimization of the lexical analyzer requires a significant portion of the total compilation time
		- divide and conquer
- portability

# Lexical analysis (Scanner)
- a pattern matcher for character strings
	- a front-end for the parser
	- identifies substrings of the source program that belong together - lexemes
	- Lexemes match a character pattern, which is associated w/ a lexical category called a `token`
- A function that is called by the parser when it needs the next token
- Three approaches to build one
	- (this class) design a state (transition) diagram that describes the tokens and write a program that implements the state diagram
- In many cases, transitions can be combined to simplify the state diagram
- Reserved words and identifiers can be recognized together 
	- use a table lookup
- Utility subprograms
	- getChar (examples for program var that can be used to evaluate)
	- addChar
	- lookup
		- determines the token code

So does this look at the tokens (letters, etc) that make up lexemes (words) ?

# State Diagram Design
- a directed graph to represent a transition function
- a naive state diagram would have a transition from every state on a every char. in the source lang.
- Recall Discrete Maths
- Finite Automata (FA)
- the tokens of a lang. are a regular language (written in real words)
- the lexical analyzer is an FA
















