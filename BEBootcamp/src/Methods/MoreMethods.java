package Methods;

public class MoreMethods {

	public static void main(String[] args) {
		int[] addInts = {2,4,6,8,10};
		int intsTotal = sumOfInts(addInts);
		System.out.println("Sum of ints: " + intsTotal);
		
		double[] avgNumbers = {3.5, 5.5, 7.5, 10.5};
		System.out.println("Average: " + averageOfDouble(avgNumbers)); // Dont need to create a variable to use in output
		
		String text = "Hello";
		int repeat = 4;
		System.out.println(makeGibberish(text, repeat));
		
		int digits = 12;
		int digitsTotal = 0;
		while ( digits > 0) {
			digitsTotal += digits % 10;
			digits = digits / 10;
		}
		System.out.println(digitsTotal);

		int a=1, b=2, c=3, d=4, e=5;
		int[] original = {a, b, c, d, e};
		int[] reverse = new int[original.length];
		
		for (int i = 0; i < original.length; i++){
		    System.out.println(original[i]);
		}

		for (int k = original.length-1; k >= 0; k--) {
	    	int j = 0;
	        reverse[j] = original[k];
	        System.out.println(reverse[j]);
	        j++;
	    }
	

		int m=3, n=3;
		int[][] multiArray = new int[m][n];
        
		for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                multiArray[i][j] = j;
            }
        }

		for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
            	System.out.println("multiArray[" + i + "][" + j + "] = " + multiArray[i][j]);
            }
        }
	
	}

		// Takes an array of ints and returns the sum of all the ints
	public static int sumOfInts(int[] numbers) {
		
		int numbersTotal = 0;
		for (int number : numbers) {
			numbersTotal += number;
		}
		return numbersTotal;
	}
		
		
		// Takes an array of double and returns the average of all elements in the array
	public static double averageOfDouble(double[] numbers) {
		
		double averageTotal = 0;
		for (double number : numbers) {
			averageTotal += number;
		}
		return averageTotal / numbers.length;
	}
		
		// Takes a String and an int and returns the String concatenated with itself int number of times
	public static String makeGibberish(String word, int num) {
		
		String gibberish = "";
		for (int i = 0; i < num; i++) {
			gibberish += word;
		}
		return gibberish;
	}
		


}
