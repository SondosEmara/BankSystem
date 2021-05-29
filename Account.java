package account;

/**
 * This class includes sufficient information that is needed to make an account
 * in terms of money, account number, withdrawal and deposit process. a (Account
 * class) and has two data fields(currentBalance) and (acountNumber)
 *
 * @author Sondos Emara Gomaa
 */
public class Account {

    private long currentBalance;
    private long acountNumber;

    /**
     * Constructor that will call when make a new object of class and take two
     * Parameters.
     *
     * @param currentBalance that will take the Balance to set it in private
     * attribute(CurrentBalance).
     * @param acountNumber that will take the AccountNumber to set it in private
     * attribute(AcountNumber).
     *
     */
    public Account(long currentBalance, long acountNumber) {

        this.currentBalance = currentBalance;
        this.acountNumber = acountNumber;

    }

    /**
     * is copy constructor that take account object in parameter
     *
     * @param accountObj that object will take when the copy constructor is call
     * from the main
     */
    public Account(Account accountObj) {

        currentBalance = accountObj.currentBalance;
        acountNumber = accountObj.acountNumber;

    }

    /**
     * setBalance is void Function that will take Balance and set in the private
     * attribute(currentBalance).
     *
     * @param currentBalance that refer to the CurrentBalance in Client Account.
     */
    public void setBalance(long currentBalance) {

        this.currentBalance = currentBalance;
    }

    /**
     * SetAcountNumber is void Function that will access by the object class to
     * set a AcountNumber in private attribute(AcountNumber)
     *
     * @param acountNumber :that refer to the AccountNumber in Client Account.
     */
    public void setAcountNumber(long acountNumber) {

        this.acountNumber = acountNumber;

    }

    /**
     * GetCurrentBalance is return Function to know the value and access of
     * private attributes that can not be access direct in out of the class
     *
     * @return return the CurrentBalance of Client Account
     */
    public long getCurrentBalance() {

        return currentBalance;

    }

    /**
     * GetAcountNumber() is return Function to know the value and access of
     * private attribute(AcountNumber) that can not be access direct in out of
     * the class
     *
     * @return return the AcountNumber of Client Account
     */
    public long getAcountNumber() {

        return acountNumber;

    }

    /**
     * toString is return Function that will return the all information of the
     * Account like(Current Balance) and (AcountNumber).
     *
     * @return return a string represent Current Balance) and (AcountNumber).
     */
    /*
    Make Override because in java there are a build function (toString())
    that appear the information memory of Object class when object created
    in class (Account) not use the (toString) that build in java but make 
    a new implentaion and put @override to avoid confuse the compiler the 
    (toString) new implentation that will return the information of account
    (Current Balance)and(AcountNumber) not a object memory location.
    Override the method toString ( ) inherited from class Object to make 
    it return a meaningful string representation of the account information
     */
    @Override
    public String toString() {

        return " Current Balance: " + currentBalance + "  AcountNumber: " + acountNumber;

    }

    /**
     * deposit is Function to add Money to (currentBalance).
     *
     * @param depositMoney that refer to the Money that will add to the
     * (currentBalance) that the user is enter it.
     * @throws Exception that throws Exception when the user enter (
     * depositMoney) value that is not under the constraints of Bank System.
     */
    public void deposit(long depositMoney) throws Exception {

        //Check of the DesositMoney that enter from user because the bank system have maxium number and Minuim Number to depositon Money.            */
        if (depositMoney <= 30000 && depositMoney >= 50) {

            if (depositMoney % 5 == 0) {
                currentBalance += depositMoney;

            } else {
                throw new Exception("Sorry,Five and multiples of ten are accepted only.");
            }

        } else {
            throw new Exception("Sorry,You have skipped limits ,The deposit Money in bank is between 30000 to 50");
        }
    }

    /**
     * withDraw is void Function that will take (withdrawalValue) and will
     * decreases this value from (currntBalance)
     *
     * @param withdrawalValue that refer to the number to decreases from
     * (currntBalance).
     * @throws Exception that throws Exception when the user enter (
     * withdrawalValue) value that is not under the constraints of Bank System.
     */
    public void withDraw(long withdrawalValue) throws Exception {

        if ((withdrawalValue <= 20000 && withdrawalValue >= 50)) {

            if (withdrawalValue % 5 != 0) {
                withdrawalValue = (withdrawalValue / 10);
                withdrawalValue = withdrawalValue * 10;
            }
            this.currentBalance -= withdrawalValue;

        } else {
            throw new Exception("Sorry,You have skipped limits ,The withdrawal Money in bank is between 20000 to 50");
        }
    }

}
