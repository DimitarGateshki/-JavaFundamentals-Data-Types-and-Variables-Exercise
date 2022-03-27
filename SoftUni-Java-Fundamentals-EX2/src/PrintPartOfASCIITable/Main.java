package PrintPartOfASCIITable;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        int p=Integer.parseInt(sc.nextLine());


        for (char i = (char)n; i <=p ; i++) {
            char ch=i;
            System.out.print(ch+ " ");

        }
    }
}
