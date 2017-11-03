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
			+ [Clojure](https://github.com/eda-ricercatore/sardegna-scala/blob/master/notes/scala-notes.md#clojure)
			+ [Haskell](https://github.com/eda-ricercatore/sardegna-scala/blob/master/notes/scala-notes.md#haskell)
			+ [Notes about Additional Programming Languages/Paradigms](https://github.com/eda-ricercatore/sardegna-scala/blob/master/notes/scala-notes.md#notes-about-additional-programming-languagesparadigms)
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
		+ A possible consequence of this (non-pure functional programming
			language) is that a function called with the same set of inputs may
			result in different outputs \cite[\S5.1, pp. 138]{Tate2010}.
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
	 - "Mutable state is bad," since it can become a conflicting state;
	 	using immutable variables (**val**) helps you avoid mutable states,
	 		which facilitates concurrent programming;
		 i.e., "mutable state limits concurrency"
	 		\cite[\S5.3, pp. 155]{Tate2010};
		this design philosophy is the main differentiator between functional
			programming and object-oriented programming
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
			\cite[\S5.2, pp. 147]{Tate2010}.
+ Simple *Scala* classes can be defined without methods nor constructors;
	e.g., *class* Person(first_name: String, last_name: String) 
	\cite[\S5.2, pp. 147]{Tate2010}.
	No body specifications need to be found for a class definition
		\cite[\S5.2, pp. 147]{Tate2010}.
+ Object-oriented classes in *Scala* contain data fields (i.e., variables) and
	behaviorial specifications (i.e., functions) \cite[\S5.2, pp. 147]{Tate2010}.
	- The constructor should define instance variables, especially instance
		variables not passed into the constructor as arguments, and methods
			\cite[\S5.2, pp. 148]{Tate2010}. 
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
		\cite[\S5.2, pp. 150]{Tate2010};
		secondary/auxiliary constructors are defined after the primary
			constructor \cite[\S5.2, pp. 150]{Tate2010}.
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
		this allows *Scala* objects to "be persistent, serializable shrubbery";
		a *Scala* trait can be perceived to be a "partial class implementation",
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
	functions as output \cite[\S5.3, pp. 160-161; \S6.3, pp. 198]{Tate2010}.
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


**Adopting the functional programming paradigm with a backgroun in imperative
	programming, procedural programming, structured programming, and
	object-oriented programming is a shift from writing pseudocode**
	\cite[\S1.1.1, pp. 5-6]{Goodrich2015} \cite[\S2.2.2, pp. 64]{Goodrich2013}
	\cite[\S1.9.2, pp. 48]{Goodrich2010} \cite[\S1.7.2, pp. 54-55]{Goodrich2011}
	\cite[\S2.1, pp. 17,20-22]{Cormen2009}**,
	for high-level analysis of an algorithm or a data structure (e.g., proving
	algorithm correctness), to describing what functions should the program
	perform.**

Performance analysis of algorithms can be carried out using:
+ **computational time complexity** \cite[\S1.1.3, pp. 8-9]{Goodrich2015}**,
	via asymptotic notation** \cite[\S1.1.5, pp. 11-18]{Goodrich2015}
	**(or asymptotic analysis** \cite[\S3.3, pp. 123-136]{Goodrich2013}
	\cite[\S4.2, pp. 166-184]{Goodrich2010} \cite[\S.4.2, pp. 162-180]{Goodrich2011}
	\cite[\S2.2, pp. 23-29; \S3, pp. 43-64]{Cormen2009}**)**
	- worst-case analysis
	- average-case analysis
+ computational space complexity
+ performance meaurement





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
	- To perform computation on an "infinite sequence", by lazily "computing
		values only when [the values] are consumed"
		\cite[\S7.3, pp. 247]{Tate2010}.
	- Most sequences in *Clojure*'s sequence library use lazy evaluation
		\cite[\S7.3, pp. 247]{Tate2010}.
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

Software developed in pure functional programming languages are reliable and
	dependent, since each function in such/this software will return the same
	output values for the same set of input values.
	This simplies software testing, verification, and validation, due to the
		absence of side effects \cite[\S8.5, pp. 310]{Tate2010}.


















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

To address mutable states in concurrent (object-oriented) software
	\cite[\S7.4, pp. 256]{Tate2010}:
+ Develop *Scala* and/or *Io* software using the actor-based model, and
	immutable constructs, so that usage of mutable variables can be avoided.
+ Develop *Erlang* software using the actor-based model, associate each
	actor with lightweight processes, and use the *BEAM* (*Bogumil's/Bj{\"{o}}rn's
	Abstract Machine*) virtual machine (*Erlang* Virtual Machine)
	\cite{Lytovchenko2017} for reliable communication and monitoring.
+ *Clojure* software "[use] software transactional memory (STM)" "to share [state
	(information)] across threaded applications."














##	Comparison of Function Programming to Other Programming Paradigms 

Functional programming languages can better support concurrency by
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

"Though programming paradigms change slowly, they do change. Like a
	tornado's path, they can leave behind some devastation, taking the form of
	broken careers and companies that invested poorly."
	\cite[\S9.1, pp. 314]{Tate2010}.

To be completed.



###	IMPORTANT

Find out about the advantages of functional programming paradigm
	\cite{Graham2004} over procedural and structural programming paradigms.
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
+ Concurrency improvement via threads and processes
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

+ Concurrency primitives: send, receive, and spawn
	\cite[\S6.4, pp. 218]{Tate2010}.

"Certain styles lend themselves to certain programming paradigms"
	\cite[\S8.5, pp. 311]{Tate2010}.









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
	supports scalable concurrency and reliability (or fault tolerance
	\cite[\S6.5, pp. 219; \S6.1, pp. 181-182]{Tate2010}.

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
	This philosophy trades-off code simplicity (in the *Erlang* software) for more
		"required base support at the virtual machine level" compared to other
		systems \cite[\S6.5, pp. 219]{Tate2010}.

*Erlang* supports the development of "robust concurrent systems," which do not
	require significant error handling;
	when a process dies, we just start its twin process
		\cite[\S6.4, pp. 218]{Tate2010}.

*Erlang* supports simple implementations of "monitors that watch each other";
	these monitors can be used to improve reliability
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
	- Distributed communication in *Erlang* that functions like "interprocess
		communication" \cite[\S6.4, pp. 218]{Tate2010}.

Higher-order functions in *Erlang* can "simulate" inheritance 
	\cite[\S6.4, pp. 212]{Tate2010}.

To support reliability and fault tolerance, *Erlang* enables a pair of processes to
	be linked; 
	the death of one of these two processes would send an exit signal to its
		linked twin (process), so that its linked twin (process) can receive that
		signal and react accordingly \cite[\S6.4, pp. 213]{Tate2010}.

Characteristics of the *Erlang* libraries \cite[\S6.5, pp. 220]{Tate2010}:
+ fault tolerance
+ scalability
+ transactional integrity
+ hot-swapping











#####	Questions about *Erlang*

Questions about *Erlang*:
+ Can lists in *Erlang* be heterogeneous, and be comprised of elements of
	multiple types? \cite[\S6.2, pp. 188]{Tate2010}
+ Can more than two processes be linked together? If so, how?
	\cite[\S6.4, pp. 213]{Tate2010}








####	*Clojure*


Characteristics of *Clojure* \cite[\S7, pp. 223]{Tate2010}:
+ Complicated
+ Powerful
+ "*Lisp* on the *JVM*"; or "yet another *Lisp* dialect";
	it has similar language restrictions and strengths as *Lisp* (LISt Processing)
		\cite[\S7.1, pp. 224]{Tate2010}, and has good support for
		metaprogramming \cite[\S7.1, pp. 224]{Tate2010} via higher-order
		functions \cite[\S7.5, pp. 266]{Tate2010}.
	- Language of lists
		* When a function is called, the first element in the list is the function,
			and the remaining elements in the lists are the arguments of the
			function.
		* Use Polish notation \cite{WikipediaContributors2017w}, or prefix
			notation, to represent functions (such as mathematical operations)
			and their arguments;
			compare to the reverse Polish notation, or postfix notation
				\cite{WikipediaContributors2017x}.
	- "Use its own data structures to express code"; this strategy is known as
		"data as code";
		"Programs are lists" \cite[\S7.5, pp. 266]{Tate2010}.
	- Using the previously mentioned concepts/ideas, arrange *Lisp* code
		\cite[\S7.1, pp. 224]{Tate2010}:
		* "As named methods in a class".
		* As objects connected in a tree-like class hierarchy (inheritance tree),
			comparable to a class diagram in UML \cite{Stevens2000}
			\cite{Rosenberg2007} \cite{Fowler2004} \cite{Rumbaugh2004}
			\cite{Booch2005}.
		* As "a prototype-based code organization with slots for data and
			behavior".
		* For "a pure-functional implementation".
		* To support programming in various programming paradigms.  
	- Primary dialects of *Lisp*, which differ by how their namespaces work
		\cite[\S7.1, pp. 224]{Tate2010}:
		* *Common Lisp*
		* *Scheme*
	- *lisp-1* family of *Lisp* dialects \cite[\S7.1, pp. 224]{Tate2010}:
		* *Scheme*.
		* *Clojure*.
		* Use the same namespace for functions and variables.
	- *lisp-2* dialect of *Lisp* \cite[\S7.1, pp. 224]{Tate2010}.
		* Use separate namespaces for functionsw and variables.
	- *Clojure* software can access multiple *Java* libraries
		\cite[\S7.1, pp. 225]{Tate2010}.
+ Dynamically typed \cite[\S7.1, pp. 225; \S7.2, pp 228]{Tate2010}.
	- "Supports strong, dynamic typing" \cite[\S7.2, pp. 228--229]{Tate2010}.
	- With dynamic typing, the type of a variable "[is] evaluated at run time"
		\cite[\S7.2, pp. 229]{Tate2010}. 
	- "*Clojure*'s types are unified with the underlying *Java* type system"
		\cite[\S7.2, pp. 229]{Tate2010}.
+ Expressive \cite[\S7.1, pp. 225]{Tate2010}.

To provide safe and concurrent access to memory, so that the use of mutable
	variables in *Clojure* is supported ("*Clojure* allows limited side effects"
	\cite[\S7.2, pp. 241]{Tate2010}), use the transactional memory (in *Clojure*)
	in the same way I would use transactional databases (to minimize side effects);
	use agents to gain encapsulated access to mutable resources
		\cite[\S7.1, pp. 225]{Tate2010}.

Use \cite{Hagelberg2017} for build automation of *Clojure* programs/software.

Use Polish notation \cite{WikipediaContributors2017w}, or prefix notation, to
	represent functions (such as mathematical operations) and their arguments
		\cite[\S7.2, pp. 226-227]{Tate2010};
	compare to the reverse Polish notation, or postfix notation
		\cite{WikipediaContributors2017x};
	this representation is like *Lisp*, hence "*Lisp* on the *JVM*".

(Basic) data types of *Clojure* \cite[\S7.2, pp. 227]{Tate2010}:  
+ *ratio*. Enables delay of computation, an approximate numerical value of the
	ratio, so that we can avoid numerical approximation and consequently a
	"lost of precision". 




A *form* is a basic building block of *Clojure* \cite[\S7.2, pp. 228]{Tate2010}.
	During compilation/interpretation, after parsing, the compiler/interpreter for
		*Clojure* would break the program into *forms*
		\cite[\S7.2, pp. 228]{Tate2010};

Examples of forms are \cite[\S7.2, pp. 228]{Tate2010}:
+ booelans
	- " `*0* and "" are *true,* but *nil* is not."
+ characters
+ strings
+ sets
+ maps
+ vectors

The main data structures that *Clojure* software tend to use are
	\cite[\S7.2,pp. 230]{Tate2010}
+ lists
	However, in idiomatic *Clojure*, use \cite[\S7.2, pp. 231]{Tate2010}:
	- "lists for code" 
	- "vectors for data"
	A list is an ordered collection \cite[\S7.2, pp. 232]{Tate2010}.
+ maps
+ vectors \cite[\S7.2, pp. 231]{Tate2010}:
	"A vector is an ordered collection of elements" \cite[\S7.2, pp. 232]{Tate2010}.
	"Vectors are optimized for random access."
	**A vector is a function that processes its index as an input argument**
		\cite[\S7.2, pp. 232]{Tate2010}. 

Many collection-returning *Clojure* functions use the *Clojure* abstraction,
	"sequence" \cite[\S7.2, pp. 232]{Tate2010}. 

When performing pattern matching with vectors, use the head and tail of the
	vector.

Types of unordered collections (of elements) in *Clojure* \cite[\S7.2, pp. 232]{Tate2010}:
+ maps
	- "A map is a key-value pair" \cite[\S7.2, pp. 233]{Tate2010}.
	- Represent map with curly braces/parentheses \cite[\S7.2, pp. 233]{Tate2010}.
	- Keywords and symbols are "two kinds of forms" for naming things
		\cite[\S7.2, pp. 233]{Tate2010}.
		A keyword points to itself and names domain entities, while a symbol
			points to something else \cite[\S7.2, pp. 233-234]{Tate2010}.
	- A map is a function \cite[\S7.2, pp. 234]{Tate2010}.
	- A keyword is also a function \cite[\S7.2, pp. 234]{Tate2010}.
	- For a "given association", use it to "create a new association with a new
		key-value pair \cite[\S7.2, pp. 234]{Tate2010}.
	- A sorted map is a map that orders key-value pairs according to a
		given/default ordering \cite[\S7.2, pp. 234]{Tate2010}.
+ sets
	- A set collection has a stable order that is implementation dependent;
		hence we should not depend on such ordering \cite[\S7.2, pp. 232]{Tate2010}.
	- Wrap/Surround a set with curly braces/parentheses, with a "#" (pound
		symbol) prefix \cite[\S7.2, pp. 232]{Tate2010}.
	- A sorted set is a set that orders elements according to a given/default
		ordering \cite[\S7.2, pp. 233]{Tate2010}.
	- A set is a function, and allows membership testing of a given element/item.
		\cite[\S7.2, pp. 233]{Tate2010}.
	

*Clojure* functions:
+ The behavior of a *Clojure* program/software is defined by its function(s)
	\cite[\S7.2, pp. 234]{Tate2010}.
+ Define a *Clojure* function with *func* \cite[\S7.2, pp. 234]{Tate2010}.
	- E.g., (defn *name-of-function* *[parameters]* *body*)
		\cite[\S7.2, pp. 235]{Tate2010}.
	- To call the function, try: (*name-of-function*) \cite[\S7.2, pp. 235]{Tate2010}.
	- An additional string can be used as documentation (like comments) in the
		body of a function, between its name and its parameters
		\cite[\S7.2, pp. 235]{Tate2010}.
+ *(doc *name-of-function*)* is used to print information (if any) about the function
	that is specified in the documentation line \cite[\S7.2, pp. 235]{Tate2010}.
+ Binding is "the process of assigning parameters based on the inbound
	arguments" \cite[\S7.2, pp. 236]{Tate2010}. 
	- *Clojure* allows "any portion of any argument" to be accessed as a
		parameter \cite[\S7.2, pp. 236]{Tate2010}.
	- Destructuring allows us to decompose a data structure, and only access
		relevant components of the data structure
		\cite[\S7.2, pp. 236]{Tate2010}.
		* "Destructuring is simply a form of pattern matching"
			\cite[\S7.2, pp. 237]{Tate2010}.
		* Carry out destructuring in the input/inbound argument list or in *let*
			statements \cite[\S7.2, pp. 237]{Tate2010}.
		* Destructure maps, ...
	- Regarding the list of input/inbound parameters, use "*_*" idiomatically to
		refer to parameters that can/should be ignored
		\cite[\S7.2, pp. 236]{Tate2010};
		this allows us to avoid using wildcard arguments in function calls
			\cite[\S7.2, pp. 237]{Tate2010};
		this allows us to concentrate on target arguments
			\cite[\S7.2, pp. 237]{Tate2010}.
+ Combine data structures/types:
	- maps and vectors \cite[\S7.2, pp. 237]{Tate2010}.
+ Anonymous functions, or unnamed functions, can be created from higher-order
	functions \cite[\S7.2, pp. 238]{Tate2010};
	higher-order functions without function names are anonymous functions, or
		unnamed functions \cite[\S7.2, pp. 238]{Tate2010}.
	these higher-order functions can be functions operating on collections
		\cite[\S7.2, pp. 239]{Tate2010}.
+ "To build platform-fast open extensions by programming to abstractions, rather
	than implementations", use *defrecord* for type operations and *protocol*
	for "grouping functions together around a type"
	\cite[\S7.3, pp. 250]{Tate2010}.
	- A "protocol" in *Clojure* is a contract, and specifies a specific set of
		functions, fields, and arguments that must be supported by its types
		\cite[\S7.3, pp. 250-251]{Tate2010}.  
	- For "[defined] JVM types", access all fields as *Java* fields or in the type as
		*Clojure* map keywords \cite[\S7.3, pp. 252]{Tate2010}.
		* "[Since] these types function/work like maps," "prototype new types as
			maps, and iteratively convert them to types as [the software] design
			stabilizes" \cite[\S7.3, pp. 252]{Tate2010}.
		* To use types as stubs or mocks, substitute types as maps in my test
			suite \cite[\S7.3, pp. 252]{Tate2010}.
		* Types support "[alternate] *Clojure* concurrency constructs", such as
			maintaining transactional integrity (similar to relational databases)
			with the use of mutable references of *Clojure* objects
			\cite[\S7.3, pp. 252-253]{Tate2010}.
		* Defined JVM types can "interoperate with *Java* classes and interfaces"
			\cite[\S7.3, pp. 253]{Tate2010}.
		* *defrecord* and *protocol* enable *Clojure* code to run on the JVM,
			without *Java*.
			Such code "can interact with other [JVM] types, including *Java*
				classes or interfaces", such as using them to "subclass *Java*
				types or implement *Java* interfaces.
			"*Java* classes can build on [these] *Clojure* types"
				\cite[\S7.3, pp. 253]{Tate2010}. 
		* This is an important subset of *Clojure/Java* interoperability
			\cite[\S7.3, pp. 253]{Tate2010}.


Applications of *Clojure*:
+ Create domain-specific languages (DSLs) \cite{Fowler2011}, "using the
	syntactic abstraction of macros to make a DSL for the machine learning
	and statistical inference bits
	\cite[\S7.2, pp. 240]{Tate2010}.
+ *Java* interop (i.e., Interoperability???), so that the *Clojure* software can work 
	with software infrastructure frameworks, such as *Hadoop* and *Cascading*
	\cite[\S7.2, pp. 240]{Tate2010}.

By reducing the need for using parentheses, *Clojure* makes it easier for
	*Clojure* software developers to use macros, but "slighty harder for macro
	writers" \cite[\S7.2, pp. 241]{Tate2010}. 

*Clojure* source code tends to contain fewer parentheses "than older *LIsp*s";
	hence, *Clojure* source code is "easier to scan, visually parse, and
	understand" \cite[\S7.2, pp. 241]{Tate2010}.


Differences between *Clojure* and other *Lisp* dialects
	\cite[\S7.2, pp. 241-242]{Tate2010}:
+ Additional/Different syntax \cite[\S7.2, pp. 241-242]{Tate2010}
	- "Use braces "{}" for maps"
	- "Use brackets "[]" for vectors"
	- "Use commas for whitespace"
	- Exclude (leave out/omit) parentheses "()" in certain places




Concepts in *Clojure* \cite[\S7.3, pp. 243]{Tate2010}:
+ Abstraction layer unifies  *Clojure* collections and *Java* collections.
+ Lazy evaluation
	- To perform computation on an "infinite sequence", by lazily "computing
		values only when [the values] are consumed"
		\cite[\S7.3, pp. 247]{Tate2010};
		significantly reduce computation overhead due to delayed execution
			or execution that is prevented from occurring
			\cite[\S7.5, pp. 265]{Tate2010}.
	- Most sequences in *Clojure*'s sequence library use lazy evaluation
		\cite[\S7.3, pp. 247]{Tate2010}.
	- Simplify approach to solve problem \cite[\S7.5, pp. 265]{Tate2010}.
	- Can be used instead of "recursion, iteration, or realized collections"
		\cite[\S7.5, pp. 266]{Tate2010}.
+ Just-in-time strategy
+ Use explicit recursion (using *loop* and *recur*) rather than iteration
	- Implicit tail recursion optimization is not supported, due to limitations of
		the JVM \cite[\S7.3, pp. 243,253]{Tate2010};
		hence, *loop* and *recur* are used for working around the lack of
			support for tail recursion \cite[\S7.3, pp. 243,253]{Tate2010}.  
+ Metadata can be associated (via a map) with a type, symbol, and collection.
	\cite[\S7.4, pp. 262]{Tate2010}
+ *Java*/JVM integration \cite[\S7.4, pp. 262]{Tate2010}
+ Multimethods can be used to organize behavior and data in *Clojure* software,
	by "[associating] a library of functions with a type" and "[implementing]
	polymorphism (via multimethods) for method dispatch based on type,
	metadata, arguments, and attributes \cite[\S7.4, pp. 262]{Tate2010}.
+ "vars" can be used to bind data to a variable "only for the current thread," so
	that data can be stored "per thread instance" \cite[\S7.4, pp. 262]{Tate2010}.

















*Clojure* software "[use] software transactional memory (STM)" 
	(\cite[\S7.4, pp. 256]{Tate2010}) "to maintain consistency and [data] integrity",
	"using multiple versions" \cite[\S7.4, pp. 256]{Tate2010}. 
+ "Changes [to] the state of a reference" must be made "within the scope of a
	transaction" \cite[\S7.4, pp. 256]{Tate2010}.
+ Using versioning, instead of locks, for concurrency control and ensuring data
	integrity shifts the burden of concurrency control away from the programmer
	\cite[\S7.4, pp. 256]{Tate2010}.
+ In versioning, the database enables each transaction to keep a private copy of
	its data, using multiple versions. If the transactions interfere with each other,
	the affected transactions are rerun by the database
	\cite[\S7.4, pp. 256]{Tate2010}. 
+ A reference is a wrapped data item, which data access has to comply with
	specific rules that support STM, and can only be modified during a
	transaction \cite[\S7.4, pp. 256]{Tate2010}.  
+ To modify a reference during a transaction, use a transforming function or use
	*ref-set*; this prevents race conditions and deadlocks from happening
	\cite[\S7.4, pp. 257]{Tate2010}.
+ "A *Clojure* atom is an encapsulated bit of state;
	an atom allow a single reference, which is uncoordinated with other activities,
	to be modified "outside the context of a transaction" with thread safety
	\cite[\S7.4, pp. 258]{Tate2010}.
+ Use atoms and references to synchronously and safely access and modify
	mutable states \cite[\S7.4, pp. 259]{Tate2010}.
+ "An agent is a wrapped piece of data," which state can only be exclusively
	mutated by a function at a given instance \cite[\S7.4, pp. 260]{Tate2010};
	an agent can be asynchronously modified via functions in a thread, and
		updated in another thread \cite[\S7.4, pp. 260]{Tate2010};
	"the state of a dereferenced agent will block until a value is available"
		\cite[\S7.4, pp. 260]{Tate2010}.
+ Accessing values from references, atoms, or agents will not cause locks nor
	blocks to occur \cite[\S7.4, pp. 260]{Tate2010};
	 with the use of appropriate abstractions, such accesses should be fast
	 	operations \cite[\S7.4, pp. 260]{Tate2010}. 
+ While functions *await* and *await-for* allow the latest value of an agent with
	respect to its own thread to be accessed, these functions "block only until
	actions from the aforementioned thread are dispatched" and does not
	indicate actions performed on this agent by other theads
	\cite[\S7.4, pp. 261]{Tate2010};
	since these *Clojure* functions involve working with instantaneous values,
		which can be out-of-date in the next instant, *Clojure* developers
		should avoid working with "the latest value of something"
		\cite[\S7.4, pp. 261]{Tate2010}.
+ "A future is a concurrency construct that allows an asynchronous return before
	computation is complete" \cite[\S7.4, pp. 261]{Tate2010};
	a future processes a body of multiple expressions in another thread, and
		returns the value of the last expression \cite[\S7.4, pp. 261]{Tate2010};
	if a future is dereferenced, it will block until the value becomes available
		\cite[\S7.4, pp. 261]{Tate2010};
	futures can be used to enable multiple long-running functions to execute in
		parallel \cite[\S7.4, pp. 261]{Tate2010}.























Random notes:
+ "Sometimes, the JVM is a double-edged sword. If you want the community,
	you need to deal with the problems."
	-- Bruce A. Tate, \cite[\S7.3, pp. 244]{Tate2010}.
+ *Clojure* sequences provide an abstraction for *Clojure* collections (e.g., sets,
	maps, and vectors), file system structures (streams and directories), and
	*Java* collections (e.g.,  containers, arrays, and strings) \cite[\S7.3, pp. 244,255]{Tate2010};
	it supports functions (*first*, *rest*, and *cons*) \cite[\S7.3, pp. 244]{Tate2010};
	it can apply common strategies from a common library (JVM
		compatible/compliant) to process collections (e.g., mutate, transform,
		and search) \cite[\S7.3, pp. 255]{Tate2010};
	"higher-order functions [can add] power and simplicity to the sequence
		libraries" \cite[\S7.3, pp. 255]{Tate2010};
	use "lazy sequences [to simplify] algorithms," and delay execution for 
		performance improvement and loosen coupling
		\cite[\S7.3, pp. 255]{Tate2010}.
+ Predicates are used to test sequences \cite[\S7.3, pp. 245]{Tate2010}.
	- *every?*
	- *not-every?*
	- *not-any?*
+ List comprehension combines multiple containers (e.g., lists and maps) and
	filters \cite[\S7.3, pp. 246]{Tate2010}.
+ *reduce* in *Lisp* is the equivalent for \cite[\S7.3, pp. 246]{Tate2010}:
	- foldl, in *Erlang*
	- foldleft, in *Scala*
	- inject, in *Ruby*
+ Support ranges as functions \cite[\S7.3, pp. 247]{Tate2010}.
+ Regarding infinite sequences \cite[\S7.3, pp. 248-250]{Tate2010}:
	- Sample a finite subset of the infinite sequence using the function *take*
		\cite[\S7.3, pp. 248]{Tate2010}.
	- "*take*" allows the first *n* elements of a sequence to be sampled
		\cite[\S7.3, pp. 248]{Tate2010}.
	- "*drop*" allows the first *n* elements of a sequence to be excluded (or
		omited/ignored) from sampling \cite[\S7.3, pp. 248]{Tate2010}.
	- "*interpose*" enables the placement of separators between elements in an
		infinite sequence \cite[\S7.3, pp. 248]{Tate2010}.
	- "*interleave*" enables elements from multiple infinite sequences to be
		interspersed/interposed/interleaved \cite[\S7.3, pp. 248]{Tate2010}. 
	- "*iterate*" is a function that performs a given function iteratively to create
		a sequence (e.g., an infinite sequence) \cite[\S7.3, pp. 249]{Tate2010};
		use the "*iterate*" function with lazy sequences to describe recursive
			problems \cite[\S7.3, pp. 249]{Tate2010}.
+ *Clojure* programs execute in two stages \cite[\S7.3, pp. 253]{Tate2010}.
	- Macros in *Clojure* programs are translated into their expanded form, via  
		macro expansion \cite[\S7.3, pp. 253]{Tate2010};
		the command "*macroexpand*" can be used to view what is happening
			\cite[\S7.3, pp. 253]{Tate2010};
		a list of reader macros is provided in \cite[\S7.3, pp. 253]{Tate2010}.
	- Macro expansion allows code to be treated lke lists
		\cite[\S7.3, pp. 254]{Tate2010}.;
		quoted functions won't execute immediately
			\cite[\S7.3, pp. 254]{Tate2010} -- a quote needs to be placed in
			front of the expression \cite[\S7.3, pp. 253]{Tate2010}.
	- "Macro expansion is perhaps the most poweerful feature of Lisp";
		express data as code, not just strings, since the code is in a higher-order
		data structure \cite[\S7.3, pp. 253]{Tate2010}.
	- "[Use] macros to add features to [*Clojure*]" \cite[\S7.3, pp. 255]{Tate2010}.
+ Learning Curve \cite[\S7.5, pp. 267]{Tate2010}.
	- "*Clojure* is rich, and the learning curve is oppressive.
		You need to have an extremely talented and experienced team to make
			*Lisp* work.
		Lazy sequences, functional programming, macro expansion,
			transactional memory, and the sophistication of the approaches
			are all powerful concepts that take time to master."
	













####	*Haskell*




Characteristics of *Haskell*:
+ pure functional programming \cite[\S8, pp. 268; \S8.1, pp. 268-269]{Tate2010}.
	- *Haskell* software do not produce side effects \cite[\S8.1, pp. 269]{Tate2010};
		however, *Haskell* functions can return side effects that are executed
			later \cite[\S8.1, pp. 269]{Tate2010}.
	- *Monads* can be used to preserve states \cite[\S8.1, pp. 269]{Tate2010}
	- "A function with the same arguments will always produce the same result.
		There are no side effects." \cite[\S8.2, pp. 284]{Tate2010}
+ lazy processing \cite[\S8.1, pp. 269]{Tate2010}.
+ lazy evaluation \cite[\S8.1, pp. 269]{Tate2010}.
+ list comprehensions \cite[\S8.1, pp. 269]{Tate2010}.
+ parameterized type system \cite[\S8.1, pp. 269]{Tate2010}.
+ strong and static typing, just like *Scala* \cite[\S8.1, pp. 269]{Tate2010}.
	- Mostly inferred type model \cite[\S8.1, pp. 269]{Tate2010}.
		* Enables type inference \cite[\S8.4, pp. 294]{Tate2010}.
		* Is polymorphic, so that different forms of the same type are treated
			the same \cite[\S8.4, pp. 294]{Tate2010}.
		* Supports the definition and usage of polymorphic data types
			\cite[\S8.4, pp. 297]{Tate2010}.
	- Supports polymorphism \cite[\S8.1, pp. 269]{Tate2010}.
	- Supports clean software architectures \cite[\S8.1, pp. 269]{Tate2010}.
	- Supports static type checking (i.e., sanity check), via program/software
		analysis (or static code analysis)
		\cite[\S8.3, pp. 291; \S8.4, pp. 294]{Tate2010}.
	- Expressive type system due to type classes and higher-kinded type
		variables \cite[\S8.3, pp. 291]{Tate2010}.
	- Flexible and rich type system that can infer the intent of the software
		developers, without restricting them \cite[\S8.4, pp. 294]{Tate2010}.
	- Supports user-defined types \cite[\S8.4, pp. 295]{Tate2010}.
	- Supports "recursive types" ("types that are recursive")
		\cite[\S8.4, pp. 298]{Tate2010}.
	- Supports data-less class usage, which is not object-oriented since data
		fields are not modeled, so that polymorphism and overloading can be
		supported \cite[\S8.4, pp. 299]{Tate2010};
		a *Haskell* class (similar to a *Clojure* protocol) defines the required
			inputs for each given operations \cite[\S8.4, pp. 299]{Tate2010};
		that is, "a class provides some function signatures"
			\cite[\S8.4, pp. 299]{Tate2010};
		if a type supports all function signatures of a class, it is an instance of
			that class \cite[\S8.4, pp. 299]{Tate2010};
		supports class inheritance \cite[\S8.4, pp. 300]{Tate2010};
		an instance of a class is a type, not a data object
			\cite[\S8.4, pp. 300]{Tate2010}.
+ Supports pattern matching \cite[\S8.1, pp. 269]{Tate2010}.
+ Supports usage of guards \cite[\S8.1, pp. 269]{Tate2010}.








Random notes:
+ "*Haskell* represents purity and freedom for many functional programming
	purists.
	It's rich and powerful, but the power comes at a price.
	You can't eat just a couple of bites.
	*Haskell* will force you to eat the whole functional programming burrito."
	\cite[\S8, pp. 268]{Tate2010}.
+ Types in *Haskell* \cite[\S8.2, pp. 270-271]{Tate2010}:
	- primitive
		* numbers
		* character data; use "++" to append strings instead of "+"
		* booleans
	- functions
		* Specified in two parts: optional type specification/declaration, and the
			function declaration (/implementation) \cite[\S8.2, pp. 272]{Tate2010}.
+ Indentation matters in *Haskell*; layouts "control indentation patterns"
	\cite[\S8.2, pp. 271]{Tate2010}.
+ The "if" block is a function, rather than a control structure
	\cite[\S8.2, pp. 271]{Tate2010}.
+ *Haskell* "[infers] types based on clues"; see *Haskell*'s type inference
	\cite[\S8.2, pp. 272]{Tate2010}. 
+ "::" is used to indicate basic types, while ":t" represents type
	conversion/inference \cite[\S8.2, pp. 272]{Tate2010}.
+ "Use the '*let*' function to bind values to implementations", or "[bind] a variable
	to a function in a local scope" \cite[\S8.2, pp. 273]{Tate2010}.
+ Functions can be defined within the scope of modules
	\cite[\S8.2, pp. 273]{Tate2010}.
+ The "Main" module is the special top-level module
	\cite[\S8.2, pp. 273]{Tate2010}.
+ During type inference, a function can return a value of a given type *\alpha*
	\cite[\S8.2, pp. 274]{Tate2010};
	pattern matching can also be performed \cite[\S8.2, pp. 274-275]{Tate2010};
	replace pattern matching with the uage of guards
		\cite[\S8.2, pp. 275]{Tate2010};
+ Use tail-recusion optimization to handle recursion
	\cite[\S8.2, pp. 275]{Tate2010}.
+  Use tuples and composition of functions to transmit the results of computation
	from one function to another \cite[\S8.2, pp. 277]{Tate2010}.
+ To traverse lists in *Haskell*, use the "*heal | tail*" constructs
	\cite[\S8.2, pp. 278]{Tate2010}.
+ "The size of a list is 1 + the size of a tail" \cite[\S8.2, pp. 279]{Tate2010}.
+ The function *zip* can be used to combine items (e.g., strings) together
	\cite[\S8.2, pp. 279]{Tate2010}; 
	it can also combine lists together \cite[\S8.2, pp. 279]{Tate2010}.
+ Lists are homogeneous \cite[\S8.2, pp. 280]{Tate2010};
	e.g., I "cannot add a list to a list of integers" \cite[\S8.2, pp. 280]{Tate2010};
	however, a list can be added to a list of lists, or an empty list
		\cite[\S8.2, pp. 280]{Tate2010}.
+ Advanced list functions for list generation include \cite[\S8.2, pp. 279]{Tate2010}:
	- recursion \cite[\S8.2, pp. 279-280]{Tate2010}:
		* Use the "*:*" operator to combine a head and a tail in list generation
			(or list formation) \cite[\S8.2, pp. 279-280]{Tate2010};
			it can be used in reverse, via pattern matching during recursive
				function calls \cite[\S8.2, pp. 279]{Tate2010}.
		* List construction can be carried out, so that a subset of the original list
			can be obtained (e.g., list of even/prime numbers).
	- ranges (and composition) \cite[\S8.2, pp. 280-281]{Tate2010}:
		* A range can be indicated as "*[start-point..end-point]*", where the
			two periods between the "*start-point*" and "*end-point*" indicate
			the range, and the default increment is one
			\cite[\S8.2, pp. 280-281]{Tate2010}.
		* If no list exist between the "*start-point*" and "*end-point*" (e.g., the
			"*start-point*" is larger than the "*end-point*"), an empty list is
			returned \cite[\S8.2, pp. 280-281]{Tate2010}.
		* The increment can be specified by indicating the next item in the list
			"*[start-point, 2nd-item .. end-point]*", and this increment can be
			a fraction \cite[\S8.2, pp. 281]{Tate2010}.
		* A range must have a "*start-point*" or "*end-point*", but not necessarily
			both, such that the sequences can be unbounded
			\cite[\S8.2, pp. 281]{Tate2010}.
		* **Question - Is the "*start-point*" mandatory, and the
				"*end-point*" optional?**
		* "Ranges are syntactic sugar for creating sequences"
			\cite[\S8.2, pp. 281]{Tate2010}.
	- list comprehensions \cite[\S8.2, pp. 281-282]{Tate2010}:
		* Regarding list comprehension, the left side is an expression, while the
			right side contains generators and filters
			\cite[\S8.2, pp. 281]{Tate2010} 
		* List comprehension can be combined with pattern matching to create
			new lists \cite[\S8.2, pp. 281]{Tate2010}
+ "Type classes provide a simple form of generic programming. You define a data
	type, and just by adding one keyword, derived, you can get routines to
	compare values, to convert values to and from strings, and so on."
	\cite[\S8.2, pp. 283]{Tate2010}
+ "Any good programming language really becomes a means of extending itself
	to embed other programming languages specialized to the task at hand.
	*Haskell* is particularly good as a tool for embedding other languages.
	Laziness, lambda expressions, monad and arrow notation, type classes,
		the expressive type system, and template *Haskell* all support extending
		the language in various ways."
		\cite[\S8.2, pp. 283]{Tate2010}
+ "*Haskell* [supports] creating proofs for correctness far easier than imperative
	counterparts" \cite[\S8.3, pp. 285]{Tate2010}.
+ Usage of higher-order functions, and their combinations via partially applied
	functions and currying, allow *Haskell* software to be more predictable and
	reliable \cite[\S8.3, pp. 285]{Tate2010}.
+ Function composition \cite[\S8.3, pp. 287]{Tate2010}.
+ Partial application allows a *Haskell* function with multiple arguments to be
	split/decomposed into multiple functions of one argument each
	\cite[\S8.3, pp. 287-288]{Tate2010};
	that is, partial applications partitions a multi-argument function into a set
		of single-argument functions \cite[\S8.3, pp. 287-288]{Tate2010};
	partial application binds a proper/(non-empty) subset of the arguments of a
		multi-argument function \cite[\S8.3, pp. 288]{Tate2010}.
+ Currying is the process of partial application and function composition, and
	"leads to greater flexibility and simpler syntax" \cite[\S8.3, pp. 288]{Tate2010}.
+ Use lazy evaluation to design "functions that return infinite lists" 
	\cite[\S8.3, pp. 288]{Tate2010};
	list composition can also be used to create infinite lists
		\cite[\S8.3, pp. 288]{Tate2010}.
+ When processing infinite lists/sequences with lazy evaluation, try to write code
	so that *Haskell* will "[only compute the necessary part] to do the job"
	\cite[\S8.3, pp. 290]{Tate2010};
	if only a subset of the infinite list is needed for computation, *Haskell* uses
		lazy evaluation to compute only that subset, rather than perform
		computation on the infinite list \cite[\S8.3, pp. 290]{Tate2010};
	lazy evaluation makes it possible for *Haskell* developers to perform
		computations on combinations of infinite sequences
		\cite[\S8.3, pp. 290]{Tate2010}.
	we can use function composition, partially applied functions (or partial
		application), and lazy evaluation together \cite[\S8.3, pp. 290]{Tate2010}. 
+ To use function composition, pass one function as an argument to another
	function \cite[\S8.3, pp. 290; \S8.3, pp. 293]{Tate2010};
	e.g., $f . g x = f(g x)$ \cite[\S8.3, pp. 290]{Tate2010}.
+ While functional programming in  *Haskell* allows us to solve hard problems
	from a different perspective, it is harder to perform simple tasks regarding
	I/O processing and error handling \cite[\S8.3, pp. 292]{Tate2010}.
	- "Though *Haskell* makes some hard things easy, it also makes some easy
		things hard" \cite[\S8.5, pp. 311]{Tate2010}.
+ Use a *let* expression to chain multiple functions (in a sequential order)
	\cite[\S8.4, pp. 302]{Tate2010};
	similarly, an *in* statement to sequentially chain *let* expressions
		\cite[\S8.4, pp. 302]{Tate2010}.
+ A monad is a function composition that has specific properties
	\cite[\S8.4, pp. 302]{Tate2010}.
	- It translates $f(g(x))$ into $f(x) . g(x)$, where "*.*" represents function
		composition \cite[\S8.4, pp. 302]{Tate2010}.
	- Monads support I/O handling, since their output is input dependent
		\cite[\S8.4, pp. 302]{Tate2010}.
	- A monad supports the special "*do*" syntax to execute imperative *Haskell*
		code \cite[\S8.4, pp. 302]{Tate2010}.
		* The "*do*" notation provides syntactic sugar (e.g., for the function
			declaration) regarding monads, for the management of stateful
			interactions, so that the *Haskell* software/program
			apprears/feels imperative (i.e., has states or stateful, has side
			effects, or functions like imperative programs)
				\cite[\S8.4, pp. 304-305]{Tate2010};
		* Wrap the code for the do/let expressions with ":{" and "}:"
			\cite[\S8.4, pp. 305]{Tate2010}.
	- Monads support error handling, which can't be addressed by *Haskell*
		otherwise \cite[\S8.4, pp. 302]{Tate2010}.
	- The components of a monad are \cite[\S8.4, pp. 302-303]{Tate2010}:
		* A type contructor based on a type of **container** (type container),
			which would be used to hold a function
			\cite[\S8.4, pp. 302-303]{Tate2010};
			design decision about the functions/behavior of the monad would
				determine the type of container selected
				\cite[\S8.4, pp. 303]{Tate2010};
			the basic type defined is "based on an arbitrary type template"
				\cite[\S8.4, pp. 304]{Tate2010};
		* Use a ***return* function** to finish executing a given function, and place
			the latter/given function in the container/monad (i.e., type
			constructor) \cite[\S8.4, pp. 303]{Tate2010};
			it finishes executing a function as a value -- for simple monads, it is
				equivalent to returning the value of the monad.
				\cite[\S8.4, pp. 304]{Tate2010};
			it returns the value with an orderly appearance
				\cite[\S8.4, pp. 305]{Tate2010}.
		* A "*>>=*" **bind function** that unwraps a given function (nesting???
			\cite[\S8.4, pp. 304]{Tate2010}), and chain functions together
			\cite[\S8.4, pp. 303]{Tate2010} as a composition
				\cite[\S8.4, pp. 304]{Tate2010}.
	- Rules that must be satisfied by monads \cite[\S8.4, pp. 303]{Tate2010}:
		* "Use a type constructor to create a monad that" works with a
			value-holding type.
		* *Unwrap and/or wrap values without information loss.
		* The order of nested bind functions should be equivalent to the
			sequential order of calling them. 
	- "[Each] monad has an associated computational strategy"
		\cite[\S8.4, pp. 305]{Tate2010}.
		* E.g., a list can be defined as a monad \cite[\S8.4, pp. 305]{Tate2010}.
		* We can use monads instead of list comprehension or function
			composition \cite[\S8.4, pp. 305-306]{Tate2010}.
		* Types of computational strategy associated with monads: identity
			monad, list monad, and maybe monad
				\cite[\S8.4, pp. 306]{Tate2010}.
	- The type *Just* can be used by nomads to represent *Nothing*
		\cite[\S8.4, pp. 307]{Tate2010}.
	





Higher-order functions
+ anonymous functions \cite[\S8.3, pp. 285]{Tate2010}.
	- "Anonymous functions are an important feature for list libraries"
		\cite[\S8.3, pp. 285]{Tate2010}.
	- The map function can apply an anonymous function (as a locally scoped
		function) to each item in a list, and process the result
		\cite[\S8.3, pp. 286]{Tate2010};
		map can also be apply part of a function (i.e., a section of a function, or
			partially applied function) \cite[\S8.3, pp. 286]{Tate2010}.
+ Use the function/feature "where" to bind functions or variables
	\cite[\S8.3, pp. 286]{Tate2010}.
+ Use the function *filter* to apply a test to items in a list
	\cite[\S8.3, pp. 286]{Tate2010}. 
+ In *Haskell*'s library of list functions, many of these functions use higher-order
	functions \cite[\S8.3, pp. 287]{Tate2010}.








Disadvantages of *Haskell*:
+ Regarding distributed computing, since *Haskell* carries out lazy evaluation by
	default, it sends "a program (and the values of all the free variables of the
	program) that can be evaluated to yield the value";
	if eager evaluation was used, it can send "the value itself". 





####	Notes about Additional Programming Languages/Paradigms

See [notes about additional programming languages and programming paradigms](https://github.com/eda-ricercatore/sardegna-scala/blob/master/notes/tate2014-notes.md).





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

## From Zhiyang Ong's *BibTeX* Database 

+ [Booch2005]
	- Booch, G., Rumbaugh, J., and Jacobson, I. The Unified Modeling Language User Guide, second ed. Addison-Wesley Object Technology Series. Addison-Wesley, Reading, MA, 2005.
+ [Cormen2009]
	- Cormen, T. H., Leiserson, C. E., Rivest, R. L., and Stein, C. Introduction to Algorithms, third ed. The MIT Press, Cambridge, MA, 2009.
+ [Fowler2004]
	- Fowler, M. UML Distilled: A Brief Guide to the Standard Object Modeling Language, third ed. Addison-Wesley Object Technology Series. Addison-Wesley, Boston, MA, 2004.
+ [Fowler2011]
	- Fowler, M., and Parsons, R. Domain-Specific Languages. Addison-Wesley Signature Series. Addison- Wesley, Boston, MA, 2011.
+ [Goodrich2015]
	- Goodrich, M. T., and Tamassia, R. Algorithm Design and Applications. John Wiley & Sons, Hoboken, NJ, 2015.
+ [Goodrich2013]
	- Goodrich, M. T., Tamassia, R., and Goldwasser, M. H. Data Structures and Algorithms in Python. John Wiley & Sons, Hoboken, NJ, 2013.
+ [Goodrich2011]
	- Goodrich, M. T., Tamassia, R., and Mount, D. M. Data Structures and Algorithms in C++, second ed. John Wiley & Sons, Hoboken, NJ, 2011.
+ [Goodrich2010]
	- Goodrich, M. T., and Tamassia, R. Data Structures and Algorithms in Java, fifth ed. John Wiley & Sons, Hoboken, NJ, 2010.
+ [Graham2004]
	- Graham, P. Hackers and Painters: Big Ideas from the Computer Age. O’Reilly Media, Sebastopol, CA, 2004.
+ [Lytovchenko2017]
	- Dmytro Lytovchenko, Roberto Aloi, Anthony Molinaro, Lukas Larsson, Yoshihiro Tanaka, Andrea Leopardi, Anton N. Ryabkov, Greg Baraghimian, Amir Moulavi, and Juan Facorro, "The Erlang Runtime System", GitHub, Inc., San Francisco, CA, May 24, 2017. Available online from {\it {GitHub, Inc.}: Erik Stenman} at: \url{https://github.com/happi/theBeamBook/releases} and \url{https://github.com/happi/theBeamBook/tree/0.0.7}; October 31, 2017 was the last accessed date.
+ [OracleCorporationStaff20XYe](http://www.oracle.com/technetwork/java/api-141528.html)
+ [OracleCorporationStaff20XYd](http://www.oracle.com/technetwork/java/javase/documentation/api-jsp-136079.html)
+ [OracleCorporationStaff20XYc](http://www.oracle.com/technetwork/java/javase/documentation/index.html)
+ [OracleCorporationStaff20XYb](http://www.oracle.com/technetwork/java/javase/overview/index.html)
+ [OracleCorporationStaff2016e](http://docs.oracle.com/javase/8/docs/api/)
+ [OracleCorporationStaff2016d](http://docs.oracle.com/javase/8/docs/)
+ [OracleCorporationStaff2016c](http://docs.oracle.com/javase/8/)
+ [OracleCorporationStaff2017](http://docs.oracle.com/en/java/)
+ [Rachel2015]
	- Rachel and Vaxquis Poponuro, "What is the difference between statically typed and dynamically typed languages?". Stack Exchange, Inc., New York, NY. September 10, 2015. Available online from {\it {Stack Exchange, Inc.}: Stack Overflow: Questions} at: \url{https://stackoverflow.com/questions/1517582/what-is-the-difference-between-statically-typed-and-dynamically-typed-languages}; October 12, 2017 was the last accessed date.
+ [Rosenberg2007]
	- Rosenberg, D., and Stephens, M. Use Case Driven Object Modeling with UML: Theory and Practice. Springer-Verlag New York, New York, NY, 2007.
+ [Rumbaugh2004]
	- Rumbaugh, J., Jacobson, I., and Booch, G. The Unified Modeling Language Reference Manual, second ed. Addison-Wesley Object Technology Series. Pearson Education, Reading, MA, 2004.
+ [Stevens2000]
	- Stevens, P., and Pooley, R. Using UML: Software Engineering with Objects and Components. Addison-Wesley Object Technology Series. Addison-Wesley, Essex, England, U.K., 2000.
+ [Tate2010]
	- Tate, B. A. Seven Languages in Seven Weeks: A Pragmatic Guide to Learning Programming Languages. Pragmatic Bookshelf, Raleigh, NC, 2010.
+ [Tate2014]
	- Tate, B. A., Daoud, F., Dees, I., and Moffitt, J. Seven More Languages in Seven Weeks: Languages That Are Shaping the Future, Version P2.0 ed. The Pragmatic Programmers, Raleigh, NC, 2014.
+ [WikipediaContributors2017e](https://en.wikipedia.org/wiki/Programming_paradigm)
+ [WikipediaContributors2017f](https://en.wikipedia.org/wiki/Functional_programming)
+ [WikipediaContributors2017g](https://en.wikipedia.org/wiki/Purely_functional_programming)
+ [WikipediaContributors2017h](https://en.wikipedia.org/wiki/Functional_logic_programming)
+ [WikipediaContributors2017j](https://en.wikipedia.org/wiki/Comparison_of_programming_paradigms)
+ [WikipediaContributors2017k](https://en.wikipedia.org/wiki/Concurrent_computing)
+ [WikipediaContributors2017l](https://en.wikipedia.org/wiki/Imperative_programming)
+ [WikipediaContributors2017m](https://en.wikipedia.org/wiki/Declarative_programming)
+ [WikipediaContributors2017n](https://en.wikipedia.org/wiki/Parallel_computing)
+ [WikipediaContributors2017o](https://en.wikipedia.org/wiki/Probabilistic_programming_language)
+ [WikipediaContributors2017p](https://en.wikipedia.org/wiki/Metaprogramming)
+ [WikipediaContributors2017q](https://en.wikipedia.org/wiki/Generic_programming)
+ [WikipediaContributors2017r](https://en.wikipedia.org/wiki/Side_effect_(computer_science))
+ [WikipediaContributors2017s](https://en.wikipedia.org/wiki/Logic_programming)
+ [WikipediaContributors2017t](https://en.wikipedia.org/wiki/Symbolic_programming)
+ [WikipediaContributors2017u](https://en.wikipedia.org/wiki/Anonymous_function)
+ [WikipediaContributors2017v](https://en.wikipedia.org/wiki/Syntactic_sugar)
+ [WikipediaContributors2017w](https://en.wikipedia.org/wiki/Polish_notation)
+ [WikipediaContributors2017x](https://en.wikipedia.org/wiki/Reverse_Polish_notation)

















#	To-Do List

Finish reading \cite{WikipediaContributors2017e}.

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

