package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int fin = 0;
        for (int i = 0; i < 9; i++){
            fin = fin + array[i];
        }
        System.out.print(fin);
    }
}
