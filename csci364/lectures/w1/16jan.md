He made a really good slide deck on Java documentation
- use it
- java-api-docs.pdf
- https://docs.oracle.com
	- https://docs.oracle.com/en/java/javase/21
		- or whatever version is installed
- java.base (emphasis)
- java.lang
	- automatically include in most
	- may need to import
	- Boolean is part of this package

java.net
- this documentation deals with sockets
- find `Socket`
	- `ServerSocket` is also found

These docs were built w/ java docs tool
- go figure
- learn it
- use it

# Sockets
sockets are one end of a two-way connection between programs running on a network
- two needed (minimum)
	- client side
	- server side
- For this class, he will expect that client and server are run on the same machine

Java provides two socket objects
- java.net.Socket (client side)
- java.net.ServerSocket

The ServerSocket is bound to a port, which listens for incoming connections from client
- "Server is listening on a port"

The client sockets connect to a host name (like an IP address) and the port the ServerSocket is listening on
- Usually will know the server and ports prior to attempting to connect

What is a three-way handshake

A socket is one endpoint of a two-way comm
- read full definition in slides

Java is platform independent
- Java Socket classes need to know what platform it's running on to know how to handle operations
	- Linux will be different from Windows machines
		- "native code" of the operating system
- Socket classes sit on top of native code, hiding system details from your Java program
	- This is how compiled Java clients and servers on heterogeneous systems (systems w/ different architectures and operating systems) can still work together

# Web Connections
- URLConnection
- URLEncoder

`break`

look at his provided zip file for an example for this class

he uses jGRASP CSD for writing

In Java, everything runs inside of a class

`main`
- typical start of Java programs
- can be anything really, I reckon
- His example had `public class Hello`
- this is called the entry

`java Hello2` (command line)
- this is how you can specify what class it will start from
- assumes a main
- assumes Hello2 resides within main
- Am I getting this right?
	- I understand the concept, just need to work out the details

OHHHHHH
his example does have a main
- main is default
	- can be changed, but why would you do that?
- Confusion was that `public class Hello` was first class, but has a main w/in

args is an array of strings
- 127.0.0.1 will be passed in a string
- 4444 will also be passed in as string
- will eventually need to be converted for use in the program
	- he claims as int

What is a process?
- a data structure that the OS uses to track what to run next (stack and things)

method:Java::function:Python

Good practice: check if the number of arguments on the command line are what is expected
```
public static void main(String[] args) {
	// check command line args
	if (args.length != 1) {  // 1 being the number of expected args
		System.err.println("Usage: java SSServer <port number>)
		// I think this is basically saying the port number was missed as an arg
		System.exit(1);
	}
	...
}
```

static vs non-static methods
- Statics can call to a class instead of an object
- How do you know?
	- docs, but...
	- `Integer.parseInt(...)` is directly callable w/out instantiating or referencing Integer class (import)

accept method (ServerSocket)
- look at docs
- this means a client is waiting to connect
	- "blocking" method
		- execution pauses until a connection

`PrintWriter` - sending messages to a destination, like a client

!!! Utilize this for first assignment !!!
- assignments will build off of the last

Not a bad idea to include print lines for development to track what's going on
- consider excluding in production code

Exercise
- command line to compile and run the client and server



