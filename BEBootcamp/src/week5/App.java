package week5;

//9.	Create a class named App that has a main method.
//10.	In this class instantiate an instance of each of your logger classes that implement the Logger interface.
//11.	Test both methods on both instances, passing in Strings of your choice.

public class App {

	public static void main(String[] args) {
		
		Logger astLogger = new AsteriskLogger();
		Logger spaceLogger = new SpacedLogger();
		
		astLogger.Log("AstLogger Log");
		astLogger.Error("AstLogger Error");
		
		spaceLogger.Log("SpaceLogger Log");
		spaceLogger.Error("SpaceLogger Error");
	}

}
