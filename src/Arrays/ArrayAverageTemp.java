package Arrays;

import java.util.Scanner;

public class ArrayAverageTemp {

    public double arrayGetAverageTemp(){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many days' temperature? ");
        double numDays = scan.nextDouble();
        double [] temps = new double[(int) numDays];
        double sum = 0;
        for (int i=0;i<numDays;i++){
            System.out.print("Day " + i+1 + "'s temperature is: ");
            temps[i] = scan.nextDouble();
            sum += temps[i];
        }

        double average = sum/numDays;
        System.out.println("Average temp = "  + average);
        return average;
    }

}
