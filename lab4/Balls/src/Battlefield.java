import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;
import java.util.stream.IntStream;

public class Battlefield extends JPanel implements ActionListener
{
    Component[] comp;
    Random rand = new Random();

    List<Integer> whiteButtons;

    private int _demention;

    int score = 0;

    Color[] colorList = new Color[] {
            new Color(121, 227, 248),
            new Color(161, 166, 250),
            new Color(229, 83, 124),
            new Color(222, 166, 41),
            new Color(31, 248, 155)
    };

    CircleButton prevButton = null;

    public Battlefield(int n)
    {
        super();
        _demention = n;
        setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        setLayout(new GridLayout(9,9,5,5));
        whiteButtons = new ArrayList<>(IntStream.rangeClosed(0, 80).boxed().toList());
        for(int i = 0; i < n * n; i++)
        {
            JButton b = new CircleButton(Color.WHITE, i);
            b.addActionListener(this);
            add(b);
        }
        comp = getComponents();
        randomThree();
    }

    public void randomThree()
    {
        Collections.shuffle(whiteButtons);
        for(int i = 0; i < 3; i++)
        {
            ((CircleButton)comp[whiteButtons.get(i)]).setColor(colorList[rand.nextInt(0,5)]);
            whiteButtons.remove(i);
        }
    }

    public void searchFifty(int num)
    {
        int i = num / _demention;
        int j = num % _demention;

        int count = 1;
        List<Integer> list = new ArrayList<>();

        CircleButton prevB = ((CircleButton) comp[j]);
        Color tempColor = prevB.getColor();
        list.add(prevB.getNumber());

        for(int k = j + _demention; k < _demention * _demention - (_demention - j) ; k+= _demention)
        {
            CircleButton currB = ((CircleButton) comp[k]);
            Color currColor = currB.getColor();
            if(currColor == tempColor)
            {
                count++;
                list.add(currB.getNumber());
            }
            else
            {
                count = 1;
                tempColor = currColor;
                list.clear();
                list.add(currB.getNumber());
            }
            if(count == 5)
            {
                score +=5;
                bleaching(list);
                count = 1;
                list.clear();
                list.add(currB.getNumber());
            }
        }

        count = 1;
        list.clear();
        prevB = ((CircleButton) comp[i]);
        tempColor = prevB.getColor();
        list.add(prevB.getNumber());

        for(int k = i + 1; k < _demention; k++)
        {
            CircleButton currB = ((CircleButton) comp[k]);
            Color currColor = currB.getColor();
            if(currColor == tempColor)
            {
                count++;
                list.add(currB.getNumber());
            }
            else
            {
                count = 1;
                tempColor = currColor;
                list.clear();
                list.add(currB.getNumber());
            }
            if(count == 5)
            {
                score +=5;
                bleaching(list);
                count = 1;
                list.clear();
                list.add(currB.getNumber());
            }
        }

    }

    public void bleaching(List<Integer> list)
    {
        for(int i = 0; i < list.size(); i++)
        {
            whiteButtons.add(list.get(i));
            ((CircleButton)comp[i]).setColor(Color.WHITE);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(prevButton != null)
        {
            CircleButton ourButton = ((CircleButton)e.getSource());
            if(prevButton.getColor() == Color.WHITE && ourButton.getColor() != Color.WHITE)
            {
                whiteButtons.remove((Integer) prevButton.getNumber());
                whiteButtons.add(ourButton.getNumber());
                prevButton.setColor(ourButton.getColor());
                ourButton.setColor(Color.WHITE);
                randomThree();
                searchFifty(prevButton.getNumber());
                prevButton = null;
            }
            else if(ourButton.getColor() == Color.WHITE && prevButton.getColor() != Color.WHITE)
            {
                whiteButtons.remove((Integer) ourButton.getNumber());
                whiteButtons.add(prevButton.getNumber());
                ourButton.setColor(prevButton.getColor());
                prevButton.setColor(Color.WHITE);
                prevButton = null;
                randomThree();
                searchFifty(ourButton.getNumber());
            }
            else
            {
                prevButton = null;
            }
        }
        else
        {
            prevButton = (CircleButton) e.getSource();
        }
    }



}
