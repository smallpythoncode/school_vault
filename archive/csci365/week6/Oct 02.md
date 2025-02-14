`https://www.tutorialspoint.com/fsharp`

`static scoping (?) begin`
Take care w/ use of global vars.

C/C++ `extern`
C++ `::varName`
- what is the difference?

Python
- `global`
- `nonlocal`
	- a keyword used to work w/ vars. inside nested functions, where the var. should not belong to the inner function
` static scoping end`

# Dynamic Scope
- Based on calling sequences of program units, not their textual layout (temporal vs. spatial)
- So, the scope can be determined only at run time
- References to vars. are connected to declarations by searching back through the chain of subprogram calls that forced execution to this point, i.e., through dynamic ancestors

- The search process begins w/ static scoping in the local declaration. If it fails, search the dynamic parent or calling f^n

## Disadvantages
- while a sub-program is active, its vars. are visible to  all subprograms it calls
- decreases readability

## Advantages
- convenient

# Scope and Lifetime
Closely related, but distinct concepts
- a var is statically bound  to storage and statically bound to the scope of the function
- its lifetime extends over the entire execution of the program of which it is part

# Referencing Environments
The collection of all names that are visible in the statement
- a subprogram is *active* if its execution has begun but has not yet been terminated

## Static-scoped
{local vars plus all visible vars. in all of its ancestors}

## Dynamic-scoped
{local vars plus all visible vars. in all active subprograms}

## Named Constants
A named constant is a var. that is bound to a value only once
- used to parameterize programs
- intended to not be changed
		- the bindings of values to a named constant can be either static (called manifest constant) or dynamic

how does `const` differ from `#define`

Java -> `final`

# Var. Initialization
- The binding of a var. to a value at the time it is bound to storage is called initialization
- often done on the declaration statement that creates it
- Static binding
	- binding and itit. done before run time
- Dymamic
	- dynamic binding = dynamic initialization










