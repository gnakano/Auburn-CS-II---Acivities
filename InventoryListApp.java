/** 
 * ItemsListApp - creates ItemsListApp.
 * utilizes Polymorphism
 *
 * Activity 5
 * @author Genji Nakano - CPSC 1223 - AO2
 * @version April 9, 2019
 */

public class InventoryListApp {

/**
* Test Driver for InventoryList.
*
* @param args = command line args not used.
*/
   public static void main(String[] args) {
   
      ItemsList myItems = new ItemsList();
      InventoryItem.setTaxRate(0.05);
   // add items
      myItems.addItem(new ElectronicsItem("laptop", 1234.56, 10));
      myItems.addItem(new InventoryItem("motor oil", 9.8));
      myItems.addItem(new OnlineBook("All Things Java", 12.3));
      myItems.addItem(new OnlineArticle("Useful Acronyms", 3.4));
      System.out.println(myItems.toString());
      System.out.println("Total: " + myItems.calculateTotal(2.0));
   }

}