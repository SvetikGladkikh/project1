import myPrint.*;

public class Runner
{
	public static void main(String[] argv)
	{
		if (argv == null || argv.length != 2) {
			throw new RuntimeException("Invalid parameters");
		}

		System.out.println(PrintFirst.getStringForPrintName(argv[0]));
		System.out.println(PrintSecond.getStringForPrintAge(Integer.valueOf(argv[1])));
	}
}