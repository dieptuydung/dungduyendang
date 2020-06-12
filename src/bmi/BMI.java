/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;

/**
 *
 * @author boss dung
 */
public class BMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
    
    
    BMICategory sieumap =new BMICategory(40,"sieu map");
    BMICategory mapu=new BMICategory(35, "map u");
    
    BMICategory map =new BMICategory(30, "map");
    BMICategory mup =new BMICategory(25, "mup");
    BMICategory chuan=new BMICategory(18.5f, "chuan");
    BMICategory hoirom= new BMICategory(16, "hoi rom");
      BMICategory rom= new BMICategory(15, " rom");
       BMICategory quarom= new BMICategory(0, "qua rom");
       sieumap.setNext(mapu)
               .setNext(map)
               .setNext(mup)
               .setNext(chuan)
               .setNext(hoirom)
               .setNext(rom)
               .setNext(quarom);
        System.out.println(sieumap.getCategory(17));
      
       
       
            
    
    }
}