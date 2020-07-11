import javax.swing.JOptionPane;

/** 
 * DivisionDriver - Driver for Division class.
 *
 * Activity 6
 * @author Genji Nakano - CPSC 1223 - AO2
 * @version April 15, 2019
 */

public class DivisionDriver {


/**
* main - driver to run program.
*
* @param args - command line args not used.
*/
   public static void main(String[] args) {
   
      String numInput 
         = JOptionPane.showInputDialog("Enter the numerator:");
   
      String denomInput
         = JOptionPane.showInputDialog("Enter the denominator:");
   
      try {
         int num = Integer.parseInt(numInput);
         int denom = Integer.parseInt(denomInput);
      
         String result = "Integer division: \n"
                   + Division.intDivide(num, denom)
                   + "\n\nFloating point division: \n"
                   + Division.decimalDivide(num, denom);
                   
         JOptionPane.showMessageDialog(null, result,
            "Result", JOptionPane.PLAIN_MESSAGE);
      }  
      catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(null,
            "Invalid input: eneter numerical integer values only.",
            "Error", JOptionPane.ERROR_MESSAGE);
      }  
      
      catch (IllegalArgumentException e) {
         JOptionPane.showMessageDialog(null,
            e, "Error", JOptionPane.ERROR_MESSAGE);
      }
         
   }

}