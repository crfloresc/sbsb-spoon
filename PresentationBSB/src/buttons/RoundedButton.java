package buttons;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JButton;

public class RoundedButton extends JButton {

    private final Color colorNormal = new Color(0, 139, 139);
    private final Color colorTextNormal = new Color(255, 255, 255);
    private final Font f = new Font("Tahoma", Font.BOLD, 14);

    @SuppressWarnings("LeakingThisInConstructor")
    public RoundedButton() {
        this.setFont(f);
        this.setPreferredSize(new Dimension(150, 35));
        this.setSize(new Dimension(150, 35));
        //this.setBorder(new RoundedBorder(60));
        this.setBorderPainted(false);
        this.setContentAreaFilled(false);
        this.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.setBackground(this.colorNormal);
        this.setForeground(this.colorTextNormal);
        this.setOpaque(true);
        this.setVisible(true);
        this.setBounds(10, 10, 30, 25);
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        // if the button is pressed and ready to be released
        if (getModel().isArmed()) {
           g.setColor(Color.lightGray);
        } else {
           g.setColor(getBackground());
        }
        g.fillOval(0, 0, getSize().width-1, getSize().height-1);

        super.paintComponent(g);
    }
    
    @Override
    protected void paintBorder(Graphics g) {
        g.setColor(getForeground());
        g.drawOval(0, 0, getSize().width-1, getSize().height-1);
    }
}
