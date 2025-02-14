# Focuses
- threads
	- for organizational purposes
	- boost program performance
- first half - java
	- deadlock
	- threads in java
- C++, but not the OOP portions of it
- Be proficient in
	- Java and C++ !!!
	- Running programs from command line

# Course objectives
- a more polished program style
	- he will provide feedback as if on his project team
	- he will have expectations as if for someone who was writing my paychecks
- Understanding of client-server architecture
	- a little of 3-part architecture: client, server, some database
- Write more interesting programs
	- utilizing deadlock, livelock
	- thread synchronization
- Utilization of threads to improve program performance

# Grading
- Up to 7 programming assignments
- Up to 8 lab activities (discussions)
- midterm (week before spring break)
- final

# Installing the OpenJDK

# tools & files
JavaC
- Compiles .java files into .class files
Java
- runs java class files

He recommends not compiling in an IDE
- don't shoehorn the IDE into the deliverable
- the deliverable needs to run on its own
	- likely via the command line
- learn how to compile and run from the command line
	- need to tinker in an IDE? sure. but don't bind yourself to it.

set JAVA_HOME variable
- path to directory that contains the bin folder and lib folder
	- emphasis CONTAINS
add JAVA_HOME/bin the PATH
- TADA!

# compilation
we will use ant in this class
- Another Neat Tool
	- what this acronym means will not be on an exam

Why use Ant?
- Platform independent
	- lots of predefined tasks implemented in Java
	- Hides platform-specific properties, ex. path separators
- Written in XML
	- easily validate
- Can be extended (more platform independent tasks)

Preparing for Ant
- JDK installed
- JAVA_HOME environment

ant home is the folder that contains the bin dir.

1st half of course - heavy ant
2nd half - a bit of make

`ant -p`
- list targets and description
	- build.xml (2 of 2) slide

File name format
- he will post this in the first programming assignment



