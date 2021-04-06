package SwingProject;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class CaixaTexto extends JFrame{
    
    private JTextField fixa, caixa;
    private JButton exibe, limpa;
    
    public CaixaTexto() {
        super("JTextField - Caixas de texto");
        setLayout(new FlowLayout());
        
        fixa = new JTextField("N�o � poss�vel alterar essa caixa de texto");
        fixa.setEditable(false);
        add(fixa);
        
        caixa = new JTextField(20);
        add(caixa);
        
        exibe = new JButton("Exibir");
        exibe.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                if(event.getSource() == exibe) {
                    JOptionPane.showMessageDialog(null, caixa.getText());
                }
            }
        });
        add(exibe);
        
        limpa = new JButton("Limpar");
        limpa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                if(event.getSource() == limpa) {
                    caixa.setText("");
                }
            }
        });
        add(limpa);
    }
}