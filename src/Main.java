public class Main {
    public static void main(String[] args) {
        int account = 100;

        int sum = 2000;


        int bonus = sum / 100;

        int balance = 0;
        balance = account + sum;

        if (sum > 1000) {

            bonus = sum / 100;

        } else {
            boolean b = sum < 1000;

            bonus = 0;

        }
        System.out.println("Баланс " + balance);
        System.out.println("Бонус " + bonus);


    }

}