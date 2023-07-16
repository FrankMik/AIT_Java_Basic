public class Main1 {
    public static void main(String[] args) {
        /*Пусть цена товара A обычно составляет 1000 евро, и товара B составляет 500 евро.
        Если клиент покупает товары вместе, то на них действует скидка 10% на всю покупку.
        Выведите на экран стоимость суммы A + B со скидкой.
        Отдельно выведите на экран абсолютную величину скидки для этой покупки.
         */
        System.out.println("Вычнсляем сумму товара со скидкой ");
        int price1 = 1000;
        int price2 = 500;
        int amount = price1 + price2;
        double discount = 0.1;
        double absolutDiscountAmount = amount * discount;
        double salePrice = amount - absolutDiscountAmount;
        System.out.println("Стоимость товаров со скидкой: " + salePrice);
        System.out.println("Абсолютная величина скидки: " + absolutDiscountAmount);

    }
}