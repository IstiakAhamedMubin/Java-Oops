public class BankAccount {
        private double balance;
        public BankAccount(){
            this.balance = 0;
        }

        public void deposite (double amount){
            if (amount>0){
                this.balance += amount;
            }
        }
        public void withDraw (double amount){
            if (amount >0 && amount <=balance) {
                balance -= amount;
            }
        }
        public double getBalance () {
            return this.balance;
        }

    }

