
public class HouseNode implements HouseNodeI{

	private HouseNode leftChild ;
	private HouseNode rightChild;
	private House house;
	
	
	public HouseNode(House house) {
		this.leftChild = null;
		this.rightChild = null;
		this.house = house;
	}
	public void setLeftChild(HouseNode newNode) {
		this.leftChild = newNode;
	}


	public void setRightChild(HouseNode newNode) {
		this.rightChild = newNode;
		
	}


	public HouseNode getLeftChild() {

		return this.leftChild;
	}


	public HouseNode getRightChild() {
		
		return this.rightChild;
	}

	
	public House getHouse() {
		
		return this.house; 
	}

}
