import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainAppli{
    public static void main(String[] args) {
		
	Frame fenetre = new Frame("Super Fenetre") ; 
	fenetre.setSize(400, 300);
	fenetre.setLayout(new FlowLayout());

	Button bouton1 = new Button("Bouton 1");
        bouton1.addActionListener(e -> fenetre.setBackground(Color.RED));
        Button bouton2 = new Button("");
        Button bouton3 = new Button("Bouton 3");
        bouton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fenetre.setBackground(Color.BLUE);  
            }
        });
        fenetre.add(bouton1);
        fenetre.add(bouton2);
        fenetre.add(bouton3);
	fenetre.setVisible(true); 
	fenetre.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
	JSlider slider1 = new JSlider(0, 100);
        slider1.setMajorTickSpacing(10);  
        slider1.setMinorTickSpacing(1);   
        slider1.setPaintTicks(true);      
        slider1.setPaintLabels(true);
	slider1.addChangeListener(e -> fenetre.setBackground(new Color(slider1.getValue(), 0, 0, 0)));
	fenetre.add(slider1); 


    }
}