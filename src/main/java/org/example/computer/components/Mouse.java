package org.example.computer.components;

public class Mouse extends EnterDevice{
    private final int idMouse;
    private static int c;

    public Mouse(String enterType, String brand){
        super(enterType,brand);
        this.idMouse = ++Mouse.c;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "idMouse=" + idMouse +
                ", " + super.toString() +
                '}';
    }
}
