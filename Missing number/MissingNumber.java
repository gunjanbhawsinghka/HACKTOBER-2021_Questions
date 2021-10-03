package com.company;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[]a ={0,3,1,2,5};

        System.out.println(Cyclic_Sort(a));
        System.out.println(Arrays.toString(a));
    }
    static int Cyclic_Sort(int[]a){

        int i = 0;
        while (i < a.length) {
            int correct = a[i] ;
            if (a[i]<a.length && a[i] != a[correct]) {
                swap(a, i, correct);
            } else {
                i++;
            }
        }
        //serach for first missing number
        for (int index = 0; index < a.length; index++) {
            if (a[index]!=index){
                return index;
            }
        }
        return a.length;

    }
    static void swap(int[] arr,int i,int correct){
        int temp;
        temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
}
