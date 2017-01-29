/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author Shelin
 */

import java.*;
import javax.swing.*;
public class Praktikum1 {
    public static void main (String[] args) {
        try {
            int[] DataArray={0,1,2,3,4,5,6,7,8,9,10};
            int i, NilaiX;
            boolean ketemu;
            
            System.out.println("");
            System.out.println("Program Pencarian Data Sederhana");
            System.out.println("===========================================");
            System.out.println("");
            
            //menampilkan array
                for(i=0;i<11;i++)
                System.out.print(DataArray[i]+"");
                System.out.print("");
                System.out.println("");
                
             //masukan data yang di cari
             String bilangan = JOptionPane.showInputDialog("Masukan nilai yang kamu cari");
             NilaiX=Integer.parseInt(bilangan);
             System.out.println("");
             System.out.println("data yang dicari adalah= "+NilaiX);
             ketemu=false;
                for(i=0;i<11;i++)
                {
                    if(DataArray[i]==NilaiX)
                    {
                        ketemu=true;
                        break;
                    }
                }
                System.out.println("===========================================");
                System.out.println("");
                if(ketemu==true)
                System.out.println("Data ditemukan pada elemen ke "+(i+1));
                else
                    System.out.println("Data tidak ditemukan");
                    System.out.println("~~~~~~~~~~~");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.exit(0);
        } catch(NullPointerException e){
            System.out.println("NPE");
        }
    }
}
