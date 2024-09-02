
public class HouseBST implements HouseBSTI{
	private HouseNode root;
	private HouseNode HNode;
	private HouseNode cursor;
	
	public HouseBST() {
		this.root = null;
		this.HNode = null;
		this.cursor = null;
	}
	public boolean addNode(House h) {
		HNode = new HouseNode(h); //Creates a new House Node
		if(root == null) { //If Binary Search Tree is empty
			root = HNode; //Newly created House Node is set to be the root of the Binary Search Tree
			return true; //Successfully created node
		}
		else {
			cursor = root; //Cursor starts at root
			while(cursor != null) { //Iterates through Binary Search Tree
				if(cursor.getHouse().compareTo(h) == 1) { //Goes left of cursor if new House Node's mls is less
					if(cursor.getLeftChild() == null) { //If left child is empty 
						cursor.setLeftChild(HNode); //Set left child to the newly created House Node
						return true; // Successfully created new House Node
					}
					cursor = cursor.getLeftChild(); //Cursor goes left if left child is not empty 
				}
				else if(cursor.getHouse().compareTo(h) == -1) { //Goes right of cursor if new House Node's mls is greater
					if(cursor.getRightChild() == null) { // If right child is empty
						cursor.setRightChild(HNode); //Set right child to the newly created House Node
						return true; //Successfully created new House Node
					}
					cursor = cursor.getRightChild(); //Cursor goes right if right child is not empty 
				}
				else { //If compareTo method doesn't return a 1 or -1 there's a duplicate
					System.out.println("No duplicate MLS!");
					return false;  //Can't add duplicates 
				}
			}
		}
		return false;
	}

	@Override
	public boolean findNode(House h) {
		cursor = root;
		while(cursor!= null) { //Goes through Binary Search Tree 
			if(cursor.getHouse().compareTo(h) == 1) { //Goes left of cursor if mls of parameter house is less 
				cursor = cursor.getLeftChild(); //Cursor goes left
			}
			else if(cursor.getHouse().compareTo(h) == -1) { //Goes right of cursor if mls of parameter house is greater 
				cursor = cursor.getRightChild(); //Cursor goes right
			}
			else { //If commpareTo method doesn't return a 1 or a -1 parameter house is found 
				return true;
			}
		}
		return false;
	}


	public void printBSTree(HouseNode root){
	      if(root != null){
	           printBSTree(root.getLeftChild()); //Prints left child recursively
	          System.out.println(root.getHouse().toString()); //use the house's toString method
	           printBSTree(root.getRightChild()); //Prints right child recursively 
	      }
	}

	@Override
	public void printBSTree() {
		printBSTree(root);
		
	}

}
