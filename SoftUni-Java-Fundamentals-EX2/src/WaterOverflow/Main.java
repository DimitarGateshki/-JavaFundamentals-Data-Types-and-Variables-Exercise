package WaterOverflow;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int capacity=255;
        int n=Integer.parseInt(sc.nextLine());
        int poured=0;

        for (int i = 0; i <n ; i++) {
            int liters=Integer.parseInt(sc.nextLine());
            if (capacity>=liters){
                capacity-=liters;
                poured+=liters;
            }else {
                System.out.println("Insufficient capacity!");
            }
        }

        System.out.println(poured);

    }
}
