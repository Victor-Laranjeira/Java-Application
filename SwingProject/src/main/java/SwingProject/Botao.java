package SwingProject;

import java.awt.FlowLayout;
import javax.swing.*;

public class Botao extends JFrame{
    private JButton ok, cancelar;
    
    public Botao() {
        super("Criando Botões");
        setLayout(new FlowLayout());
        
        ok = new JButton("OK");
        cancelar = new JButton("Cancelar");
        add(ok);
        add(cancelar);
    }
    
    
}
