import java.util.Scanner;
public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Hello world!");



        while (true) {
            double t = temperature();
            if (t < -460) {
                break;
            }
            double c = formula(t);
            formula(c);
            display(c);
        }
//        double t = temperature();
//        double c = formula(t);
//        display(c);


    }
    static double temperature(){
        System.out.println("please enter the temp in fahrenheit");
        double temp = input.nextDouble();
        //System.out.println(temp);
        return temp;
    }

    static double formula(double temp){
        double celsius =((temp - 32.0)* 1.8 );
        return celsius;

    }
    static void display(double c){
        System.out.println(c);
    }




}