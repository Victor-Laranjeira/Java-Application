package SwingProject;
import javax.swing.*;
public class Janela {
    
    private static JFrame janela;
    
    public JFrame Janela(){
        janela = new JFrame();
        
        JButton btn = new JButton("Clique aqui");
        btn.setBounds(130,100,100,40);
        
        janela.add(btn);
        
        janela.setSize(400,500);
        janela.setLayout(null);
        janela.setVisible(true);
        
        return janela;
    }
}
