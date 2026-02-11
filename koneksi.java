package koneksi;
import java.sql.Connection;
import java.sql.DriverManager;

public class Koneksi {
    private static Connection koneksi;

    public static Connection getConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/db_inventaris";
            String user = "root";
            String pass = "";

            koneksi = DriverManager.getConnection(url, user, pass);
            System.out.println("Koneksi Berhasil!");
        } catch (Exception e) {
            System.out.println("Koneksi Gagal: " + e.getMessage());
        }
        return koneksi;
    }
}
