import java.awt.*;



public class maPremiereFenetre extends Frame {

   public MaPremiereFenetre() {
      super();
      setTitle(" fenetre avec un super titre ");
      setSize(300, 300);
      setLayout(new GridLayout(1, 3));
      add(new Button("bouton 1"));
      add(new Button("bouton 2"));
      add(new Button("bouton 3"));
      add(new Button("bouton 4")); 
      add(new Button("bouton 5 tres long"));
      add(new Button("bouton 6"));

      pack();
      show(); // affiche la fenetre
   } 