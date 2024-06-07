package Java;

import java.util.Scanner;

import javax.swing.Spring;

class add{
    public static void main(Spring argc []){
        int x, y, sum;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter new Number");
        x = myObj.nextInt();

        y = myObj.nextInt();

        sum = x + y;
        System.out.println("sum is"+sum);
    }
}
