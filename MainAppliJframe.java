import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class MainAppliJframe {
    public static void main(String[] args) {

        JFrame fenetre = new JFrame("Super Fenetre");
        fenetre.setSize(800, 800);
        JPanel panelUp = new JPanel(); 
	JPanel panelDown = new JPanel(); 
	JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, panelUp, panelDown);
        //splitPane.setDividerLocation(150); 
        splitPane.setResizeWeight(0.33);
        fenetre.add(splitPane); 


        JButton bouton1 = new JButton("Bouton 1");
        bouton1.addActionListener(e -> panelUp.setBackground(Color.RED));
  
        JButton bouton3 = new JButton("Bouton 3");
        bouton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panelUp.setBackground(Color.BLUE);  
            }
        });

	panelUp.setLayout(new BorderLayout());
        panelUp.add(bouton1, BorderLayout.WEST); 
        panelUp.add(bouton3, BorderLayout.EAST);

        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	panelDown.setLayout(new BoxLayout(panelDown, BoxLayout.Y_AXIS));

        JSlider slider1 = new JSlider(0, 100);
        slider1.setMajorTickSpacing(10);  
        slider1.setMinorTickSpacing(1);   
        slider1.setPaintTicks(true);      
        slider1.setPaintLabels(true);
	JLabel slider1Label = new JLabel();
	slider1Label.setText("Paramètre du rouge"); 


        JSlider slider2 = new JSlider(0, 100);
        slider2.setMajorTickSpacing(10);  
        slider2.setMinorTickSpacing(1);   
        slider2.setPaintTicks(true);      
        slider2.setPaintLabels(true);
	JLabel slider2Label = new JLabel();
	slider2Label.setText("Paramètre du vert"); 

        JSlider slider3 = new JSlider(0, 100);
        slider3.setMajorTickSpacing(10);  
        slider3.setMinorTickSpacing(1);   
        slider3.setPaintTicks(true);      
        slider3.setPaintLabels(true);
	JLabel slider3Label = new JLabel();
	slider3Label.setText("Paramètre du bleu"); 

        slider1.addChangeListener(e -> {
            int redValue = slider1.getValue() * 255 / 100; 
            int greenValue = slider2.getValue() * 255 / 100;
            panelDown.setBackground(new Color(redValue, greenValue, 0));
        });

	panelDown.add(Box.createRigidArea(new Dimension(0,50)));
        panelDown.add(slider1Label);
        panelDown.add(slider1);
	panelDown.add(Box.createVerticalGlue()); 

        slider2.addChangeListener(e -> {
            int redValue = slider1.getValue() * 255 / 100; 
            int greenValue = slider2.getValue() * 255 / 100; 
            panelDown.setBackground(new Color(redValue, greenValue, 0));
        });

        panelDown.add(slider2Label);
        panelDown.add(slider2);
	panelDown.add(Box.createVerticalGlue()); 

        slider3.addChangeListener(e -> {
            int blueValue = slider3.getValue() * 255 / 100; 
            int redValue = slider1.getValue() * 255 / 100; 
            int greenValue = slider2.getValue() * 255 / 100; 
            panelDown.setBackground(new Color(redValue, greenValue, blueValue));
        });
        panelDown.add(slider3Label);
        panelDown.add(slider3);
	panelDown.add(Box.createRigidArea(new Dimension(0,50)));

	slider1Label.setAlignmentX(Component.CENTER_ALIGNMENT);
	slider2Label.setAlignmentX(Component.CENTER_ALIGNMENT);
	slider3Label.setAlignmentX(Component.CENTER_ALIGNMENT);

        fenetre.setVisible(true);
    }
}
