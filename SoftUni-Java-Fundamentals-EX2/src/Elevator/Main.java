package Elevator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        int p=Integer.parseInt(sc.nextLine());
        int count=0;
        while (n>0){
            if (n>p){
                n-=p;
            }else{
                n=0;
            }
            count++;
        }
        System.out.println(count);
    }
}
