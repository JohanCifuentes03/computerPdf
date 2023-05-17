package org.example;

import org.example.computer.Computer;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int idOrder;
    List<Computer> computers;
    private int computersCount;
    private static int orderC;

    public Order(){
        this.idOrder = ++computersCount;
        this.computers = new ArrayList<Computer>();

    }

    public void addComputer (Computer computer){
        this.computers.add(computer);
    }

    public void showComputers (){
        for (Computer computer : computers) {
            System.out.println(computer);
        }
    }
}
