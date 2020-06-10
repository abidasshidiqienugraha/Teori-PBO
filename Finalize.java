/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_TEO_PBO;

/**
 *
 * @author abid
 */
public class Finalize {
     public void Finalize(){
        System.out.print("Objek Yang Tidak Terpakai Sudah Dibersihkan:");
    }
    
    public static void main(String[] args){
        Runtime RT = Runtime.getRuntime();
        System.out.println("Jumlah Memori Awal : "+RT.totalMemory());
        
        Finalize objek1 = new Finalize(); //Block Satu
        Finalize objek2 = new Finalize(); //Block Dua
        Finalize objek3 = objek1; //Objek3 Mengembalikan Nilai Objek1
        
        //Objek 1 dan 2 dibuat null,sehingga block 1 dan 2 jdi kosong nilainya
        objek1 = null;
        objek2 = null;
        System.out.println("Jumlah Memori Yeng Tersedia Sebelum di GC: "+RT.freeMemory());
        System.gc();//Untuk menjalankan Garbage Collection pada java
        System.out.println("===========================================");
        System.out.println("Jumlah Memori Yeng Tersedia Setelah di GC: "+RT.freeMemory());
    }
}
