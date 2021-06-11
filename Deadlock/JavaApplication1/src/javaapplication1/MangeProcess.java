/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author zyad
 */
public class MangeProcess {
    
   public static void  mange(int num,int process,int values[],int ava[],int[][] need,int[][] allocation){
    
    
    if(num==1){
        request(process, values, ava, need, allocation);
    
    
    }
    if(num==2) {
    
        relese(process, values, ava, need, allocation);
       }
    
    }
    
    public static void request(int process,int values[],int ava[],int[][] need,int[][] allocation){
    
    
    
    
    }
    
   
    public static void relese(int process,int values[],int ava[],int[][] need,int[][] allocation){
         int count=0;
         for(int i=0;i<values.length;i++){
                if(values[i]<=allocation[process][i]){
                                count++;
                        }
         }

        if(count==values.length){
    
       for(int i=0;i<values.length;i++){
              ava[i]=ava[i]+values[i];
              allocation[process][i]=allocation[process][i]-values[i];
                     
                          }
          }
    
   
    
    
    
    }
    
    
}
