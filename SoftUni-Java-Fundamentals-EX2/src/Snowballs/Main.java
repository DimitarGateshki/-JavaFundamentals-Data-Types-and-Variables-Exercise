package Snowballs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int snowBalls=Integer.parseInt(scan.nextLine());
        double snowballMax=0;
        int snowballSnowOut=0;
        int snowballTimeOut=0;
        int snowballQualityOut=0;
        for (int i = 0; i <snowBalls ; i++) {
            int snowballSnow=Integer.parseInt(scan.nextLine());
            int snowballTime=Integer.parseInt(scan.nextLine());
            int snowballQuality=Integer.parseInt(scan.nextLine());
            double snowballValue=Math.pow((snowballSnow/snowballTime),snowballQuality) ;
            if (snowballMax<snowballValue){
                snowballMax=snowballValue;
                snowballSnowOut=snowballSnow;
                snowballTimeOut=snowballTime;
                snowballQualityOut=snowballQuality;
            }
        }

        System.out.println(String.format("%d : %d = %.0f (%d)",snowballSnowOut,snowballTimeOut,snowballMax,snowballQualityOut));

    }
}
