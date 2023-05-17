package org.example;

import org.example.computer.Computer;
import org.example.computer.components.Keyboard;
import org.example.computer.components.Monitor;
import org.example.computer.components.Mouse;

public class Main {
    public static void main(String[] args) {
        Monitor monitorHp   = new Monitor("HP", 15.0);
        Keyboard keyboardHp = new Keyboard("bluetooth","HP");
        Mouse mouse         = new Mouse("bluetooth", "HP");
        Computer computerHp = new Computer("HP computer",monitorHp,mouse,keyboardHp);

        Order order = new Order();
        order.addComputer(computerHp);
        order.showComputers();
    }
}