package SumDigits;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb=Integer.parseInt(sc.nextLine());
        int sum=0;
        int digit=0;

        while (numb>0){
            digit=numb%10;
            sum+=digit;
            numb/=10;

        }
        System.out.println(sum);
    }
}
