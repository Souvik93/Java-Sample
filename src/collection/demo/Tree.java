package collection.demo;

// https://stackoverflow.com/questions/8876406/binarytree-implementation-in-java
public class Tree {
	
	private Node head;
	private int size;
	private int data;
	
	public Tree() {
		this.head = new Node(data);
	}
	
	public void add(int data){
		
		if(size == 0) {
			this.head.data = data;
			size+=1;
		} else {
			add(head,new Node(data));
		}
		
	}
	
	public void inOrder(){
		System.out.println("Hey There !! From  In Order Traversal");
		in(head);
		System.out.println();
	}
	
	public void in(Node parent) {
		if(parent != null){
			in(parent.left);
			System.out.println(parent.data);
			in(parent.right);
		}
	}
	
	public void add(Node head, Node newNode){
		if(head == null)
		return ;
		if(head.data>newNode.data){
			if(head.left==null)
			head.left = newNode;
			else
			add(head.left,newNode);
			size +=1;
		} else {
			if(head.right==null)
				head.right=newNode;
			else
				add(head.right,newNode);
			size+=1;
		}
	}
	
	

	private static class Node {
		private int data;
		private Node left;
		private Node right;
		public Node(int data) {
			this.data = data;
		}
	}
	
	
	

}
