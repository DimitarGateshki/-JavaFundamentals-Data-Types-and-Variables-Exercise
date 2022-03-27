package SpiceMustFlow;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int startingYleld=Integer.parseInt(scan.nextLine());
        int days=0;
        int total=0;
        while (startingYleld>=100){
            total+=startingYleld;
            startingYleld-=10;
            if (total>26){
                total-=26;
            }

            days++;
        }

        if (total>26){
            total-=26;
        }
        System.out.println(days);
        System.out.println(total);

    }
}
