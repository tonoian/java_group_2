package Exam;

public class Bonus {
    public static void main(String[] args) {
        for (int i = 2; i < 100 ; i++) {
            int num = 0;
            for( int j = 2; j < i; j++){
                if(i % j == 0) {
                    num++;
                    break;
                }
            }
            if( num == 0)
                System.out.println(i);
        }
    }
}
