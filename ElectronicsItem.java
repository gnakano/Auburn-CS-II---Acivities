/** 
 * ElectronicsItem - creates Electronics Items.
 * utilizes inheritance
 *
 * Activity 5
 * @author Genji Nakano - CPSC 1223 - AO2
 * @version April 6, 2019
 */
public class ElectronicsItem extends InventoryItem {

// instance variables
   protected double weight;
   /** Constant for Shipping cost. */
   public static final double SHIPPING_COST = 1.5;

/**
*constructor = initializes ElectronicsItem.
*
*@param nameIn = name to be set.
*@param priceIn = price to be set.
*@param weightIn = weight to be set.
*/
   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
   // uses super to set the invoke the constructor for InventoryItem
      super(nameIn, priceIn);
      weight = weightIn;
   }
   
/** 
*calculateCost = overrides calculateCost to include shipping.
*
*@return cost including shipping
*/
   public double calculateCost() {
   // using super.calculateCost() explicitly calls on calcuateCost from parent
      return super.calculateCost() + (SHIPPING_COST * weight);
   }


}