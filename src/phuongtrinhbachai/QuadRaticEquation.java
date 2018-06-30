package phuongtrinhbachai;

public class QuadRaticEquation {
    private double a = 1;
    private double b = 1;
    private double c = 1;

    public QuadRaticEquation() {

    }

    public QuadRaticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public void getRoot() {
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình có vô số nghiệm.");
                } else {
                    System.out.println("Phương trình vô nghiệm.");
                }
            } else {
                if (c == 0) {
                    System.out.println("Phương trình vô nghiệm");
                } else {
                    System.out.println("Phương trình có nghiệm duy nhất là: " + (-c / b));
                }
            }
        } else {
            if (getDiscriminant() < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (getDiscriminant() == 0) {
                System.out.println("Phương trình có nghiệm duy nhất là: " + (-b / (2 * a)));
            } else {
                System.out.println("Phường trình có hai nghiệm phân biệt là: ");
                System.out.println("x1 = " + ((-b - Math.pow(getDiscriminant(), 0.5))/(a*2)));
                System.out.println("x2 = " + ((-b + Math.pow(getDiscriminant(), 0.5))/(a*2)));
            }
        }
    }
}
