# Recursive Descent Parsing

When more than one right hand side, it must be structured in such a way (the algo) that it selects the correct one

## The Left Recursion Problem
If a grammar has direct/indirect left recursion, it cannot be the basis for a top-down parser

"epsilon" - the empty string, or, an erasure rule

the "prime" avoids endless recursion
- "jump to the end" with "Beta" then follow on with normal rules
- Ends with "epsilon", meaning we are done with the recursion
- No longer relies on left recursion
	- because it is recursive
	- eventually ends up in the correct form, but very round about
	- by deriving, it can become a shorter path

in last slide covered in lecture (1-29), `id` was the phrase with `F` as the handle

