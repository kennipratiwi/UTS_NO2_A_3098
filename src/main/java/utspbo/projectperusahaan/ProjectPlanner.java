/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utspbo.projectperusahaan;

/**
 *
 * @author Asus
 */
public class ProjectPlanner {
    String nama_3098;
    int nip_3098;
    double gajiPokok_3098;
    double komisi_3098;
    double totalHasilProyek_3098;
    private double GajiProjectPlanner_3098;
    private double pajak_3098;

    //Method passed by reference dengan parameter tipe data class
    public double totalGaji (){
        pajak_3098 = (0.05 * gajiPokok_3098);
        GajiProjectPlanner_3098 = gajiPokok_3098 + (komisi_3098*totalHasilProyek_3098) - pajak_3098;
        return GajiProjectPlanner_3098;
    }
    
    public void cetakProjectPlanner(){
        System.out.println(" \n");
        System.out.println(" Data Project Planner \n");
        System.out.println("Nama :"+nama_3098);
        System.out.println("NIP :"+nip_3098);
        System.out.println("gaji Pokok :"+gajiPokok_3098);
        System.out.println("Komisi : "+komisi_3098);
        System.out.println("Total Hasil Proyek :"+totalHasilProyek_3098);

    }
}
