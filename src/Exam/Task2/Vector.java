package Exam.Task2;

public class Vector {
    double x, y, z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double method(){
        return Math.sqrt(x * x + y * y + z * z);
    }

    public static void main(String[] args) {
        Vector v = new Vector(3, 4, 5);
        System.out.println("Vector = " + v.method());
    }
}
