#	Key Features of *Scala*

##	In Comparison to *Java* 

Features of of *Scala* (in comparison to *Java* \cite{Tate2010}):
+ Type inference \cite[\S5.1, pp. 136]{Tate2010}
	- If possible, infer variable types.
		+ Local type inference has limitations due to its 
			not-so-good constraint solver \cite[\S5.1, pp. 138]{Tate2010}.
	- *Java* requires type declaration for each variable,
		argument, or parameter.
	- Has strong support due to its type system
		\cite[\S5.1, pp. 138]{Tate2010}.
+ Functional concepts \cite[\S5.1, pp. 137]{Tate2010}
	- Form new functions using existing functions in different ways,
		beyond simple "syntactical sugar" (or what Dr. Anders Franz{\'{e}}n
		calls, "syntactic sugar").
		+ Code blocks.
		+ Higher-order functions.
		+ Collection library.
	- *Java* does not allow such formation/composition of new functions.
+ Immutable variables \cite[\S5.1, pp. 137]{Tate2010}
	- Requires explicit indication of whether a variable is mutable.
		+ A possible consequence of this is that a function called
			with the same set of inputs may result in different
			outputs. This is not always true
			\cite[\S5.1, pp. 138]{Tate2010}.
		+ If possible, use functional abstractions to avoid changing
			the values of variables \cite[\S5.1, pp. 138]{Tate2010}.
	- Concurrency can have unforeseen/unpredictable (/uncertain) effects
		on mutable variables.
		+ These effects may seem erratic.
		+ When multiple threads can change the value of a variable
			simultaneously, the resultant value of the variable
			may leave the program in an invalid state.
			This can be difficult to deterministically reproduce
			during software testing \cite[\S5.1, pp. 139]{Tate2010}.
	- *Java* requires a (rarely used) modifier for variables to be
		immutable.
	- A mutable variable is a variable that can hold multiple values
		after its initialization.
		Any variable that is not mutable is an immutable variable
		\cite[\S5.1, pp. 138-139]{Tate2010}.
+ Advanced programming constructs \cite[\S5.1, pp. 137]{Tate2010}
	- Actors for concurrency.
	- *Ruby*-style collections with higher-order functions.
	- XML processing.
+ Lightweight programming language \cite[\S5.1, pp. 138]{Tate2010}
+ General purpose \cite[\S5.1, pp. 138]{Tate2010}
	- *Scala* software can be used to:
		+ Concurrent/Parallel software
		+ Web applications dealing with *XML*.
		+ Implementation of domain-specific languages. 








#	Notes on Functional Programming

Characteristics of a functional programming language:
+ Support programming style that is based on strong mathematical
	foundations \cite[\S5.1, pp. 138]{Tate2010}.
+ Compose functional programs with functions
	\cite[\S5.1, pp. 138]{Tate2010}.
+ "A function always returns a value"
	\cite[\S5.1, pp. 138]{Tate2010}.
+ For a given set of inputs, a function will return a given set
	of outputs.
	When this is done repeatedly, the set of outputs is the same
		as that of other repetitions. [Insert REFERENCE!!!]
+ In the functional programming paradigm, software developers avoid
	changing the state of an executing program or modifying its data
	\cite[\S5.1, pp. 138]{Tate2010}. 
	- The use of assignments to modify the values of variables is
		discouraged \cite{WikipediaContributors2017e}.
	- The values of variables can be modified via recursive function
		calls \cite{WikipediaContributors2017e}.




"*Scala* is not a pure functional programming language,"
	since it allows values of variables to be modified
	\cite[\S5.1, pp. 138]{Tate2010}.











##	Pure Functional Programming Languages

"Pure functional programming languages allow" software developers to
	use a programming style that has certain mathematical features
	or characteristics
	\cite[\S5.1, pp. 138]{Tate2010} \cite{WikipediaContributors2017e}.







##	Comparison of Function Programming to Other Programming Paradigms 

To be completed.

###	IMPORTANT

Determine the advantages of functional programming paradigm over
	procedural and structural programming paradigms.




### Notes on Other Programming Paradigms


A taxonomy of programming paradigms \cite{WikipediaContributors2017e}:
+ Concurrent programming \cite{WikipediaContributors2017k}: FIX THIS
+ Data-driven programming:
	- Describe 
+ Declarative programming (contrast: Imperative programming) \cite{WikipediaContributors2017m} -- A programming paradigm that specifies what computation/tasks should a computer program do, rather than how the computer program carries out these computation/tasks (i.e., control flow) \cite{WikipediaContributors2017l}. That is, declarative programming does not result in any side effects; or, declarative programming "is referentially transparent" \cite{WikipediaContributors2017m}. 
	- Constraint programming
	- Dataflow programming
		* Reactive programming
	- Functional programming
	- Logic programming
		* Functional logic programming
+ Generic programming \cite{WikipediaContributors2017q} -- For designing parameterized algorithms that have "to-be-specified-later" data types during (object) instantiation. These algorithms formalize abstracted concepts that are independent of how algorithms are implemented (i.e., concrete examples). 
+ Imperative programming (contrast: Declarative programming) \cite{WikipediaContributors2017l} -- A programming paradigm that changes the state of the computer program via a sequence of statements; that is, these statements have side effects, since they change the state of the program. These sequences of statements focus on how computer programs operate.
	- Literate programming
	- Procedural programming: "[associates] code into functions" \cite{WikipediaContributors2017l}... In addition, "heavily-procedural programming is a form of structured programming".
+ Metaprogramming \cite{WikipediaContributors2017p} -- For designing computer programs to synthesize, analyze, and transform other computer programs.
+ Non-structured programming (contrast: Structured programming)
+ Parallel computing
+ Probabilistic programming language \cite{WikipediaContributors2017o} -- For describing probabilistic models (i.e., probabilistic relational models, PRMs) and performing inference (i.e., probabilistic reasoning) on these models; they are more expressive and flexible than Bayesian networks and probabilistic graphical models (PDMs).
+ Structured programming (contrast: Non-structured programming)
	- Object-oriented programming
	- Recursive programming

WikipediaContributors2017q














#	Personal Notes from Developing *Scala* Software

##	Build Process and Automation for *Scala* Software

###	Compiling *Scala* Software

Compile *Scala* software as follows:

	scalac [filename].scala


###	Executing *Scala* Software

Execute *Scala* software as follows:

	scala [filename_of_Scala_object_with_main_method]


#	References

Citations/References that use the *LaTeX/BibTeX* notation are taken
	from my *BibTeX* database (set of *BibTeX* entries).




+ \cite{WikipediaContributors2017e}
	Wikipedia contributors, "Programming paradigm," in {\it Wikipedia, The Free Encyclopedia: Programming language classification}, Wikimedia Foundation, San Francisco, CA, August 31, 2016. [Available online](https://en.wikipedia.org/wiki/Programming_paradigm); last accessed on September 2, 2016.




#	To-Do List

Finish reading \cite{WikipediaContributors2017e}.
Stop reading at: \cite[\S5.1, pp. 139]{Tate2010}.
\5.2, pp. 139--153

Build *Scala*-based software:
+ SAT solver
+ SMT solver
+ model checker 
+ communication system with different crytographic schemes
+ unconditionally secure communication system 






#	Author Information

The MIT License (MIT)

Copyright (c) <2016> Zhiyang Ong

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

Email address: echo "cukj -wb- 23wU4X5M589 TROJANS cqkH wiuz2y 0f Mw Stanford" | awk '{ sub("23wU4X5M589","F.d_c_b. ") sub("Stanford","d0mA1n"); print $5, $2, $8; for (i=1; i<=1; i++) print "6\b"; print $9, $7, $6 }' | sed y/kqcbuHwM62z/gnotrzadqmC/ | tr 'q' ' ' | tr -d [:cntrl:] | tr -d 'ir' | tr y "\n"		Don't compromise my computing accounts. You have been warned.

