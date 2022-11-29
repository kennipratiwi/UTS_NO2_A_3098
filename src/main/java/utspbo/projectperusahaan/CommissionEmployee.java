/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utspbo.projectperusahaan;

/**
 *
 * @author Asus
 */
public class CommissionEmployee {
    String nama_3098;
    int nip_3098;
    double gajiPokok_3098;
    double komisi_3098;
    double totalPenjualan_3098;
    private double GajiCommisionEmploye_3098;
    
    //Method passed by reference dengan parameter tipe data class
    public double totalGaji (){
        return GajiCommisionEmploye_3098 = gajiPokok_3098 + (komisi_3098*totalPenjualan_3098);
    }
    
     public void cetakCommissionEmployee(){
        System.out.println(" \n");
        System.out.println(" Data Commission Employee \n");
        System.out.println("Nama :"+nama_3098);
        System.out.println("NIP :"+nip_3098);
        System.out.println("gaji Pokok :"+gajiPokok_3098);
        System.out.println("Komisi : "+komisi_3098);
        System.out.println("Total Penjualan :"+totalPenjualan_3098);
    }
}

