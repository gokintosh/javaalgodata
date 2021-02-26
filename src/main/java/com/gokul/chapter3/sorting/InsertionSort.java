package com.gokul.chapter3.sorting;

public class InsertionSort {

    public static void insertionSort(char[]data){
        int n=data.length;
        for(int i=1;i<n;i++){
            char curr=data[i];
            int j=i;
            while(j>0&&data[j-1]>curr){
                data[j]=data[j-1];
                j--;
            }
            data[j]=curr;
        }
        System.out.println(data);
    }
}
