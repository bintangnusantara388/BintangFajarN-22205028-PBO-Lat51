/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gajikaryawan;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Gajikaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        Manager mnr1 = new Manager();
        System.out.println("=== Program Perhitungan Gaji Karyawan===");
        System.out.print("Masukkan Nik : ");
        mnr1.setNik(baca.nextLine());
        System.out.print("Masukkan Nama : ");
        mnr1.setNama(baca.nextLine());
        System.out.print("Masukkan Golongan (1/2/3) : ");
        mnr1.setGolongan(baca.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        mnr1.setJabatan(baca.next());
        System.out.print("Masukkan Jumlah Kehadiran : ");
        mnr1.setKehadiran(baca.nextInt());
        System.out.println("");

        System.out.println("===Hasil Perhitungan===");
        System.out.println("NIK : " + mnr1.getNik());
        System.out.println("Nama : " + mnr1.getNama());
        System.out.println("Golongan : " + mnr1.getGolongan());
        System.out.println("Jabatan : " + mnr1.getJabatan());
        System.out.println("");

        System.out.println("TUNJANGAN GOLONGAN : " + mnr1.tunjanganGolongan
                           (mnr1.getGolongan()));
        System.out.println("TUNJANGAN JABATAN : " + mnr1.tunjanganJabatan
                           (mnr1.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN : " + mnr1.tunjanganKehadiran
                           (mnr1.getKehadiran()));
        System.out.println("");
        System.out.println("GAJI TOTAL " + mnr1.totalGaji());


    }
    
}
class Karyawan {

    protected String nik;
    protected String nama;
    protected String jabatan;
    protected int golongan;

    public String getNik() {
        return nik;
    }

    public String getNama() {
        return nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public int getGolongan() {
        return golongan;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public void setGolongan(int golongan) {
        this.golongan = golongan;
}

}

class Manager extends Karyawan {

    private int kehadiran;
    private float tunjanganGolongan;
    private float tunjanganJabatan;
    private float tunjanganKehadiran;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }

    public float tunjanganKehadiran(int hadir) {
        tunjanganKehadiran = kehadiran * 10000;
        return tunjanganKehadiran;
    }

    public float tunjanganJabatan(String jabatan) {
        if (jabatan.equals("Manager")) {
            tunjanganJabatan = 2000000;
        } else if (jabatan.equals("Kabag")) {
            tunjanganJabatan = 1000000;
        } else {
            tunjanganJabatan = 0;
        }
        return tunjanganJabatan;
    }

    public float tunjanganGolongan(int golongan) {
        if (golongan == 1) {
            tunjanganGolongan = 500000;
        } else if (golongan == 2) {
            tunjanganGolongan = 1000000;
        } else if (golongan == 3) {
            tunjanganGolongan = 1500000;
        }
        return tunjanganGolongan;
    }

    public float totalGaji() {
        return tunjanganJabatan + tunjanganGolongan + tunjanganKehadiran;
}

}