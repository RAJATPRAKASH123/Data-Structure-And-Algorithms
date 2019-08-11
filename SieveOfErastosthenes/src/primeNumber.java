// Sieve of Eratosthenes implemented in Java
public class primeNumber
{
	
	public static void sieveOfEratosthenes(int n)
	{
		boolean[] prime = new boolean[n + 1];
		for (int i = 0; i < n + 1; i++)
		{
			prime[i] = true;
		}
		for (int p = 2; p <= Math.sqrt(n); p++)
		{
			if( prime[p] == true)
			{
				for (int i = p*p ; i <= n; i+=p)
				{
					prime[i] = false;
				}
			}
		}
		for (int i = 2; i <= n; i++)
		{
			if (prime[i] == true)
			{
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		sieveOfEratosthenes(23);
	}
}