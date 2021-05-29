package account;

import java.util.ArrayList;

/**
 * This class includes information of the Bank like name, address and phone
 *
 * @author Mahmoud_Mohamed_Abd-Elazeem
 */
public class Bank {

    private String name;
    private String address;
    private String phone;
    private ArrayList<Account> accountList;
    private ArrayList<Client> clientList;

    /**
     * Constructor that will call when make a new object of class and take two
     * Parameters
     *
     * @param name take the name of the Bank and sore it set it in private
     * attribute(name)
     * @param address take the address of the Bank and sore it set it in private
     * attribute(address)
     * @param phone take the phone number of the Bank and sore it set it in
     * private attribute(phone)
     */
    Bank(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        accountList = new ArrayList<Account>();
        clientList = new ArrayList<Client>();
    }

    /**
     * setName is a void function that take a String name as a parameter and
     * stor it
     *
     * @param name that refer to the name of the Bank
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * setAddress is a void function that take a String address as a parameter
     * and stor it
     *
     * @param address that refer to the name of the Bank
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * setPhone is a void function that take a String phone number as a
     * parameter and stor it
     *
     * @param phone that refer to the name of the Bank
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * getName is a return function
     *
     * @return the name of the Bank
     */
    public String getName() {
        return name;
    }

    /**
     * getAddress is a return function
     *
     * @return the address of the Bank
     */
    public String getAddress() {
        return address;
    }

    /**
     * getPhone is a return function
     *
     * @return the phone number of the Bank
     */
    public String getPhone() {
        return phone;
    }

    /**
     * addAccount is a void function that take an object of type Account
     *
     * @param accountObj as a object that contain all the information of the
     * account and added it in bank list
     */
    public void addAccount(Account accountObj) {
        accountList.add(accountObj);
    }

    /**
     * addClient is a void function that take an object of type Account
     *
     * @param clientObj as a object that contain all the information of the
     * Client and added it in bank list
     */
    public void addClient(Client clientObj) {
        clientList.add(clientObj);
    }

    /**
     * display is a void function that return a massage to user this massage
     * contain all information of the list of the clients in Bank
     */
    public void display() {
        System.out.println(clientList.toString());
    }

    /**
     * searchAccount is a void function that search on an account in list of the
     * Bank and by the account number return it
     *
     * @param index that is the (account number -1)
     * @return return account object
     */
    public Account search(int index) {

        return accountList.get(index);

    }

    /**
     * editAccount is a void function that change an account information by
     * taking to parameters (balanceAccount,accountNumber)
     *
     * @param balanceAccount is a long value that contain the balance of the
     * account
     * @param accountNumber is a integer value that contain the number of the
     * account
     */
    public void editAccount(long balanceAccount, int accountNumber) {

        (accountList.get(accountNumber)).setBalance(balanceAccount);

    }
}
