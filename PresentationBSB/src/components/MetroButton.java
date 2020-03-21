package components;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.border.Border;

public class MetroButton extends JButton implements MouseListener, MouseMotionListener {

    private Color colorNormal = new Color(51, 39, 47);
    private Color colorPressed = new Color(51, 50, 70);   
    private Color colorHover = new Color(51, 50, 70);
    private Border bordeMoved = javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255));
    private Color colorTextNormal = new Color(255, 255, 255);
    private Color colorTextPressed = new Color(255, 255, 255);
    private Color colorTextHover = new Color(255, 255, 255);
    private final Font f = new Font("Tahoma", Font.BOLD, 14);
    private boolean isDisabled = false;

    @SuppressWarnings("LeakingThisInConstructor")
    public MetroButton() {
        init();
    }

    public MetroButton(boolean isDisabled) {
        this.isDisabled = isDisabled;
        init();
    }

    public MetroButton(String title) {
        init();
        this.setText(title);
        this.setBorderPainted(false);
    }

    private void init() {
        this.setFont(f);
        this.setPreferredSize(new Dimension(150, 35));
        this.setSize(new Dimension(150, 35));
        this.setBorder(null);
        this.setFocusPainted(false);
//        this.setBorderPainted(false);
        this.setContentAreaFilled(false);
        this.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.setBackground(this.colorNormal);
        this.setForeground(this.colorTextNormal);
        this.setOpaque(true);
        this.setVisible(true);
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (!isDisabled) {
            this.setForeground(this.colorTextPressed);
            this.setBackground(this.colorPressed);
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (!isDisabled) {
            this.setBackground(this.colorNormal);
            this.setForeground(this.colorTextNormal);
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (!isDisabled) {
            this.setBorder(null);
            this.setBackground(this.colorNormal);
            this.setForeground(this.colorTextNormal);
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        if (!isDisabled) {
            this.setForeground(this.colorTextHover);
            this.setBackground(this.colorHover);
            this.setBorder(bordeMoved);
        }
    }

    public Color getColorPressed() {
        return colorPressed;
    }

    public void setColorPressed(Color colorPressed) {
        this.colorPressed = colorPressed;
    }

    public Color getColorTextPressed() {
        return colorTextPressed;
    }

    public void setColorTextPressed(Color colorTextPressed) {
        this.colorTextPressed = colorTextPressed;
    }

    public Color getColorHover() {
        return colorHover;
    }

    public void setColorHover(Color colorHover) {
        this.colorHover = colorHover;
    }

    public Color getColorTextHover() {
        return colorTextHover;
    }

    public void setColorTextHover(Color colorTextHover) {
        this.colorTextHover = colorTextHover;
    }

    public Color getColorNormal() {
        return colorNormal;
    }

    public void setColorNormal(Color colorNormal) {
        this.setBackground(colorNormal);
        this.colorNormal = colorNormal;      
    }

    public Color getColorTextNormal() {
        return colorTextNormal;
    }

    public void setColorTextNormal(Color colorTextNormal) {
        this.setForeground(colorTextNormal);
        this.colorTextNormal = colorTextNormal;
    }
    
    public Border getColorBorde() {
        return bordeMoved;
    }

    public void setColorBorde(Border bordeMoved) {
        this.bordeMoved = bordeMoved;
    }
}
