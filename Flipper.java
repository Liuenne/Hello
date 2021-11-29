/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flipper;

import java.util.Scanner;

/**
 * The Flipper Program implements an application that flips a grid of 1,2,3,4
 * and outputs that grid
 * 
 * @author elton.chen
 * @version 1.0
 * @since 20201-09-22
 */
public class Flipper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        String input = Scan.nextLine();
        int[][] theGrid = {{1,2},{3,4}};
        for (int x = 0; x < input.length(); x++) {
            if (input.charAt(x) == ('H')){
                horizontal(theGrid);
            }else{
                vertical(theGrid);
            }  
        }
        for (int[] i: theGrid) {
            for (int j: i) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
    public static void vertical(int[][] theGrid) {
        int [] temp1 = {theGrid[0][1], theGrid[0][0]};
        int [] temp2 = {theGrid[1][1], theGrid[1][0]};
        theGrid[0] = temp1;
        theGrid[1] = temp2;
    }
    public static void horizontal(int[][] theGrid) {
        int [] temp = theGrid[0];
        theGrid[0] = theGrid[1];
        theGrid[1] = temp;
    }
    
}
