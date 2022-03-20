package com.ucup;
// Belajar OOP menggunakan Java
/*
    Dalam OOP kita mengenal ada dua hal yaitu class (ibaratkan pembukus)
    dan Object (sebagai hal yang ingin kita proses)
*/


class Mahasiswa{
    // Data Member
    String nama;
    String NIM;
    String Jurusan;
    double IPK;


    // Fungsi Constructor
    Mahasiswa(String nama, String NIM, String Jurusan){
        this.nama = nama;
        this.NIM = NIM;
        this.Jurusan = Jurusan;

    }
    
    // Method tanpa return dan tanpa parameter
    void TampilkanData(){
        System.out.println("Nama Lengkap : " + nama);
        System.out.println("NIM          : " + NIM);
        System.out.println("Jurusan       :" + Jurusan);

    }

    // Method tanpa return dan dengan parameter
    void EditData(String nama){
        this.nama = nama;
    }

    // Method dengan return dan tanpa parameter
    String getKabar(){
        return "Halo, " + nama + " Apakabar Hari Ini ??\n";
    }

    // Method dengan return dan dengan parameter
    double TambahIPK(double IPK){
        this.IPK = IPK;
        return this.IPK;
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Alfares", "2107411020", "TIK");
        Mahasiswa mahasiswa2 = new Mahasiswa("Agus", "2107411013", "TIK");

        // Panggil Tampilkan Data
        System.out.println("Data Mahasiswa :\n");
        mahasiswa1.TampilkanData();
        mahasiswa2.TampilkanData();
        
        // Panggil Edit Data
        mahasiswa1.EditData("Alfares Ariandha Nurdin");
        mahasiswa2.EditData("Agus Setiawan");
        System.out.println("\nData Mahasiswa Yang Telah Di Edit :\n");
        mahasiswa1.TampilkanData();
        mahasiswa2.TampilkanData();
        
        // Panggil getKabar
        System.out.println("\n");
        System.out.println(mahasiswa1.getKabar());
        System.out.println(mahasiswa2.getKabar());
        
        // Panggil TambahIPK
        System.out.println("\nData Mahasiswa dan IPK-nya :\n");
        mahasiswa1.TampilkanData();
        System.out.println("IPK Saya adalah " + mahasiswa1.TambahIPK(4.0) + "\n");
        mahasiswa2.TampilkanData();
        System.out.println("IPK Saya adalah " + mahasiswa2.TambahIPK(3.7) + "\n");

        // mahasiswa1.nama = "Alfares";
        // mahasiswa1.NIM = "2107411020";
        // mahasiswa1.Jurusan = "TIK";
        // System.out.println("\nMahasiswa 1: ");
        // System.out.println("\n"+mahasiswa1.nama);
        // System.out.println(mahasiswa1.NIM);
        // System.out.println(mahasiswa1.Jurusan);
        
        // mahasiswa2.nama = "Agus";
        // mahasiswa2.NIM = "2107411013";
        // mahasiswa2.Jurusan = "TIK";
        
        // System.out.println("\nMahasiswa 2: ");
        // System.out.println("\n"+mahasiswa2.nama);
        // System.out.println(mahasiswa2.NIM);
        // System.out.println(mahasiswa2.Jurusan);
    }
}
