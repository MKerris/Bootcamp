package week3;

public class week3CodingAssignment {

	public static void main(String[] args) {

//		1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
//		a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
			int[] ages1 = {3, 9, 23, 64, 2, 8, 28, 93};							// ages1 and and ages2 will be used for 1a and 1b, but the same code is used otherwise
			System.out.println("1a: " + (ages1[ages1.length-1] - ages1[0])); 	// 93 - 3 - 90

//		b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
			int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 76, 69};					// Two more ages added to the array
			System.out.println("1b: " + (ages2[ages2.length-1] - ages2[0])); 	// 69 - 3 = 66

//		c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.
			int avgAge = 0;
			for(int i=0; i < ages1.length; i++) {
				avgAge += ages1[i];
			}
			System.out.println("1c: " + (double)avgAge / (double)ages1.length);
			
//		2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
//		a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
			int numLetters = 0;
			String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
			for(String name : names) {
				numLetters += name.length();
			}
			System.out.println("2a: " + (double)numLetters / (double)names.length);
			
//		b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
			String allNames = "";
			for (String name : names) {
				allNames += name + " ";
			}
			System.out.println("2b: " + allNames);
			
//		3.	How do you access the last element of any array?
			System.out.println("3: " + names[names.length - 1]);	// Use the Length method minus 1 to find the final index of any string array

//		4.	How do you access the first element of any array?
			System.out.println("4: " + names[0]);		//The first element in any array is index 0
			
//		5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
			int[] nameLengths = new int[names.length];
			int nameCounter = 0;
			for(String name : names ) {
				nameLengths[nameCounter] = names[nameCounter].length();
				nameCounter++;
			}
			
//		6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
			int nameLengthSum = 0;
			for(int length : nameLengths) {
				nameLengthSum += length;
			}
			System.out.println("6: " + nameLengthSum);
			
//		7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
			
			String userWord = "Hello";
			int userNumber = 3;
			System.out.println("7: " + makeGibberish(userWord, userNumber));
			
//		8.	Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
			
			System.out.println("8: " + makeFullName("Matt", "Kerris"));
			
//		9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
			
			int[] oneHundredNums = {23, 32, 38};
			System.out.println("9: " + oneHundredPlus(oneHundredNums));
			
//		10.	Write a method that takes an array of double and returns the average of all the elements in the array.
			
			double[] dblNums = {4.5, 5.5, 6.5};
			System.out.println("10: " + averageDouble(dblNums));
			
//		11.	Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
			
			double[] dblArray1 = {3.5, 4.5, 5.5};
			double[] dblArray2 = {1.5, 5.5, 7.5};
			System.out.println("11: " + dblArrayCompare(dblArray1, dblArray2));
			
//		12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
			
			boolean hot = false;
			double money = 15.0;
			System.out.println("12. " + willBuyDrink(hot, money));
			
//		13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
			
			// For my work, I deal with importing data from files quite often, and sometimes I need to filter which files I'm importing
			// This method will help determine the extension of a file so I can evaluate if it should be imported or not
			String fileName = "Homework.docx";
			System.out.println("13. Extension: " + filenameExtension(fileName));
			
		}

		
	// -----------------------------------------------------------------------------------------
		// Method for #7 - Repeat word n times
		public static String makeGibberish(String word, int n) {		
			
			String gibberish = "";
			for (int i = 0; i < n; i++) {
				gibberish += word;
			}
			return gibberish;
		}
		
		// Method for #8 - Concatenate firstName and lastName
		public static String makeFullName(String firstName, String lastName) {
			return firstName + " " + lastName;
		}
		
		// Method for #9 - Add numbers in array and return true/false if greater than 100
		public static boolean oneHundredPlus(int[] nums) {
			int oneHundredSum = 0;
			for (int num : nums) {
				oneHundredSum += num;
			}
			return oneHundredSum > 100;
		}
		
		// Method for #10 - Average numbers in array of double elements
		public static double averageDouble(double[] doubleNums) {
			double dblAverage = 0.0;
			for(double nums : doubleNums) {
				dblAverage += nums;
			}
			return dblAverage / doubleNums.length;
		}
		
		// Method for #11 - Compare averages between two arrays of doubles
		public static boolean dblArrayCompare(double[] arr1, double[] arr2) {
			System.out.println("11. Array 1: " + averageDouble(arr1));
			System.out.println("11. Array 2: " + averageDouble(arr2));
			return averageDouble(arr1) > averageDouble(arr2);
		}
		
		// Method for #12 - Will buy drink returns true if isHotOutside = true and moneyInPocket > 10.50 (AND, not OR)
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			if(isHotOutside == true && moneyInPocket > 10.50) {
				return true;
			} else {
				return false;
			}
			
		}
		
		// Method for #13 - 
		public static String filenameExtension(String fName) {
			int extStart = fName.lastIndexOf('.');
			return fName.substring(extStart, fName.length());
		}

	
}
