/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.bentuk;

/**
 *
 * @author ASM
 */
public class Segitiga extends BentukDuaDimensi {
    private double sisi1;
    private double sisi2;
    private double sisi3;
    
    public Segitiga(double sisi1, double sisi2, double sisi3) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    @Override
    public double hitungLuas() {
        // Menggunakan rumus Heron untuk menghitung luas
        double s = (sisi1 + sisi2 + sisi3) / 2;
        return Math.sqrt(s * (s - sisi1) * (s - sisi2) * (s - sisi3));
    }

    @Override
    public double hitungKeliling() {
        return sisi1 + sisi2 + sisi3;
    }

    @Override
    public void tampilkan() {
        System.out.println("Ini adalah segitiga dengan sisi: " + sisi1 + ", " + sisi2 + ", " + sisi3);
    }
    
}

