#	This Makefile is written by Zhiyang Ong for build automation, of his solvers framework. 

#	The MIT License (MIT)

#	Copyright (c) <2016> <Zhiyang Ong>

#	Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

#	The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

#	THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

#	Email address: echo "cukj -wb- 23wU4X5M589 TROJANS cqkH wiuz2y 0f Mw Stanford" | awk '{ sub("23wU4X5M589","F.d_c_b. ") sub("Stanford","d0mA1n"); print $5, $2, $8; for (i=1; i<=1; i++) print "6\b"; print $9, $7, $6 }' | sed y/kqcbuHwM62z/gnotrzadqmC/ | tr 'q' ' ' | tr -d [:cntrl:] | tr -d 'ir' | tr y "\n"		Don't compromise my computing accounts. You have been warned.

# @author Zhiyang Ong

# =============================================================

# Definition of macro flags...

#	Accessing the source code from the "bin"/bianaries directory.
TEST=		../test/
FRONTEND=	../front_end/
UTILITIES=	../utilities/
#	Location of automatically generated documentation
DOCLIB=		./lib/


#	"Scala" file extension
SCALAFILEEXTN=	.scala
#	Source files for "Scala."
SOURCE=			*$(SCALAFILEEXTN)
#	Class/Object files for "Scala."
CLASSFILES=		*.class
#	Name of "Scala" executable.
EXECUTABLE=		Tester
#	Main file of the "Scala" program
MAIN=			$(EXECUTABLE)$(SCALAFILEEXTN)


#	"Scala" compiler.
SCALAC=			scalac
#	Execution of "Scala" program on the JVM.
SCALA=			scala
#	"Scala" documentation generator, "scaladoc."
SCALADOC=		scaladoc

#	HTML files.
HTML=			*.html
JAVASCRIPT=		*.js



#	UNIX-like processes/commands.
#	Delete files and directories recursively
REMOVE=			rm -rf

# =============================================================

#	Make targets.


all:
	$(SCALAC)	$(UTILITIES)$(SOURCE)
	$(SCALAC)	$(TEST)$(SOURCE)
	$(SCALA)	$(EXECUTABLE)




doc:
	$(SCALADOC) -author "Zhiyang Ong" -doc-footer "Footer for my Scala project." -doc-title "Documentation for my Scala Solver Project" -doc-version 0.1 -implicits-show-all  -diagrams-debug -implicits-debug -dependencyfile dependency-file.text -verbose $(TEST)$(SOURCE)



clean:
	$(REMOVE) $(CLASSFILES)
	$(REMOVE) $(HTML)
	$(REMOVE) $(JAVASCRIPT)
	$(REMOVE) $(DOCLIB)














# =============================================================

deprecated-all:
	#scalac -d classes HelloWorld.scala
	scalac ../test/Tester.scala
	scala Tester
