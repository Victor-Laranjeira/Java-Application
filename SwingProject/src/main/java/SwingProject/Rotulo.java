package SwingProject;

import javax.swing.*;

public class Rotulo extends JFrame {
    private JLabel  texto;
    
    public Rotulo() {
        super("Usando r�tulos em JFrame");
        texto = new JLabel("Meu primeiro JLabel");
        add(texto);
    }
}
