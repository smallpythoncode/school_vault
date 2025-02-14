Intro to course

Concepts! the purpose of the class

A request for a late submission must be made 24 hours in advance
- requires approval of instructor

# Chapter 1 - Preliminaries
- Why do we study concepts of programming languages
- Domains
- Language evaluation criteria
- Influences on Language Design
- Categories

## Why do we study concepts of prog. langs.?

## Domains
- scientific
	- Fortran
- business
	- COBOL
- AI
	- LISP
- systems programming
	- C
- web software
	- HTML, PHP
	- Front-end
		- Browser
	- Back-end
		- Web server
		- Database

## Language Evaluation Criteria
Readability
- the most important criterium
Writeability
- the easew/ which the lang. can be used to create progs.
Reliability
- conformance to specifications under all conditions
Cost
- the ultimate total cost

### Readability
Overall simplicity
- a manageable set of features and constructs - too many is bad
- minimal feature multiplicity
- minimal operator overloading: e.g.) +
	- What is the rule of + in what context? adding strings or numbers
Orthogonality
- a relatively small set of primitive constructs can be combined in a relatively small number of ways to build the control and data structures of language
- Every possible combo. is legal/meaningful
- The more orth. the design, the few exceptions the lang. requires
Syntax considerations
- `static` - meaning depends on the context of it appearance
- created at compile time
- non-exportable
Writeability
- Support for abstractions
	- The ability to define and use complex structures or ops. in ways that allow details to be ignored
- Expressivity
	- A set of relatively convenient ways of specifying ops.
		- Count++ (C)
Reliability
- Type checking
	- testing for type errors at compile or run time
- Exception handling
	- Intercept run-time errors, take corrective measures, then continue
		- `try`, `except`
- Aliasing
	- Presence of two or more distinct referencing methods for the same memory location
Cost
- Training
- Testing
- Writing
- Execution (hardware)
- Maintenance


