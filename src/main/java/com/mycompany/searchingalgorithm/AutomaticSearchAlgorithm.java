/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.searchingalgorithm;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class AutomaticSearchAlgorithm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        BinarySearch binarySearch = new BinarySearch();
        LinearSearch linearSearch = new LinearSearch();
        
        boolean run = true, sorted = true;
        int index = 0;
        String str = "";
        
        while (run){
            System.out.print("Enter an Array: ");
            String user_input = input.nextLine();
        
            if (user_input.equals(0)) {
                run = false;
            } else {
        
            System.out.println("Please enter the value you want to find");
            String x = input.nextLine();
        
        
            int[] newArray = arrayInt(user_input.split(", "));
        
            for (int i = 0 ; i < newArray.length ; i++){
                if(i != newArray.length - 1){
                    if (!(newArray[i] < newArray[i+1])){
                        sorted = false;
                    }
                }
                
            }
        
            if (sorted) {
                System.out.println("The array is sorted, we will use Binary Search.");
                index = binarySearch.numberSearch_bs(newArray, Integer.parseInt(x));
                str = binarySearch.isFound()?"The value you want is at index : " + index : "Value not found.";
                System.out.println(str);   
            } else {
                System.out.println("The array is unsorted, we will use Linear Search.");
                index = linearSearch.numberSearch_ls(newArray, Integer.parseInt(x));
                str = linearSearch.isFound()?"The value you want is at index : " + index : "Value not found.";
                System.out.println( str);
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
