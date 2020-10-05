package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("National Canada Bank");
        bank.addBranch("Calgary");
        bank.addCustomer("Calgary", "Blair", 4.20);
        bank.addCustomer("Calgary", "Mike", 175.34);
        bank.addCustomer("Calgary", "Percy", 220.12);
        bank.addBranch("Edmonton");
        bank.addCustomer("Edmonton", "Bob", 150.54);

        bank.addCustomerTransaction("Calgary", "Blair", 44.22);
        bank.addCustomerTransaction("Calgary", "Blair", 12.44);
        bank.addCustomerTransaction("Calgary", "Mike", 1.65);

        bank.listCustomers("Calgary", true);
        bank.listCustomers("Edmonton", true);

        bank.addBranch("RedDeer");

        if(!bank.addCustomer("RedDeer", "brian", 5.53)) {
            System.out.println("RedDeer Error doesn't exist.");
        }
        if(!bank.addBranch("Calgary")) {
            System.out.println("Calgary Error already exist.");
        }
    }
}
