package PokeMon;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int N=Integer.parseInt(scan.nextLine());
        int M=Integer.parseInt(scan.nextLine());
        int Y=Integer.parseInt(scan.nextLine());
        int count=0;
        double half=N/2;
        while (N >= M) {
            count++;
            N-=M;
            if(N == half){
                if (Y>0){
                    N/=Y;
                }
            }
        }

        System.out.println(N);
        System.out.println(count);

    }
}

