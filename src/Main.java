public class Main {
    public static void main(String[] args) {
        int balance = 100;  // начальный баланс
        int coming = 1001;  // сумма пополнения
        int bonus = coming / 100;  // расчет бонусов
        int x = coming + bonus + balance;  // баланс с бонусами
        int x1 = coming + balance; // баланс без бонусов

        if (coming > 1000) {
            System.out.println("Бонус = " + bonus + "р.," + "баланс = " + x + "р.");
        } else {
            System.out.println("баланс = " + x1);

        }


    }
}
