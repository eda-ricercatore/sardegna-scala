#	Notes about *Scala*

**Table of Content:**
+ [Key Features of *Scala*](https://github.com/eda-ricercatore/sardegna-scala/blob/master/notes/scala-notes.md#key-features-of-scala)
	- [In Comparison to *Java*](https://github.com/eda-ricercatore/sardegna-scala/blob/master/notes/scala-notes.md#in-comparison-to-java)
	- [*Scala* Runs on the *Java* Virtual Machine (JVM)](https://github.com/eda-ricercatore/sardegna-scala/blob/master/notes/scala-notes.md#scala-runs-on-the-java-virtual-machine-jvm)
	- [Features of *Scala*](https://github.com/eda-ricercatore/sardegna-scala/blob/master/notes/scala-notes.md#features-of-scala)
+ [Notes on Functional Programming](https://github.com/eda-ricercatore/sardegna-scala/blob/master/notes/scala-notes.md#notes-on-functional-programming)
	- [Concepts of Functional Programming](https://github.com/eda-ricercatore/sardegna-scala/blob/master/notes/scala-notes.md#concepts-of-functional-programming)
	- [Pure Functional Programming Languages](https://github.com/eda-ricercatore/sardegna-scala/blob/master/notes/scala-notes.md#pure-functional-programming-languages)
	- [Concurrency + Functional Programming](https://github.com/eda-ricercatore/sardegna-scala/blob/master/notes/scala-notes.md#concurrency--functional-programming)
	- [Comparison of Function Programming to Other Programming Paradigms](https://github.com/eda-ricercatore/sardegna-scala/blob/master/notes/scala-notes.md#comparison-of-function-programming-to-other-programming-paradigms)
		* [Notes on Other Programming Paradigms](https://github.com/eda-ricercatore/sardegna-scala/blob/master/notes/scala-notes.md#notes-on-other-programming-paradigms)
		* [Miscellaneous Information](https://github.com/eda-ricercatore/sardegna-scala/blob/master/notes/scala-notes.md#miscellaneous-information)
			+ [Logic/Declarative Programming](https://github.com/eda-ricercatore/sardegna-scala/blob/master/notes/scala-notes.md#logicdeclarative-programming)
				- [Prolog](https://github.com/eda-ricercatore/sardegna-scala/blob/master/notes/scala-notes.md#prolog)
			+ [Software Implemented in Multiple Computer Languages](https://github.com/eda-ricercatore/sardegna-scala/blob/master/notes/scala-notes.md#software-implemented-in-multiple-computer-languages)
			+ [Erlang (or Ericsson Language)](https://github.com/eda-ricercatore/sardegna-scala/blob/master/notes/scala-notes.md#erlang-or-ericsson-language)
+ [Personal Notes from Developing *Scala* Software](https://github.com/eda-ricercatore/sardegna-scala/blob/master/notes/scala-notes.md#personal-notes-from-developing-scala-software)
	- [Build Process and Automation for Scala Software](https://github.com/eda-ricercatore/sardegna-scala/blob/master/notes/scala-notes.md#build-process-and-automation-for-scala-software)
		* [Compiling Scala Software](https://github.com/eda-ricercatore/sardegna-scala/blob/master/notes/scala-notes.md#compiling-scala-software)
		* [Executing Scala Software](https://github.com/eda-ricercatore/sardegna-scala/blob/master/notes/scala-notes.md#executing-scala-software)
+ [To-Do List](https://github.com/eda-ricercatore/sardegna-scala/blob/master/notes/scala-notes.md#to-do-list)










#	Key Features of *Scala*

##	In Comparison to *Java* 

Features of of *Scala* (in comparison to *Java* \cite{Tate2010}):
+ Type inference \cite[\S5.1, pp. 136]{Tate2010}
	- If possible, infer variable types.
		* Local type inference has limitations due to its 
			not-so-good constraint solver 
			\cite[\S5.1, pp. 138; \S5.2, pp. 142]{Tate2010}.
		* Because of static typing \cite[\S5.2, pp. 152]{Tate2010}.
	- At compile time:
		* *Scala* uses syntactical clues to carry out type checking
			\cite[\S5.2, pp. 140]{Tate2010}.
		* *Scala* does type binding, and type inference
			\cite[\S5.2, pp. 141-142]{Tate2010}.
	- Where possible, *Scala* uses "simple *Java* types", such as
		*java.lang.String* \cite[\S5.2, pp. 141]{Tate2010}.
	- *Java* requires type declaration for each variable,
		argument, or parameter.
		"With some exceptions", "everything is an object in *Scala*"
			\cite[\S5.2, pp. 140]{Tate2010}.
		In comparison, most statically typed object-oriented languages
			have primitives, such as *Java*
			\cite[\S5.2, pp. 140]{Tate2010} and *C++*.
	- Has strong support due to its type system
		\cite[\S5.1, pp. 138]{Tate2010}.
	- Manages types across *Scala* and *Java* 
		\cite[\S5.2, pp. 142]{Tate2010}.
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











##	*Scala* Runs on the Java Virtual Machine (JVM)

Since *Scala* runs on the *Java Virtual Machine* (*JVM*), and can
	access *Java* libraries and the *Java* core application programming
	interface (API) \cite[\S5.1, pp. 138]{Tate2010}.
+ E.g., the *Java* Core API
	\cite{OracleCorporationStaff20XYe,OracleCorporationStaff2016e} can be accessed from \cite{OracleCorporationStaff20XYd}.
	- Standard documentation for *Java* can be found at \cite{OracleCorporationStaff20XYc,OracleCorporationStaff20XYb,OracleCorporationStaff2016d,OracleCorporationStaff2016c,OracleCorporationStaff2017}


##	Features of *Scala*

+ Examples of first-class objects \cite[\S5.2, pp. 140]{Tate2010}:
	- string
	- Int (or Integer)
+ "*Scala* is strongly typed" \cite[\S5.2, pp. 141-142]{Tate2010}; it has a "strong,
	static typing philosophy" \cite[\S5.2, pp. 142]{Tate2010}. 
	- The type *Nil* is an empty list that cannot be tested in boolean
		expressions \cite[\S5.2, pp. 142]{Tate2010}.
	- "0" has the type *Int* that cannot be tested in boolean
		expressions \cite[\S5.2, pp. 142]{Tate2010}.
	- + *Scala*'s treatment/handling of \cite[\S5.2, pp. 142]{Tate2010}:
		* *Nil*. Treated as a type object or empty list. Cannot test *Nil*. 
		* *0*. Treated as an integer object. Cannot test *0*.
		* Neither *Nil* nor *0* should be treated/used as boolean expressions.
	- Difference between strong typing and static typing
		\cite[\S5.2, pp. 143]{Tate2010} \cite{Rachel2015}:
		* With strong typing, the language determines if multiple/two
			types are compatible, and throws an error if the types cannot be
			coerced (i.e., implicit type conversions \cite[\S5.2, pp. 152]{Tate2010})
			into one type. 
		* With static typing, polymorphism is enforced via the structure of the
			types. Dynamic typing does not depend on such structures.
		* Type inference is used with/by static typing, via syntactical clues
			\cite[\S5.2, pp. 152]{Tate2010}. 
	- Expressions in *Scala* tend to be stricter (in how they work) than other
	programming languages \cite[\S5.2, pp. 153]{Tate2010}. 
		* E.g., most conditionals require a boolean type, and would reject "*0*"
		and "*Nil*".
	- Advanced data types supported by *Scala* include: tuples (i.e., fixed-length
		lists with heterogeneous types) and ranges (fixed, all-inclusive ordered
		sequence of numbers) \cite[\S5.2, pp. 153]{Tate2010}.
		* "The data type *Any* ... is the catchall data type for *Scala*"
			 \cite[\S5.3, pp. 156]{Tate2010}.
			 "In the *Scala* class hierarchy," "`*Any*' is the root class";
			 everything inherits from "*Any*"
			 \cite[\S5.3, pp. 159]{Tate2010}.
		* "*Nothing*" is a subtype of every type;
			It can be used to return noting, while conforming to the return type
				and value for the given function;
				it inhertis from everything \cite[\S5.3, pp. 159]{Tate2010}.
		* "*Null* is a trait; null is an instance of *Null* that works like Java's *null*,
			meaning an empty value";
			*Nil* refers to an empty collection;
			"*Nothing* is a trait that is a subtype of everything," and "has no
			instance" and cannot be dereferenced like *Null*;
			*Nothing* can be a return type that "[means] no value at all"
				\cite[\S5.3, pp. 160]{Tate2010}.
+ Variable declaration \cite[\S5.2, pp. 142]{Tate2010}:
	- Using the "**val**" keyword for *Scala* variable declaration of an
		**immutable variable**;
		 an immutable variable (**val**) can be redefined multiple times in the
		 	console, but not outside of it (which generates errors)
		 	\cite[\S5.3, pp. 155]{Tate2010}.
	- Using the "**var**" keyword for *Scala* variable declaration of a
		**mutable variable**.
	- Be aware of the life cycle of each variable in functions/classes, in the
		context of "the pure functional programming model"
		\cite[\S5.3, pp. 154]{Tate2010}.
	 - Mutable state is bad, since it can become a conflicting state;
	 	using immutable variables (**val**) helps you avoid mutable states,
	 		which facilitates concurrent programming;
		 i.e., "mutable state limits concurrency"
	 		\cite[\S5.3, pp. 155]{Tate2010}.
+ By default, *Scala* treats variables and functions as *public*
	\cite[\S5.2, pp. 144]{Tate2010}.
+ Define a method/function with "*def method_name*"
	\cite[\S5.2, pp. 144]{Tate2010}.
+ For the *for loop*, the expression includes a variable argument (e.g., i) followed
	by the "*<-*" (assignment) operator, followed by a range (i.e., initial value until
	ending value, such as "0 until args.length") \cite[\S5.2, pp. 144]{Tate2010}.
+ *args* refers to the list of "incoming command-line arguments"
	\cite[\S5.2, pp. 144-145]{Tate2010}.
+ *Scala* provides good support for ranges \cite[\S5.2, pp. 145, 145-146]{Tate2010}.
	- val range = 0 until 10
	- range.start
	- range.end
	- range.step
	- (0 to 10 by 2)
	- The direction of the range can be specified to be in ascending/descending
		order. However, it cannot be inferred \cite[\S5.2, pp. 146]{Tate2010}.
	- A range can be specified to be inclusive; e.g., *val range = (0 to 10)*
		\cite[\S5.2, pp. 145, 145-146]{Tate2010}.
	- The default step size between elements in a range is: 1; this step size is
		independent of the endpoints expressed for the range; and the step size
		is not limited to integers \cite[\S5.2, pp. 145, 145-146]{Tate2010}.
	- *Scala* carries out implicit type conversions, such as during specifications
		of a *for loop* \cite[\S5.2, pp. 146]{Tate2010}.
	- *Scala* supports tuples, which are "fixed-length sets of objects"; these
		objects don't need to be of the same type; and tuples can be expressed
		as objects and their attributes \cite[\S5.2, pp. 146]{Tate2010}.
		Tuples can also be used for multivalue assignments
			\cite[\S5.2 pp. 147]{Tate2010}.
		*Scala* software can also perform static type checking
			\cite[\S5.2, pp. 147]{Tate2010}.. 
+ Simple *Scala* classes can be defined without methods nor constructors;
	e.g., *class* Person(first_name: String, last_name: String) 
	\cite[\S5.2, pp. 147]{Tate2010}.
	No body specifications need to be found for a class definition
		\cite[\S5.2, pp. 147]{Tate2010}.
+ Object-oriented classes in *Scala* contain data fields (i.e., variables) and
	behaviorial specifications (i.e., functions) \cite[\S5.2, pp. 147]{Tate2010}.
	- The constructor should define instance variables, not passed into the
		constructor as arguments, and methods \cite[\S5.2, pp. 148]{Tate2010}. 
	- Each *Scala* method definition has a parameter types and names
		\cite[\S5.2, pp. 148]{Tate2010}. 
	- The constructor of a *Scala* class should not be in a method definition, and
		is listed as the initial block of code in a *Scala* class;
		basic/primary constructors are code blocks that intitializes classes
		and methods \cite[\S5.2, pp. 148-149]{Tate2010}.
	- In *Scala* class definitions, method definitions follow the constructor
		\cite[\S5.2, pp. 149]{Tate2010}. 
	- For one-line method definitions, the braces around the method body can
		be obmitted \cite[\S5.2, pp. 149]{Tate2010}. 
	- Secondary/auxiliary constructors are defined like methods with the name
		(method name)"*this*," and support "a broad array of usage patterns"
		\cite[\S5.2, pp. 150]{Tate2010}.
	- *Scala* allow instance methods to be declared only in the class definitions,
		with the keyword "class" instead of the keyword "object";
		in *Scala,* an object definition can share the same name as a class
		  	definition;
		the *companion objects* strategy "creates class methods within the
			singleton object declaration, and instance methods within the class
			definition" \cite[\S5.2, pp. 150]{Tate2010}.
	- Regarding class inheritance, a child class shall overwrite method(s) in the
		parent class, and uses the word "*extends*" to inherit from a parent
		class;
		also, the keyword "*overwrite*" shall be mentioned preceding the
			definition of an overwritten method;
		when the parent class is mentioned, its "complete parameter list" shall
			be specified (specification of the types of the parent class is
			optional) \cite[\S5.2, pp. 151]{Tate2010}.
	- *Scala* traits are comparable to *Ruby mixins* that are implemented with
		modules, or *Java* interfaces with implementation, or multiple
		inheritance in *C++*;
		this allows *Scala* objects to be persistent, serializable shrubbery;
		a *Scala* trait can be perceived to be a partial class implementation,
			and is included in class definitions.
			\cite[\S5.2, pp. 151-152]{Tate2010}.
+ *Scala* functions
	- The "*def*" keyword is used to define functions (and methods) in *Scala*;
		after the "*def*" keyword and the function name, its parameters and
		their types are specified next within parentheses (round brackets);
		if the return type is not optionally specified, it is inferred
			\cite[\S5.3, pp. 154]{Tate2010}.
	- Include the mandatory "*=*" sign after the return type
		\cite[\S5.3, pp. 154]{Tate2010}.  
	- Invoke *Scala* functions using their name, and the argument list
		encapsulated in parentheses \cite[\S5.3, pp. 154]{Tate2010}.
+ Collections
	- Primary data structures for *Scala*: lists, sets, and maps
		 \cite[\S5.3, pp. 155-156]{Tate2010}.
	- The list is the primary data structure for functional programming languages;
	 	it is an ordered collection of things belonging to the same data type or
			clique in the class hierarchy;
		it uses the *Java* feature *generics* to type the items in the list
			\cite[\S5.3, pp. 156]{Tate2010}.
		* Since list access is a function, use the "*()*" operator to access an
			element in the list;
			"*Scala*'s index for lists starts with 0," and accessing elements/items
				outside the range of the list with result in an exception being
				thrown \cite[\S5.3, pp. 156]{Tate2010}.
		* Accessing the list using a negative number will result in an exception
			being thrown \cite[\S5.3, pp. 157]{Tate2010}.
	- A set is an unordered data structure, which allows elements to be added
		to or removed from the set, using the "*+*" and "*-*" operations
		respectively; and
		each set operation builds a new set, as opposed to modifying existing
			sets \cite[\S5.3, pp. 157]{Tate2010}.
		"By default, sets are immutable" \cite[\S5.3, pp. 157-158]{Tate2010}.
		To perform set union and set difference operations on sets, use "*++*"
			and "*--*" accordingly" \cite[\S5.3, pp. 158]{Tate2010}.
		To performa set intersection operation between elements, try "*&*"
			\cite[\S5.3, pp. 158]{Tate2010}.
	- A map is a data structure for key-value pairs, or (key,value) pairs; and
		use the "*->*" operator to access the value of a  (key,value) pair
		\cite[\S5.3, pp. 158]{Tate2010}.
		For assigning a (key,value) pair to the set, try
			"*set_name += key --> value*" \cite[\S5.3, pp. 158-159]{Tate2010}.
		When type constraints of the map are not adhered to, errors/exceptions
			are thrown at compile time or run-time \cite[\S5.3, pp. 159]{Tate2010}.
+ *Scala* application programming interface (API) \cite[\S5.2, pp. 153]{Tate2010}.
+ "A higher-order function is [a function] that produces or consumes functions";
	specifically, it accepts other functions via input parameters and/or returns
	functions as output \cite[\S5.3, pp. 160-161]{Tate2010}
		\cite[\S6.3, pp. 198]{Tate2010}.
	- Functions can be passed into these higher-order functions
		\cite[\S5.3, pp. 160]{Tate2010}.
	- "Assign input functions to any variable or parameter, or pass them into
		functions, and return them from functions"
	- Advanced topics in higher-order functions include \cite[\S5.3, pp. 161]{Tate2010}:
		* partially applied functions, or currying
		* Code blocks, passing simple functions as parameters into collections;
			the code block can be an anonymous function, or a function
			without a name
		* Anonymous functions can be passed as input parameters to
			higher-order functions on collections
	- The function/method "*foreach*" is performed on collections, and accepts
		a code block as a parameter;
		it iterates through the data structure, and performs functions (in the
			code block) on it \cite[\S5.3, pp. 161]{Tate2010}.
	- The function/method "*foreach*" has two versions, and accepts an initial
		value and a code block into its input parameters, passes each element
		of the container (e.g., array) and another value:
		* this other value is the initial value for the first invocation of the
			"*foreach*" function/method
		* or, this other value is the result from the code block for subsequent
			invocations;
			"currying transforms a function with multiple parameters [into]
				several functions with their own parameter lists (a composition
				of functions)
				\cite[\S5.3, pp. 164-165]{Tate2010}.
	- BLAH
	



Skimming through other chapters

















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
		as that of other repetitions \cite[\S6.2, pp. 185]{Tate2010}.
+ In the functional programming paradigm, software developers avoid
	changing the state of an executing program or modifying its data
	\cite[\S5.1, pp. 138]{Tate2010}. 
	- The use of assignments to modify the values of variables is
		discouraged \cite{WikipediaContributors2017e}.
	- The values of variables can be modified via recursive function
		calls \cite{WikipediaContributors2017e}.
	- By avoiding state mutation, concurrent programming becomes
		easier \cite[\S5.1, pp. 138]{Tate2010}. 



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
	- References:
		* \cite[\S4.3 pp. 111]{Tate2010} discusses tail recursion optimization. 
	- Declarative interpretation need not be restricted to recursive functions
		(recursive application of logical rules, or recursive rule application).
		It (reasoning on nested rules) can be replaced with goal proving and
			subgoal satisfaction;
			the logical reasoning engine has to perform goal proving and
				subgoal satisfaction \cite[\S4.3 pp. 113]{Tate2010}.
+ immutability


##	Pure Functional Programming Languages

"Pure functional programming languages allow" software developers to
	use a programming style that has certain mathematical features
	or characteristics
	\cite[\S5.1, pp. 138]{Tate2010} \cite{WikipediaContributors2017e}.

The purely functional programming paradigm only performs computation
	that evaluates mathematical functions \cite[\S6.2, pp. 185]{Tate2010}, and
	cannot change the state of the computer program via mutable datafields
	\cite[\S6.2, pp. 186]{Tate2010};
	this implies that all functions would be solely dependent on their
		input arguments, and are independent of the local or global state
		of the computer program \cite{WikipediaContributors2017g};
	that is, these functions have no side effects, and cannot modify the program
		state (or state of the program) \cite[\S6.2, pp. 186]{Tate2010}.

Pure functional programs use persistent (purely functional) data
	structures, so that the repreated evaluation of a function would
	always return the same result for the same input arguments (of
	that function) \cite{WikipediaContributors2017g}.

Purely functional programming makes it easier to develop parallel
	programs, since the developers do not have to be concerned about
	interacting evaluations of mathematical functions (purely
	functional components) \cite{WikipediaContributors2017g}.

Each variable can only be assigned once \cite[\S6.2, pp. 186]{Tate2010}.





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
Any given programming language can support multiple programming paradigms,
	or programming models \cite[\S2.2, pp. 29]{Tate2010}.

A taxonomy of programming paradigms \cite{WikipediaContributors2017e}:
+ Automata-based programming \cite{WikipediaContributors2017j} -- A
	computer program based on a finite state machine (FSM) model, or
	another formal automaton.
	Its characteristics are \cite{WikipediaContributors2017j}: "state
		enumeration, control variable, state changes, isomorphism,
		state transition table."
+ Concurrent programming (compare: parallel programming)
	\cite{WikipediaContributors2017k} -- Concurrent computing
	concurrently execute multiple computations during overlapping
	time periods;
	each computation/process has a separate execution point or thread
	of control.
	That is, in concurrent computing, a computation can advance
		independently of other computations, which may be incomplete.
	
+ Data-driven programming
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
	This programming paradigm is a style of constructing a computer program's
		structure and elements \cite{WikipediaContributors2017m}.
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
	The types of parallel computing are: bit-level parallelism,
		instruction-level parallelism, data parallelism, and task
		parallelism.
	Bit-level parallelism and instruction-level parallelism are
		implicitly parallel.
	Explicitly parallel algorithms, especially those that involve
		concurrency, are more difficult to develop and test than
		sequential algorithms;
		concurrency in such algorithms can lead to race conditions,
		and other types/classes of software bugs.
	It is difficult to manage communication and synchronization
		between subtasks, such that the parallel computation would
		have a significant speed-up over the serial/sequential
		implementation.
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
	include syntactic sugar (features added for convenience
	\cite[\S2.3, pp. 36]{Tate2010}), syntactic salt, syntactic saccharin, and
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
+ Concurrent improvement via threads and processes
	\cite[\S6.1, pp. 182]{Tate2010}:
	- A process can be composed of many threads, and has its own resource.
	- A "thread [has its] own execution path, but [shares] resources with other
		threads in the same process."
	- Therefore, a thread usually does not use more resource than a process;
		or, a thread uses less resource than a process.
	- The fewer resource usage of threads (compared to processes) comes at
		the expense of the need for (operating system -level) locks and
		semaphores to protect shared resources (or coordinate
		access/modification control between multiple threads);
		these locks lead to performance bottlenecks
			\cite[\S6.1, pp. 182]{Tate2010}.















###	Miscellaneous Information

####	Logic/Declarative Programming
Logic/declarative programming languages, such as *Prolog*, can be used to
	"[solve/analyze] systems with constraints" (or "constrained systems", or
	"systems with constrained resources") \cite[\S4.4, pp. 120,126,133]{Tate2010};
	*Prolog* can be used to solve constraint-based problems
		\cite[\S4.4, pp. 131]{Tate2010}, by processing rules that are compositions
		of (clauses of) goal compositions -- a rule is a composition of clauses,
		and a clause is a composition of a series of goals 
		\cite[\S4.5, pp. 132]{Tate2010}.

Unification of nested subgoals is an important concept for logic programming in
	*Prolog* \cite[\S4.3, pp. 119]{Tate2010}.
	Unification matches variables on both sides of a system;
		this is analogous to assignments in the imperative programming paradigm;
		however, the logical reasoning engine may "[have] to try many possible
		combinations of variables to unify variables for an inference"
		\cite[\S4.5, pp. 132]{Tate2010}.
	When exploring "all possible combinations" of variables for a given set of
		rules, *Prolog* compilers tend to use depth-first search on a decision
		tree \cite[\S4.5, pp. 134]{Tate2010};
		for very large data sets, *Prolog* compilers have to run slow algorithms
			(i.e., depth-first search) on very large decision trees;
		 hence,  *Prolog* developers have to exploit features of *Prolog* to keep
		 	the size of the data sets manageable for automated logical reasoning,
		 	else automated logical reasoning would take too long
			\cite[\S4.5, pp. 134]{Tate2010}.
	Tail recursion optimization has to be exploited to keep the set of rules at
		acceptable levels \cite[\S4.5, pp. 134]{Tate2010}.

#####	*Prolog*

Programming in *Prolog* involves these two steps \cite[\S4.5, pp. 132]{Tate2010}:
+ Use "logical facts and inferences about the problem domain" to "[build] up
	[the] knowledge base. 
+ "Compile [the] knowledge base, and ask questions [(can be assertions)] about
	the domain"

####	Software Implemented in Multiple Computer Languages

We can use multiple computer languages in a software to exploit the advantages
	of each computer language.
	E.g., we can combine *SQL* and *Ruby*/*Java* in software applications that
		need/require a database.
	Similarly, we can combine *Prolog* with *C++* in software applications that
		require automated logical reasoning on a set of (recursive) rules
		\cite[\S4.5, pp. 134]{Tate2010}.

####	*Erlang* (or *Ericsson Language*)

*Erlang* (or *Ericsson Language*) is a functional programming language that
	supports scalable concurrency and reliability
	\cite[\S6.1, pp. 181-182]{Tate2010}.

*Erlang* uses distributed message passing and lightweight processes to avoid
	performance bottlenecks concerning shared resources,
	and improve concurrency \cite[\S6.1, pp. 182-183]{Tate2010}.
	An actor represents each lightweight process;
	processes inbound messages from the input queue, and uses pattern
		matching to determine how to process the inbound messages
		\cite[\S6.1, pp. 183]{Tate2010}.

*Erlang*'s "Let it crash" philosophy for fault tolerance (and non-defensive
	programming \cite[\S6.1, pp. 184]{Tate2010}) leads to support for allowing
	low-overhead processes to be monitored ("Is it alive?"), terminated, restarted,
	and replaced during execution (i.e., "hot-swap code").
	Since these processes are lightweight, resource management of constrained
		resources would not be a major problem 
	\cite[\S6.1, pp. 183]{Tate2010}.

*Erlang* supports the development of "robust concurrent systems," which do not
	require significant error handling;
	when a process dies, we just start its twin process
		\cite[\S6.4, pp. 218]{Tate2010}.

*Erlang* supports simple implementations of "monitors that watch each other"
	\cite[\S6.4, pp. 218]{Tate2010}.

The "foundational principles in *Erlang*" are \cite[\S6.2, pp. 185]{Tate2010}:
+ code blocks
+ actors
+ pattern matching
+ distributed message passing
	- Messaging models can be asynchronous or synchronous 
		\cite[\S6.4, pp. 210]{Tate2010}.
	- Processes communicate with each other using message passing;
		*Erlang* supports "message passing and encapsulation of behavior"
			\cite[\S6.4, pp. 212]{Tate2010}.
	- BLAH

Higher-order functions in *Erlang* can "simulate" inheritance 
	\cite[\S6.4, pp. 212]{Tate2010}.

To support reliability and fault tolerance, *Erlang* enables a pair of processes to
	be linked; 
	the death of one of these two processes would send an exit signal to its
		linked twin (process), so that its linked twin (process) can receive that
		signal and react accordingly \cite[\S6.4, pp. 213]{Tate2010}.











#####	Questions about *Erlang*

Questions about *Erlang*:
+ Can lists in *Erlang* be heterogeneous, and be comprised of elements of
	multiple types? \cite[\S6.2, pp. 188]{Tate2010}
+ Can more than two processes be linked together? If so, how?
	\cite[\S6.4, pp. 213]{Tate2010}





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












#	Author Information

The MIT License (MIT)

Copyright (c) <2016> Zhiyang Ong

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

Email address: echo "cukj -wb- 23wU4X5M589 TROJANS cqkH wiuz2y 0f Mw Stanford" | awk '{ sub("23wU4X5M589","F.d_c_b. ") sub("Stanford","d0mA1n"); print $5, $2, $8; for (i=1; i<=1; i++) print "6\b"; print $9, $7, $6 }' | sed y/kqcbuHwM62z/gnotrzadqmC/ | tr 'q' ' ' | tr -d [:cntrl:] | tr -d 'ir' | tr y "\n"		Don't compromise my computing accounts. You have been warned.

