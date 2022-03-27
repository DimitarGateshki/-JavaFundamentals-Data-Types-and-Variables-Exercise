package IntegerOperations;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fn=Integer.parseInt(sc.nextLine());
        int sn=Integer.parseInt(sc.nextLine());
        int tn=Integer.parseInt(sc.nextLine());
        int fon=Integer.parseInt(sc.nextLine());

        int sum=((fn+sn)/tn)*fon;

        System.out.println(sum);

    }
}
