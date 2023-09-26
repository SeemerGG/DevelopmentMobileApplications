import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args)
    {
        JFrame f = new JFrame();
        JButton b = new JButton("10");

        b.addActionListener(new ActionListener() {
            int flag = 10;

            @Override
            public void actionPerformed(ActionEvent e) {
                flag -= 1;
                if(flag < 1){
                    System.exit(0);
                }
                ((JButton)e.getSource()).setText(String.format("%d", flag));
            }
        });

        f.add(b);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300, 500);
        f.setVisible(true);
    }
}