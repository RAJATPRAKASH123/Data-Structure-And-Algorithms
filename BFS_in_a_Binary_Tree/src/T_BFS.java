import java.util.LinkedList;
import java.util.Queue;

public class T_BFS {
	
	public void levelOrderTreeTraversal(Node root)
	{
		if ( root == null)
		{
			return;
		}
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while( !q.isEmpty())
		{
			Node n = q.poll();
			System.out.print(" " + n.data);
			if ( n.left != null )
			{
				q.add( n.left );
			}
			if ( n.right != null )
			{
				q.add( n.right );
			}
		}
		
	}
	
	public static void main(String[] args)
	{
		
	}

}

class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
