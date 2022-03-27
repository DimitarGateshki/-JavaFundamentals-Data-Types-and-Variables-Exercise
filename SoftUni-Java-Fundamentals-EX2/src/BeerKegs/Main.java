package BeerKegs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        String biggest="";
        double maxCap=0;

        for (int i = 0; i <n ; i++) {
            String name=sc.nextLine();
            double r=Double.parseDouble(sc.nextLine());
            double h=Double.parseDouble(sc.nextLine());
            double sum=Math.PI*(r*r)*h;
            if (sum>maxCap){
                maxCap=sum;
                biggest=name;
            }
        }

        System.out.println(biggest);
    }
}
