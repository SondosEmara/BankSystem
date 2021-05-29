package account;

/**
 * this class Inherits from class client this class Consider it as company not a
 * person so the national id is set to 00000000000000
 *
 * @author Nada Omar Fathi Abdelsalam
 */
public class CommercialClient extends Client {

    /**
     * the private attribute of the class
     */
    private String commercialID;

    /**
     * the constructor which take 5 parameters and set each one to the
     * correspond attribute we set the national id to 00000000000000
     *
     * @param name : first parameter named (name)to pass it to the client
     * constructor to set the name
     * @param address : second parameter named (address)to pass it to the client
     * constructor to set the address
     * @param phone : third parameter named (phone)to pass it to the client
     * constructor to set the phone
     * @param Account: fourth parameter named (Account)to pass it to the client
     * constructor to set the Account
     * @param commercialID : fifth parameter named (commercialID) to set
     * commercialID
     */
    public CommercialClient(String name, String commercialID, String address, String phone, Account Account) {
        super(name, "00000000000000", address, phone, Account);
        this.commercialID = commercialID;
    }

    /**
     * void method to set will take id and set in the private
     * attribute(setcommercialID)
     *
     * @param commercialID : the only parameter named commercialID
     */
    void setcommercialID(String commercialID) {
        this.commercialID = commercialID;
    }

    /**
     * this method to return commercialID of the company
     *
     * @return {String}
     */
    String getcommercialID() {
        return commercialID;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "  CommercialID: " + getcommercialID() + "  Address: " + getAddress() + "  Phone: " + getPhone() + "  " + getAccount() + "\n";

    }

}
