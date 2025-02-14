# Memory Management
## Dynamic mem. management, or heap
w/ fixed-lenght block
- the heap is divided into a certain number of blocks of small fixed length, linked into a list structure called the free list
    - linked list
- allocation
- deallocation
    - the freed block is linked to the head of the head of the free list

# Stack-Dynamic variable
storage bindings are createc when the var decl. statements are elaborated but whose types are statically bounded
- the storage alloc. & binding process indicated by the declaration during the run time
- vars ar allocated from the run-time stack
- the default for defined vars. in methods in Java, C++
- type binding is static
    - storage binding is dynamic
- var decl. occurs anywhere
    - if not declared at the beginning, the storage binding of all of the s-d vars can occur when the function / method begins execution
- allows recursion
- overhead of alloc./dealloc -> slower (indirect addressing)

# Explicit Heap-Dynamic Vars.
nameless (asbstract) mem. cells that are alloc./dealloc. to/from a heap by explicit instruction, which takes effect during execution
- heap: a  collection of storage cells whose org. is highly disorganized due to the unpredictability of its use - a free list
- referenced only through pointers or references
- type binding is static since it's done at compile time

# Implicit Heap-Dynamic vars.
alloc/dealloc to/from heap storage caused by assignment statements
- flexibility -> generic code
- inefficient since all attributes are dynamic

# Scope
The range of statements over which it is visible
- Local vars. - those that are declared in that unit of a program
- Nonlocal vars. - those that are visible in the unit but not declared there
- Global

## Static scope
scope of var can be statically determined based on program context
- if var defined by name, compiler must find the declaration
- Searches for names within nearest scope first (ancestors)

### blocks
A method of creating static scopes inside program unit
- a section of code is allowed to have own local vars. whose scope is minimized w/in a block
- prone to errors -> legal in C/C++, but not Java/C#

## the LET construct
- avail. in most functional langs. (ML, F#)
- 1. binds names to values
- 2. uses the named defined in part 1
- programs in FL are comprised of expressions rather than statements

# Declaration order
most langs allow var declarations to appear anywhere a statement can appear
- distinction between local vars and those of outer scope
    - C++, Java: the scope of all local vars. is from the delcaration to the end of the block
- loop vars can be declared in for statements
    - C++, Java, C#, Python
    - the scope of such vars. is restricted to the for construct

# Global scope
- vars delcarations to appear outside function definitions are allowed, except thso that include a declaration of a local var w/ the same name
- C/C++ have both declarations (just attributes) and definitions (attributes and storage) of global data
    - a declaration outside a function def. specificies that it is defined in a different file
    - `extern int sum;` (C99)
    - `::x` (C++) - where x is a hidden global var
- Python
    - to reference, must specify `global var_name`
    - declaration/modification of same name will produce UnboundLocalError
    - `what is nonlocal keyword?`
        - a keyword used to work w/ vars inside nested function, where the var should no belong to the inner function

# Dynamic scope
based on calling sequences of program units, not their textual layout (temporal versus spatial)
- the scope can be determined only at run time
- 





















