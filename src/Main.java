public class Main {
    public static void main(String[] args) {
        int balance = 0;

        int bonus = 0;

        int account = 100;

        int sum = 1200;


        if (sum >= 1000) {

            bonus = sum / 100;

        } else {
            bonus = 0;
        }

        balance = sum + account + bonus;


        System.out.println("Бонус " + bonus);
        System.out.println("Баланс " + balance);


    }

}