package myPrint;

public class PrintSecond
{
	public static String getStringForPrintAge(Integer age)
	{
		if (age != null)
			return "My age is " + age.toString();
		else
			throw new RuntimeException("Age must not be null!");
	}
}