import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainAppliJframe {
    public static void main(String[] args) {

        JFrame fenetre = new JFrame("Super Fenetre");
        fenetre.setSize(800, 800);
        fenetre.setLayout(new FlowLayout());

        Container contentPane = fenetre.getContentPane();
        JButton bouton1 = new JButton("Bouton 1");
        bouton1.addActionListener(e -> contentPane.setBackground(Color.RED));

        JButton bouton2 = new JButton("");  
        JButton bouton3 = new JButton("Bouton 3");
        bouton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contentPane.setBackground(Color.BLUE);  
            }
        });

        fenetre.add(bouton1);
        fenetre.add(bouton2);  
        fenetre.add(bouton3);

        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JSlider slider1 = new JSlider(0, 100);
        slider1.setMajorTickSpacing(10);  
        slider1.setMinorTickSpacing(1);   
        slider1.setPaintTicks(true);      
        slider1.setPaintLabels(true);

        JSlider slider2 = new JSlider(0, 100);
        slider2.setMajorTickSpacing(10);  
        slider2.setMinorTickSpacing(1);   
        slider2.setPaintTicks(true);      
        slider2.setPaintLabels(true);

        JSlider slider3 = new JSlider(0, 100);
        slider3.setMajorTickSpacing(10);  
        slider3.setMinorTickSpacing(1);   
        slider3.setPaintTicks(true);      
        slider3.setPaintLabels(true);

        slider1.addChangeListener(e -> {
            int redValue = slider1.getValue() * 255 / 100; 
            int greenValue = slider2.getValue() * 255 / 100;
            contentPane.setBackground(new Color(redValue, greenValue, 0));
        });
        fenetre.add(slider1);

        slider2.addChangeListener(e -> {
            int redValue = slider1.getValue() * 255 / 100; 
            int greenValue = slider2.getValue() * 255 / 100; 
            contentPane.setBackground(new Color(redValue, greenValue, 0));
        });
        fenetre.add(slider2);

        slider3.addChangeListener(e -> {
            int blueValue = slider3.getValue() * 255 / 100; 
            int redValue = slider1.getValue() * 255 / 100; 
            int greenValue = slider2.getValue() * 255 / 100; 
            contentPane.setBackground(new Color(redValue, greenValue, blueValue));
        });
        fenetre.add(slider3);

        fenetre.setVisible(true);
    }
}
