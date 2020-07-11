/** 
 * InventoryItem - creates Inventory Items.
 * utilizes inheritance
 *
 * Activity 5
 * @author Genji Nakano - CPSC 1223 - AO2
 * @version April 6, 2019
 */
public class InventoryItem {

// instance variables
   protected String name;
   protected double price;
   private static double taxRate = 0;

/**
*Constructor = initializing InventoryItem.
*
*@param nameIn = name to be set.
*@param priceIn = price to be set.
*/
   public InventoryItem(String nameIn, double priceIn) {
      name = nameIn;
      price = priceIn;
   }
   
   /**
   *getName = gets name of inventory item.
   *
   *@return name = name of inventory item.
   */
   public String getName() {
      return name;
   }
   
   /**
   *calculateCost = calcultates cost.
   * using price including tax
   *
   *@return cost = price * (1 * taxRate)
   */
   public double calculateCost() {
      return price + (price * (1 * taxRate));
   }
   
   /** 
   *setTaxRate = sets tax Rate.
   *
   *@param taxRateIn = tax rate to be set.
   */
   public static void setTaxRate(double taxRateIn) {
      taxRate = taxRateIn;
   }
   
   /** 
   *toString = string rep of object.
   *
   *@return output = string rep of object.
   */
   public String toString() {
      return name + ": $" + calculateCost();
   }
   
}