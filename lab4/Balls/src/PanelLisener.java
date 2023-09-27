import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class PanelLisener implements ActionListener
{
    CircleButton prevButton = null;
    Component[] components;
    List<Integer> whiteButtons;

    Color[] colorList = new Color[] {
            new Color(121, 227, 248),
            new Color(161, 166, 250),
            new Color(229, 83, 124),
            new Color(222, 166, 41),
            new Color(31, 248, 155)
    };

    public PanelLisener(Component[] comp, List<Integer> whites)
    {
        components = comp;
        whiteButtons = whites;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(prevButton != null)
        {
            CircleButton ourButton = ((CircleButton) e.getSource());
            if(prevButton.getColor() == Color.WHITE && ourButton.getColor() != Color.WHITE ||
                    ourButton.getColor() == Color.WHITE && prevButton.getColor() != Color.WHITE)
            {
                Color temp = prevButton.getColor();
                prevButton.setColor(ourButton.getColor());
                ourButton.setColor(temp);
                prevButton = null;
            }
            else
            {
                prevButton = null;
            }
        }
        else
        {
            prevButton = ((CircleButton) e.getSource());
        }
    }



}
