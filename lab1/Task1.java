import java.awt.*;
import java.awt.event.*;

class Task1 extends Frame{
    Task1(String s){
        super(s);
        setBounds(0, 0, 305, 305);
        setVisible(true);
    }
    public void paint(Graphics g){
        Dimension d = getSize();
        g.fillRect(0, 0, 100,100);
        g.fillRect(200, 0, 100, 100);
        g.fillRect(50, 200, 200, 100);
        setBackground(Color.WHITE);
        setForeground(Color.BLACK);
    }

    public static void main(String[] args){
        Frame f = new Task1("Image");
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent ev){
                System.exit(0);
            }
        });
    }
}