package com.company;

import org.apache.commons.math3.stat.descriptive.moment.Mean;
import org.apache.commons.math3.stat.descriptive.moment.Variance;

import java.util.Scanner;

public class MathUsage {
    public   String mean_higher;
    public   String variance_lower;
    public void setMean_higher(String mean_higher) {
        this.mean_higher = mean_higher;
    }

    public void setVariance_lower(String variance_higher) {
        this.variance_lower = variance_higher;
    }
    public  void judgment(double[]a,double[]b,BubbleSort aBubble,Heapsort bHeap){
        a = aBubble.bubbleSort(a).clone();
        b = bHeap.heapSort(b).clone();
        Mean x_mean = new Mean();
        Variance x_variance = new Variance();
        Mean y_mean = new Mean();
        Variance y_variance = new Variance();
        if( x_mean.evaluate(a) < y_mean.evaluate(b) ){
            this.setMean_higher("B");
        }
        else{
            this.setMean_higher("A");
        }
        if( x_variance.evaluate(a) < y_variance.evaluate(b) ){   //小于号被改成了大于号
            this.setVariance_lower("A");
        }
        else{
            this.setVariance_lower("B");
        }
    }
    public static void main(String[] args){
        double[] a = new double[5];
        double[] b = new double[5];
        System.out.println("请输入A,B两组学生的身高：");
        Scanner input = new Scanner(System.in);
        for(int i = 0 ; i < 2 ; i ++){
            a[i] = input.nextDouble();
        }
        for(int i = 0 ; i <2 ; i++){
            b[i] = input.nextDouble();
        }
        MathUsage test = new MathUsage();
        BubbleSort aBubble=new BubbleSort();
        Heapsort bHeap =new Heapsort();
        test.judgment(a,b,aBubble,bHeap);
        System.out.println(test.mean_higher+"组学生的平均身高更高。");
        System.out.println(test.variance_lower+"组学生的平均身高更相似。");

    }
}