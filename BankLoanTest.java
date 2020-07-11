import org.junit.Assert;
// import static org.junit.Assert.*;
// import org.junit.Before;
import org.junit.Test;
/** 
 * BankLoanTest - Test BankLoan objects.
 * 
 * 
 *
 * Activity 1
 * @author Genji Nakano - CPSC 1223 - AO2
 * @version March 14, 2019
 */

public class BankLoanTest {

/**  tests Interest rate for new loan. */
   @Test public void chargeInterestTest() {
      BankLoan loan1 = new BankLoan("Jane", .10);
      loan1.borrowFromBank(1000.00);
      loan1.chargeInterest();
      Assert.assertEquals("Testing chargeInterst: ",
                         1100, loan1.getBalance(), 000001);
   }
   
   @Test public void test2() {
      int one = 1;
      int two = 2;
      Assert.assertEquals("Error", one, two);
   }


}
