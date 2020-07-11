/** 
 * OnlineArticle - creates Online Article Items.
 * utilizes inheritance
 *
 * Activity 5
 * @author Genji Nakano - CPSC 1223 - AO2
 * @version April 6, 2019
 */
public class OnlineArticle extends OnlineTextItem {
   
   // instance variables
   // keep track of word count
   private int wordCount;
   
   /**
   *constructor = sets the onlineArticle method.
   *
   *@param nameIn = sets name.
   *@param priceIn = price to be set.
   */
   public OnlineArticle(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      wordCount = 0;
   }
   
 /**
 *setWordCount = sets word count.
 *
 *@param wordCountIn = sets wordCount
 */
   public void setWordCount(int wordCountIn) {
      wordCount = wordCountIn;
   }
   
}