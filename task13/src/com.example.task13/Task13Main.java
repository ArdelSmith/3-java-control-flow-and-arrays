package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {9, 1100, 7, 8};
        removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null) return null;
        int n = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] <= 1000) n += 1;
        }
        int[] ar = new int[n];
        int j = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] <= 1000){
                ar[j] = arr[i];
                j += 1;
            }
        }
        return ar;
    }

}