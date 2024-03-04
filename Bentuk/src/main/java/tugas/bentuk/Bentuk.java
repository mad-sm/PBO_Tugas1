/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tugas.bentuk;

/**
 *
 * @author ASM
 */

public interface Bentuk {
    double hitungLuas();
    double hitungKeliling();
    void tampilkan();
    
    public static void main(String[] args) {
        // Membuat objek-objek bentuk dan menguji fungsionalitas
        Bentuk lingkaran = new Lingkaran(5);
        Bentuk persegiPanjang = new PersegiPanjang(4, 6);
        Bentuk segitiga = new Segitiga(3, 4, 5);

        lingkaran.tampilkan();
        System.out.println("Luas lingkaran: " + lingkaran.hitungLuas());
        System.out.println("Keliling lingkaran: " + lingkaran.hitungKeliling());

        persegiPanjang.tampilkan();
        System.out.println("Luas persegi panjang: " + persegiPanjang.hitungLuas());
        System.out.println("Keliling persegi panjang: " + persegiPanjang.hitungKeliling());

        segitiga.tampilkan();
        System.out.println("Luas segitiga: " + segitiga.hitungLuas());
        System.out.println("Keliling segitiga: " + segitiga.hitungKeliling());
    }
    
}