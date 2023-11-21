import javax.swing.*;
import java.awt.*;
public class ChipButton extends JButton{
    private Color _c;
    private int _num;

    public ChipButton(Color color, int num)
    {
        super(num+"");
        _c = color;
        _num = num;
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        setBackground(Color.WHITE);
    }

    public ChipButton()
    {
        super();
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        setBackground(Color.WHITE);
    }

//    @Override
//    protected void paintComponent(Graphics g)
//    {
//        super.paintComponent(g);
//        Graphics2D g2d = (Graphics2D) g;
//        g2d.setColor(_c);
//        g2d.fillOval(3, 3, getWidth()-6, getHeight()-6);
//        g2d.setColor(Color.BLACK);
//        g2d.setStroke(new BasicStroke(3));
//        g2d.drawOval(3, 3 , getWidth() - 6, getHeight() - 6);
//    }
}
