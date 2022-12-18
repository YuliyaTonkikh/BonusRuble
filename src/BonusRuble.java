public class BonusRuble {
    public static void main(String[] args) {
        int balance = 100; // Баланс счета
        int bonusRuble = 0; // За каждые 100 рублей 1 бонусный рубль
        int add = 2000; // Сумма пополнения счета
        if (add > 1000) {
            bonusRuble = add / 100;
        }
        int finalBalance = balance + bonusRuble + add;
        System.out.println(balance + " Баланс счета");
        System.out.println(bonusRuble + " Количество бонусных рублей");
        System.out.println((balance + add + bonusRuble) + " Итоговый счет");
    }
}
