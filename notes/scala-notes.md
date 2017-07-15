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
		A non-empty set of mutable variables describe the mutable
			state of the software \cite[\S5.1, pp. 139]{Tate2010}.
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



##	Concepts of Functional Programming

Concepts of functional programming to explore
	\cite{WikipediaContributors2017e}:
+ delegates
+ anonymous functions (function lietral or lambda abstraction)
	- arguments passed to higher-order functions
	- Output (i.e., return function) of a higher-order function
	- first-class functions???
	- Also, known as "lambda expressions" (reference lambda calculus)
		in C# \cite{WikipediaContributors2017u}
+ currying
+ pattern matching
+ algebraic data types
+ lazy evaluation
+ tail recursion
+ immutability


##	Pure Functional Programming Languages

"Pure functional programming languages allow" software developers to
	use a programming style that has certain mathematical features
	or characteristics
	\cite[\S5.1, pp. 138]{Tate2010} \cite{WikipediaContributors2017e}.

The purely functional programming paradigm only performs computation
	that evaluates mathematical functions, and cannot change the state
	of the computer program via mutable datafields;
	this implies that all functions would be solely dependent on their
	input arguments, and are independent of the local or global state
	of the computer program \cite{WikipediaContributors2017g}.

Pure functional programs use persistent (purely functional) data
	structures, so that the repreated evaluation of a function would
	always return the same result for the same input arguments (of
	that function) \cite{WikipediaContributors2017g}.

Purely functional programming makes it easier to develop parallel
	programs, since the developers do not have to be concerned about
	interacting evaluations of mathematical functions (purely
	functional components) \cite{WikipediaContributors2017g}.


##	Concurrency + Functional Programming

