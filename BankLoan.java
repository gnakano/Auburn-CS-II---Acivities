   /** 
 * BankLoan - creates cutomer bank loan information.
 * provides info on customer, balance, interest rate
 * 
 *
 * Activity 1
 * @author Genji Nakano - CPSC 1223 - AO2
 * @version March 14, 2019
 */
public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;

   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;

   // static variables (can be used by class name)
   private static int loansCreated = 0;

/**
* Constructor: sets the initial customer and interest rate. 
* 
*@param customerNameIn = initial customer name
*@param interestRateIn = sets initial interest rate
*/
   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }

/**
* borrowFromBank = boolean to verify if loan was made.
*
*@param amount = amount to borrow
*@return wasLoanMade = boolean if amount + balance > Max_Loan_Amount
*/
   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }
   
   /**
   * payBank = takes payments and applies and.
   * updates balance
   *
   *@param amountPaid = amount that is being applied
   *@return double
   */

   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
   
   /**
   * getBalance = returns balance.
   *
   * @return balance = balance
   */
   public double getBalance() {
      return balance;
   }
   
   
   /**
   * setInterestRate = sets interest rate.
   *
   *@param interestRateIn = interest rate to be set if valid
   *@return boolean = true if valid
   */
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
   
   
   /**
   *getIntereRate = getter for interest rate.
   *
   *@return interestRate = gets interest rate
   */
   public double getInterestRate() {
      return interestRate;
   }
   
   
   /**
   * chargeInterest = adds interest to balance.
   *
   */
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
   
   /**
   *isAmountValid boolean to check if amount is valid.
   *
   *@param amount = amount to be checked
   *@return amount = true if >= 0
   */
   public static boolean isAmountValid(double amount) {
      return amount >= 0;
   }
   
   /**
   * isInDebt = checks to see if loan balance is greater than 0.
   *
   *@param loan = loan to check
   *@return boolean = true if balance > 0
   */
   public static boolean isInDebt(BankLoan loan) {
      if (loan.getBalance() > 0) {
         return true;
      }
      return false;
   } 
   
   /**
   * getLoansCreated() = counts number of loan objects created.
   *
   *@return loansCreated = number of loans created
   */
   public static int getLoansCreated() {
      return loansCreated;
   }
   
   /**
   * resetLoansCreated = resets loansCreaed to zero.
   *
   */
   public static void resetLoansCreated() {
      loansCreated = 0;
   }
   
   
   
  /**
  * toString = string rep of object.
  *
  *@return output = string rep of object
  */ 
   
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }

}
