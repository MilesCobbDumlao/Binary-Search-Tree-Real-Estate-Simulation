/**
 * HouseBSTI Interface to be used for HouseBST.java
 */
public interface HouseBSTI {
   
   /**
     * Inserts node into binary search tree.
     * @param House h
     * @exception Any exception.
     * @return boolean.
     *      true if the node was added
     *      false if the node could not be added
     */
   abstract boolean addNode(House h);
   
      /**
     *Looks for a node within the binary search tree.
     * @param House h
     * @exception Any exception.
     * @return boolean.
     *      true if the node was found
     *      false if the node was NOT found     
     *
     */
   abstract boolean findNode(House h);
   
   /**
     * Prints binary search tree in inorder
     * traversal using recursion.
     * @param BSTNode root.
     * @exception Any exception.
     * @return No return value.
     */   
     abstract void printBSTree(HouseNode root);
        
   /**
     * Overloads method of the same name to
     * access private variable root.
     * @param None.
     * @exception Any exception.
     * @return No return value.
     */
   abstract void printBSTree( ); 
   
}
   