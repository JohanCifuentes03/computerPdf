package org.example.computer;

import org.example.computer.components.Keyboard;
import org.example.computer.components.Monitor;
import org.example.computer.components.Mouse;

public class Computer {
    private int idComputer;
    private String  name;
    private Monitor monitor;
    private Mouse   mouse;
    private Keyboard keyboard;
    private static int computerC;

    public Computer(){
        this.idComputer = ++computerC;
    }

    public Computer(String name, Monitor monitor, Mouse mouse, Keyboard keyboard) {
        this();
        this.name = name;
        this.monitor = monitor;
        this.mouse = mouse;
        this.keyboard = keyboard;
    }

    public int getIdComputer() {
        return idComputer;
    }

    public void setIdComputer(int idComputer) {
        this.idComputer = idComputer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public static int getComputerC() {
        return computerC;
    }

    public static void setComputerC(int computerC) {
        Computer.computerC = computerC;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "idComputer=" + idComputer +
                ", name='" + name + '\'' +
                ", monitor=" + monitor +
                ", mouse=" + mouse +
                ", keyboard=" + keyboard +
                '}';
    }
}
