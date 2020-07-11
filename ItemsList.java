/** 
 * ItemsList - creates ItemsList.
 * utilizes Polymorphism
 *
 * Activity 5
 * @author Genji Nakano - CPSC 1223 - AO2
 * @version April 6\9, 2019
 */

public class ItemsList {

// instnce variables
// Create an array of InventoryItem
   private InventoryItem[] inventory;
// used to count the number of items in inventory
   private int count;


/**
* Constructor = creates new InventoryLIst object.
*
*/
   public ItemsList() {
      inventory = new InventoryItem[20];
      count = 0;
   } 

/**
* addItem = addItems to InventoryItem[] array.
*  that was instantiated
*
* @param itemIn = item to be added
*/
   public void addItem(InventoryItem itemIn) {
      inventory[count] = itemIn;
      count++;
   }

/**
* calculateTotal = calculates total.
*
* @param electronicsSurcharge = Electronics Surcharge to be added
* @return total = total cost.
*/
   public double calculateTotal(double electronicsSurcharge) {
      double total = 0;
      for (int i = 0; i < count; i++) {
         if (inventory[i] instanceof ElectronicsItem) {
            total += inventory[i].calculateCost() + electronicsSurcharge;
         }
         
         else {
            total += inventory[i].calculateCost();
         }
      
      }
      return total;
   }

/**
* toString = String rep of an object.
*
* @return output = string rep of object
*/
   public String toString() {
      String output = "All inventory:\n\n";
   
      for (int i = 0; i < count; i++) {
         output += inventory[i] + "\n";
      }
      return output;
   }

}