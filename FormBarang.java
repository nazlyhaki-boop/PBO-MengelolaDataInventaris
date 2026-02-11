package view;
import controller.BarangController;
import javax.swing.*;
import java.awt.event.*;

public class FormBarang extends JFrame {

    JTextField txtNama = new JTextField();
    JTextField txtStok = new JTextField();
    JButton btnSimpan = new JButton("Simpan");

    public FormBarang() {
        setTitle("Form Barang");
        setSize(300,200);
        setLayout(null);

        JLabel l1 = new JLabel("Nama Barang");
        l1.setBounds(10,10,100,25);
        add(l1);

        txtNama.setBounds(120,10,150,25);
        add(txtNama);

        JLabel l2 = new JLabel("Stok");
        l2.setBounds(10,50,100,25);
        add(l2);

        txtStok.setBounds(120,50,150,25);
        add(txtStok);

        btnSimpan.setBounds(120,90,100,30);
        add(btnSimpan);

        btnSimpan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                BarangController bc = new BarangController();
                bc.tambahBarang(txtNama.getText(),
                        Integer.parseInt(txtStok.getText()));
            }
        });

        setVisible(true);
    }
}
