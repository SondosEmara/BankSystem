package account;

/**
 * SpecialAccount that is a Account and inherit from(Account Class) the Features
 * (Methods)
 *
 * @author Sondos Emara Gomaa
 */
public class SpecialAccount extends Account {

    public SpecialAccount(long balance, long accountNumber) {
        super(balance, accountNumber);
    }

    /**
     * withDraw is the Function in (SpecialAccount) that (override Function)
     * that access the state if the client enter WithdrawalValue less than
     * (currentBalance)
     *
     * @param withdrawalValue that will pass this value from main function and
     * refer to the number to decreases from(currntBalance).
     * @throws Exception that throws Exception when the user enter (
     * withdrawalValue) value and the draft is less than or equal 0 that can not
     * borrow now
     */
    @Override

    public void withDraw(long withdrawalValue) throws Exception {

        if ((withdrawalValue <= 20000 && withdrawalValue >= 50)) {

            if (withdrawalValue % 5 != 0) {
                withdrawalValue = (withdrawalValue / 10);
                withdrawalValue = withdrawalValue * 10;
            }
            if ((getCurrentBalance() - withdrawalValue) < -1000) {
                throw new Exception("Sorry ,You can not borrow money from bank");
            }

            setBalance(getCurrentBalance() - withdrawalValue);
        } else {
            throw new Exception("Sorry,You have skipped limits ,The withdrawal Money in bank is between 20000 to 50");
        }
    }

}
