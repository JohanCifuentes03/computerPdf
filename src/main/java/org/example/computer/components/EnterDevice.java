package org.example.computer.components;

public class EnterDevice {
    private String enterType;
    private String brand;

    public EnterDevice(){}

    public EnterDevice(String enterType, String brand) {
        this.enterType = enterType;
        this.brand = brand;
    }

    public String getEnterType() {
        return enterType;
    }

    public void setEnterType(String enterType) {
        this.enterType = enterType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "EnterDevice{" +
                "enterType='" + enterType + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
