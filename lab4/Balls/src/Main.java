import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Random;



public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame("BALLS");
        f.setSize(480, 480);
        f.setResizable(false);
        f.setLayout(new BoxLayout(f.getContentPane(), BoxLayout.Y_AXIS));
        JLabel score = new JLabel("Счет: 0");
        score.setHorizontalTextPosition(JLabel.CENTER);
        JPanel p = new Battlefield(81);
        f.add(score);
        f.add(p);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }


}