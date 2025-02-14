We want programs that are deterministic
- the outcome can be predictable, is not random

Critical section
- a part of a program where concurrent access may result in unexpected behavior or non-determinist results

We need to take steps enforce mutually exclusive access
- a mutex - a construct that ensures only one thread at a time can enter a critical section

# Dining Philosophers Problem
- illustrates the synchronization issue
- 5 silent philosophers sit around a table w/ 5 forks between them (1 fork between each pair of philosophers)
- Philosophers think or eat. Eating requires two forks
- Must put down both forks after eating
- Find an algo. so that no philosopher starves

# Types of Locks
- a synchronization mechanism that enforces mutual exclusion for a critical section
- Semaphor
    - A variable or object that keeps track of how many of a resource are in use
- Binary semaphore
    - A sempahore initialized to 1
        - 1 means available
- Monitor
    - A synch. tool that allows them to enter the critical section
    - if 0, they don't have to exit the critical section just yet
    - more to come...

## synchronized statement
`synchronized (expression) statement`








