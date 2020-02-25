import java.util.Scanner;

public class IO
{
    public static int readInt()
    {
	Scanner input = new Scanner(System.in);

	return input.nextInt();
    }

    public static String readLine()
    {
	Scanner input = new Scanner(System.in);
	return input.nextLine();
    }

    public static double readDouble()
    {
	Scanner input = new Scanner(System.in);
	return input.nextDouble();
    }
}
