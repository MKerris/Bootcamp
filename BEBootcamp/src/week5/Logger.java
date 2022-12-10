package week5;

//1.	Create an interface named Logger.
//2.	Add two void methods to the Logger interface, each should take a String as an argument
//a.	Log
//b.	Error

public interface Logger {
	
	public void Log(String logStr);

	public void Error(String errorStr);	
	
}
