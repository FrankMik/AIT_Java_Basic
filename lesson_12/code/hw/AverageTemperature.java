public class AverageTemperature {
    public static void main(String[] args) {
//        Собрать в массив данные о дневной температуре в вашем городе за прошедшую неделю.
//        Выведите на печать температуру, которая была во вторник и затем в четверг.
//        Найти среднюю температуру за прошлую неделю.
        int[] temperature = {24, 24, 26, 28, 27, 26, 27};

        int monday = temperature[0];
        int tuesday = temperature[1];
        int wednesday = temperature[2];
        int thursday = temperature[3];
        int friday = temperature[4];
        int saturday = temperature[5];
        int sunday = temperature[6];

        System.out.println("The temperature on tuesday was " + tuesday);

        System.out.println("The temperature on thursday was " + thursday);

        int average = (24+24+26+28+27+26+27)/7;

        System.out.println("The average temperature is: " + average + " °C ");
    }
}
