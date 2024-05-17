import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Lienzo extends JFrame {
    protected Container content;
    protected JPanel lienzo;
    
    public Lienzo() {
        setSize(1600,920);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initComponents();
    }


    private void initComponents() {
        content = getContentPane();
        content.setLayout(new BoxLayout(content, BoxLayout.X_AXIS));
        lienzo = new JPanel();

        lienzo.setBorder(BorderFactory.createLineBorder(new Color(0x000000)));
        content.add(lienzo);
    }

    public void paintComponent(Graphics g) {

    }

    
}
