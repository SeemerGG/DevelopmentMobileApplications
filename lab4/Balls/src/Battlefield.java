import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;
import java.util.stream.IntStream;

public class Battlefield extends JPanel
{
    Component[] comp;
    Random rand = new Random();

    List<Integer> whiteButtons;

    Color[] colorList = new Color[] {
            new Color(121, 227, 248),
            new Color(161, 166, 250),
            new Color(229, 83, 124),
            new Color(222, 166, 41),
            new Color(31, 248, 155)
    };

    public Battlefield(int n)
    {
        super();
        setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        setLayout(new GridLayout(9,9,5,5));
        ButtonListener listener = new ButtonListener(this);
        whiteButtons = new ArrayList<>(IntStream.rangeClosed(0, 80).boxed().toList());

        for(int i = 0; i < n; i++)
        {
            JButton b = new CircleButton(Color.WHITE);
            b.addActionListener(listener);
            add(b);
        }
        comp = getComponents();
        //PanelLisener panelLisener = new PanelLisener(comp, whiteButtons);
        randomThree();

    }

    public void randomThree()
    {
        Collections.shuffle(whiteButtons);
        for(int i = 0; i < 3; i++)
        {
            ((CircleButton)comp[whiteButtons.get(i)]).setColor(colorList[rand.nextInt(0,3)]);
            whiteButtons.remove(i);
        }
    }


}
