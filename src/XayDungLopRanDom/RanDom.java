package XayDungLopRanDom;

import java.util.Random;

public class RanDom {
    private int number;

    public RanDom(int numb) {
        this.number = numb;
    }

    public int random(int number) {
        Random rd = new Random();
        int num = rd.nextInt(number);
        return num;
    }
}

