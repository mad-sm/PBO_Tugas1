/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.bentuk;

/**
 *
 * @author ASM
 */
public class Lingkaran extends BentukDuaDimensi {
    private double radius;
    
    public Lingkaran(double radius){
        this.radius = radius;
    }
    
   @Override
   public double hitungLuas(){
       return Math.PI * radius * radius ;
   }
   
    @Override
    public double hitungKeliling() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void tampilkan() {
        System.out.println("Ini adalah lingkaran dengan jari-jari: " + radius);
    }
}
