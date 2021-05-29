package account;

/**
 * this class represents the clients of the bank
 *
 * @author Nada Omar Fathi Abdelsalam
 */
public class Client {

    /**
     * the class private attributes( name, nationalID,address,phone, account)
     *
     */
    private String name;
    private String nationalID;
    private String address;
    private String phone;
    private Account account;

    /**
     * the constructor which will be called when we create an object of this
     * class
     *
     * @param name :we use it to set the private attribute name
     * @param nationalID:we use it to set the private attribute national id
     * @param address:we use it to set the private attribute address
     * @param phone:we use it to set the private attribute phone
     * @param account:we use it to set the private attribute account but at
     * first we must create an object of type Account and pass it as a parameter
     * to the client constructor to be his account
     *
     */
    public Client(String name, String nationalID, String address, String phone, Account account) {
        this.name = name;
        this.nationalID = nationalID;
        this.address = address;
        this.phone = phone;
        this.account = account;
    }

    /**
     * this void method takes string parameter and set the private attribute
     * name
     *
     * @param name : it is the only parameter named name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * this void method takes string parameter and set the private attribute
     * nationalID
     *
     * @param nationalID : it is the only parameter named nationalID
     */
    public void setnationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    /**
     * this void method takes string parameter and set the private attribute
     * address
     *
     * @param address : it is the only parameter named address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * this void method takes string parameter and set the private attribute
     * phone
     *
     * @param phone : it is the only parameter named phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * this void method takes string parameter and set the private attribute
     * account
     *
     * @param account : it is the only parameter named account
     */
    public void setAccount(Account account) {
        this.account = account;
    }

    /**
     * method to return the client name
     *
     * @return {String}
     */
    public String getName() {
        return name;
    }

    /**
     * method to return the client nationalID
     *
     * @return {String}
     */
    public String getnationalID() {
        return nationalID;
    }

    /**
     * method to return the client address
     *
     * @return {String}
     */
    public String getAddress() {
        return address;
    }

    /**
     * method to return the client phone
     *
     * @return {String}
     */
    public String getPhone() {
        return phone;
    }

    /**
     * method to return the client account
     *
     * @return {Account}
     */
    public Account getAccount() {
        return account;
    }

    /**
     * toString method that will be override from class object and it return
     * string describe the client information
     *
     * @return { String }
     */
    @Override
    public String toString() {
        return "Name: " + getName() + "  National ID:  " + getnationalID() + "  Address: " + getAddress() + "  Phone: " + getPhone() + "  " + getAccount() + "\n";

    }
}