Race conditions/hazards occur when multiple threads can modify any
	given mutable variable at the same time.
	[IMPORTANT:::Define race conditions.][###TO-DO]
	When race conditions/hazards occur, these modifying operations do
		not necessarily leave the mutable variable in a valid state.
	Consequently, this makes it much more difficult to test the
		concurrent software for correct functionality.
	To ensure that concurrent threads will leave the mutable variable
		in valid states, database users use transactions and locking
		to avoid invalid states.
	Similarly, software developers programming with object-oriented
		programming languages use mutual exclusion (or mutexes),
		semaphores, and monitors to control data access to shared
		mutable variable \cite[\S5.1, pp. 139]{Tate2010}.

Functional programming languages allow software developers to avoid
	problems associated with race conditions/hazards if they avoid
	using, or cannot use, mutable variables
	\cite[\S5.1, pp. 139]{Tate2010}




















##	Comparison of Function Programming to Other Programming Paradigms 

Functional programming languages can better support concerrency by
	discouraging the use of mutable states
	[Reference needed!!!]

For performance comparison, it is difficult to compare which
	programming style would yield a performance advantage, due to the
	number of factors/variables that should be considered, such as:
	total instruction path length, usage of subroutines, propensity of
	cache misses (and instruction fetch overhead) due to the likelihood
	of referencing non-local physical instructions
	\cite{WikipediaContributors2017j}.
	Also, the extend of message passing (i.e., subroutine calls)
		determines the extend of these overheads: "dynamic memory
		allocation, parameter copying, and dynamic dispatch"
		\cite{WikipediaContributors2017j}.

To be completed.

###	IMPORTANT

Find out about the advantages of functional programming paradigm over
	procedural and structural programming paradigms.
Also, determine its disadvantages.



### Notes on Other Programming Paradigms

A programming paradign is a classification of programming languages
	based on a shared set of (enabled/forbidden) (programming language)
	features \cite{WikipediaContributors2017e}.
A programming paradigm is a style of constructing a computer program's
	structure and elements

A taxonomy of programming paradigms \cite{WikipediaContributors2017e}:
+ Automata-based programming \cite{WikipediaContributors2017j} -- A
	computer program based on a finite state machine (FSM) model, or
	another formal automaton.
	Its characteristics are \cite{WikipediaContributors2017j}: "state
		enumeration, control variable, state changes, isomorphism,
		state transition table."
+ Concurrent programming (compare: parallel programming)
	\cite{WikipediaContributors2017k}: [FIX THIS]
+ Data-driven programming:
	- [To be continued]
+ Declarative programming (contrast: Imperative programming)
	\cite{WikipediaContributors2017m} -- A programming paradigm that
	specifies what computation/tasks should a computer program do
	(or "program logic" \cite{WikipediaContributors2017j}), rather than
	how the computer program carries out these computation/tasks in
	order (i.e., control flow \cite{WikipediaContributors2017j})
	(i.e., the order in which these computation/tasks are executed
	\cite{WikipediaContributors2017l}.
	That is, declarative programming does not result in any side
		effects; or, declarative programming "is referentially
		transparent" \cite{WikipediaContributors2017m}. 
	- Constraint programming
	- Dataflow programming
		* Reactive programming
	- Functional programming (contrast: Imperative programming) does
		not allow side effects;
		that is, it does not execute in a sequence of states;
		instead, it performs function evaluations (like mathematical
			functions) without using/affecting memory ("program state
			and mutable data" \cite{WikipediaContributors2017j}) nor
			input/output operations
			\cite{WikipediaContributors2017r,WikipediaContributors2017f}.
		This paradigm encourages the use of: recursion.
		This paradigm discourages the use of: assignment statements.
		Its characteristics are \cite{WikipediaContributors2017j}:
		"Lambda calculus, compositionality, formula, recursion,
			referential transparency, and no side effects"
	- Logic programming -- The style of execution model is based on
		formal logic (syntax/grammar), so that "automated reasoning
		(i.e., application of inference rules) [is carried out on] a
		body of knowledge (expressed in mathematical logic)
		\cite{WikipediaContributors2017s}. 
		* Functional logic programming \cite{WikipediaContributors2017h}
			-- synthesized combination of the "functional programming
			[paradigm] (including higher-order programming) and logic
			programming paradigm (including nondeterministic
			programming and unification).			
+ Event-driven programming \cite{WikipediaContributors2017j} -- Control
	flow of the program is determined by events (e.g., actions of user
	during user interaction, interrupts, or sensor inputs) or messages
	passed from/by other threads/programs.
	Its characteristics are: "main loop, event handlers, and
		asynchronous processes."
+ Generic programming \cite{WikipediaContributors2017q} -- For
	designing parameterized algorithms that have "to-be-specified-later"
	data types during (object) instantiation.
	These algorithms formalize abstracted concepts that are independent
		of how algorithms are implemented (i.e., concrete examples). 
+ Imperative programming (contrast: Declarative programming, and
	Functional programming) \cite{WikipediaContributors2017l} -- A
	programming paradigm that changes the state of the computer program
	\cite{WikipediaContributors2017j} via a sequence/order of
	statements;
	that is, these statements have side effects
		\cite{WikipediaContributors2017r}, since they directly change
		the state (set of datafields) of the program
		\cite{WikipediaContributors2017j};
	communication between units of code is implicit.
	Assignment statements are used to change the state (data fields
		and global variables) of the program, and produce side effects
		(memory, or program state and mutable data, and I/O operations)
		\cite{WikipediaContributors2017j}.
	These sequences of statements focus on how computer programs operate.
	- Literate programming
	- Procedural programming: "[associates] code into functions"
		\cite{WikipediaContributors2017l}... In addition,
		"heavily-procedural programming is a form of structured
		programming".
		Uses local variables with functions/operations in sequence,
			selection, and iteration;
			these local variables are stored using modularization
			\cite{WikipediaContributors2017j};
		Specifies the steps to bring the program from an initial/given
			state to a desired state \cite{WikipediaContributors2017j}.
+ Metaprogramming \cite{WikipediaContributors2017p} -- For designing
	computer programs to synthesize, analyze, and transform other
	computer programs.
+ Non-structured programming (contrast: Structured programming)
+ Parallel computing (compare: concurrent programming)
	\cite{WikipediaContributors2017n} -- Parallel computing is defined
	as the simultaneous execution of processes or
	calculations/computation on a computer.
	It is defined at the following levels of abstraction: bit-level
		parallelism, instruction-level parallelism, data parallelism,
		and task parallelism.
+ Probabilistic programming language \cite{WikipediaContributors2017o}
	-- For describing probabilistic models (i.e., probabilistic
		relational models, PRMs) and performing inference (i.e.,
		probabilistic reasoning) on these models; they are more
		expressive and flexible than Bayesian networks and
		probabilistic graphical models (PDMs).
+ Structured programming (contrast: Non-structured programming)
	\cite{WikipediaContributors2017j} -- Implies structure in the
	logic of the computer program (i.e., logical program structure)
	- Object-oriented programming (contrast: imperative programming)
		-- Source code is organized into classes according to the
			state that it changes.
			The state (i.e., data fields) of an object can only be
				modified by code (i.e., functions/methods) asssociated
				with the object \cite{WikipediaContributors2017j}.
			These objects interact with each other
				\cite{WikipediaContributors2017j}.
			Its characteristics are \cite{WikipediaContributors2017j}:
				"objects, methods, message passing, information hiding,
				data abstraction, encapsulation, polymorphism,
				inheritance, [and] serialization-marshalling."
	- Recursive programming
+ Symbolic programming \cite{WikipediaContributors2017t} -- Programs
	manipulate formulas and processes as data to form more complex
	processes.
	Effectively, such programs resembles self-modifying
		programs that can learn.



Notes:
+ When programming languages are designed, or being refined, they may
	include syntactic sugar, syntactic salt, syntactic saccharin, and
	syntactic syrup (i.e., programming language features) to
	facilitate computer programming in a, or a set of, given
	programming paradigm(s) \cite{WikipediaContributors2017j,
	WikipediaContributors2017v}.
+ Parallel computing and concurrent computing are distinct concepts,
	and paradigms, that tend to be conflated together.
	Parallelism can exist without concurrency; e.g., bit-level
	parallelism.
	Concurrency can exist without parallelism; e.g., multitasking by
	time-sharing on a single-core processor.
	Parallel computing involves partitioning/decomposing a task into
	multiple similar subtasks that can be processed independently,
	such that the results of these subtasks can be merged/combined.
	Concurrent programming involves processes that carry out
	different/unrelated tasks/processes, which need coordination
	during execution via inter-process communication (IPC)
	\cite{WikipediaContributors2017n}









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



June 22 - July 12 
July 15-16, 19-now



#	Author Information

The MIT License (MIT)

Copyright (c) <2016> Zhiyang Ong

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

Email address: echo "cukj -wb- 23wU4X5M589 TROJANS cqkH wiuz2y 0f Mw Stanford" | awk '{ sub("23wU4X5M589","F.d_c_b. ") sub("Stanford","d0mA1n"); print $5, $2, $8; for (i=1; i<=1; i++) print "6\b"; print $9, $7, $6 }' | sed y/kqcbuHwM62z/gnotrzadqmC/ | tr 'q' ' ' | tr -d [:cntrl:] | tr -d 'ir' | tr y "\n"		Don't compromise my computing accounts. You have been warned.

