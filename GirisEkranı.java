import javax.swing.*;
import java.awt.*;

public class GirisEkrani extends JFrame {

    JTextField kullaniciAdi;
    JPasswordField sifre;

    public GirisEkrani() {

        setTitle("PERMA OTO KİRALAMA");
        setSize(600,550);
        setLayout(new GridLayout(3,2));

        add(new JLabel("Kullanıcı Adı"));
        kullaniciAdi = new JTextField();
        add(kullaniciAdi);

        add(new JLabel("Şifre"));
        sifre = new JPasswordField();
        add(sifre);

        JButton giris = new JButton("Giriş");
        add(giris);

        giris.addActionListener(e -> {

            String k = kullaniciAdi.getText();
            String s = new String(sifre.getPassword());

            if(k.equals("ferhat") && s.equals("1234")) {

                Veritabani.aktifKullanici = k;

                dispose();
                new AracKiralamaEkrani();

            } else {
                JOptionPane.showMessageDialog(this, "Hatalı giriş");
            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
