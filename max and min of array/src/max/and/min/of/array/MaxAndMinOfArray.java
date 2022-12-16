/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package max.and.min.of.array;

import java.util.Scanner;

/**
 *
 * @author MOHAMED HASSAN
 */
public class MaxAndMinOfArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
       
        int[] arr=new int[5];
        
        for(int i=0; i<arr.length;i++)
        {
            System.out.println("enter the element no : "+(i+1));
            arr[i]=input.nextInt();
            
        }
        int mx=arr[0], mn = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>mx)
                mx=arr[i];
            
            if(arr[i] < mn)
                mn = arr[i];
        }
        System.out.println("the maximum element is : "+mx);
        System.out.println("the minimum element is : "+mn);

    }
    
}
