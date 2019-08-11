import java.util.Scanner;
public class DoublyLinkedList
{
	private Node head;
	private Node tail;
	private static Node middle;
	private static int length;
	private static class Node
	{
		private int data;
		private Node next;
		private Node previous;
		Node(int data)
		{
			this.data = data;
		}
	}
	public static void middleChange()
	{
		if (length > 2 &&  length % 2 != 0)
		{
			middle = middle.next;
		}
	}
	public void insertAtEnd(int data)
	{
		Node newNode = new Node(data);
		if (head == null)
		{
			head = newNode;
			tail = newNode;
			middle = head;
			length++;
			return;
		}
		tail.next = newNode;
		newNode.previous = tail;
		tail = newNode;
		length++;
		middleChange();
		return;
	}
	
	public void delAtFirst()
	{
		if (head == null)
		{
			return;
		}
		if (head.next == null)
		{
			head = null;
			tail = null;
			middle = null;
			length--;
			return;
		}
		head = head.next;
		head.previous = null;
		length--;
		middleChange();
		return;
	}
	
	public void printMiddle()
	{
		if (head == null)
		{
			return;
		}
		if (head.next == null)
		{
			System.out.println(head.data);
			return;
		}
		if (head.next.next == null)
		{
			System.out.println(head.data + " " + head.next.data);
			return;
		}
	}
	
	public static void main(String[] args)
	{
		DoublyLinkedList pikachu = new DoublyLinkedList();
		Scanner sc = new Scanner(System.in);
		pikachu.insertAtEnd(1);
		int test = sc.nextInt();
		for (int i = 0; i < test; i++)
		{
			int query = sc.nextInt();
			if ( query == 1)
			{
				pikachu.insertAtEnd(sc.nextInt());
			}
			if (query == 2)
			{
				pikachu.delAtFirst();
			}
			if (query == 3)
			{
				if (length % 2 !=0 && length > 2)
				{
					System.out.println(middle.data);
				}
				if (length == 2 ||  length == 1)
				{
					pikachu.printMiddle();
				}
				if (length % 2 == 0 && length > 2)
				{
					System.out.println(middle.data + " " + middle.next.data );
				}
			}
		}
	}
}