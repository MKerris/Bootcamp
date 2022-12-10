package week5;

//3.	Create two classes that implement the Logger interface
//b.	SpacedLogger

//6.	The SpacedLogger should add spaces between each character of the String argument passed into its methods.
//7.	If the log method received “Hello” as an argument, it should print H e l l o
//8.	The error method should do the same, but with “ERROR:” preceding the spaced out input (i.e. ERROR: H e l l o)

public class SpacedLogger implements Logger {

	@Override
	public void Log(String str) {
		for(int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i) + " ");
		}
		System.out.println("");
	}

	@Override
	public void Error(String str) {
		System.out.print("ERROR: ");
		Log(str);
	}
	
}


