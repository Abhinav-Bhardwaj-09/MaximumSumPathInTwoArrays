package main;

import maximumSumPath.MaximumSum;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 06-03-2021
 * Time: 21:26
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_cases = sc.nextInt();
        int size_1, size_2, arr1[], arr2[], result[] = new int[test_cases];
        for(int test_case = 0; test_case < test_cases; test_case++) {
            size_1 = sc.nextInt();
            size_2 = sc.nextInt();

            arr1 = new int[size_1];
            arr2 = new int[size_2];

            for(int index = 0; index < size_1; index++) {
                arr1[index] = sc.nextInt();
            }

            for(int index = 0; index < size_2; index++) {
                arr2[index] = sc.nextInt();
            }

            MaximumSum msp = new MaximumSum();

            result[test_case] = msp.maximumPathSum(arr1, arr2);
        }

        for(int element : result){
            System.out.println(element);
        }
    }
}