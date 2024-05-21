/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.searchingalgorithm;

/**
 *
 * @author hp
 */
public class LinearSearch {

    public LinearSearch() {
    }
    
    private boolean found = false;
    
    
    public  int numberSearch_ls (int[] arr, int x){ 
        int f = -1;
        found = false;
        
        
        
        for (int i = 0 ; i < arr.length ; i++){
            if (x == arr[i]){
                f = i;
                found = true;
                break;
            } 
            
        }
//        if(!found){
//                System.out.println("Value not found");
//            }
        return f;
    }
    
    public int stringSearch_ls (String[] arr, String x){
        int f = -1;
        found = false;
        for (int i = 0 ; i < arr.length ; i++){
            if (x.equals(arr[i])){
                f = i;
                found = true;
                break;
            }
        }
        if(!found){
                System.out.println("Value not found");
            }
        return f;
    }

    public boolean isFound() {
        return found;
    }
    
    
    
}
