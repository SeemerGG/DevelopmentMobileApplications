import javax.swing.*;
import java.awt.*;


public class CircleButton extends JButton
{
    public Color c;
    public CircleButton(Color color)
    {
        super();
        c = color;
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        setBackground(Color.WHITE);

    }
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(c);
        int x = getWidth()/2 ;
        int y = getHeight()/2 ;
        g2d.fillOval(x, y, 10, 10);
        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(3));
        g2d.drawOval(0, 0 , 10, 10);
    }

}
