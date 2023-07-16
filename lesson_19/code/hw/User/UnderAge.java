package hw.User;

public class UnderAge extends Adult{
    public boolean checkAge;

    public UnderAge(String firstname, String lastname, int age, String email, String password, String telefonNumber, String IPadresse) {
        super(firstname, lastname, age, email, password, telefonNumber, IPadresse);
    }
    // Constructor

    public UnderAge(String firstname, String lastname, int age, String email, String password, String telefonNumber, String IPadresse, boolean checkAge) {
        super(firstname, lastname, age, email, password, telefonNumber, IPadresse);
        this.checkAge = checkAge;
    }

    // Getter and Setter

    public boolean isCheckAge() {
        return checkAge;
    }

    public void setCheckAge(boolean checkAge) {
        this.checkAge = checkAge;
    }
    // to String

    @Override
    public String toString() {
        return "UnderAge{" +
                "checkAge=" + checkAge +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }
    public static int Age(){
        int n = 18;
        if(n<18){
            System.out.println("You're too young!");
        }  else {
            System.out.println("Keep going");
        }
        return n;
    }

}
