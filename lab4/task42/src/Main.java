import javax.swing.*;

public class Main {
    public static void main(String[] args)
    {
        JFrame f = new JFrame();
        JPanel p = new JPanel();
        for(int i = 0; i < 8; i++)
        {
            p.add(new JButton("ahah"));
        }
        f.setSize(300, 500);
        f.add(p);
        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}