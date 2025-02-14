Quizzes are usually posted on Wednesday
- He doesn't on Monday because (in his experience) then students just work the quiz then don't show up to class.
	- Frankly, who gives a shit? If a student wants to pay all this money just to know show up to class, that's on him. Fuck you, Jun, you boomer.

#affine #cypher
https://en.wikipedia.org/wiki/Affine_cipher
# Number Theory
We only deal w/ integers
- we will not deal w/ floating point numbers
- Only exception is probabilities (between 0 and 1)
## Divisibility
Interpretation: the multiplicative inverse

A relation between two integers
- whether one can evenly divide the other
- `b | a` -> `b` (evenly) divides `a`

## Properties of Divisibility
Euclidean Algorithm
If b | g and b | h, then b | (mg + nh) for arbitrary integers m and n

-> Cryptography cares a lot about prime numbers
- a prime numbers is one that has only 2 divisors, 1 and itself

## Division Algorithm
- remainder is required to be non-negative
- the remainder cannot be larger than the divisor
- He claims many students get mixed up on these facts?
	- Why?
	- How do negatives affect this process?
	- `a = qn + r` -> has to do with the re-gonkulating of this formula
		- R must be positive
		- expanded (more precise) formula than the ones on the slides
			- `0 <= r <= |n| - 1`
			- 

Apparently, we care about the ceiling?
![[Pasted image 20250122123222.png]]

```
a / n = - 17 / 5 = 3 & 2 / 5
-4 < 3 & 2 / 5 < -3

-4 is the floor of a / n
-3 is the ceiling of a / n

17 = -3 (-5) + 2 = q (n) + 2

The value of the remainder is always non-negative
```

Learn the formula
- worst case scenario, guesswork (trial and error)

## Euclidean Algorithm
- one of the basic techniques of number theory
- Procedure for determining the greatest common divisor of two positive integers
- Two integers are relatively prime if their only common positive integer factor is 1

### Greatest Common Divisor (GCD)
- The GCD of a and b is the largest integer that divides both a and b
- We can use the notation `gcd(a, b)` to mean GCD of a and b
	- Defined: gcd(0, 0) = 0
- Positive integer c is said the be the gcd of a and b if
	- c is a divisor of a and b
	- any divisor of a and b is a divisor of c
- An equivalent definition
	- gcd(a, b) = max\[k, such that k | a and k | b]

SEE SLIDES

## Modular Arithmetic
### Modulus
- if an integer and n is a positive integer, we define a mod n to be the **remainder** when a is divided by n; the integer n is called the modulus

#### Congruent moduluo
Congruent modulo n
- two integers a and b are said to be congruent modulo n if (a mod n) = (b mod n)
	- In relation to each other
- a = b(mod n)

```
For exams, write "mod" notation
Programmatic symbols, such as `%` is code, not mathematics
```

### Properties of Congruence
1. a = b (mod n) if n | (a -b)
2. a = b (mod n) implies b = a (mod n)
3. a = b (mod n) and b = c (mod n) imply a = c (mod n)

### Additional properties
1. \[(a mod n) + (b mod n)] mod n = (a + b) mod n
2. \[(a mod n) - (b mod n)] mod n = (a - b) mod n
3. \[(a mod n) * (b mod n)] mod n = (a * b) mod n
- will the text explain this better
	- may need to gpt this










