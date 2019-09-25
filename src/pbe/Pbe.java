/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbe;
import java.util.Scanner;
/**
 *
 * @author Freddy
 */
public class Pbe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String xd;
        
        xd = sc.nextLine();
        
        System.out.println(xd.split(",").length);
        for (String string : xd.split(",")) {
            System.out.println(string);
        }
    }
    
}
