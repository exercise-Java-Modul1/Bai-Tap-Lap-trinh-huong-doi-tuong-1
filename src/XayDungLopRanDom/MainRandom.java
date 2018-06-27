package XayDungLopRanDom;
import java.util.Scanner;

public class MainRandom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bạn muốn hiển thị random từ 0 đến bao nhiêu?: ");
        int number = sc.nextInt();

        RanDom rd = new RanDom(number);
        int i = 0;
        while (i < 50) {
            System.out.print(rd.random(number) + "\t");
            i++;
        }
    }
}
