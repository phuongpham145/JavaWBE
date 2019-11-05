public class Fan {
    public  byte SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public byte getSLOW() {
        return SLOW;
    }

    public void setSLOW(byte SLOW) {
        this.SLOW = SLOW;
    }

    public byte getMEDIUM() {
        return MEDIUM;
    }

    public void setMEDIUM(byte MEDIUM) {
        this.MEDIUM = MEDIUM;
    }

    public byte getFAST() {
        return FAST;
    }

    public void setFAST(byte FAST) {
        this.FAST = FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
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

    public String toString(){
        if (isOn()){
            System.out.println(getSpeed());
            System.out.println(getColor());
            System.out.println(getRadius());
            System.out.println("fan is on !");
        }
        else {
            System.out.println(getSpeed());
            System.out.println(getColor());
            System.out.println(getRadius());
            System.out.println("fan is off !");
        }
        return " ";
    }
}
