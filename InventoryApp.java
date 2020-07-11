/** 
 * InventoryApp - Driver for InventoryItems and classes that use it.
 * utilizes inheritance
 *
 * Activity 4
 * @author Genji Nakano - CPSC 1223 - AO2
 * @version March 30, 2019
 */
public class InventoryApp {


/**
*Driver to check InventoryItem inheritance.
*Sets tax rate to 0.05.
*
*@param args = command line not used
*/
   public static void main(String[] args) {
      InventoryItem.setTaxRate(0.05);
   
   // instantiate items
   // item1 = InventoryItem
      InventoryItem item1 = new InventoryItem("Oil change kit", 39.00);
      System.out.println(item1);
     // item2 = ElectronicsItem 
      ElectronicsItem item2 = new ElectronicsItem("Cordless phone", 
                                                  80.00, 1.8);
      System.out.println(item2);
      
      // item3 OnlineArticle
      // need to setWordCount()                                          
      OnlineArticle item3 = new OnlineArticle("Java News", 8.50); 
      item3.setWordCount(700);    
      System.out.println(item3);
      
      // item4 OnlineBook
      OnlineBook item4 = new OnlineBook("Java for Noobs", 13.37);
      item4.setAuthor("L. G. Jones");    
      System.out.println(item4);                                       
   }


}