For classical encryption, the goal is to make decryption to authorized parties be very simple while making un-encryption to unauthorized parties be very difficult

Essential to the encryption is the encryption algo. and the decryption algo.
- one inverts the other via common key (symmetric)
- updating the common key poses a difficulty
	- Contrast this with public-private keys (later in course) where each party has their own set of keys that is easier to update because of separation

# Terminology
plaintext
- the original message
ciphertext
- the coded message
enciphering/encryption
- the process of converting from plaintext to ciphertext
- must be performed w/o error, otherwise the ciphertext becomes useless
deciphering/decryption
- restoring the plaintext from the ciphertext
cryptography
- the area of study of the many schemes used for encryption and decryption
cryptographic system/cipher
- a scheme
cryptanalysis
- techniques used for deciphering a message w/o any knowledge of the enciphering details
- the process of identifying the key
	- the algorithm is likely public knowledge, otherwise it wouldn't be used
		- obviously, if it were a matter of national security, this would not hold true
cryptology
- the areas of cryptography and cryptanalysis (combined)

Y = E(K, X)
- Y - ciphertext
	- Assumed to be accessible to adversary. However, without encryption key, it cannot be deciphered
- E - the encryption algo. (a function)
- K - the encryption key
	- Should not be used indefinitely
	- A continual update of the key promotes the idea that messages remain secure over an extended duration
- X - plaintext
	- should not be transmitted unencrypted

# Cryptographic Systems
Characterized along three independent dimensions
1. Types of operations used for transforming plaintext to ciphertext
	1. substitution
	2. transposition
2. the number of keys used
	1. symmetric - single key for both encryption and decryption (conventional encryptions)
	2. asymmetirc - two keys: one public (self) and one private, which should never be disclosed
	3. The way plaintext is processed (the algo.)
		1. block cipher
		2. stream cipher

# Cryptanalysis
- studying the characteristics of the encryption algo. to subsequently decipher ciphertext

# Brute force
- trying all possible keys
- on average, half of all possible keys must be tried to achieve success

A strong encryption/encrypted messaging system is secure if the messages remain secure when facing the most advanced attack methods

# Encryption Scheme Security
Unconditionally secure
- no matter how much time an opponent has, it is impossible for him/her to decrypt the ciphertext simply because the required info. is not there
	- Quantum computer is a major threat to this scheme

Computationally Secure
- the most prevalent scheme
- the cost of breaking the cipher exceeds the value of the encrypted info.
- The time required to break the cipher exceeds the useful lifetime of the info.



Brute Force attack
- trying very possible key

Strong encryption
- encryption schemes that make it impractically difficult for unauthorized persons or systems to gain access to the plaintext

# Encryption Techniques
Substitution
- one in which the letters of plaintext are replaced by other letters or by numbers of symbols
	- if of bits,  replaced by ciphertext bit patters
- Examples
	- Caesar cipher
		- c = E(k, p) = (p + k) mod 26
		- p = D(k, C) = (C - k) mod 26
		- linguistic frequency still applies
Transposition
- the changing of the positions of characters


























