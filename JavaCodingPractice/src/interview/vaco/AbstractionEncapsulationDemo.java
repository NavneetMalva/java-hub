package interview.vaco;

// Abstraction Example
abstract class BankAccount {
  // Encapsulation: private data members
  private String accountHolder;
  private double balance;

  public BankAccount(String accountHolder, double balance) {
    this.accountHolder = accountHolder;
    this.balance = balance;
  }

  // Abstract methods (Abstraction) — only define "what" to do
  abstract void deposit(double amount);

  // Encapsulation: controlled access via getters/setters
  public String getAccountHolder() {
    return accountHolder;
  }

  public double getBalance() {
    return balance;
  }

  protected void setBalance(double balance) {
    this.balance = balance;
  }
}

// Concrete class implementing abstract methods
class SavingsAccount extends BankAccount {

  public SavingsAccount(String accountHolder, double balance) {
    super(accountHolder, balance);
  }

  @Override
  void deposit(double amount) {
    setBalance(getBalance() + amount);
    System.out.println(amount + " deposited. New Balance: " + getBalance());
  }

}

public class AbstractionEncapsulationDemo {
  public static void main(String[] args) {
    SavingsAccount account = new SavingsAccount("Navneet", 1000);
    account.deposit(500);
    System.out.println("Account Holder: " + account.getAccountHolder());
  }
}

