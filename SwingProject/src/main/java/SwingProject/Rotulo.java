package SwingProject;

import javax.swing.*;

public class Rotulo extends JFrame {
    private JLabel  texto;
    
    public Rotulo() {
        super("Usando rótulos em JFrame");
        texto = new JLabel("Meu primeiro JLabel");
        add(texto);
    }
}
