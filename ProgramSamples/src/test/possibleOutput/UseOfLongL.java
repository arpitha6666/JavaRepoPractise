package test.possibleOutput;

public class UseOfLongL {

	public static void main(String[] args) {
		long longWithL = 1000*60*60*24*365L;
		long longWithoutL = 1000*60*60*24*365;
		System.out.println(longWithL);
		System.out.println(longWithoutL);

		/* The output of the code snippet will be: 31536000000 ,1471228928
		We are explicitly creating the first variable as long by adding an �L� suffix. 
		So the compiler will treat it as long and assign it to the first variable.
		For the second statement, the compiler will perform the calculation and treat it as a 32-bit integer. 
		Since the output is outside the range of integer max value (2147483647), the compiler will truncate the 
		most significant bits and then assign it to the variable.
		Binary equivalent of 1000*60*60*24*365L = 011101010111101100010010110000000000 (36 bits).
		After removing 4 most significant bits to accommodate in 32-bit int, the new value = 01010111101100010010110000000000 (32 bits).
		This is equal to 1471228928 and hence the output. 
		 */

	}

}
