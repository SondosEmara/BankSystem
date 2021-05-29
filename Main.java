package account;

import java.util.Scanner;

/**
 * main function that the code will begin in it when run.
 *
 * @author All members of team
 *
 *
 */
public class Main {

    public static void main(String[] args) throws Exception {

        int choiceNum = 0, newAccount = 0, accountNumber;
        String name, nationalID, address, phone;
        Scanner Input = new Scanner(System.in);
        Bank eqyptBank = new Bank("EqyptBank", "Cairo", "012456823");
        Account accountObj;

        while (choiceNum != 6) {

            System.out.println("1-Create new Client");
            System.out.println("2-Create new CommercialClient");
            System.out.println("3-Display all Clients");
            System.out.println("4-WithDraw");
            System.out.println("5-Deposit");
            System.out.println("6-Exit");
            choiceNum = Input.nextInt();//Take input from user

            switch (choiceNum) {

                //case 1 when the user want to add new client 
                case 1: {

                    System.out.println("Enter Your Name");
                    name = Input.next();

                    System.out.println("Enter Your nationalID");
                    nationalID = Input.next();

                    System.out.println("Enter Your address ");
                    address = Input.next();

                    System.out.println("Enter Your phone ");
                    phone = Input.next();

                    accountObj = new Account(0, ++newAccount);
                    Client clientObj = new Client(name, nationalID, address, phone, accountObj);
                    eqyptBank.addAccount(accountObj);
                    eqyptBank.addClient(clientObj);
                    System.out.println("Success,you have now account in bank");
                    break;

                }

                //case 2 when the user want to add new commercial client 
                case 2: {

                    String commercialID;
                    System.out.println("Enter Your Name");
                    name = Input.next();

                    System.out.println("Enter Your commercialID");
                    commercialID = Input.next();

                    System.out.println("Enter Your address ");
                    address = Input.next();

                    System.out.println("Enter Your phone ");
                    phone = Input.next();

                    accountObj = new Account(0, ++newAccount);
                    Client commercialClientObj = new CommercialClient(name, commercialID, address, phone, accountObj);
                    eqyptBank.addAccount(accountObj);
                    eqyptBank.addClient(commercialClientObj);
                    System.out.println("Success,your company has now an account in the bank");
                    break;

                }

                //case 3 display all the clients and accounts in bank
                case 3: {
                    System.out.println("Lists of all clients in bank");
                    eqyptBank.display();
                    break;
                }

                //case 4 if the user want to withDraw money
                case 4: {

                    System.out.println("Enter  your account number");
                    accountNumber = Input.nextInt();

                    if (accountNumber > newAccount || accountNumber == 0) {
                        System.out.println("Try again,Uncorrect Account Number");
                    } else {

                        accountObj = new Account(eqyptBank.search(accountNumber - 1));
                        System.out.println("Enter the withDrawValue");
                        long withDraw = Input.nextLong();

                        if (accountObj.getCurrentBalance() < withDraw) {
                            accountObj = new SpecialAccount(accountObj.getCurrentBalance(), accountNumber);
                        }

                        try {
                            accountObj.withDraw(withDraw);
                            eqyptBank.editAccount(accountObj.getCurrentBalance(), accountNumber - 1);
                            System.out.println("Success of withDraw Process ");

                        } catch (Exception Error) {
                            System.out.println(Error.getMessage());
                        }

                    }
                    break;
                }

                //case 5 if the user want to deposit  money in bank.
                case 5: {
                    System.out.println("Enter  your account number");
                    accountNumber = Input.nextInt();

                    if (accountNumber > newAccount || accountNumber == 0) {
                        System.out.println("Try again,Uncorrect Account Number");
                    } else {

                        accountObj = new Account(eqyptBank.search(accountNumber - 1));
                        System.out.println("Enter the depositValue");
                        long deposit = Input.nextLong();

                        if (accountObj.getCurrentBalance() < deposit) {
                            accountObj = new SpecialAccount(accountObj.getCurrentBalance(), accountNumber);
                        }

                        try {
                            accountObj.deposit(deposit);
                            eqyptBank.editAccount(accountObj.getCurrentBalance(), accountNumber - 1);
                            System.out.println("Success of deposit Process ");

                        } catch (Exception Error) {
                            System.out.println(Error.getMessage());
                        }

                    }
                    break;

                }
                case 6: {
                    System.out.println("Thank you to deal with  Egyptbank");
                    break;
                }
                default: {
                    System.out.println("TryAgain,Please enter correct choice");
                    break;
                }

            }

        }

    }

}
