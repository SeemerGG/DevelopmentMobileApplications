import javax.swing.*;
import java.awt.*;
import java.util.Random;



public class Main {
    public static void main(String[] args) {
        Color[] colorList = new Color[] {
                new Color(121, 227, 248),
                new Color(161, 166, 250),
                new Color(229, 83, 124),
                new Color(222, 166, 41),
                new Color(31, 248, 155)
        };
        Random rand = new Random();
        JFrame f = new JFrame("BALLS");
        f.setSize(480, 480);
        f.setResizable(false);
        f.setLayout(new BoxLayout(f.getContentPane(), BoxLayout.Y_AXIS));
        JLabel score = new JLabel("Счет: 0");
        score.setHorizontalTextPosition(JLabel.CENTER);
        JPanel p = new JPanel();
        p.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        p.setLayout(new GridLayout(9,9,5,5));
        for(int i = 0; i < 81; i++)
        {
            p.add(new CircleButton(colorList[rand.nextInt(0, 4)]));
        }
        Component[] buttons = p.getComponents();
        f.add(score);
        f.add(p);
        f.setLocationRelativeTo(null);
        f.setVisible(true);

    }
}