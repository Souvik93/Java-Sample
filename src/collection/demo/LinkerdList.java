package collection.demo;

public class LinkerdList {
	
	private Node node;
	
	public static class Node {
		private int data;
		private Node next;
		
		Node(int data) {
			this.data = data;
			this.next = null;
		}

		@Override
		public String toString() {
			return "Node [data=" + data + ", next=" + next + "]";
		}
		
		
	}
	
	@Override
	public String toString() {
		return "LinkerdList [node=" + node + "]";
	}
	
	
	
	public static LinkerdList insert(LinkerdList ls, int data) {
		if(ls != null) {
			if(ls.node == null) {
				ls.node= new Node(data);
			} else {
				Node last = ls.node;
				while(last.next != null) {
					last = last.next;
				}
				last.next=new Node(data);
			}	
		}		
		return ls;		
	}
	
	public static LinkerdList delete(LinkerdList ls, int data){
		
		if(ls != null) 
		{
			Node node = ls.node;
			
			if (node.data == data) {
				
				ls.node=node.next;
				
			} else {
				Node previousNode = null;
				boolean isDeleted = false;
				while(node != null && node.next != null) {
					previousNode = node;
					node = node.next;
					if(node.data == data) {
						previousNode.next = node.next;
						isDeleted = true;
						break;
					}
					
					node=node.next;
				}
				if(!isDeleted) {
					System.out.println("Hey There !! Unable To Find The Data You Want To Delete..");
				}
			}
		}
		
		return ls;
		
	}
	
	public static void printLinkedList(LinkerdList ls) {
		if(ls != null) {
			System.out.println("Hey There!! Your Created Linked List Is:");
			Node child = ls.node;
			while(child.next !=null) {
				System.out.println(child.data);
				System.out.println(",");
				System.out.println(child.next);
				System.out.println("=>");
				child = child.next;
			}
		} else {
			System.out.println("Hey There !! Your Ceeated Linked List Is Either Blank Or Empty");
		}
	}

}
