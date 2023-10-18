import javax.swing.*;
import java.awt.*;
public class ChipButton extends JButton{
    private Color _c;
    private int _number;

    public Color getColor()
    {
        return _c;
    }

    public int getNumber(){ return _number; }

    public void setColor(Color c)
    {
        _c = c;
        repaint();
    }

    public ChipButton(Color color, int num)
    {
        super();
        _c = color;
        _number = num;
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        setBackground(Color.WHITE);

    }
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(_c);
        g2d.fillOval(3, 3, getWidth()-6, getHeight()-6);
        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(3));
        g2d.drawOval(3, 3 , getWidth() - 6, getHeight() - 6);
    }
}
