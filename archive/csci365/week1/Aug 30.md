# Evaluation Critiera: Others
Portability
- The ease w/ which programs
- ISO Global standards
Generality
Well-definedness
Computer architechture
- von Neumann architechture
	- CPU: ALU + Control unit
	- Memory
	- Input/Output devices
- Future -> Quantum architecture

## Computer Architecture Influence
Von Neumann
Imperative langs., most dominant, because of VN
- Data and programs stored in mem.
- Mem. separate from CPU
Fetch-Execute cycle

### Assembly
A textual human-understandable rep. of a machine langs. 0s and 1s

### High-Level langs.
Fortran - first
higher level instructions than assembly, enabling greater productivity
Compiler - converts high-level to assembly

# Language Categories
Imperative
- Central features
	- variables
	- assignment statements
	- iteration
- procedure-oriented
- Include languages that support object-oriented programming
- includes scripting languages
- includes visual languages

Object-Oriented
- An object consists of some internal data items plus operations that can be performed on that data
- supports decomposing a program into objects

Functional
- main means of making computations is by applying functions to given parameters
- This class will dip into Scheme

Logic
- rule-based
	- designed for inference w/ knowledge in the form of rules
	- Rules in no particular order
		- the lang. implementation must choose an order in which the rules are used to produce the desired result
- Used in AI (some)
- Example: Prolog

Markup/programming hybrid
- a markup language allows a dev. to describe a document's content, desired formatting, and other features
	- HTML
- extended support to some programming

# Language Design Trade-Offs
Reliability vs Cost of Execution

Readability vs. Writeability

Writability (flexibility) vs. Reliability

# Implementation Methods
Compilation
- programs are translated into machine code
- slow translation but fast execution
- includes just-in-time (JIT) systems
	- "delayed compiler"
- Use: Large commercial applications

Pure Interpretation
- interpreted by another program (interpreter)
- No translation - slow execution
- easier implementation of programs
- becoming rare
- Use: small programs or when efficiency is not an issue

Hybrid
- a compromise between compilers and interpreters
- a high-level lang. program is translated to an intermediate lang. that allows easy interpretation
- small translation cost
- Use: small and medium systems when efficiency is not the first concern

## Compilation
Lexical analysis
- converts characters into lexical units - identifiers, operators, etc
Syntax analysis
- transforms lexical units into parse trees which is a hierarchical syntactic structure
Semantics analysis
- generates intermediate code and checks errors that could be detected in syntax analysis
Code generation

## additional terms
- load module
- linking (and loading) -> loader

VN Bottleneck
- connection speed between a computer's mem. and CPU determines the speed of the computer
- program instructions often can be executed much faster than the speed of the connection; the connection speed thus results in a bottleneck

## Memory hierarchies
registers
- closest to cpu, very fast, but relatively few in number
cache
RAM (internal memory)
external (drives)
network (cloud) storage

Preprocessors
- commonly used to specify that code from another file is to be included







