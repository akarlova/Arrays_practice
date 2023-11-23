package app;

public class Main1 {

    //Виведіть значення температури, які
    // замірялися впродовж десяти днів.
    // Пункти переліку мають бути пронумеровані.

    public static void main(String[] args) {
        int count=0;
double[] degrees = new double[] {30.0, 25.0, 24.0, 20.0, 20.0,
        23.0, 21.0, 18.0, 14.0,12.0 };
for(double degree:degrees){
    count++;
   System.out.println("day " + count + " is  " + degree + " degrees");
}
    }
}
