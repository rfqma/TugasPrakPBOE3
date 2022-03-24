import javax.swing.*;
import java.awt.event.*;

public class Kalkulator extends JFrame {
    JLabel teksJudul = new JLabel("Kalkulator Balok");
    JLabel teksLebar = new JLabel("Lebar");
    JLabel teksPanjang = new JLabel("Panjang");
    JLabel teksTinggi = new JLabel("Tinggi");
    JLabel teksHasil = new JLabel("Hasil : ");

    JLabel labelLuas = new JLabel("");
    JLabel labelKeliling = new JLabel("");
    JLabel labelVolume = new JLabel("");
    JLabel labelLpermukaan = new JLabel("");

    JTextField fieldLebar = new JTextField();
    JTextField fieldPanjang = new JTextField();
    JTextField fieldTinggi = new JTextField();

    JButton tombolHitung=  new JButton("Hitung");
    JButton tombolReset=  new JButton("Reset");

    public Kalkulator(){
        setSize(600,600);
        setLayout(null);

        add(teksJudul);
        add(teksLebar);
        add(teksPanjang);
        add(teksTinggi);
        add(teksHasil);

        add(fieldLebar);
        add(fieldPanjang);
        add(fieldTinggi);

        add(labelLuas);
        add(labelKeliling);
        add(labelVolume);
        add(labelLpermukaan);

        add(tombolHitung);
        add(tombolReset);


        teksJudul.setBounds(200,20,200,25);

        teksLebar.setBounds(20,70,150,25);
        fieldLebar.setBounds(180,70,270,25);

        teksPanjang.setBounds(20,120,150,25);
        fieldPanjang.setBounds(180,120,270,25);

        teksTinggi.setBounds(20,170,150,25);
        fieldTinggi.setBounds(180,170,270,25);

        teksHasil.setBounds(200,200,200,25);

        labelLuas.setBounds(20,240,300,25);
        labelKeliling.setBounds(20,280,300,25);
        labelVolume.setBounds(20,320,300,25);
        labelLpermukaan.setBounds(20,360,300,25);

        tombolHitung.setBounds(150,450,100,50);
        tombolReset.setBounds(350,450,100,50);


        tombolHitung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double panjang = Double.parseDouble(fieldPanjang.getText());
                double lebar = Double.parseDouble(fieldLebar.getText());
                double tinggi = Double.parseDouble(fieldTinggi.getText());

                double luas =  panjang * lebar;
                double keliling = 2*(panjang + lebar);
                double volume = panjang * lebar * tinggi;
                double luasPermukaan = 2 * (panjang*lebar + panjang*tinggi + lebar*tinggi);


                labelLuas.setText("Luas Persegi Panjang : " + luas);
                labelKeliling.setText("Keliling Persegi Panjang : " + keliling);
                labelVolume.setText("Volume Balok : " + volume);
                labelLpermukaan.setText("Luas Permukaan Balok : " + luasPermukaan);
            }
        });

        tombolReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fieldPanjang.setText("");
                fieldLebar.setText("");
                fieldTinggi.setText("");
                labelLuas.setText("");
                labelKeliling.setText("");
                labelVolume.setText("");
                labelLpermukaan.setText("");
            }
        });

        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}


