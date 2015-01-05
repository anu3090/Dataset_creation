/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import static java.lang.System.out;
import java.util.Random;

/**
 *
 * @author anuradha
 */
public class Dataset_creation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            
            PrintStream myconsole = new PrintStream("/home/anuradha/Documents/pp2/Datasets/data_3000.txt");
            System.setOut(myconsole);
             int number =3000 ;
             
             
             int clusters = 4;
             int nc = number / clusters;
             
         for (int i = 0; i < clusters; i++) {
             int x = (i *nc +1) ;
                   
             for (int j = x ; j < (x+nc) ; j++) {
                 if(x != j)
                 {
                    myconsole.println(x + "\t" + j);
                
                 }
                }
            }

             
             
            
        }
        catch(FileNotFoundException fx)
        {
            System.out.println(fx);
        }
 
           
		
        /*
        // TODO code application logic here*/
    }
    
}
