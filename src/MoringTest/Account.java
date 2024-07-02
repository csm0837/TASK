package MoringTest;

class Account {
  private static final int MIN_BALANCE = 0;
  private static final int MAX_BALANCE = 1_000_000;
  private String accountNumber;
  private String accountHolder;
  private int balance;

  public Account() {}

  public Account(String accountNumber, String accountHolder, int initialDeposit) {
    this.accountNumber = accountNumber;
    this.accountHolder = accountHolder;
    this.balance = initialDeposit;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public String getAccountHolder() {
    return accountHolder;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    if (balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
      this.balance = balance;
    }
  }

  public void deposit(int amount) {
    if (amount > 0) {
      balance += amount;
    }
  }

  public boolean withdraw(int amount) {
    if (amount > 0 && amount <= balance) {
      balance -= amount;
      return true;
    }
    return false;
  }

  @Override
  public String toString() {
    return accountNumber + "\t" + accountHolder + "\t" + balance;
  }
}


//
//public Chicken(int speed) {
//  super. (speed);
//}
//
//
//@Override
//int run(int speed) {
//  setDistance(getSpeed() + speed);
//  System.out.println("닭의 이동거리" + getDistance());
//}
//@Override
//public void fly() {
//  setSpeed(getSpeed() * 2);
//}
