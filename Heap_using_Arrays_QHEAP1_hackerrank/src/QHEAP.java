import java.util.Scanner;
import java.util.*;
public class QHEAP {
	
	private static int[] doubleSizeOf(int[] heap)
	{
		int[] doubleHeap = new int[heap.length * 2];
		for ( int i = 0 ; i < heap.length; i++)
		{
			doubleHeap[i] = heap[i];
		}
	}
	
	public static void swim( int[] heap, int pos)
	{
		int parent = pos/2;
		while ( parent > 0 && heap[pos] < heap[parent])
		{
			swap( heap, parent, pos);
			pos = parent;
			parent = pos/2;
		}
	}
	
	private static void swap( int[] heap, int from, int to)
	{
		int temp = heap[from];
		heap[from] = heap[to];
		heap[to] = temp;
	}
	
	private static void sink( int[] heap, int pos, int last)
	{
		int left = pos * 2; 
		int right = pos * 2 + 1; 
		int posToSwap = pos;
		
		if ( left < last && heap[left] < heap[posToSwap])
		{
			posToSwap = left;
		}
		if ( right < last && heap[right] < heap[posToSwap])
		{
			posToSwap = right;
		}
		if ( pos ==  posToSwap)
		{
			return;
		}
	}
	
	
	
	public static void main(String[] args)
	{
		int[] heap = new int[16];
		int last = 1;
		Scanner sc = new Scanner(System.in);
		int queries = sc.nextInt();
		
		for ( int q = 0; q < queries; q++)
		{
			int op = sc.nextInt();
			switch(op)
			{
			case 1:
				int value = sc.nextInt();
				if ( last == heap.length)
				{
					heap = doubleSizeOf(heap);
				}
				heap[last] = value;
				swim(heap, last);
				last++;
				break;
			case 2:
				value = sc.nextInt();
				int posToDelete = findInHeap( heap, value, last);
				last--;
				swap( heap, posToDelete, last);
				sink( heap, posToDelete, last);
				swim
			}
		}
	}
}
