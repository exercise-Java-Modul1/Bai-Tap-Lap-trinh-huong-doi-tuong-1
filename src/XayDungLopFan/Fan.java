package XayDungLopFan;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {
    }

    public Fan(int speed, int radius,String color) {
        this.speed = speed;
        this.radius = radius;
        this.color = color;
    }
    public void totoString() {
        if (isOn() == true) {
            System.out.println("color is " + color + " radius is " + radius + " fan is on with speed is " + speed);
        } else {
            System.out.println("color is " + color + " radius is " + radius + " fan is off");
        }
    }
    
}
