
public class Main {
    public static void main(String[] args) {

        int startScore = 100;
        int replenishment = 1100;
        int balance;

        if (replenishment <= 1000) {
            balance = 0;
        } else {
            balance = replenishment / 100;
        }
        System.out.printf("Бонусы = " + balance);

    }
}
