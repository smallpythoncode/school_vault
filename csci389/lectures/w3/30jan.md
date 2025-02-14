 mono-alphabetic cipher
- frequency analysis applies
	- E - 12.702%
	- T - 9.056%
	- A - 8.167%
	- most frequent digram - "th"
	- " " trigram - "the"

# Playfair Cipher
- Invented by British scientist Sir Charles Wheatstone in 1854
- the standard field system of the British Army during WWI and the US Army and other Allied forces during WWII
- based on 5 x 5 matrix of letters constructed using a keyword
- treats digrams in the plaintext as a single unit and translates these into cipher digrams

`During exams, we will (likely) not be asked to spend time on deciphering - he claims we simply won't have the time. (If we were to do this on MT1, it would likely be for a Caesar cipher given it is the easiest.) Thus, exams will likely be about concepts rather than processes`

Hill cipher will not be on a midterm
- will appear on an assignment

## numbers for letters
![[Pasted image 20250209114017.png]]

# Vigenere cipher

![[Pasted image 20250209114049.png]]

# Vernam Cipher
- The ultimate defense against such a cryptanalysis is to choose a keyword that is as long as the plaintext and has no statistical relationship to it
- users must use the same copy of the machine, or have the same config.
- Review: XOR gate

# One-Time Pad
- improvement to vernam cipher
- uses a random key for each encryption
	- difficult to implement

# Rail Fence Cipher
- simplest transposition cipher
- plaintext is written down as a sequence of diagonals and then read off as a sequence of rows

```
meet me after the toga party

m e m a t r h t g p r y
 e t e f e t e o a a t

mematrhtgpryetefeteoaat

```

What is the encryption key?
- depth is the key
- in above example, depth 2
- more immune the frequency analysis
- If not "enough characters", add padding to the message

# Row Transposition Cipher

















