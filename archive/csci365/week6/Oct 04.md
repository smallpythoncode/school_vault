Data Types

A data type defines a collection of data objects and a set of predefined operations on those objects
A descriptor is the collection of the attributes of a var.
An object represents and instance of a user-defined (abstract data) type
Design issue:
- What ops. are defined and how are they specified?

# Primitive Data Types
Those not defined in terms of other data types
- integer, float-point

## Integer
Almost always an exact reflection of the hardware so the mapping is trivial
- There may be as many as eight different integer types in a lang.

## floating point
models real numbers, but only as approximations
- float (4 byte)
- double (8 byte)
- IEEE Floating-Point standard format 754 format
	- single-precision (32 bits)
	- double-precision (64 bits)

## Comlex
- some langs. support a complex type
	- C99, Fortran, Python
- Each value consists of two floats
	- A real part + an imaginary part
- Python example
	- (7 +3i)
		- 7 is real part
		- 3 is the imaginary part

## Decimal
For business applications
- essential to COBOL
Stores a fixed number of decimal digits w/ the implied decimal point at a fixed position in the value, in coded form (BCD - Binary coded decimal)
- supports up to 29 significant digits

## Boolean
simplest of all
- 1 - true
- 0 - false
- Could be implemented as bits, but often as bytes

## Character
- stored as numeric codings
	- most commonly ASCII
		- 7-bit coding
- alternative
	- Unicode (UCS-2)
		- 16-bit coding
	- 32 bit unicode (UCS-4)

## Character String Types
- Values are sequences of characters
- Design issues
	- Is it a primitive or just a special kind of array?

### Operations
Typical ops.
- assignment and coding
- comparison
- sub-string reference (slicing)
- pattern matching
	- lexical analysis

### Implementation
- Static length
	- compile-time descriptor
- limited dynamic length
	- may need a run-time descriptor for length
- dynamic
	- needs run-time descriptor
	- allocation/dealloc. is the biggest implementation problem

#### 3 approaches to dynamic (de)allocation
1. linked lists
2. store them ass arrays of pointers to indiv. chars. allocated in the heap
3. store complete strings in adjacent storage cells (expensive)

## enumeration type
- A data type in which all poss. values, which are named constants, are provided/enumerated in the definition.
	- a way of defining and grouping collections of named constants - enumeration constants
- a lang. w/ no enumeration type, they are simulated /w integer values (indexes of arrays)

## Array types
- a homogeneous aggregate of data elements in which and individual element is identified by its position (index) in the aggregate, relative to the first element
- individual data elements are of the same type
	- Do they have to be, though?
### indexing 
- aka subscripting
- a mapping from indices to elements
- typically indexes are integer types
- range checking
	- C, C++, Fortran do not specify range checking
	- Java does
		- Doesn't Python










