package XayDungLopRanDom;

import java.util.Random;

public class RanDom {
    private int number;

    public RanDom(int number) {
    }

    public int random(int number) {
        this.number = number;
        Random rd = new Random();
        int num = rd.nextInt(number);
        return num;
    }
}

