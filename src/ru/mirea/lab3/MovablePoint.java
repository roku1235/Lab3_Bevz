package ru.mirea.lab3;

public class MovablePoint implements Movable {

    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void moveUp() {
        System.out.println("Move up");
    }

    public void moveDown() {
        System.out.println("Move down");
    }

    public void moveLeft() {
        System.out.println("Move left");
    }

    public void moveRight() {
        System.out.println("Move right");
    }

    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}