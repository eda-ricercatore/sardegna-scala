**Table of Content:**
+ [Lua](https://github.com/eda-ricercatore/sardegna-scala/blob/master/notes/tate2014-notes.md#lua)
+ [Factor](https://github.com/eda-ricercatore/sardegna-scala/blob/master/notes/tate2014-notes.md#factor)
+ [Elm](https://github.com/eda-ricercatore/sardegna-scala/blob/master/notes/tate2014-notes.md#elm)
+ [Elixir](https://github.com/eda-ricercatore/sardegna-scala/blob/master/notes/tate2014-notes.md#elixir)
+ [Julia](https://github.com/eda-ricercatore/sardegna-scala/blob/master/notes/tate2014-notes.md#julia)
+ [miniKanren](https://github.com/eda-ricercatore/sardegna-scala/blob/master/notes/tate2014-notes.md#minikanren)
+ [Idris](https://github.com/eda-ricercatore/sardegna-scala/blob/master/notes/tate2014-notes.md#idris)



#	Lua



##	Characteristics of *Lua*

+ Fast, flexible programming/scripting language
	\cite[\SAcknowledgments, pp. xvii]{Tate2014}.
+ Embeddable prototype language for production systems
	\cite[\SAcknowledgments, pp. xvii]{Tate2014}.
	- The compiler can be built on "a particularly limited embedded platform"
		\cite[\S1, pp. 4]{Tate2014}.
+ Flexible inputs and outputs of functions \cite[\S1, pp. 1]{Tate2014}.
+ "Rich syntax and proper semantics" \cite[\S1, pp. 1]{Tate2014}.
+ Friendly, approachable syntax \cite[\S1, pp. 5]{Tate2014}.
+ "Quick, portable little [scripting] language" \cite[\S1, pp. 1]{Tate2014}.
+ Expressive description language \cite[\S1, pp. 3]{Tate2014}.
	- Tables \cite[\S1, pp. 3]{Tate2014}.
	- Can be combined with other computer languages, such as *C*
		\cite[\S1, pp. 3]{Tate2014}.
+ Powerful and compact \cite[\S1, pp. 7]{Tate2014}
+ "Code is just data" philosophy allows functions to be created, stored, and
	passed around in *Lua* programs \cite[\S1, pp. 48]{Tate2014}.









##	Notes about *Lua*

+ Composable primitives of *Lua* \cite[\S1, pp. 30]{Tate2014}:
	- Tables
		* Can function as:
			+ arrays
			+ dictionaries
	- Co-routines
+ Tables in *Lua* provide "a single, unifying abstraction" that is used to build
	"object systems, custom data structures,"
		\cite[\SAcknowledgments, pp. ix]{Tate2014}.
	- This supports clean implementations that are platform-independent, the
		plug and play paradigm, and facilitates software extension and
		maintenance \cite[\SAcknowledgments, pp. ix]{Tate2014}.
	- "Array-meets-dictionary object" \cite[\S1, pp. 3]{Tate2014}.
	- Table-based programming language that enables abstraction for
		implementation of different programming paradigms
			\cite[\S1, pp. 3]{Tate2014}:
		* Procedural programming paradigm
		* Object-oriented programming paradigm
		* Event-driven programming paradigm
	- Supports prototype style of object-oriented programming paradigm
		\cite[\S1, pp. 3]{Tate2014}.
		* Does not differentiate between *classes*/blueprints and
			*instances*/objects (based on those *classes*/blueprints)
		* Enables cloning of instances
		* Enables customization of each clone
		* Philosophically simpler (i.e., "simpler feel") than object-oriented
			programming paradigm 
	- Contributes to the expressiveness of *Lua* \cite[\S1, pp. 13]{Tate2014}
	- A data structure that allows programmers to \cite[\S1, pp. 14]{Tate2014}:
		* Store data that can be accessed by name.
		* Store value in a particular order
	- By explicitly supporting only the table as a data structure for *Lua*, it
		allows *Lua* programmers to avoid the need to learn the API, syntax,
		performance characteristics, and possibly other aspects, of data
		structures, such as arrays, tuples, vectors, lists, and dictionaries
			\cite[\S1, pp. 14]{Tate2014}.
	- A *Lua* table is a collection of keys (names) and their associated values;
		that is, it is a collection of (key,value) pairs, or key-value pairs
			\cite[\S1, pp. 14]{Tate2014}.
	- A table constructor can be expressed as within curly braces as follows
		\cite[\S1, pp. 14]{Tate2014}:
		e.g., *name_of_table* = { key1 = value1, key2 = value2, key3 = value3}.
	- *name_of_table*.*key_name* allows the value of 
		*name_of_table*.*key_name* to be read \cite[\S1, pp. 14-15]{Tate2014}.
	- To modify *name_of_table*.*key_name*, assign *name_of_table*.*key_name*
		to a value \cite[\S1, pp. 15]{Tate2014}.
	- *name_of_table*[*key_name*] allows keys with spaces or decimal points to
		be read/accessed at runtime \cite[\S1, pp. 15]{Tate2014}.
	- Assigning the special value of *nil* to an item in the table removes it from
		the table;
		e.g., *name_of_table*.*key_name* = nil \cite[\S1, pp. 15]{Tate2014}.
	- Creating arrays using tables \cite[\S1, pp. 16]{Tate2014};
		*name_of_array* = { value1, value2, value3}.
			+ array indices start from one; e.g., *name_of_array*[1]
				\cite[\S1, pp. 16]{Tate2014}.
	- Since arrays and dictionaries are not mutually exclusive, they can be mixed
		in the same table, and *Lua* can determine how to store information
		efficiently \cite[\S1, pp. 17]{Tate2014}.
		* A semi-colon can be used to separate the declaration of the array and
			the table \cite[\S1, pp. 17]{Tate2014};
			e.g., *combi* = {arr1,arr2,arr3; key1 = value1, key2 = value2}.
	- A metatable provides custom lookup logic \cite[\S1, pp. 17]{Tate2014}.
	- A metatable allows users to \cite[\S1, pp. 17]{Tate2014}:
		* provide a non-*nil* default value for unrecogized keys
		* log/record all accesses and modifications to a given table
	- Each table has a corresponding metable that has functions for
		\cite[\S1, pp. 18]{Tate2014}:
		* accessing/modifying keys
		* iterating the metatable
		* overloading operators
	- The metatable of most tables is set to *nil* \cite[\S1, pp. 18]{Tate2014}.
	- Tables in *Lua* are designed to be fault tolerant \cite[\S1, pp. 19]{Tate2014};
		when accessing a nonexistent key in a table, *nil* is returned 
			\cite[\S1, pp. 19]{Tate2014}.
	- Functions for stricter access and modification of keys in tables can be 
		designed and implemented as a table under the names *__index* and
		*__newindex*, and set as the (private) metatable for the data
			\cite[\S1, pp. 19]{Tate2014}.
	- Use *Lua*-supported abstraction to design a custom/homegrown
		object-oriented programming language in *Lua*
			\cite[\S1, pp. 21]{Tate2014}.
+ Coroutines
	- Coroutines define the control flow of *Lua* programs
		\cite[\S1, pp. 14]{Tate2014}.
	- *Lua* does not support multi-threading, and does not have a threading API.
		\cite[\S1, pp. 24]{Tate2014}.
	- A co-routine is a simpler primitive for multi-tasking
		\cite[\S1, pp. 24]{Tate2014}.
	- Co-routines enable non-preemptive multi-tasking (or cooperative
		multitasking [WikipediaContributors2017a1]), unlike preemptive threads
		for multi-tasking \cite[\S1, pp. 25]{Tate2014}.
	- Avoiding preemption by threads simplifies multi-task scheduling, and
		hence avoid a "class of concurreny problems" \cite[\S1, pp. 25]{Tate2014}.
		* This trade-offs the amount of effort spent coordinating multi-tasking
			programs (i.e., more effort for preemptive threads versus less effort
			for non-preemptive co-routines) for more/less control over
			concurrency problems.
		* It forces developers to choose between development effort (extra task
			to coordinate co-routines) and control/freedom (of coordination).
		* While co-routines allows software developers to avoid hard concurrency
			problems, they do not inherently allow software developers to
			exploit multi-core processing (i.e., parallel processing).
		* Each *Lua* process with multiple co-routines would only run on one
			of multiple processor cores,
		* Multiple *Lua* interpreters per process can be spun up, and executed
			on multiple processor cores.
	- Co-routines can be \cite[\S1, pp. 25-26]{Tate2014}:
		* create
		* resume
		* yield
	- Co-routines enable software to be responsive during
		\cite[\S1, pp. 26]{Tate2014}:
		* network operations
		* long computation
	- Co-routines waiting to be executed are placed in the pending array, which
		is ordered by their timestamps \cite[\S1, pp. 27]{Tate2014}.
	- By making fjunctions local, name collisions can be avoided
		\cite[\S1, pp. 27]{Tate2014}.
	- Co-routines should be designed to be lightweight, and return or yield
		quickly after completion of their tasks \cite[\S1, pp. 28]{Tate2014}.
	- The scheduler for co-routines would busy wait till the (time) instance to
		execute the next task \cite[\S1, pp. 28]{Tate2014}.
	- Use *require()* to load *Lua* modules, rather than similar functions (such as
		*dofile()*), since it also performs the following that similar functions don't
		do \cite[\S1, pp. 29]{Tate2014}:
		* "Checks to see if you've already loaded the module"
		* "Searches multiple (configurable) library paths"
		* "Safely namespaces the code in a local variable"
+ "Supports an interactive read-eval-print loop (REPL)" \cite[\S1, pp. 4]{Tate2014}
	- That is , it provides an interactive command-line interface (CLI). 
+ Friendly, approachable syntax \cite[\S1, pp. 5]{Tate2014}.
	- No semi-colons are not required to indicate the end of a statement.
	- Does not use the off-side rule; not an off-side rule programming language;
		it is an example of "free-form languages, notably curly-bracket
		programming languages" \cite{WikipediaContributors2017y};
		whitespace has no major significance in *Lua*, other than tokenization
			that uses whitespace as delimiters;
		line breaks are not required between statements. 
+ Dynamically typed scripting language \cite[\S1, pp. 5]{Tate2014}.
	- Variables in the source code are not specified with a type each.
	- Run-time values of variables do have a type each. 
	- Examples of types for run-time values:
		* *numbers*
		* *Booleans*
		* *strings*
		* *nil*, which represents "not found" or does not exist
			\cite[\S1, pp. 6]{Tate2014}
+ Boolean expressions in *Lua* are subject to short-circuit evaluation
	\cite[\S1, pp. 6]{Tate2014} \cite{WikipediaContributors2017z}.
+ Functions
	-  Functions are first-class values \cite[\S1, pp. 7]{Tate2014}.
	- "[Functions] can be treated just like any other value in *Lua*"
		\cite[\S1, pp. 7]{Tate2014}.
	- "[Functions] can be" \cite[\S1, pp. 7]{Tate2014}:
		* "assigned to variables",
		* "passed as parameters into other functions",
		* "stored in data structures".
	- "Treat code as data" \cite[\S1, pp. 7]{Tate2014}
		* Important for contributing to *Lua*'s power and compactness.
	- The function name is not required \cite[\S1, pp. 7]{Tate2014}.
	- Flexible arguments \cite[\S1, pp. 8]{Tate2014}
		* Assign the value of *nil* to all unused parameters.
		* Ignore extra parameters.
	- Variadic functions can be explicitly defined \cite[\S1, pp. 8]{Tate2014}.
		* A variadic function that can accept "an arbitrary number of inputs".
		* Specify the last parameter as an ellipsis "*...*". 
	- Tail call optimization \cite[\S1, pp. 9]{Tate2014}
		* For recursive functions that end with a recursive call to itself.
		* **What is the difference between this and tail recursion
			optimization???** 
	- Multiple return values \cite[\S1, pp. 9-10]{Tate2014}
		* A function can return multiple values;
			these values can be used (e.g., in an assignment) or ignored
				\cite[\S1, pp. 9-10]{Tate2014}.
		* If the number of variables (assigned to the return values) is greater
			than the number of return values, they are assigned the value of
			*nil* \cite[\S1, pp. 10]{Tate2014}.
	- To mimic keyword arguments, pass a table as a function argument;
		that is, keyword arguments do not have a special syntax in *Lua*
		\cite[\S1, pp. 10]{Tate2014}.
		* During function calls, positional arguments can be assigned to the
			formal parameters of the function;
			positional arguments are not keyword arguments.
+ Control flow 
	- Built-in control flow constructs \cite[\S1, pp. 10]{Tate2014}
		* *if* statement, including *else* clause and zero or more *elseif* clauses.
		* *for* loop, which has two flavors:
			+ For a series of numbers \cite[\S1, pp. 11]{Tate2014}:
				- Without step argument.
				- With optional step argument.
			+ For items in a collection; see notes about tables
				\cite[\S1, pp. 11]{Tate2014}.
		* *while* loop.
			+ Its cousin is the *repeat* loop \cite[\S1, pp. 11]{Tate2014}.
+ Variables
	- "Variables are global by default" \cite[\S1, pp. 12]{Tate2014}
	- Placing the keyword "local" around them would make the scope of the
		variables local. 
+ A prototype object can be used when the object system can't find a key or
	function in table \cite[\S1, pp. 22]{Tate2014}.
	- The lines "setmetatable(obj, self)" and "self.__index = self" distinguishes
		prototypes from metatables \cite[\S1, pp. 23]{Tate2014}.
	- While "metatables [use] special functions for custom behavior", tables are
		used instead in prototype objects for defining/specifying special
		functions \cite[\S1, pp. 23]{Tate2014}.
	- WIth "prototype-based object systems", "no special mechanism" is needed
		for inheritance;
		cloning prototypes would suffice for implementing inheritance
			\cite[\S1, pp. 23]{Tate2014}.
	- *Lua* is a prototype system \cite[\S1, pp. 48]{Tate2014}.
+ Syntactic sugar 
	- When *table_name:method_name()* is used rather than
		*table_name.method_name(self)*, the *self* parameter is left out since it
		is passed implicitly \cite[\S1, pp. 23]{Tate2014}.
	- Enables simple and flexible data structures to be defined
		\cite[\S1, pp. 24]{Tate2014}.
+ Hybrid software can exploit the expressiveness of *Lua*, and the performance
	and the libraries of *C*/*C++* (*C*/*C++* libraries have a expressive API)
		\cite[\S1, pp. 32-33]{Tate2014}.
	- Hybrid software are developed in multiple programming/scripting languages.
	- To link code in other programming/scripting languages, use *luaL_doFile()*
		instead of *luaL_dostring()* to avoid recompiling programs in those
		other programming/scripting languages each time modifications are
		made only to the *Lua* code \cite[\S1, pp. 37]{Tate2014}.
+ "The [*Lua*] interpreter is designed to be lightweight" \cite[\S1, pp. 35]{Tate2014}.  










#	Factor

##	Characteristics of *Factor*

+ "Concatenative programming model" in "a full-featured, practical environment"
	\cite[\SAcknowledgments, pp. x]{Tate2014}.
+ Concatenative, stack-based programming model
	\cite[\SAcknowledgments, pp. xvii]{Tate2014}.
+ Full-featured library\cite[\SAcknowledgments, pp. xvii]{Tate2014}.
+ UI framework \cite[\SAcknowledgments, pp. xvii]{Tate2014}.
+ Web framework \cite[\SAcknowledgments, pp. xvii]{Tate2014}.





##	Notes about *Factor*

+ Composition of functions \cite[\SIntroduction, pp. xv]{Tate2014}, or function
	composition \cite[\S2, pp. 49]{Tate2014}.
	- A function can be passed as an input to another function.
	- A function can be passed "through a series of functions", where the output
		of a function can be passed as an input to another function, and "the
		output of the last function [is] the final result".
	- Keep "each function small and focused".
	- "By creating and connecting blocks of code", *Lua* programs can be
		developed to solve problems.
	- "Function composition (or composition of functions) is the essence of
		*Factor*"
	- Function composition in *Factor* does not involve:
		* variable names
		* parentheses
		* dots
		* any other punctuation to indicate function composition
	- It is assumed that the output of a function is available as an input to another
		function.
		* This is implemented via a (data \cite[\S2, pp. 52-53]{Tate2014}) stack;
			the stack provides input for words/functions, and pushes the results
				of words/functions onto the stack, which can be operated on
				by the next word/function.
		* The stack is used "to communicate input and output values"
			\cite[\S2, pp. 50]{Tate2014}.
		* Each word/function in [a] *Factor* [program receives] zero or more
			values from the stack" (i.e., pop the stack), "and pushes zero or
			more values onto the stack";
			the next word in the *Factor* program works with the resulting
				stack;
			when a stack has more values than a word needs to receive (i.e.,
				pop the stack), the remaining/excess/extra values remain
				on the stack \cite[\S2, pp. 53]{Tate2014}.
		* The period at the end of a line in *Factor* code pops a value from the
			stack, and pretty-prints it \cite[\S2, pp. 53]{Tate2014}.
		* Mathematical expressions in *Factor* is written in postfix notation
			(Reverse Polish notation, RPN) \cite[\S2, pp. 54]{Tate2014}.
		* *Factor* tends to have less punctuation than other programming
			languages, but the required presence or absence of whitespace is
			significant \cite[\S2, pp. 56]{Tate2014}.
		* Stack shuffling to reorder, duplicate, or eliminate values on the data
			stack \cite[\S2, pp. 57]{Tate2014}:
			+ dup ("duplicates a value")
			+ drop ("drops the top value")
			+ nip ("drops the second value")
			+ swap ("swaps two values")
			+ over ("duplicates the second value over to the top")
			+ rot ("rotate [the] values")
			+ pick
		* Combinators are higher-order words (or higher-order functions) that
			avoid excessive stack shuffling \cite[\S2, pp. 58]{Tate2014}.
			+ "[Combinators] use quotations (i.e., anonymous functions) to
				operate on values from the stack" \cite[\S2, pp. 58]{Tate2014}.
			+ A higher-order function/word that takes in a code block in its
				input parameter \cite[\S2, pp. 71]{Tate2014}.
			+ "*bi* applies two quotations to a value"
				\cite[\S2, pp. 59]{Tate2014}.
			+ "*bi@* applies one quotations to two values"
				\cite[\S2, pp. 59]{Tate2014}.
			+ "*bi\** applies one quotations to two values"
				\cite[\S2, pp. 59]{Tate2014}.
			+ "*dip* applies a quotation to the second value on the stack,
				keeping the first value intact" \cite[\S2, pp. 59]{Tate2014}.
			+ "*keep* applies a quotation to a value and puts the value back on
				top of the stack" \cite[\S2, pp. 59]{Tate2014}.
			+ "*tri*, *tri@*, and *tri* correspond to their bi equivalents, with three
				values and three quotations" \cite[\S2, pp. 59]{Tate2014}.
	- A function is also known as a *word* in *Factor*.
	- A quotation (i.e., anonymous function) is a word/function that is placed on
		the stack and is used by other words as values
			\cite[\S2, pp. 55]{Tate2014};
		a quotation is delimited by square brackets \cite[\S2, pp. 55]{Tate2014}.
	- A conditional (i.e., if statement) requires a value and two quotations (one for
		a non-false value, and the other for a false value) as inputs
			\cite[\S2, pp. 55]{Tate2014}.
	- Types of conditionals \cite[\S2, pp. 56]{Tate2014}:
		* *if* conditional
		* *when* conditional
		* *unless* conditional
+ Concatenative programming languages, such as *Factor* concatenates
	functions, and allows functions to be listed successively/consecutively
		\cite[\S2, pp. 50]{Tate2014}.
	- In contrast, applicative programming languages apply functions to values. 
	- Successively/consecutively listed functions can be processed using
		function composition (or composition of functions).
	- Helps to (or facilitates) express programmer intent.
+ Pipelines of functions (or pipelining functions) enables the demonstration of
	the strength of *Factor* \cite[\S2, pp. 50]{Tate2014}.
	- A pipeline of words/functions exploits the power of function composition
		(composition of functions) \cite[\S2, pp. 77]{Tate2014}.
	- A pipeline of words/functions can be known as "a higher-order word",
		"an example of the strategy pattern", or a chain of words
			\cite[\S2, pp. 78]{Tate2014}.
	- The value returned from a word/function higher up the chain can be used
		by a function down the chain, regardless of the number of functions
		between them \cite[\S2, pp. 78]{Tate2014}.
	- Decompose a problem into individual words/functions, and assemble the
		words into a pipeline for a composed solution (to the problem)
			\cite[\S2, pp. 82]{Tate2014}.
+ Comments in *Factor* code
	- Comments begin with an exclamation mark \cite[\S2, pp. 53]{Tate2014}.
+ Data types in *Factor* code \cite[\S2, pp. 54]{Tate2014}:
	- strings
	- numbers
	- Booleans \cite[\S2, pp. 54]{Tate2014}:
		* "In Boolean contexts, any value other than *f* is considered as true,
			including zero, empty strings, and empty sequences."
	- sequences
		* Includes container-based sequences of values
			\cite[\S2, pp. 54]{Tate2014}:
			+ lists; character space delimited between values, surrounded by
				curly braces
			+ maps; a list of two-value lists (i.e., key and value)
				\cite[\S2, pp. 55]{Tate2014}
				- Accessed via map and key (using *of* function), or key and
					map (using *at* function).
+ A vocabulary in *Factor* is a module (or package, or namespace
	\cite[\S2, pp. 63]{Tate2014}) of functions/words \cite[\S2, pp. 61]{Tate2014}.
	- We can execute vocabularies as standalone programs, and test them using
		unit testing \cite[\S2, pp. 61]{Tate2014}. 
	- A word/function can be (custom) defined as follows
		\cite[\S2, pp. 62]{Tate2014}:
		* colon
		* (character) space
		* name of the word
		* stack effect
			+ E.g., "( x--y )" indicates "the number of values that the word" pops
				from "and pushes back onto the stack, on the left and right side
				of the '--', respectively"
			+ Functions are allowed to pop nothing from the stack.
			+ Functions are allowed to push nothing onto the stack.
			+ To return multiple values with with a word/function, "declare
				multiple names on the right-hand side of '--' in the word's
				stack effect" \cite[\S2, pp. 62-63]{Tate2014}.
		* code for the word
		* (character) space
		* semi-colon
	- To load a set of vocabularies, try \cite[\S2, pp. 64-65]{Tate2014}:
		* "*USE: (name-of-vocabulary)*" for each vocabulary
		* "*USING: (name-of-vocabulary1) (name-of-vocabulary2) ... (name-of-vocabularyN) ;*"
	- A symbol can store a value, and transfer information between vocabularies
		\cite[\S2, pp. 65]{Tate2014}.
	- To define a symbol, try \cite[\S2, pp. 65]{Tate2014}: *SYMBOL: (symbol-name)*.
	- To assign a value to a symbol, try \cite[\S2, pp. 65]{Tate2014}:
		*(value) (symbol-name) set*.
	- For symbols with the type Boolean, try \cite[\S2, pp. 65]{Tate2014}:
		* *(variable-name) on* sets the *(variable-name)* to be boolean *True*.
		* *(variable-name) off* sets the *(variable-name)* to be boolean *False*.
		* *(variable-name) toggle* toggles the boolean value of *(variable-name)*. 
+ Unit testing in *Factor* \cite[\S2, pp. 68]{Tate2014}.
+ *Listener*, or *The Factor Listener*, *Factor* UI, GUI-based interactive console
	\cite[\S2, pp. 51-52]{Tate2014}.
	- Get documentation for a word/function via the *Listener*
		\cite[\S2, pp. 63]{Tate2014}:
		* Backslash
		* (character) space
		* (word) (or name of function)
		* help
		* Use *about* to get documentation about the vocabulary regarding the
			searched item \cite[\S2, pp. 63]{Tate2014};
			i.e., "(searched item)" *about* \cite[\S2, pp. 63]{Tate2014}.
		* Use *apropos* to show vocabularies/modules, words/functions, and
			articles containing the searched item \cite[\S2, pp. 63]{Tate2014};
			i.e., "(searched item)" *apropos* \cite[\S2, pp. 63]{Tate2014}.
+ Data structures for *Factor*
	- "Factor has an object system" \cite[\S2, pp. 74]{Tate2014}.
	- tuples \cite[\S2, pp. 74]{Tate2014}:
		* "[A tuple is a class] of objects for storing values into named slots."
		* A class can be instantiated via the keyword *new* to create empty
			slots for the instance of the class.
		* Use "TUPLE:" to declare a tuple so that empty slots can be generated
			for the instance of the class.
		* E.g., "TUPLE: *[name-of-class] [name-of-slot1] ... [name-of-slotN]*".
		* Each slot of a class represents a property/field of the class.
		* Use the *boa constructor*, or *By Order of Arguments*
			\cite[\S2, pp. 75]{Tate2014}.
		* For each slot of the *boa constructor*, it is required to place its value
			on the stack \cite[\S2, pp. 75]{Tate2014}. 
		* We can pass a word defining some values to the *boa constructor*,
			and require the caller (of the *boa constructor*)  to specify values
			for the remaining (empty) slots \cite[\S2, pp. 75]{Tate2014};
			this allows the *boa constructor* to be defined with default values
				for a subset of its slots \cite[\S2, pp. 75]{Tate2014}.
		* A word/function can be defined to instantiate a class with default
			values;
			by convention, rather than a requirement from the compiler(s), this
				definition is surrounded by angle brackets/chevrons
					\cite[\S2, pp. 75]{Tate2014}.
		* A tuple can also be defined as follows \cite[\S2, pp. 75-76]{Tate2014}:
			+ *<function-name> ( x -- y) Value1 Value2 class-name boa* ;
			+ *<function-name> ( x -- y) T{ class-name { Variable1 Value1}
				{ Variable2 Value2 } }* ;
			+ *T{ class-name f Value1 Value2 }* ;






#	Elm






Reference the following points (Reference these!!!)
+ functional reactive programming (FRP)
+ concurrency
+ GUI programming/development
+ Web development


##	Characteristics of *Elm*

+ Supports reactive programming, by using data flows and functions to propagate
	change \cite[\SAcknowledgments, pp. xvii]{Tate2014}.
	- Remove callbacks to simplify *JavaScript* applications, by "representing
		user interactions as signals that map onto functions"
			\cite[\SAcknowledgments, pp. xvii]{Tate2014}.
	- Reactive programming is a programming paradigm that is centered on the
		flow of data, rather than the flow of events \cite[\S3, pp. 89]{Tate2014}.
+ A higher level programming language that compiles into *JavaScript*, which is
	a lower level programming language for Web browsers
		\cite[\S3, pp. 89]{Tate2014}.
	- A functional programming language that compiles into *JavaScript*
		\cite[\S3, pp. 89-90]{Tate2014}.
+ Strongly typed \cite[\S3, pp. 91]{Tate2014}.
	- "Like the type systems in *Haskell* and *ML*, *Elm*'s type system is strong
		enough to represent complex data types but flexible enough to infer and
		coerce those types" \cite[\S3, pp. 91]{Tate2014}.
	- This avoids bugs due to weak typing, and helps make the software more
		predictable, stable, and reliable \cite[\S3, pp. 91]{Tate2014}.
	- *Type classes* describe the hierarchy of *Elm* types, even though my own
		instances cannot be built \cite[\S3, pp. 91]{Tate2014}.
	- *List*s and *string*s are *appendable* types, and can be used with the *++*
		operator \cite[\S3, pp. 91]{Tate2014}.
	- Since the type system is type inferred, each argument or variable does not
		need a declared type \cite[\S3, pp. 92]{Tate2014}.
	- Since the type system is polymorphic, types that inheirt from the same
		(parent) type can be treated equally \cite[\S3, pp. 92]{Tate2014}.
+ "*Elm* is a single-assignment language," but the interactive
	*Read-Eval-Print Loop (REPL)* environment of *Elm* allows primitive values
	to be redefined \cite[\S3, pp. 92]{Tate2014}.





+ "I wanted to show that functional programming can be great for real problems. Many functional folks have a way of saying extremely interesting and useful things in a totally inaccessible and impractical way, and I wanted to fix this. I wanted to prove that functional programming actually helps you write nicer code. Elm’s focus on examples, quick visual feedback, and shockingly short code are all meant to prove that purely functional GUIs are a good idea."
	- Evan Czaplicki, \cite[\S3, pp. 101]{Tate2014}.
+ "Elm is not about being theoretically better, it is about being demonstrably better."
	- Evan Czaplicki, \cite[\S3, pp. 102]{Tate2014}.





##	Notes about *Elm*

+ Control structures of *Elm* \cite[\S3, pp. 92]{Tate2014}:
	- *if* statements \cite[\S3, pp. 92]{Tate2014}:
		* One-line *if* statements.
		* Multi-line *if* statements.
	- *case* statements, for pattern matching \cite[\S3, pp. 92]{Tate2014}.
+ The design of complex data types make the type system stronger
	\cite[\S3, pp. 93]{Tate2014}.
+ A *type constructor* enables new instances of a type to be built
	\cite[\S3, pp. 93]{Tate2014}.
	- Use *Cons* (i.e., construct) at compile time to define types with head and
		tail arguments \cite[\S3, pp. 93]{Tate2014}.
		* Allows for "yet undefined abstract data type", with flexibility & power;
			or parameteric type parameter.
	- The head of a list can be combined with its tail (of the list)
		\cite[\S3, pp. 94]{Tate2014}.
	- "*Cons* [operates with] types at compile time" \cite[\S3, pp. 94]{Tate2014}.
	- The run-time counterpart of the "Cons" operator works on data is "::"
		\cite[\S3, pp. 94]{Tate2014}.
+ Algebraic data types??? \cite[\S3, pp. 93]{Tate2014}
+ Records \cite[\S3, pp. 94]{Tate2014}
	- It is a set of named fields \cite[\S3, pp. 94]{Tate2014}.
+ A function is the most important building block in *Elm*
	\cite[\S3, pp. 95]{Tate2014}.
	- A function can be defined as follows: *name-of-function [list of input
		arguments] = mathematical-expression-based-on-input-arguments*
		\cite[\S3, pp. 95]{Tate2014}.
	- Anonymous functions can be defined as: *name-of-function = \x ->
		mathematical-expression-based-on-input-arguments*
		\cite[\S3, pp. 95]{Tate2014}.
	- Pipe operators, "|>" or "<|", can be used to pipeline operations, from left to
		right or right to left, respectively \cite[\S3, pp. 95-96]{Tate2014}.
	- "Pattern matching [can] simplify function definitions"
		\cite[\S3, pp. 97]{Tate2014}.
	- Non-exhaustive pattern matching will lead to error conditions
		\cite[\S3, pp. 97]{Tate2014}.
	- Currying refers to the transformation of multi-argument functions into a
		chain/composition of single-argument functions, via partially applied
		functions (partial application) and function composition
			\cite[\S3, pp. 97-98]{Tate2014}.
+ Input/Output (I/O) processing is the most diffcult concept of functional
	programming, and is an important expect of user interaction/interface (UI)
		\cite[\S3, pp. 100]{Tate2014}.
	- The requirement of using callback functions in reactive programming
		complicates the software architecture (or code base);
		i.e., "callback hell" \cite[\S3, pp. 102]{Tate2014}.
	- Callback functions in reactive programming trades off simplicity for better
		responsiveness, via inversion of control \cite[\S3, pp. 103]{Tate2014}.
	- A signal represents input/output characteristics as a time-varying value
		\cite[\S3, pp. 103]{Tate2014}.
	- Use signals, instead of inverion of control, to provide better responsiveness;
		signal usage results in a straight composition of functions, instead of
		callback functions and inversion of control, where the present value is
		mapped whenever the signal changes.
		
















#	Elixir

"To achieve a critical mass, a popular general-purpose functional language will
	need to be able to insulate its users from tedious boilerplate"
		\cite[\S4, pp. 167]{Tate2014}.

##	Characteristics of *Elixir*

+ "Pure functional [programming] language"
	\cite[\SIntroduction, pp. xvii]{Tate2014}:
	- Runs "on the *Erlang* virtual machine"
	- Has "a rich *Ruby*-like syntax"
	- *Lisp*-style macros
+ Distributed computing \cite[\S4, pp. 125]{Tate2014}:
	- "extends *Erlang*'s message passing actor model"
	- Concurrent, distributed application \cite[\S4, pp. 126]{Tate2014}.
+ Uses syntactic "sugar to eliminate tedious repetition"
	\cite[\S4, pp. 125]{Tate2014}.
+ Supports metaprogramming \cite[\S4, pp. 125]{Tate2014}.
+ "Lisp-like, real macros without all the parentheses and prefix notation"
	\cite[\S4, pp. 125]{Tate2014}.
+ Has rich macro material \cite[\S4, pp. 126]{Tate2014}.
+ State machine representation via a macro \cite[\S4, pp. 126]{Tate2014}.


##	Notes about *Elixir*

+ Macros:
	- Express code in templates, via metaprogramming
		\cite[\SIntroduction, pp. xv]{Tate2014}
+ Elixir allows for multiline representations called *heredocs*, and you'll find
	*Ruby*-style sigils, a syntax for formatting literals.
+ "Elixir is a functional language" \cite[\S4, pp. 128]{Tate2014}.
	- "The base types are not objects, and the base types are immutable."
	- "You can't change a list or a tuple after you've defined it the first time."
+ "Tuples are collections of fixed size" \cite[\S4, pp. 128]{Tate2014}. 
+ Destructuring allows complex data structures to be packed and unpacked
	\cite[\S4, pp. 128-129]{Tate2014}.
+ Multiple assignment is forbidden \cite[\S4, pp. 129]{Tate2014}.
	- Avoid problems associated with mutable state and state assignment
		\cite[\S4, pp. 129]{Tate2014}.
+ Higher order function can be imposed, via unnamed or annoymous functions
	\cite[\S4, pp. 130]{Tate2014}.
	- Include a "*.*" (period) character  between the function call and its
		arguments \cite[\S4, pp. 130]{Tate2014}.
+ "Functional programming is about building functions
	that work together" \cite[\S4, pp. 131]{Tate2014}.
	- An "important composition is [to run] functions in sequence, matching up
		inputs and outputs" \cite[\S4, pp. 131]{Tate2014}.
+ A module is composed of \cite[\S4, pp. 131]{Tate2014}:
	- (named) functions
	- macros
	- other constructs
+ "*defmodule* is a macro that defines a module, and *def* is a macro that
	defines functions" \cite[\S4, pp. 132]{Tate2014}.
+ "The API clearly expresses our intentions" \cite[\S4, pp. 132]{Tate2014}.
+ "Maps associate keys with values" \cite[\S4, pp. 135]{Tate2014}.
+ For efficient destructuring, use pattern matching with maps
	\cite[\S4, pp. 135]{Tate2014}.
+ "Lists are the primary variable-length structure" \cite[\S4, pp. 136]{Tate2014}.
+ "Functions are fundamentally transformations.
	It's not surprising that you'll often want to do multiple transformations at
		once, such as a filter and a map.
	*Elixir* has a tool to do just that: the for comprehension."
		\cite[\S4, pp. 139]{Tate2014}.
+ "Each for comprehension has a generator step, a filter step, and a map step"
	\cite[\S4, pp. 139]{Tate2014}.
+ "Metaprogramming uses programs to write more sophisticated programs"
	\cite[\S4, pp. 143]{Tate2014}.
	- "Sometimes, the best way to do metaprogramming is to build a simple tool
		that implements the code you want your metaprogramming platform to
		build."
	- "If we want to build a generic state machine builder, we start by building a
		single state machine."
+ "A struct is like a map with a fixed set of fields, with the ability to attach
	behavior in the form of functions" \cite[\S4, pp. 144]{Tate2014}.
	- "Structs are just maps--create, update, and pattern match using the map
		syntax" \cite[\S4, pp. 145]{Tate2014}.
	- "Define them in modules, and include the functions that work on them"
		\cite[\S4, pp. 145]{Tate2014}.
+ Use macros as a function template to generate code for similar functions
	\cite[\S4, pp. 152]{Tate2014}.
	- Macros simplify the implementation of a finite state machine in *Elixir*
		\cite[\S4, pp. 152]{Tate2014}.
	- "Instead of using functions at runtime to do the work, we'll use macros at
		compile time" \cite[\S4, pp. 152]{Tate2014}.




















#	Julia

##	Characteristics of *Julia*

+ For computing regarding statistics and multi-dimensional mathematics
	\cite[\SIntroduction, pp. xviii]{Tate2014}.
+ Designed for concurrent and parallel computing
	\cite[\SIntroduction, pp. xviii]{Tate2014}.
+ Concurrent, distributed application \cite[\S5, pp. 172]{Tate2014}.
+ *Julia* has *Java*-like strongly typed behavior, with dynamic typing
	\cite[\S5, pp. 182]{Tate2014}.
+ Collection types are multi-faceted \cite[\S5, pp. 182]{Tate2014}.
	- When an array only has (a) concrete type, computation involving this array
		is efficient \cite[\S5, pp. 182]{Tate2014}
	- Strongly typed and dynamic typing can concurrent attributes of a
		programming language \cite[\S5, pp. 182]{Tate2014}.
	- Enables indexing and slices "to work in multiple dimensions"
		\cite[\S5, pp. 182]{Tate2014}
+ Dynamic typed programming language \cite[\S5, pp. 193]{Tate2014}
	- Improves productivity
+ Enables simple control of memory resources, and has high-performance library
	\cite[\S5, pp. 193]{Tate2014}.
+ Straightforward and transparent execution model \cite[\S5, pp. 193]{Tate2014}:
	- Don't require lots of software implementation tricks to gain performance
		speedup.
	- Has control over memory usage and memory layout
	- Enable easy interaction with other software in *C* or *Fortran*.
+ Multiple dispatch \cite[\S5, pp. 193]{Tate2014}
+ Polymorphic \cite[\S5, pp. 193]{Tate2014}







##	Notes about *Julia*

+ "Any is *Julia*'s universal type" \cite[\S5, pp. 174]{Tate2014}. 
+ "Tuples are fixed-size groups of other types. Their type is a tuple of the types
	of their components" \cite[\S5, pp. 174]{Tate2014}.
+ "Numeric operations between different types of numbers auto-promote"
	\cite[\S5, pp. 174]{Tate2014}.
+ Multiple variables can be concurrently assigned unique values, as long as the
	structures on the left-hand side (LHS) and right-hand side (RHS) are the
	same \cite[\S5, pp. 175]{Tate2014}.
+ In a dictionary, for each of its key-value pair, or (key, value) pair, the type of the
	key must also be the type of the value \cite[\S5, pp. 175]{Tate2014}. 
+ Data types can be \cite[\S5, pp. 183]{Tate2014}:
	- Abstract \cite[\S5, pp. 185]{Tate2014}
		* An abstract type has no fields, and cannot be constructed.
		* An abstract type groups multiple types together.
		* An abstract type can be a field type specifier or typed array literal, but
			it cannot be constructed.
		* Defined subtypes of an abstract type as concrete types.
		* Define a subtype with a "*<:*" operator \cite[\S5, pp. 186]{Tate2014}.
		* Multiple subtypes can coexist together \cite[\S5, pp. 186]{Tate2014}.
		* Multiple levels of subtype are forbidden \cite[\S5, pp. 186]{Tate2014}.
	- User-defined types \cite[\S5, pp. 185]{Tate2014}.
	- Abstract subtypes can be mixed with concrete subtypes
		\cite[\S5, pp. 194]{Tate2014}.
+ Strong typing \cite[\S5, pp. 184]{Tate2014}:
	- Boolean "expression[s] must evaluate to a boolean".
	- "0,1, and empty collections [cannot be cast] to boolean values"  
+ Variable names (e.g., of numbers or collections) and expressions can be
	referenced \cite[\S5, pp. 184]{Tate2014}.
+ A dictionary is a collection of tuples, where each tuple contains a key and a
	value \cite[\S5, pp. 184]{Tate2014}.
+ "Multiple dispatch is [functionally embodied] by polymorphism"
	\cite[\S5, pp. 185]{Tate2014} 
+ "In a type definition", use the "*::*" operator to contraint a field to a particular
	type \cite[\S5, pp. 185]{Tate2014}.
+ A constructor allows values of a type to be created, as an instance variable or
	constant;
	its name is the same as the type, and each input argument of the constructor
		has a type \cite[\S5, pp. 185]{Tate2014}.
+ *Julia* allows the type hierarchy to be enumerated, so that the *supertype* and
	the *subtype* can be found by introspection;
	this is analogous to other dynamically typed languages
		\cite[\S5, pp. 186]{Tate2014}.
+ User-defined functions enable software developers to abstract over code
	\cite[\S5, pp. 186]{Tate2014}.
	- A function returns the last expression in its code block.
	- A "return" statement enables the function to exit early.
	- If an argument is not specified during the invocation of a function, the
		default values of default arguments would be used
			\cite[\S5, pp. 186]{Tate2014}.
	- Using "*...*" as the final argument (in a function invocation) creates a
		collection to represent remaining arguments, if any remaining arguments
			exist \cite[\S5, pp. 187]{Tate2014}.
	- Using "*...*" in the argument list of a function definition gathers
		arguments into a collection \cite[\S5, pp. 187]{Tate2014}.
	- A function can be defined multiple times for different types
		\cite[\S5, pp. 187]{Tate2014}. 
+ Mathematical operators are functions that can be specified in mathematical
	expressions in the prefix notation \cite[\S5, pp. 187]{Tate2014}.  
+ Multiple dispatch selects a function based on the types of all its input
	arguments \cite[\S5, pp. 187]{Tate2014}.
	- "Each version of a function is called a method";
		however, "the methods do not belong to [any] particular type"
			\cite[\S5, pp. 187]{Tate2014}.
	- Multiple dispatch allows open extension of software libraries without
		modifiying those libraries;
		this is forbidden in object-oriented programming languages
			\cite[\S5, pp. 188-189]{Tate2014}.
	- "Functions are built on multiple dispatch, which is a more powerful version
		of overloading and dynamic dispatch" \cite[\S5, pp. 194]{Tate2014}.
+ Concurrency and distributed computing are required for high-performance
	computing \cite[\S5, pp. 189]{Tate2014}.
+ Processes in *Julia* communicate with each other via message passing, which
	supports distributed computing \cite[\S5, pp. 189]{Tate2014}.
	- To enable distributed processing, use *addprocs(N)* to add *N* local
		worker processes (also listed with IDs via workers()) and obtain their IDs;
		the process with ID 1 is the REPL \cite[\S5, pp. 189]{Tate2014}.
	- To start a REPL with a specific number of processes, N, try: *julia -p N*
		\cite[\S5, pp. 189-190]{Tate2014}.
		* This starts the REPL with *N+1* processes: one for the REPL shell, and
			*N* spare processes for parallel processing
				\cite[\S5, pp. 190]{Tate2014}.
	- Use the following low-level primitives for parallel programming 
		\cite[\S5, pp. 189-190]{Tate2014}:
		* *remotecall(ID,func,args)* to "send messages", by calling the function
			*func* with the arguments *args* on the process with the ID *ID*;
			"it returns a *RemoteRef* that can be used to obtain results of the
			function call (on *func*)  
		* *fetch(Rref)* to receive messages by using a RemoteRef *Rref* to
			obtain results of the function call (on *func*);
			if *func* has not finish executing, this will block and wait till it is
				done 
	- Try to use "higher-level parallel programming features" of *Julia*, instead of
		directly using *remotecall* and *fetch* \cite[\S5, pp. 190]{Tate2014}.
+ Use the *@time* macro for performance measurement of a function call; 
	it determines the time taken (in seconds) and the memory usage (in terms of
		the number of allocated bytes) \cite[\S5, pp. 191]{Tate2014}.
+ Use the *@parallel (+)* macro for parallel reduction, or to obtain a parallel
	reducing version of a sequential algorithm;
	the first argument *(+)* is the combing operator, so that the parallelized
		operation is commutative and allows scheduled processes to run in an
		arbitrary order \cite[\S5, pp. 191]{Tate2014}
+ "The *->* notation is *Julia*'s lightweight anonymous function syntax"
	\cite[\S5, pp. 192]{Tate2014}
+ *Julia* improves the efficiency of (statistical) data analysis, in terms of
	development/engineering effort and the speed of (statistical) data analysis;
	effort spend scheduling processes and managing mutexes is shifted from
		the developers/engineers to the *Julia* compiler and operating system
		\cite[\S5, pp. 192]{Tate2014}. 
+ Compiling *Julia* scripts to executables is not sufficiently convenient
	\cite[\S5, pp. 194]{Tate2014}
+ Parallel computing aspects of *Julia* \cite[\S5, pp. 194]{Tate2014}:
	- @spawn
	- @everywhere
	- *pmap*
+ *Julia*'s macros are based on macros of *Lisp* \cite[\S5, pp. 195]{Tate2014}.
	- A *Julia* macro receives (code) expressions as input, and produces a
		transformed version as its output.
	- A *Julia* macro operates "on the parsed tree structure of the language",
		rather than strings.
	- A *Julia* macro is defined like a *Julia* function
		\cite[\S5, pp. 198]{Tate2014}..
+ Homoiconicity is the property of code being equivalent to its internal data
	structure, such that the code is another data structure that can be
	manipulated by the code \cite[\S5, pp. 196]{Tate2014}
	- Placing a colon in front of a variable or function invocation returns a
		representation of the variable/function in the code's tree structure
			\cite[\S5, pp. 196]{Tate2014}.
- *Expr* is the type of an expression in *Julia* \cite[\S5, pp. 197]{Tate2014}. 
+ Quoted expressions are evaluated at run-time \cite[\S5, pp. 197]{Tate2014}.
+ Interpolated expressions are evaluated immediately, when it is constructed
	\cite[\S5, pp. 197]{Tate2014}.
+ Data compression finds compact representations of data by "[removing]
	unimportant information or finding easier-to-represent approximations of it"
		\cite[\S5, pp. 199]{Tate2014}.
+ Decompression is the reverse process of data compression
	\cite[\S5, pp. 199]{Tate2014}.





##	*Julia* To-Dos

+ Plot different graphs with *Julia* 
+ Carry out machine learning with *Julia*
+ Carry out pattern recognition with *Julia*
+ Determine ease of file I/O processing.








#	miniKanren

##	Characteristics of *miniKanren*

+ A domain-specific language (DSL), rather than a programming language, for
	logic programming \cite[\SIntroduction, pp. xviii]{Tate2014}.
+ Embedded logic DSL in general purpose programming language enables
	miniKanren developers to use logic programming in real world scenarios
		\cite[\SIntroduction, pp. xviii]{Tate2014}.
+ Focus on rules, constraints, and relations in logic programming
	\cite[\S6, pp. 209]{Tate2014}.











##	Notes about *miniKanren*

+ Express rules, rather than express individual steps of a procedure
	\cite[\SIntroduction, pp. xv]{Tate2014}
+ Logic programming involves specifying starting data and logical rules, and
	letting the logical reasoning engine automatically solve the problem (return a
	set of solutions) \cite[\S6, pp. 211]{Tate2014}. 
+ Use unification to unify a logic variable to a number, and use pattern matching
	\cite[\S6, pp. 212]{Tate2014}.
+ Mixes functional programming with logic programming
	\cite[\S6, pp. 220]{Tate2014}:
	- Perform pattern matching















##	Advantages of *miniKanren*

##	Disadvantages of *miniKanren*










#	Idris

##	Characteristics of *Idris*

+ Has dependent types \cite[\SAcknowledgments, pp. xviii]{Tate2014}







##	Notes about *Idris*


##	Advantages of *Idris*

##	Disadvantages of *Idris*




#	Miscellaneous Information

+ comma-separated values (CSV) \cite[\S1, pp. 2]{Tate2014}
	- Makes it harder to modify entries in CSV, without the "support [for]
		collections and constraints"





#	References

Citations/References that use the *LaTeX/BibTeX* notation are taken
	from my *BibTeX* database (set of *BibTeX* entries).

## From Zhiyang Ong's *BibTeX* Database 

+ [Tate2014]
	- Tate, B. A., Daoud, F., Dees, I., and Moffitt, J. Seven More Languages in Seven Weeks: Languages That Are Shaping the Future, Version P2.0 ed. The Pragmatic Programmers, Raleigh, NC, 2014.
		* Note that there are no numbered sections in this book.
		* When I reference/cite this work, I shall indicate the chapter and page
			number (if possible).
+ [WikipediaContributors2017y](https://en.wikipedia.org/wiki/Off-side_rule)
+ [WikipediaContributors2017z](https://en.wikipedia.org/wiki/Short-circuit_evaluation)
+ [WikipediaContributors2017a1](https://en.wikipedia.org/wiki/Cooperative_multitasking)













































#	Author Information

The MIT License (MIT)

Copyright (c) <2017> Zhiyang Ong

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

Email address: echo "cukj -wb- 23wU4X5M589 TROJANS cqkH wiuz2y 0f Mw Stanford" | awk '{ sub("23wU4X5M589","F.d_c_b. ") sub("Stanford","d0mA1n"); print $5, $2, $8; for (i=1; i<=1; i++) print "6\b"; print $9, $7, $6 }' | sed y/kqcbuHwM62z/gnotrzadqmC/ | tr 'q' ' ' | tr -d [:cntrl:] | tr -d 'ir' | tr y "\n"		Don't compromise my computing accounts. You have been warned.

