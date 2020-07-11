/** 
 * OnlineBook - creates Online Book Items.
 * utilizes inheritance
 *
 * Activity 5
 * @author Genji Nakano - CPSC 1223 - AO2
 * @version April 6, 2019
 */
public class OnlineBook extends OnlineTextItem {
// Instance variables
   protected String author;

/**
*constructor = instantiate OnlineBook Item.
*
*@param nameIn = name of book.
*@param priceIn = price of book.
*/
   public OnlineBook(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      author = "Author Not Listed";
   }
   
   /**
   *toString = overide to include author in string rep of object.
   *
   *@return string = string rep of object
   */
   public String toString() {
      return super.name + " - " + author + ": $" + super.calculateCost();
   }
   
   /**
   *setAuthor = sets author of object.
   *
   *@param authorIn = author to be set
   */
   public void setAuthor(String authorIn) {
      author = authorIn;
   }
}