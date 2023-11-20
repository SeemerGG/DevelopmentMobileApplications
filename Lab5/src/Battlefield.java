import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;
import java.util.stream.IntStream;
public class Battlefield extends JPanel{

    JLabel _label = null;
    boolean flag = false;
    Battlefield(JLabel l){
        super();
        _label = l;
        setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        setLayout(new GridLayout(9,9,5,5));
        for(int i = 0; i < 9; i++)
        {
            for(int j = 0; j < 9; j++){
                JButton b = new ChipButton(Color.WHITE, i);
                //b.addActionListener();
                add(b);
            }
        }
    }


}
