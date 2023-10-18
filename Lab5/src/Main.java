import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Random;

public class Main {
    enum Players{
        Green,
        Red,
        Blue,
        Black;
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Лото");
        f.setSize(480, 480);
        f.setResizable(false);
        f.setLayout(new BoxLayout(f.getContentPane(), BoxLayout.Y_AXIS));
        Random rand = new Random();
        JLabel score = new JLabel(String.format("Первый ходит игрок цвета: %s", Players.values()[rand.nextInt(Players.values().length)]));
        score.setHorizontalTextPosition(JLabel.CENTER);
        JPanel p = new Battlefield(score);
        f.add(score);
        f.add(p);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        }
    }
