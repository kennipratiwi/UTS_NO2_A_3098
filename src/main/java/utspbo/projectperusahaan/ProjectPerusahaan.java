/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package utspbo.projectperusahaan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Asus
 */
public class ProjectPerusahaan {

      public static void main(String[] args) throws IOException {
        SalariedEmployee S = new SalariedEmployee();
        CommissionEmployee C = new CommissionEmployee();
        ProjectPlanner P = new ProjectPlanner();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        
        try{
           S.nama_3098 = "Kenni";
           S.nip_3098  = 21103098;
           S.upahMingguan_3098 = 1500000; 
        
           C.nama_3098 = "Pratiwi";
           C.nip_3098 = 211030600;
           C.gajiPokok_3098 = 4000000;
           C.komisi_3098 = 1000000;
           C.totalPenjualan_3098 = 100;
           
           P.nama_3098 = "Cantik";
           P.nip_3098 = 21103018;
           P.gajiPokok_3098 = 3000000;
           P.komisi_3098 = 500000;
           P.totalHasilProyek_3098 = 150;
           
           S.cetakSalariedEmployee();
           System.out.println("");
           C.cetakCommissionEmployee();
           System.out.println("");
           P.cetakProjectPlanner();
            System.out.println("");
        }  
    catch(Exception ex){
            System.out.println(ex);
        }
    }
}       
