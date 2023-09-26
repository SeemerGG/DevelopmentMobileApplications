import javax.swing.*;
public class Main {

    public static void main(String[] args)
    {
        JFrame f = new JFrame();
        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel l1 = new JLabel("ahahahahhah 1");
        JLabel l2 = new JLabel("ahahahahhah 2");
        JLabel l3 = new JLabel("ahahahahhah 1");
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.setVisible(true);
    }


}