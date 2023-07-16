package hw.User;

public class Adult extends User{
    private String email;
    private String password;
    private String telefonNumber;
    private String IPadresse;
    public Adult(String firstname, String lastname, int age) {
        super(firstname, lastname, age);
    }

    // Constructor

    public Adult(String firstname, String lastname, int age, String email, String password, String telefonNumber, String IPadresse) {
        super(firstname, lastname, age);
        this.email = email;
        this.password = password;
        this.telefonNumber = telefonNumber;
        this.IPadresse = IPadresse;
    }

    // Getter and Setter

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelefonNumber() {
        return telefonNumber;
    }

    public void setTelefonNumber(String telefonNumber) {
        this.telefonNumber = telefonNumber;
    }

    public String getIPadresse() {
        return IPadresse;
    }

    public void setIPadresse(String IPadresse) {
        this.IPadresse = IPadresse;
    }

    // to String

    @Override
    public String toString() {
        return "Adult{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", telefonNumber='" + telefonNumber + '\'' +
                ", IPadresse='" + IPadresse + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }
}
