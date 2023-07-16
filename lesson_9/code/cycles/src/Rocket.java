public class Rocket{
    public static void main(String[] args) {
        //Запустить обратный отсчет старта ракеты от 10 до 0. 
        // Последнее сообщение: "Поехали!...".
        
        int countDawn = 10;
        while (countDawn !=0) {

            System.out.println("To start the rocket left: " + countDawn);
            countDawn --;

        } //end of while
        System.out.println("Let`s go ...");
    }
}
