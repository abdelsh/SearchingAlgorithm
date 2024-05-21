/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.searchingalgorithm;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class SearchingAlgorithm {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        BinarySearch binarySearch = new BinarySearch();
        LinearSearch linearSearch = new LinearSearch();
        
        boolean run = true;
        int index = 0;
        String str = "";
        
        while (run){
        System.out.println("What would you like to perform:\n0. Exit the program.\n1. Search a number in an Array using Linear Search\n2. Search a number in an Array using Binary Search\n3. Search a String in an Array using Linear Search\n4. Search a String in an Array using Binary Search");
        int choice = input.nextInt();
        input.nextLine();
        
        if (choice == 0) {
            run = false;
        } else {
        
        System.out.println("please enter your array: (example: 1, 2, 3, 4)");
        String arr = input.nextLine();
        
        String arr_trim = arr.trim();
        
        
        System.out.println("Please enter the value you want to find");
        String x = input.nextLine();
        
        String[] str_array = arr_trim.split(", ");
        
        
        
        switch (choice) {
            case 1:
                index = linearSearch.numberSearch_ls(arrayInt(str_array), Integer.parseInt(x));
                str = linearSearch.isFound()?"The value you want is at index : " + index : "Value not found.";
                System.out.println( str);
                break;

            case 2:
                index = binarySearch.numberSearch_bs(arrayInt(str_array), Integer.parseInt(x));
                str = binarySearch.isFound()?"The value you want is at index : " + index : "Value not found.";
                System.out.println(str);
                break;
                
            case 3:
                index = linearSearch.stringSearch_ls(str_array, x);
                str = linearSearch.isFound()?"The value you want is at index : " + index : "Value not found.";
                System.out.println(str);
                break;
                
            case 4:
                index = binarySearch.stringSearch_bs(str_array, x);
                str = linearSearch.isFound()?"The value you want is at index : " + index : "Value not found.";
                System.out.println(str);
                break;
                
            default:
                System.out.println("Invalid choice.");
        }
        }
        
        
        }
        
        
    }
    
    public static int[] arrayInt (String[] arr){
        int[] arrInt = new int[arr.length];
        for (int i = 0 ; i < arr.length ; i++){
            arrInt[i] = Integer.parseInt(arr[i].trim());
        }
        return arrInt;
    }
    
    
    
}
