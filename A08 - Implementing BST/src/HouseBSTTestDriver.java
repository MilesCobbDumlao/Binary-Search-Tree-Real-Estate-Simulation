/*
  Driver for assignment 8
  @author: Blanca  Polo
*/
public class HouseBSTTestDriver{

   public static void main(String[ ] arg) throws Exception{
      final int SIZE = 6;
      HouseBST tree = new HouseBST( );
      House s;
   
   
      s = new House(11111,1,1, "seller1");
   
      if(!tree.addNode(s)) {
         System.out.println("didn't add it");
      }
      else{
      
         System.out.println("addedddddd!!!!");
      }
      
               
      House h = new House(22222,2,222.22, "seller2");
   
      if(!tree.addNode(h)) {
         System.out.println("didn't add it");
      }
      else{
      
         System.out.println("addedddddd!!!!");
      }
      
      
       h = new House(44444,4,2422.22, "seller4");
   
      if(!tree.addNode(h)) {
         System.out.println("didn't add it");
      }
      else{
      
         System.out.println("addedddddd!!!!");
      }
      
       h = new House(33333,2,322.22, "seller3");
   
      if(!tree.addNode(h)) {
         System.out.println("didn't add it");
      }
      else{
      
         System.out.println("addedddddd!!!!");
      }
      
      h = new House(22222,2,222.22, "seller2");
   
      if(!tree.addNode(h)) {
         System.out.println("correctly detected duplicate");
      }
      else{
      
         System.out.println("added a duplicate, fix code!!!!");
      }
      
 ///printing the Houses inorder by MLS
       
      System.out.println("\n==========\n");
      System.out.println("printing Houses, inorder by MLS");
      tree.printBSTree( );
      
      
      
 // Find a house    
      

      System.out.println("\n======Find Houses=====");
      System.out.println("======+++++++=====\n");
      
      
      House sfind = new House (22222, 2, 2, "Seller2");
      if(tree.findNode(sfind)) {
         System.out.println(sfind.toString( ));
         System.out.println("\n - - -  Correctly found\n*****\n");
      }
      else{
         System.out.println(sfind.toString( ));
         System.out.println("\n - - - not found, fix code\n*****\n");
      }
      
      sfind = new House (54321, 5, 3, "non-Existing");
      if(tree.findNode(sfind)) {
         System.out.println(sfind.toString( ));
         System.out.println("\n - - - found, house doesn\'t exist, fix code\n*****\n");
      }
      else{
         System.out.println(sfind.toString( ));
         System.out.println("\n - - - Correct, not found\n*****\n");
      }
      
      
     
   }
}