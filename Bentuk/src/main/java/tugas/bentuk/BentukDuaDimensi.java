/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.bentuk;

/**
 *
 * @author ASM
 */
public abstract class BentukDuaDimensi implements Bentuk {

    /**
     *
     * @return
     */
    @Override
    public abstract double hitungLuas();

    @Override
    public void tampilkan() {
        System.out.println("Ini adalah sebuah bentuk dua dimensi.");
    }
}
