package XayDungLopFan;

public class MainFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3, 10, "yello");
        Fan fan2 = new Fan(2, 5, "blue");

        fan1.setOn(true);
        fan2.setOn(false);
        fan1.totoString();
        fan2.totoString();
    }
}
