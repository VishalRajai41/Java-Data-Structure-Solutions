/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MaxMinArray;

/**
 *
 * @author rajai
 */
public class Main {
    static class pair{
        int min;
        int max;
    }
    static pair getMinMax(int arr[],int n)
    {
        pair MinMax=new pair();
        int i;
        if (n==1)
        {
         MinMax.max=arr[0];   
         MinMax.min=arr[0];
         return MinMax;
        }
        
        if(arr[0]>arr[1])
        {
            MinMax.max=arr[0];
            MinMax.min=arr[1];
        }
        else
        {
            MinMax.max=arr[1];
            MinMax.min=arr[0];
        }
        for(i=2;i<n;i++)
        {
            if(arr[i]>MinMax.max){
                MinMax.max=arr[i];
            }
            else if(arr[i]<MinMax.min)
            {
                MinMax.min=arr[i];
            }
        }
        return MinMax;
    }
    
    public static void main(String args[]){
        int arr[]={1000,11,45,1,300,3000};
        int arr_size=6;
        pair MinMax=getMinMax(arr,arr_size);
        System.out.printf("\nMinimum elements is %d",MinMax.min);
        System.out.printf("\nMaximum elementts is %d",MinMax.max);
    }
    
}
