# Arrays

## Heterogeneous
- a hetero. array is one in which the the elements need not be of the same type
	- homo. -> single data type
- The elements are all references to data objects that reside in scattered locations, often on the heap
- Python, Ruby

## Initialization
Some langs. allow init. at the same time as storage allocation

## Operations
- assignment, catenation, comparison
- specific ops. avail. are base on lang.

### Rectangular array
- multi-dimensional array in which all the rows have the same number of elements and all columns have the same num. of elements

### Jagged array
- on that has rows w/ varying number of elements
- possible when multi-dimensional arrays actually appear as arrays of arrays

### Slices
- some substructure of an array; a referencing mechanism
- only useful in langs. that have array ops.

## Associative arrays
- an unordered collection of data elements are indexed by an equal num. of values called keys
	- user defined keys must be stored
		- key : element
		- dicts in Python
			- 3.7+ - ordered
			- up to 3.6 - unordered

# Record types
- a possibly heterogeneous aggregate of data elements in which the individual elements are identified names
- `literally never heard of this type before`
- `what the fuck is an elliptical reference`
	- What is ref #42? (from her slides) a page num?
- C, C++ equivalent is `struct`
	- C++ -> `class`
	- `struct` : public :: `class` : private

# Records vs. Arrays
Records
- when a collection of data values is heterogeneous
Arrays
- homogeneous

Access to array elements is much slow because subscripts are dynamic
Access to record fields is faster - field names are static












