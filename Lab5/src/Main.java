import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Random;

public class Main {

    public static void addBattlefield(JFrame f, Color color, int x, int y) {
        JPanel p = new Battlefield(color);
        f.add(p, x, y);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Лото");
        f.setSize(640, 480);
        f.setLayout(new GridLayout(5, 1, 25, 25));
        JLabel score = new JLabel(String.format("Ход игрока:%s", "Player"));
        JLabel number = new JLabel("ljthfewo");
        score.setHorizontalTextPosition(JLabel.CENTER);
        addBattlefield(f, Color.RED, 1, 0);
        addBattlefield(f, Color.YELLOW, 2, 0);
        addBattlefield(f, Color.GREEN, 3, 0);
        addBattlefield(f, Color.BLUE, 4, 0);
        f.add(score, 0 ,0);
        f.add(number, 0, 1);
        JButton startB = new JButton("Начать игру");
        f.add(startB);
    }
}
