package org.example.computer.components;

public class Monitor {
    private final int idMonitor;
    private String brand;
    private Double size;
    private static int monitorC;

    public Monitor(){
        this.idMonitor = ++monitorC;
    }

    public Monitor (String brand, Double size){
        this();
        this.brand = brand;
        this.size  = size;

    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "idMonitor=" + idMonitor +
                ", brand='" + brand + '\'' +
                ", size=" + size +
                '}';
    }
}
