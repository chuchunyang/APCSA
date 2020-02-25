public class FirstPrimes
{
    public static void main(String[] args)
    {
        int count = 0;
		System.out.print("\nPlease enter an integer: ");
		int a = IO.readInt();
		int t = 2;

		System.out.println();
		while(count!=a)
		{
	    	if(isPrime(t))
	    	{
				count+=1;
				System.out.println("The " + count + "th prime number is: " + t);
	    	}
	    	t++;
		}

    }

    public static boolean isPrime(int n)
    {
        for(int i=2; i<=n/2; i++)
        {
	    	if(n % i == 0)	{return false;}
	    }
		return true;
    }
}
