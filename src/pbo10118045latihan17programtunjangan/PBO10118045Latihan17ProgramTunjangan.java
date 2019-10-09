/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan17programtunjangan;

import java.util.Scanner;

/**
 *
 * @author 
 * Nama     :   Muhammad Ilham Apriyadi
 * Kelas    :   IF 2
 * NIM      :   10118045
 * Deskripsi Program : membuat program tunjangan
 */
public class PBO10118045Latihan17ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double tunj,tot;
        System.out.println("========Program Tunjangan========");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        Scanner Scanner = new Scanner(System.in);
        double gaji = Scanner.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum)    : ");
        Scanner scanner = new Scanner(System.in);
        String status = scanner.next();
        if("Menikah".equals(status)||("menikah".equals(status))){
            tunj = 0.35 * gaji;
        }    
        else{ 
            tunj = 0 * gaji;
        }
        tot = gaji+tunj;
        System.out.println("====Hasil Perhitungan Gaji Anda====");
        System.out.println("Gaji Pokok\t\t: Rp. " +gaji);
        System.out.println("Tunjangan\t\t: Rp. " +tunj);
        System.out.println("Total Gaji\t\t: Rp. " +tot);
        System.out.println("Developed by : Muhammad Ilham Apriyadi");
                
                
    }
    
}
