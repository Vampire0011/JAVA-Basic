class Account {String accountName;int accountNumber;double amount;String date;}

public class bankdt{public static void main(String[] args) {


    Account acc = new Account();


    acc.accountName = "Rahul";
    acc.accountNumber = 12345;
    acc.amount = 5000.50;
    acc.date = "11-08-2026";


    System.out.println("Account Name: " + acc.accountName);
    System.out.println("Account Number: " + acc.accountNumber);
    System.out.println("Amount: " + acc.amount);
    System.out.println("Date: " + acc.date);
}

}