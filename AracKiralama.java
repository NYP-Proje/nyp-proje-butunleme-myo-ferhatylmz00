import javax.swing.*;
import java.awt.*;

public class AracKiralamaEkrani extends JFrame {

    JComboBox<String> arabalar;
    JTextField gun;
    JLabel sonuc;

    public AracKiralamaEkrani() {

        setTitle("Araç Kiralama");
        setSize(600,550);
        setLayout(new FlowLayout());

        String[] liste = {
                "Renault Clio - 3000",
                "Fiat Egea - 3500",
                "Hyundai i20 - 3200",
                "Toyota Corolla - 5000",
                "Honda Civic - 5500",
                "Volkswagen Passat - 7500",
                "Skoda Octavia - 6500",
                "BMW 320i - 12000",
                "Mercedes C200 - 14000",
                "Audi A4 - 13000",
                "Range Rover Evoque - 25000",
                "Tesla Model 3 - 20000"
        };

        arabalar = new JComboBox<>(liste);
        gun = new JTextField(5);
        sonuc = new JLabel();

        JButton hesapla = new JButton("Hesapla");
        JButton odeme = new JButton("Ödeme");

        add(arabalar);
        add(new JLabel("Gün:"));
        add(gun);
        add(hesapla);
        add(odeme);
        add(sonuc);

        hesapla.addActionListener(e -> {

            try {
                String secim = arabalar.getSelectedItem().toString();
                int fiyat = Integer.parseInt(secim.split("-")[1].trim());
                int gunSayisi = Integer.parseInt(gun.getText());

                int toplam = fiyat * gunSayisi;

                Veritabani.sonTutar = toplam;

                sonuc.setText("Toplam: " + toplam + " TL");

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Hatalı giriş");
            }
        });

        odeme.addActionListener(e -> {

            if (Veritabani.sonTutar == 0) {
                JOptionPane.showMessageDialog(this, "Önce hesapla");
                return;
            }

            dispose();
            new OdemeEkrani();
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
