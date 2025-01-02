package com.reva.cse;

import java.util.Scanner;

public class SparseMatrix {
    public static void main(String[] args) {
        // Declare variables
        int m, n;

        // To take input from the user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        // Initialize the number of rows
        m = sc.nextInt();

        System.out.println("Enter the number of columns: ");
        // Initialize the number of columns
        n = sc.nextInt();

        // Declare a mxn order array
        int[][] a = new int[m][n];

        System.out.println("Enter all the values of the matrix: ");
        // Initialize the matrix elements
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        // Stores the size of the matrix
        int size = m * n;

        // Variable to check for the number of zero elements
        int count = 0;

        // Calculate sum if the element is non-zero
        int sum = 0;

        // Loop to count all zero elements present in the matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == 0) {
                    // Check if element is 0 or not
                    count++; // Increment the count if 0 element is found
                } else {
                    // Calculate sum
                    sum += a[i][j];
                }
            }
        }

        // Check if the matrix is sparse or not
        if (count > (size / 2)) {
            System.out.println("It is a sparse matrix and the sum of non-zero elements is: " + sum);
        } else {
            System.out.println("It is not a sparse matrix.");
        }
    }
}
