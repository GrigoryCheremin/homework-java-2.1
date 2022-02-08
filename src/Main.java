public class Main {
    public static void main(String[] args) {
        int startBal = 100; // начальный баланс, руб.
        int amount = 2100; // сумма пополнения счёта, руб.
        int lim = 1000; // сумма, после которой начисляются бонусы, руб.
        int bonus = amount / 100; // количество бонусных рублей
        int finalBalance;
        if (amount > lim) {
            finalBalance = startBal + amount + bonus;
            System.out.println("Итого на счёте:");
            System.out.println(finalBalance);
            System.out.println("Количество бонусных рублей:");
            System.out.println(bonus);
        } else {
            finalBalance = startBal + amount;
            System.out.println("Итого на счёте:");
            System.out.println(finalBalance);
            System.out.println("Количество бонусных рублей 0");
        }
    }
}
