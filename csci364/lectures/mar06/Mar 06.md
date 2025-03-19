After studying the slides (intro-to-talon.pdf), use your browser to logon to Talon (the Open OnDemand interface). Remember, if you connect from off-campus, you need to install and connect to the UND VPN before logging in to Talon.

Under the OOD Files menu, select Home Directory to launch the OOD File Manager. Try uploading helloworld.tar. You will first need to download helloworld.tar from Blackboard to your local computer and then upload the file to Talon.

Using the OOD File Manager, navigate to the directory where you uploaded helloworld.tar and click Open In Terminal. (That's four buttons to the left of the File Manager's Upload button.

Use the ls (that's ell ess) command to list the files in that directory. Verify that helloworld.tar is in the list. Un-tar the file

$ ls                                        # list the files in the current directory. Verify that helloworld.tar is in the list

$ tar xvf helloworld.tar     # un-tar the archive

$ ls                                        # now confirm that there is a helloworld folder

$ cd helloworld                   # navigate into the helloworld folder

$ ls                                        # verify hello.cpp (the program), Makefile (the build script), and slurm.sh (the Slurm job submission script)

$ make                                 # use make to run the build script

$ sbatch slurm.sh              # use sbatch to submit the program to one of the compute nodes. DO NOT RUN hello ON A LOGIN NODE.

$ squeue --me                    # confirm your job is finished

$ ls                                        # look for your output file. In this case, 'hi.xxxxxx.txt' is the name of the output file.

Study the output file. Try to trace each line in the output file to the source code file and the Slurm job submission script.