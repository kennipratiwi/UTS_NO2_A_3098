/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utspbo.projectperusahaan;

/**
 *
 * @author Asus
 */
public class SalariedEmployee {
    String nama_3098;
    int nip_3098;
    double upahMingguan_3098;
    private double GajiSalariedEmploye;
    
    
    
    //Method passed by reference dengan parameter tipe data class
    public double totalGaji (){
        return GajiSalariedEmploye = upahMingguan_3098;
    }
    
    public void cetakSalariedEmployee(){
        System.out.println(" \n");
        System.out.println(" Data Commission Employee \n");
        System.out.println("Nama :"+nama_3098);
        System.out.println("NIP :"+nip_3098);
        System.out.println("gaji Pokok :"+upahMingguan_3098);
    }  
}

