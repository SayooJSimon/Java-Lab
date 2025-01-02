import java.util.Scanner;

class Balance extends Exception {
    String message;

    public Balance(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}

public class UserDefinedException {
    static double current_balance;

    public static void main(String[] args) throws Balance {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the Amount to deposit:");
        current_balance = s.nextInt();

        System.out.println("Enter the amount to withdraw:");
        int n = s.nextInt();

        try {
            if (current_balance < n) {
                throw new Balance("Insufficient funds! Your current balance is " + current_balance);
            } else {
                System.out.println("Please take the money: " + n);
                current_balance = current_balance - n;
                System.out.println("Balance available after withdrawal: " + current_balance);
            }
        } catch (Balance mab) {
            mab.printStackTrace();
        }
    }
}
