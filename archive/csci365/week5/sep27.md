Chapter 5
names, bindings, and scopes

imperative langs are abstractions of von Neumann architechture
- memory
- processors

Variable
- an abstraction of a mem. cell (ch 1 pg 20)
- characterized as a sextuple of attributes
    - name
    - address
        - Where is memory
    - value
    - type
    - lifetime
    - scope

to design a type, consider
- scope
- lifetime
- type checking
- initialization
- type compatibility

Name = identifier

Design considerations
- max lenght
- case sensitivity
- special words/reserved words/keywords
    - if, while, etc

lenght
- if too short, cannot be connotative

Names by lang
PHP - vars must begin w/ dollar sign
Perl - names begin with a special chars to indicate type ($, @, %)

Casing
- camel case, underscore sep
    - often just a matter of style


Case sensitivity
- disadvantage
    - readability


Keyword - a word that is special only in special contexts
Reserved words - cannot be used as a user-defined name
- cannot be redefined

Variables
- abstraction of a (collection of) memory cell(s)
- characterized by the sextuple

Address (L-value) - the mem address w/ which it is associated
- may have different addresses at diff. times during execution
- aliases
    - mult. var. names can be used to access the same mem. location
    - harm readability

Type
determines the range of values of vars. and the set of ops
- in floating point, type also determines the precision

Value (R-value)
- the contents of the location w/ which the var is associated
- !!! L-value is the address
- !!! R-value is the value

Binding
- an association between an entity and an attibute, such as between a var and its type or value, or between operator and a symbol
- significant in chronological terms in process
    - load time, compilation, load, etc

Binding time
- the time at which a binding takes place

Example
```
int count
count = count + 5
```
type of count is bound at compile time
the value of count is bound at run time
rep of literal 5 is bound at design time

Static vs Dynamic Binding
- A binding is *static* if it first occurs before run time and remains unchanged throughout program execution
    - during compilation, doesn't change during running
- a binding is *dynamic* if it first occurs during execution or can change during the exec. of the program
    - var value update

## Type Binding
How is a type specified?
When does it take place?
If static, the type may be specified by either an explicit or an implicit delcaration

### Explicit declaration
- a program statement used for declaring the types of vars.
- e.g., int count
	- C#, C, Fortran

### Implicit declaration
- a default mechanism for specifying types of vars through default naming conventions, rather than declaration statements
- done either by a compiler or an interpreter
- both explicit and implicit declarations create static bindings to types

### Type inference
- an implicit type declaration using context to determine types of vars.
- C#: a var can be declared w/ var and an initial value
	- `var total = 0.0; var name = "Fred"`

## Dynamic type binding
- Python, JavaScript
- specified through an assignment statement
- C#: `dynamic` reserved word

## Variable attributes
- Storage bindings and Lifetime
	- Allocation: getting a cel from some pool of avail. cells
	- Deallocation: putting a cell back into the pool
- the lifetime of the var.
	- the time during which it is bound to a particular mem. cell

### Static var. lifetime
- bound to mem. cells before execution begins and remains bound to the same mem. cell throughout execution

## Memory Management
- allocation
	- how they must be arranged in mem.
	- how much time they may remain
	- which auxiliary structures are required to fetch info. from mem.
- low-level abstract machine -> simple & static
- high-level lang -> complicated & dynamic
- stack vs. heap

### Static MM
- performed by a compiler before the execution
	- st. allocated mem. objects reside in a fixed zone of mem. and they remain there for the entire duration of execution






