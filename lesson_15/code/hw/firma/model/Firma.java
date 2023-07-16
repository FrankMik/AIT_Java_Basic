package hw.firma.model;

public class Firma {
//   Создать класс Работник (Employee) c полями:
//    -уникальный номер
//    -имя
//    -фамилия
//    -пол
//    -зарплата
//    -уровень налогообложения.
//  Создать приложение FirmaAppl в котором принять на работу несколько сотрудников.

    // поля класса
    public long idNumber;

    public String firstName;

    public String lastName;

    public String gender;

    public double salary;

    public byte taxClass;

    // методы класса
    // конструктор


    public Firma(long idNumber, String firstName, String lastName, String gender, double salary, byte taxClass) {
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.salary = salary;
        this.taxClass = taxClass;
    }

    public void display(){
        System.out.println("Id number: " + idNumber);
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Gender: " + gender);
        System.out.println("Salary: " + salary);
        System.out.println("Tax class: " + taxClass);
    }

    public long getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(long idNumber) {
        this.idNumber = idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public byte getTaxClass() {
        return taxClass;
    }

    public void setTaxClass(byte taxClass) {
        this.taxClass = taxClass;
    }
}
