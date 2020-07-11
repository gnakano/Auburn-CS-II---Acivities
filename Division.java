/**
* Division - runs divison on 2 integers.
* utilizes try - catch exceptions
*
 * Activity 6
 * @author Genji Nakano - CPSC 1223 - AO2
 * @version April 15, 2019
*/
public class Division {

   /**
   * intDivide - divides two integers.
   * utilizes try-catch
   *
   * @param num = numerator
   * @param denom = denominator
   * @return num/div - return integer
   */
   public static int intDivide(int num, int denom) {
             
    
      try {
         return num / denom;
      }
      catch (ArithmeticException e) {
         return 0;
      }
   
     
   }


   /**
   * decimalDivide - divides two integers.
   *
   * @param num = numerator
   * @param denom = denominator
   * @return num/denom - return float
   */

   public static float decimalDivide(int num, int denom) {
      if (denom == 0) {
         throw new IllegalArgumentException("The denominator "
            + "cannot be zero");
      }
   
      return (float) num / denom;
   }


}