	public interface HouseNodeI{    
	      
		  /**
		  * This method will set newNode as
		  * the left child of the current node
		  * @param HouseNode new Node to add into a BST
		  */
		     abstract void setLeftChild(HouseNode newNode);
		  /**
		  * This method will set newNode as
		  * the right child of the current node
		  * @param HouseNode new Node to add into a BST
		  */
		    abstract void setRightChild(HouseNode newNode);
		  /**
		  * This method will return the left child
		  * of the current node
		  * @param no paramteters
		  * @return HouseNode left child
		   */
		    abstract HouseNode getLeftChild( );
		  /**
		  * This method will return the right child
		  * of the current node
		  * @param no paramteters
		  * @return HouseNode right child
		   */   
		    abstract HouseNode getRightChild( );

		  /**
		  * This method return the information
		  * inside the current node House
		  * @param none
		  * @return House object
		   */   
		    abstract House getHouse( );
		 
		 /**
		  * This method return a printable version
		  * of the House inside the current node
		  * @param none
		  * @return String with the House information
		   */
		    abstract String toString( );
		   
		}

