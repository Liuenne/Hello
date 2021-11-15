/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horverflip;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author elton.chen
 */
public class HorVerFlip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String actin = input.toString();
        int n = 0;
        while (input.hasNextInt()){
            n++;
            input.next();
        }
        ArrayList <Character> FlipList = new ArrayList <>();
        for (int x = 0; x < n; x++) {
            FlipList.add(actin.charAt(x));
        }
        //2D array with 3 rows and 4 columns
        int[][] arr2D = new int[2][2];
        for (int i = 0; i < arr2D.length; i++) {
            int[] row = arr2D[i];
            for (int j = 0; j < row.length; j++) {
                arr2D[i][j] = 2*i + j + 1;
                
            }
        }
        
        
        
        
        for (int[] row: arr2D) {
            System.out.println(Arrays.toString(row));
            System.out.println(FlipList);
        }
        
    }
    
}