package practice.computer.controller;

import practice.computer.model.Computer;

public class ConputerAppl {
    public static void main(String[] args) {

        Computer comp1 = new Computer();
        comp1.setCpu("Intel");
        comp1.setRam(-16);
        comp1.setSsd(0);

        System.out.println(comp1.toString());

        System.out.println(comp1.toString());

        Computer comp2 = new Computer("i7", 16, 512, "Acer", "Off");

    }
}
