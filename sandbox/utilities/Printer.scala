/**
 * boilerplate-code: A library of common utility classes needed to
 *	print text to standard output/error stream, and perform file
 *	input/output (I/O) operations.
 *
 * utilities: A module that enables objects of other classes to
 *	print text to standard output/error stream, and perform file
 *	input/output (I/O) operations.
 *
 * The MIT License (MIT)
 *
 * Copyright	(C)	<2014>	<Zhiyang Ong>
 *
 * Permission is hereby granted, free of charge, to any person
 *	obtaining a copy of this software and associated documentation
 *	files (the "Software"), to deal in the Software without
 *	restriction, including without limitation the rights to use, copy,
 *	modify, merge, publish, distribute, sublicense, and/or sell copies
 *	of the Software, and to permit persons to whom the Software is
 *	furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 *	included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 *	EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 *	MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 *	NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 *	HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 *	WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *	OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
 *	DEALINGS IN THE SOFTWARE.
 *
 *
 * @author Zhiyang Ong
 *
 * Class that enables objects of other classes to print text to
 *	standard output/error stream.
 *
 *
 * #### IMPORTANT NOTES:
 * To be completed...
 *
 *
 */
class Printer {
	// Indicator of permission to print to standard output stream.
	private var toStdOutputEnable = false;
	// Indicator of permission to print to standard error stream.
	private var toStdErrorEnable = false;

	/**
	 * Method to set indicator to print to standard output stream.
	 * @param indicatorOutput - Indicates the new value of
	 *								toStdOutputEnable.
	 * @return - Nothing.
	 */
	def setIndicatorPrintToStdOutput(indicatorOutput: Boolean) {
		toStdOutputEnable = indicatorOutput;
	}

	/**
	 * Method to set indicator to print to standard error stream.
	 * @param indicatorError - Indicates the new value of
	 *								toStdErrorEnable.
	 * @return - Nothing.
	 */
	def setIndicatorPrintToStdError(indicatorError: Boolean) {
		toStdErrorEnable = indicatorError;
	}

	/**
	 * Method to get indicator to print to standard output stream.
	 * @param - Nothing.
	 * @return toStdOutputEnable.
	 */
	def getIndicatorPrintToStdOutput {
		toStdOutputEnable
	}

	/**
	 * Method to get indicator to print to standard error stream.
	 * @param - Nothing.
	 * @return toStdErrorEnable.
	 */
	def getIndicatorPrintToStdError {
		toStdErrorEnable
	}

	
}