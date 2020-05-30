package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sum=0;
        //input the number of rows and columns
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows=scanner.nextInt();
        System.out.println("Entert the number of columns");
        int columns=scanner.nextInt();
	int[][] multiDimensionalArray=new int[rows][columns];
	for (int i=0;i<rows;i++){
	    for (int j=0;j<columns;j++){
            System.out.println("Enter a value");
            multiDimensionalArray[i][j]=scanner.nextInt();
        }
    }
	//sum the values of the array.
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                sum=sum+multiDimensionalArray[i][j];

            }
        }

        System.out.println("the sum of the array is: "+sum);

    }
}
