# Extended BNF
- Extend BNF to handle a few minor inconveniences
- Optional parts are placed in brackets `[ ]`
- Alternative parts of RHSs are placed inside parentheses `( )` and separated via vertical bars `|`
- Repetitions (0 or more) are placed inside braces `{ }`

- Some variants in EBNF (CSCI435)
	- Look at it then i guess?

# Semantics

# Static Semantics: Motivation
- nothing to do w/ the meaning of programs; it has to do w/ the syntax rather than semantics
- categories of constructs that are in trouble
	- context-free, but cumbersome
		- type compatibility of operands in expressions
	- non-context-free
		- variables something something

## Rules
- okay...

# Attribute Grammars
- She's skipping this...so why is there a slide?
- Wait...she says she's going to skip yet she's elaborating what's on the slide? I don't like this teacher

# Dynamic Semantics
- describing the semantics - the meanings of the program
- needs for a methodology and notation for semantics
	- programmers need to know what statements mean
	- compiler writers must know exactly what lang. constructs do
	- language designers could detect ambiguities and inconsistencies
- Scheme (FL) - one of the only few langs. whose definition includes a formal semantics descriptions

# Axiomatic Semantics
- the most abstract way of the semantics specification
	- specify what can be proven about the program
- based on formal logic, predicate calculus
- original purpose: formal program verification
	- prove the correctness of the program/statement
- Precondition
	- an assertion before a statement
- Postcondition
	- an assertion following a statement
		- no shit?
- The weakest (least restrictive) precondition is the least restrictive precondition that will guarantee the postcondition

# Program Proof Process
- the postconditionn for the entire program is the desired result of the program
	- work back through the program to first statement
	- if the precondition on the first statement is the same as the program specification, the program is correct
- inference rule
	-  a method of inferring the truth of one assertion (consequent) on the basis of the values of other assertions (antecedent)
	- Axiom: a logical statement that is assumed to be true; an inference rule w/o an antecedent

`Look up the Rule of Consequence`

A postcondition can always be weakened and a precondition can always be strengthened

There are a number of axioms in the slides...use them, I guess




