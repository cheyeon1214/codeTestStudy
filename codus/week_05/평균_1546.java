package codus.week_05;

import java.util.Scanner;

public class 평균_1546 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        double [] arr= new double[N];
        double max = 0;
        double count = 0;
        for(int i=0; i<N; i++)
        {
            arr[i] = scan.nextDouble();
            if(max <= arr[i])
            {
                max = arr[i];
            }
        }

        
        for(int i =0; i<N; i++)
        {
            arr[i] = arr[i] /max * 100;
            System.out.println(arr[i]);
            count = count + arr[i];
            System.out.println(count);
        }
        System.out.print(count/N);
    }
}
