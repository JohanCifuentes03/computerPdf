package org.example.computer.components;

public class Keyboard extends  EnterDevice{
    private final int idKeyBoard;
    private static int c;

    public Keyboard(String enterType, String brand){
        super(enterType,brand);
        this.idKeyBoard = ++Keyboard.c;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "idKeyBoard=" + idKeyBoard +
                ", " + super.toString() +
                '}';
    }
}
