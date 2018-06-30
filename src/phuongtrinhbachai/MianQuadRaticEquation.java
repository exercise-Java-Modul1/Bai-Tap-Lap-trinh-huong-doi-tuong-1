package phuongtrinhbachai;

public class MianQuadRaticEquation {
    public static void main(String[] args) {
        QuadRaticEquation quadRaticEquation1 = new QuadRaticEquation(1.0, 3, 1);
        QuadRaticEquation quadRaticEquation2 = new QuadRaticEquation(1, 2.0, 1);
        QuadRaticEquation quadRaticEquation3 = new QuadRaticEquation(1, 2, 3);
        System.out.println("đen ta = " + quadRaticEquation1.getDiscriminant());
        System.out.println("đen ta = " + quadRaticEquation2.getDiscriminant());
        System.out.println("đen ta = " + quadRaticEquation3.getDiscriminant());
        quadRaticEquation1.getRoot();
        quadRaticEquation2.getRoot();
        quadRaticEquation3.getRoot();
    }
}
