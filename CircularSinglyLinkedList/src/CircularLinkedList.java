import java.util.Scanner;
public class CircularLinkedList
{
	private int length;
	private static Node last;
	
	private static class Node
	{
		
		private int data;
		private Node next;
		public Node(int data)
		{
			this.data = data;
		}
	}
	public void insertAtFirst(int data)
	{
		Node temp = new Node(data);
		
		if (last == null)
		{
			last = temp;
		}
		else
		{
			temp.next = last.next;
		}
		last.next = temp;
	}
	public static void main(String[] args)
	{
		CircularLinkedList pikachu = new CircularLinkedList();
		pikachu.insertAtFirst(1);
		
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for (int i = 0; i < test; i++)
		{
			int query = sc.nextInt();
			if (query == 1)
			{
				pikachu.insertAtFirst(sc.nextInt());
			}
			if (query == 2)
			{
				last = last.next;
			}
			if (query == 3)
			{
				System.out.println(last.data);
			}
		}
		
	}
}


class test
{
	Node node = new Node(5);
	System.out.println(node.data);
}