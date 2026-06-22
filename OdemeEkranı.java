import javax.swing.*;
import java.awt.*;

public class OdemeEkrani extends JFrame {

    JTextField kartNo, cvv, tarih, isim;

    public OdemeEkrani() {

        setTitle("Ödeme");
        setSize(400,300);
        setLayout(new GridLayout(5,2));

        add(new JLabel("Kart Sahibi"));
        isim = new JTextField();
        add(isim);

        add(new JLabel("Kart No"));
        kartNo = new JTextField();
        add(kartNo);

        add(new JLabel("Son Kullanma"));
        tarih = new JTextField();
        add(tarih);

        add(new JLabel("CVV"));
        cvv = new JTextField();
        add(cvv);

        JButton ode = new JButton("Öde");
        add(ode);

        ode.addActionListener(e -> {

            if(isim.getText().isEmpty() ||
                    kartNo.getText().isEmpty() ||
                    tarih.getText().isEmpty() ||
                    cvv.getText().isEmpty()) {

                JOptionPane.showMessageDialog(this, "Boş alan var");
                return;
            }

            if(kartNo.getText().length() != 16 ||
                    cvv.getText().length() != 3) {

                JOptionPane.showMessageDialog(this, "Kart bilgisi hatalı");
                return;
            }

            JOptionPane.showMessageDialog(this,
                    "Ödeme başarılı!\nTutar: " + Veritabani.sonTutar + " TL");

            Veritabani.kiralamaGecmisi.add(
                    "Kullanıcı: " + Veritabani.aktifKullanici +
                            " - Tutar: " + Veritabani.sonTutar
            );

            Veritabani.sonTutar = 0;

            dispose();
            new GirisEkrani();
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
