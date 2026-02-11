package controller;
import koneksi.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class BarangController {

    public void tambahBarang(String nama, int stok) {
        try {
            Connection conn = Koneksi.getConnection();
            String sql = "INSERT INTO barang(nama_barang, stok) VALUES(?,?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, nama);
            pst.setInt(2, stok);
            pst.executeUpdate();
            System.out.println("Data berhasil ditambahkan!");
        } catch (Exception e) {
            System.out.println("Gagal tambah: " + e.getMessage());
        }
    }
}
