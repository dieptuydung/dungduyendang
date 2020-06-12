package bmi;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author boss dung
 */
public class BMICategory {
    float fromBMI;
    BMICategory next;
    String category;

   
    public BMICategory(float fromBMI, String category) {
        this.fromBMI = fromBMI;
        this.category = category;
    }

    public BMICategory setNext(BMICategory next) {
        this.next = next;
        return next;
    }
    
   public String getCategory(float bmi){
       if(bmi>fromBMI)
       return this.category;
       else {
           return next.getCategory(bmi);
       }
       
       
       
       
   }
    
}
