package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    double arr[]=new double[10];
	    for(int i=1;i<11;i++){
            System.out.print("请第"+i+"位老师打分：");
	        Scanner in=new Scanner(System.in);
	        arr[i-1]=in.nextDouble();
	        if(arr[i-1]>100||arr[i-1]<0){
	            System.out.print("成绩应在0-100之间，请重新打分！");
	            i--;
            }
        }
        //冒泡排序
        bubbleSort(arr);
        double all=0;
        for(int i=1;i<9;i++){
            all=arr[i]+all;
        }
        double avr=all/8;
        System.out.print("\n平均成绩："+avr);

    }

    public static void bubbleSort(double[] a){
        double temp;
        for(int i=0;i<9;i++){
            for(int j=0;j<9-i;j++){
                if(a[j]<a[j+1]){
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
      /*
        for (int i = a.length - 1; i > 0; --i)
        {
            for (int j = 0; j < i; ++j)
            {
                if (a[j + 1] < a[j])
                {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }*/
    }

}
