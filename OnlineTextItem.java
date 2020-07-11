/** 
 * OnlineTextItem - creates Online Text Items.
 * utilizes inheritance
 *
 * Activity 5
 * @author Genji Nakano - CPSC 1223 - AO2
 * @version April 6, 2019
 */
public abstract class OnlineTextItem extends InventoryItem {

/**
*constructor = creates OnlinceTextItem.
*
*@param nameIn = name to be set.
*@param priceIn = price to be set. 
*/
   public OnlineTextItem(String nameIn, double priceIn) {
      super(nameIn, priceIn);
   }

/**
*calculateCost = overides calcualteCost from InventoryItem.
*
*@return price = price of item.
*/
   public double calculateCost() {
      return price;
   }

}