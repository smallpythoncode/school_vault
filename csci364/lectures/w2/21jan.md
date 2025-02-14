https://en.wikipedia.org/wiki/Convention_over_configuration
- Software design paradigm used by software frameworks that attempts to decrease the number of decisions that a developer using the framework is required to make without necessarily losing flexibility and don't repeat yourself (DRY) principles.

What are subroutines in Java called? Methods.

Ant preferred over make reason?
- platform independent

Why do some companies use Java over, say, C or C#?
- platform independence

# Compilation
- Convention to for all programs to have a main or root folder
- For compilation, switch to the dir that contains the src/ folder
	- Is this within the root? (My assessment: likely)
- Compile
	- `javac -d build src/*.java`
	- compiles all .java files within the src/ dir. into .class files
	- `-d build`
		- This says put all those class files in a dir. called build
- Run the server in one terminal window
	- `java -cp build SSServer 4444`
		- `SSServer` is that class we are telling Java to run
			- From main method
		- `-cp` class path
			- Where JRE can find the thing
				- The build directory
				- Will find the SSServer class
		- `4444` port specified
- Run the client in another terminal window
	- `java -cp build SSClient localhost 4444` #run
		- `localhost` - where the server is running
		- `4444` - the port to which the server is bound

# Assignment 1
- A knock-knock joke server
- Comms over TCP/IP
- Use the SSServer and SSClient already provided and build on top of it

## Server set-up
The server shall read three command line arguments
1. an integer TCP port to which the server will bind
2. the name of a text file containing several knock-knock jokes
3. a long seed value for a random number generator to select the joke

Work in short cycles
- implement a piece and test
- Iterative development
	- this is especially important given we work w/ two parts, client and server

Quiz: What Java method is used for a server to wait until a connection is established w/ a client?
- `accept`
	- A blocking action

## Client set-up
Command line arguments:
1. the name or IP address of the server
2. The server's TCP port

## Error handling
- if invalid message received, exit
	- Don't kick client and wait for new connection (accept), just exit
	- For both client and server
# Common Ports
80 - insecure HTTP

# Java Threading
A Java program w/ a single main (almost certainly) has a single thread

## Two ways to create a Thread
- `java.lang.Thread`
	- https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Thread.html
- `java.lang.Runnable`
	- https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Runnable.html

```
// assumed import of Thread
public class HelloThread extends Thread {
    private int val;
    public HelloThread(int val) {
        this.val = val;
    }
}
```

What does the `extend` mean?

He doesn't like importing w/ a wildcard
- I will need to figure out IntelliJ's automatic conversion to wildcards
- It doesn't serve to document the code well

What does `private` mean?
- it is only readable by the class in which it resides

`this.val` is referring to the private instance of `val`
the `= val` instance of value is referring to the argument, i.e., `(int val)`
`this` is used to alleviate confusion. We are saying:
- take the value of parameter `val`, we are not assigning it to `this.val`
	- Could just use different var names, but whatever...

What is a constructor?

`run()`
- the actual thread

`start()`
- is defined in the Thread class
	- look at the docs
- What it do?
	- generates a new thread
	- start calls run, and does other things good too
		- this is how threads are created
		- if run was called directly, a single thread (probably) would call all run methods sequentially, but not multi-threaded

Why is the execution inter-leaved?
- the scheduling of the threads
- The console is a limited resource
	- one console, five threads

```
// implied import of Runnable
public class HelloRunnable implements Runnable {
    
}
```

Why implements?
- implements an interface
- Teach recommends this. why?
	- Extending - all one has is the thread
		- Java can only extend one class at a time
	- Implementing
		- Java allows one to implement multiple interfaces at a time

List : interface :: ListArray : something_less_flexible

can have multiple interfaces
- can only have a single class

Program to the interface!!!!!

# Multi-threaded Servers
```
while (true) {
    accept a connection
    create thread for client
}
```
Assumes server socket has been created outside the while loop
`.accept()` awaits the connection of a new client
Each thread in the server class is is interacting w/ a separate client
- gives us throughput


Advantages
- less work for main thread
- multiple requests handled simultaneously
- better responsiveness than single-threaded server
Caution
- make sure tasks are thread-safe
    - What does this mean? (contention for resources)
- Does not limit the number of threads created
    - DDOS
    - Don't do `while true`







