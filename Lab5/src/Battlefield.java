import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;
import java.util.stream.IntStream;
public class Battlefield extends JPanel{
    Color _color = null;
    boolean flag = false;

    JButton[][] buttons = new JButton[3][9];

    Battlefield(Color color){
        super();
        _color = color;
        setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        setLayout(new GridLayout(3,9,5,5));
        setBackground(_color.brighter());
        Set<Integer> ints = new HashSet<Integer>();
        Random rand = new Random();
        for(int i = 0; i < 3; i++)
        {
            while(ints.size() < 5){
                ints.add(rand.nextInt(0,9));
            }
            for(int j = 0; j < 9; j++){
                JButton b;
                if(ints.contains(j)){
                    b = new ChipButton(_color, rand.nextInt(j * 10, (j+1) * 10));
                }
                else{
                    b = new ChipButton();
                }
                buttons[i][j] = b;
                add(b);
            }
            ints.clear();
        }
    }

}
