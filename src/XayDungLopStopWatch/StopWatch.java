package XayDungLopStopWatch;

import java.util.Random;

public class StopWatch {
    Random random = new Random();

    public StopWatch() {

    }

    public void getElapsedTime() {
        long startTime = System.currentTimeMillis();
        int[] array = new int[1000];
        for (int i = 0; i < 1000; i++) {
            int number = random.nextInt(5000);
            array[i] = number;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Dãy số mới vừa sắp xếp lại là:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        long endTime = System.currentTimeMillis();
        System.out.println("Tổng thời gian thực thi của chương trình này là: " + (endTime - startTime) + " milisecond giây");
    }
}
