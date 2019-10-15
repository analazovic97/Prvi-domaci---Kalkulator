
package KalkulatorPaket;

import javax.swing.*;
import java.awt.*;

public class JavaApplication1 {

    private JFrame f;
    private JPanel p;
    private JButton b1,b2;
    private JLabel lab1,lab2,lab3;
    private JTextField tx1,tx2,tx3;
    
    
    public JavaApplication1(){
    
        gui();
    
    }
    
    public void gui(){
    
        f=new JFrame("Kalkulator");
        
        f.setSize(350, 350);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        
        p=new JPanel(new GridBagLayout());
        
        GridBagConstraints c= new GridBagConstraints();
        
        tx1= new JTextField(null,8);
        lab1= new JLabel("a");
        
        tx2=new JTextField(null,8);
        lab2= new JLabel("b");
        
        tx3=new JTextField(null,8);
        lab3=new JLabel("c");
        
        tx3.setEditable(false);
        
        b1= new JButton("Saberi");
        b2= new JButton("Oduzmi");
        
        c.insets= new Insets(18,7,18,7);
        
        c.gridx=0;
        c.gridy=0;
        p.add(lab1,c);
        
        c.gridx=1;
        c.gridy=0;
        p.add(tx1,c);
        
        c.gridx=0;
        c.gridy=1;
        p.add(lab2,c);
        
        c.gridx=1;
        c.gridy=1;
        p.add(tx2,c);
        
        c.gridx=0;
        c.gridy=2;
        p.add(lab3,c);
        
        c.gridx=1;
        c.gridy=2;
        p.add(tx3,c);
        
        c.gridx=0;
        c.gridy=3;
        p.add(b1,c);
        
        c.gridx=2;
        c.gridy=3;
        p.add(b2,c);
        
       f.add(p);
       f.setVisible(true);
        
    }
    
    
    
    
    public static void main(String[] args) {
        new JavaApplication1();
    }
    
}
