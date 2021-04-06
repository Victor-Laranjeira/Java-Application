package SwingProject;

import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBox extends JFrame {
    private JCheckBox java, php, csharp, c;
    
    public CheckBox() {
        super("Que Linguagens Deseja Aprender ?");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,100);
        setLayout( new FlowLayout() );
        
        //Criando os JCheckBox
        java = new JCheckBox("Java");
        php = new JCheckBox("PHP");
        csharp = new JCheckBox("C#");
        c = new JCheckBox("C");
        
        //Adicionando os JCheckBox no Layout
        add(java);
        add(php);
        add(csharp);
        add(c);
        
        setVisible(true);
}
}