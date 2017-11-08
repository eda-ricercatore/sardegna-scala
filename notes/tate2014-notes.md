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










##	Notes about *Lua*


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
		structures, such as arrays, tuples, vectors, lists, and dictionaries. 
+ Coroutines
	- Coroutines define the control flow of *Lua* programs
		\cite[\S1, pp. 14]{Tate2014}. 
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











\cite[\S1, pp. 7]{Tate2014}


TO BE COMPLETED...




##	Advantages of *Lua*

##	Disadvantages of *Lua*




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

+ Composition of functions \cite[\SIntroduction, pp. xv]{Tate2014}



##	Advantages of *Factor*

##	Disadvantages of *Factor*



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







##	Notes about *Elm*


##	Advantages of *Elm*

##	Disadvantages of *Elm*




#	Elixir

##	Characteristics of *Elixir*

+ "Pure functional [programming] language"
	\cite[\SIntroduction, pp. xvii]{Tate2014}:
	- Runs "on the *Erlang* virtual machine"
	- Has "a rich *Ruby*-like syntax"
	- *Lisp*-style macros






##	Notes about *Elixir*

+ Macros:
	- Express code in templates, via metaprogramming
		\cite[\SIntroduction, pp. xv]{Tate2014}





##	Advantages of *Elixir*

##	Disadvantages of *Elixir*






#	Julia

##	Characteristics of *Julia*

+ For computing regarding statistics and multi-dimensional mathematics
	\cite[\SIntroduction, pp. xviii]{Tate2014}
+ Designed for concurrent and parallel computing
	\cite[\SIntroduction, pp. xviii]{Tate2014}






##	Notes about *Julia*




##	Advantages of *Julia*

##	Disadvantages of *Julia*








#	miniKanren

##	Characteristics of *miniKanren*

+ A domain-specific language (DSL), rather than a programming language, for
	logic programming \cite[\SIntroduction, pp. xviii]{Tate2014}.
+ Embedded logic DSL in general purpose programming language enables
	miniKanren developers to use logic programming in real world scenarios
		\cite[\SIntroduction, pp. xviii]{Tate2014}.













##	Notes about *miniKanren*

+ Express rules, rather than express individual steps of a procedure
	\cite[\SIntroduction, pp. xv]{Tate2014}





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
















@misc{WikipediaContributors2017z,
	Address = {San Francisco, {CA}},
	Author = {{Wikipedia contributors}},
	Date-Added = {2014-03-30 00:11:00 +0200},
	Date-Modified = {2014-03-30 00:11:00 +0200},
	Howpublished = {Available online from {\it Wikipedia, The Free Encyclopedia: Evaluation strategy} at: \url{https://en.wikipedia.org/wiki/Short-circuit_evaluation}; November 8, 2017 was the last accessed date},
	Keywords = {programming language features, programming language theory, programming languages},
	Month = {October 19},
	Publisher = {Wikimedia Foundation},
	School = {},
	Title = {Short-circuit evaluation},
	Url = {https://en.wikipedia.org/wiki/Short-circuit_evaluation},
	Year = {2017}}

@misc{WikipediaContributors2017y,
	Address = {San Francisco, {CA}},
	Author = {{Wikipedia contributors}},
	Date-Added = {2014-03-30 00:11:00 +0200},
	Date-Modified = {2014-03-30 00:11:00 +0200},
	Howpublished = {Available online from {\it Wikipedia, The Free Encyclopedia: Programming language topics} at: \url{https://en.wikipedia.org/wiki/Off-side_rule}; November 8, 2017 was the last accessed date},
	Keywords = {indent style conventions},
	Month = {July 31},
	Publisher = {Wikimedia Foundation},
	School = {},
	Title = {Off-side rule},
	Url = {https://en.wikipedia.org/wiki/Off-side_rule},
	Year = {2017}}





























#	Author Information

The MIT License (MIT)

Copyright (c) <2017> Zhiyang Ong

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

Email address: echo "cukj -wb- 23wU4X5M589 TROJANS cqkH wiuz2y 0f Mw Stanford" | awk '{ sub("23wU4X5M589","F.d_c_b. ") sub("Stanford","d0mA1n"); print $5, $2, $8; for (i=1; i<=1; i++) print "6\b"; print $9, $7, $6 }' | sed y/kqcbuHwM62z/gnotrzadqmC/ | tr 'q' ' ' | tr -d [:cntrl:] | tr -d 'ir' | tr y "\n"		Don't compromise my computing accounts. You have been warned.

