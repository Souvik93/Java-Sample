package collection.demo;

public class CollectionDemoDriver {
	
	public void executeCustomLinkedList() {
		LinkerdList ls = new LinkerdList();
		
		LinkerdList.insert(ls,987);
		LinkerdList.insert(ls, 4444);
		LinkerdList.insert(ls, 777777777);
		LinkerdList.insert(ls, 785327840);
		
		LinkerdList.printLinkedList(ls);
		
		System.out.println("Hey There After Insert: "+ls.toString());
		LinkerdList.delete(ls,98);
		System.out.println("Hey There !! After Delete:"+ls.toString());
		
	}
	
	public void executeCustomTree(){
		Tree tree = new Tree();
		tree.add(40);
		tree.add(4);
		tree.add(12);
		tree.add(16);
		tree.add(20);
		tree.add(24);
		tree.add(28);
		tree.add(8);
		tree.add(32);
		tree.add(36);
		tree.inOrder();
	}

}
