package lop_va_doi_tuong_trong_java.bai_tap;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public int getSLOW() {
        return 1;
    }

    public int getMEDIUM() {
        return 2;
    }

    public int getFAST() {
        return 3;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "Blue";
    }

    public String toString() {
        if (this.on == true) {
            return " Speed: " + this.speed + "\n" + " Status: " + this.on + "\n" + " Radius: " + this.radius + "\n" + " Color: " + this.color + "\n" + " fan is on";
        } else {
            return " Speed: " + this.speed + "\n" + " Status: " + this.on + "\n" + " Radius: " + this.radius + "\n" + " Color: " + this.color + "\n" + " fan is off";
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.getFAST());
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println("FAN 1:");
        System.out.println(fan1.toString());
        System.out.println("---------------------------");
        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.getMEDIUM());
        fan2.setRadius(5);
        fan2.setColor("Blue");
        fan2.setOn(false);
        System.out.println("FAN 2:");
        System.out.println(fan2.toString());

    }
}
