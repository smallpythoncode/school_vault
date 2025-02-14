# Pausing a Thread

`Thread.sleep(X)`
- can throw an exception
    - if a thread is sleeping and that thread gets interrupted, the method that the thread is paused on will throw an exception
    - so catch the exception
        - try catch for the explicit expected exception
        - if we don't catch it, the program will not compile correctly


## Interrupts
- intended to be a temporary pause
- however, can be so significant that the OS loses its mind
- What would cause this?
    - runtime issue
    - external to the program
        - every key press will cause an interruption (the OS reads these in constantly)
        - the buffer to OS uses to log keystrokes is not large, hence, the OS will attempt to keep on top of it
        - mouse clicks
        - network incoming

- a signal that a thread should stop what is is doing and so that other work can be done
    - an event has occurred in another thread
- programmers can anticipate certain interrupts and code how a thread should respond

- the scheduler
    - a timeout occurs that disrupts the OS/hardware timing allotted for specific tasks
        - this could cause an interrupt because something occurred that disrupts the scheduling
- keyboard interrupt
- networking

## Interrupt handling

`look at slides`
-> try catch utilized

- will print a message every four seconds until interrupted or there are no more messages

In other cases, there is no reasonable way to catch if an interrupt is present
- `heavyCrunch` slides
- In this case, a conditional is used
    - since `heavyCrunch` can take a very long time
    - static method -> `Thread.interrupted()` returns true if interrupted
- Is it better to throw `InterruptedException`?
    - instead of returning
    - you can define what happens upon interrupt
        - calling return may not help the method that called the one w/ interrupt

CLARIFICATION
- an interrupt is a signal that something unintended happened
    - maybe a process took too long
    - maybe something happened out of order (scheduling)
- in this case, some thread was interrupted
    - how does our program handles this thread's interruption


# Synchronization
Threads communicate by sharing access to field and methods of objects they reference
- More efficient than network communication
- Utilizes the same memory
This can lead to errors...

Atomic operation - cannot be interrupted
- increment/decrement - not atomic

Can create data races
- code must be deterministic - or has the same result every time it runs

## Memory consistency
- these errors occur when threads have inconsistent view of the data

# Happens-before
These relationships guarantee some statements happen before others
Example: `Thread.start()` and `Thread.join()`
Synchronization ensures a happen-before relationship
- see also Ch. 17 of the Java Lang. Specification

# Networking

Network Protocol Stack

## TCP
transmission control protocol
- reliable host-to-host protocol
    - data can be damaged, lost, duplicated, or delivered out of order
    - each packet sent must be acknowledged within timeout period

## Three-way Handshake
- establishes a TCP connection
- fdsa
- Client sends ACK flag (acknowledgement)
    - Random sequence number A
- Server sends a SYN-ACK
    - acknowledgement number (A+1) and its own random sequence number B
- Client sends an ACK
    - Sequence number = acknowledgement number
    - Acknowledgement number = B + 1

## UDP
User datagram Protocol
- everything about TCP is missing from UDP
- not reliabile
- positive connection is not ensured
Not connection-based
- arrival, arrival-time, and content not guaranteed
So why use it?
- much faster
- less overhead

### ifconfig
interface config
tests if local machine is on a network
- Windows equivalent `ipconfig`
Deprecated due to
- kernel improvements
- maintainability issues

### ip
- replaces ifconfig

### ping
Packet INternet Groper
- tests if a host is alive on the network
- sends an echo request to a target - target may respond
    - some firewalls disable this

### nc or ncat
Netcat - a network command line utility
reads or writes data across a network
works with
- tcp or UDP connections
- IPv4 or IPv6
Two modes of operation
- connect mode - like a network client
- listen mode - like a network server
Defaults to TCP






















