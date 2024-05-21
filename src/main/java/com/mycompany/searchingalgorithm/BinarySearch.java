/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.searchingalgorithm;

/**
 *
 * @author hp
 */
public class BinarySearch {

    public BinarySearch() {
    }
    
    private boolean found = false;
    
    public int numberSearch_bs (int[] arr, int x){

//        //Sorting
//        for(int i = 0 ; i<arr.length-1 ; i++){
//            
//            int min_index = i;
//            for(int j = 0 ; j <arr.length ; j++){
//                if (arr[j]<arr[min_index]){
//                    min_index = j;
//                }
//            }
//            int temp = arr[min_index];
//            arr[min_index] = arr[i];
//            arr[i] = temp;
//        }
        int f = -1, start = 0, end = arr.length;
        
        while (start < end){
            int mid = (start+end)/2;
            
            if (x == arr[mid]){
                found = true;
                f = mid;
                break;
                
            } else if (x > arr[mid]) {
                start = mid+1;
            } else if (x < arr[mid]) {
                end = mid-1;
            }
        }
        
        return f;
    }
    
    
    public int stringSearch_bs (String[] arr, String x){
        
        int f = -1, start = 0, end = arr.length;
        
        while (start < end){
            int mid = (start+end)/2;
            
            if (x.equals(arr[mid])){
                found = true;
                f = mid;
                break;
            } else if (arr[mid].compareTo(x) < 0) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        
        return f;
    }

    public boolean isFound() {
        return found;
    }
    
    
}
