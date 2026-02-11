package model;

public class Barang {
    private int idBarang;
    private String namaBarang;
    private int stok;

    public Barang(int idBarang, String namaBarang, int stok) {
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.stok = stok;
    }

    public int getIdBarang() { return idBarang; }
    public String getNamaBarang() { return namaBarang; }
    public int getStok() { return stok; }
}
