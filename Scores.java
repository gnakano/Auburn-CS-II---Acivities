
/** 
 * Scores - using an array to keep score.
 *
 * Activity 3
 * @author Genji Nakano - CPSC 1223 - AO2
 * @version March 27, 2019
 */
public class Scores {

// instance variables
   private int[] numbers;
   
   /** 
   *constructor - Scores.
   *
   *@param numbersIn = array sets numbers.
   */
   public Scores(int[] numbersIn) {
      numbers = numbersIn;
   }
   
   /**
   *findEvens = finds evens.
   *
   *@return evens = array of even numbers
   */
   public int[] findEvens() {
      int numberEvens = 0;
   
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            numberEvens++;
         }
      }
      // creating array of ints called evens with
      // length of numberEvens
      int[] evens = new int[numberEvens];
      int count = 0;
         
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            evens[count] = numbers[i];
            count++;
            
         }
         
      
      }
      return evens;
   }
   
   /**
   *findOdds = finds odds.
   *
   *@return odds = array of odd numbers
   */
   public int[] findOdds() {
      int numberOdds = 0;
   
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 1) {
            numberOdds++;
         }
      }
   
      int[] odds = new int[numberOdds];
      int count = 0;
   
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 1) {
            odds[count] = numbers[i];
            count++;
         }
      
      }
   
      return odds;
   }
   
   /**
   *calculteAverage = calculates average.
   *
   *@return average
   */
   public double calculateAverage() {
      int sum = 0;
      for (int i = 0; i < numbers.length; i++) {
         sum += numbers[i];
      }
   
      return (double) sum / numbers.length;
   }
   
   /**
   *toString = string containing all scores.
   *@return result;
   */
   public String toString() {
      String result = "";
      for (int i = 0; i < numbers.length; i++) {
         result += numbers[i] + "\t";
      } 
   
      return result;
   }
   
   /**
   *toStringInReverse = sting with scores in reverse.
   *
   *@return scores in reverse
   */
   public String toStringInReverse() {
      String result = "";
      for (int i = numbers.length - 1; i >= 0; i--) {
         result += numbers[i] + "\t";
      }
      return result;
   }
   
}