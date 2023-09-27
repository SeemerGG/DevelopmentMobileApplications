import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ButtonListener implements ActionListener
{
    CircleButton prevButton = null;
    Component[] components;
    List<Integer> whiteButtons;

    Battlefield battlefield = null;

    public ButtonListener(Battlefield b)
    {
        battlefield = b;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(prevButton != null) {
            CircleButton ourButton = ((CircleButton)e.getSource());
            if(prevButton.getColor() == Color.WHITE && ourButton.getColor() != Color.WHITE ||
                    ourButton.getColor() == Color.WHITE && prevButton.getColor() != Color.WHITE)
            {
                Color temp = prevButton.getColor();
                prevButton.setColor(ourButton.getColor());
                ourButton.setColor(temp);
                prevButton = null;
            }
            else {
                prevButton = null;
            }
        }
        else {
            prevButton = (CircleButton) e.getSource();
        }
    }
}
