package hw.firma.controller;

import hw.firma.model.Firma;
//      this.idNumber = idNumber;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.gender = gender;
//        this.salary = salary;
//        this.taxClass = taxClass;

public class FirmaAppl {
    public static void main(String[] args) {

        double a = 2350, b = 4230;
        double[] salary = new double[5];
        for (int i = 0; i < 5; i++) {
            salary[i] = (Math.random()* (b-a+1)+a);
        }

            byte a1 = 1, b1 = 6;
            byte[] taxClass = new byte[6];
            for (int j = 0; j < 6; j++) {
                taxClass[j] = (byte) (Math.random()* (b1-a1+1)+a1);
            }

        // создаём объектные переменные

        Firma employee1 = new Firma(110654, "Viktor", "Petrov", "Man", salary[0], taxClass[4]);
        Firma employee2 = new Firma(110724, "Igor", "Swiridov", "Man", salary[3], taxClass[1]);
        Firma employee3 = new Firma(110639, "Maik", "Müller", "Man", salary[2], taxClass[0]);
        Firma employee4 = new Firma(113454, "Anton", "Schuhmacher", "Man", salary[1], taxClass[5]);
        Firma employee5 = new Firma(134554, "Lea", "Costa", "Woman", salary[4], taxClass[3]);
        Firma employee6 = new Firma(172014, "Simone", "Sinn", "Woman", salary[1], taxClass[2]);

        employee1.display();
        System.out.println();
        employee2.display();
        System.out.println();
        employee3.display();
        System.out.println();
        employee4.display();
        System.out.println();
        employee5.display();
        System.out.println();
        employee6.display();
    }
}
