class BankAccount{
    String accountHolder;
    int accountNumber;
    double balance;

    BankAccount(String accountHolder, int accountNumber, double initialBalance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } 
        else{
            System.out.println("Insufficient funds");
        }
    }

    public void displayAccountDetails(){
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("George", 123, 1000.0);
        account.displayAccountDetails();
        account.deposit(500.0);
        account.withdraw(200.0);
        account.displayAccountDetails();
    }
}