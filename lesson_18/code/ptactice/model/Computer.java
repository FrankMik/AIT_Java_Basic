package ptactice.model;

import java.util.Objects;

public class Computer {
    // поля класса
    protected String cpu;
    protected int ram;
    protected int ssd;
    protected String brand;

    // конструктор


    public Computer(String cpu, int ram, int ssd, String brand) {
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.brand = brand;
    }

    // геттеры и сеттеры

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    //

    @Override
    public String toString() {
        return "Brand: " + brand + ", CPU:" + cpu + ", RAM:" + ram + ", SSD:" + ssd;
    }
// сравнение объектов
    @Override
    public boolean equals(Object ob) {
        if (this == ob) return true;
        if (ob == null || getClass() != ob.getClass()) return false;
        Computer computer = (Computer) ob;
        return ram == computer.ram && ssd == computer.ssd && cpu.equals(computer.cpu) && brand.equals(computer.brand);
    }


}
