package Pertemuan12;

public class Mahasiswa26 {

    String nim, nama, kelas;
    double ipk;

    public Mahasiswa26() {
    }
    public Mahasiswa26 (String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    public void tampilInformasi() {
        System.out.println(nama + "\t\t" + nim + "\t\t" + kelas + "\t\t" + ipk);
    }
}