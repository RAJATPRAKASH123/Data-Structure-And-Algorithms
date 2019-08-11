
public class bubbleSort {
	
	public static void sort(int[] a)
	{
		int l = a.length;
		for (int i = 0 ; i < l; i++ )
		{
			for (int j = 1 ; j < l - i; j++)
			{
				if ( a[j - 1] > a[j] )
				{
					// swap it
					int temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < l ; i++)
		{
			System.out.print(a[i] + " ");
		}
	}
	
	
	public static void altSort(int[] a)
	{
		int l = a.length;
		for (int i = 1; i < l ; i++)
		{
			for (int j = l - 1 ; j > i - 1  ; j-- )
			{
				if (a[j] < a[j-1])
				{
					int temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}
			}
		}
		for (int i = 0; i < l ; i++)
		{
			System.out.print(a[i] + " ");
		}
	}
	
	
	
	public static void main(String[] args) {
		int[] a = {4, 3, 9, 22, 1, 37, 19, 2, 8, 1, 0};
		sort(a);
		altSort(a);
		
	}
}
