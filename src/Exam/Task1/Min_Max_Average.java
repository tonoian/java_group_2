package Exam.Task1;


public class Min_Max_Average {
    public static void main(String[] args) {

        double[] arr = new double[10];

        double max = 0;
        double min = 0;
        double sum = 0;

        for (int i = 0; i < 10; i++) {
            double randNum = Math.random();
            arr[i] = randNum;

            if(i == 0)
                min = randNum;

            System.out.print(arr[i] + ": ");

            if(randNum < min)
                min = randNum;

            if(randNum > max)
                max = randNum;


            sum += arr[i];
        }
        System.out.println();
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("average = " + sum / 10);
    }
}
