/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moviles
 */
public class Eval1_19_Gcd {
    public static void main(String[]args){
        
        System.out.println(god(181,7));
    }
    
    public static int god(int dividendo, int divisor){
        int residuo;
        residuo=dividendo % divisor;
        //debe determinar si el algoritmo continua o se detiene
        if(residuo==0){
            return divisor;
        }else{
           return god(divisor, residuo);
        }
        
    }
}

    

