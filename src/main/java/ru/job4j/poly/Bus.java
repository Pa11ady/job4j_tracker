package ru.job4j.poly;

public class Bus implements Transport {
    private double unitPrice = 60.0;
    private int number;

    @Override
    public void go() {
        System.out.println("Ехать!");
    }

    @Override
    public void passengers(int number) {
        this.number = number;
    }

    @Override
    public double refuel(double amount) {
        return amount * unitPrice;
    }
}
