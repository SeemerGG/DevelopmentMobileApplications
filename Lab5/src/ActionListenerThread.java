import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.util.List;

public class ActionListenerThread extends Thread implements ActionListener {
    static List<Color> color_list;
    Color color = null;
    public ActionListenerThread(Color color, String name){
        super(name);
        this.color = color;
        color_list.add(color);
    }

    public void run(){
        
    }
    @Override
    public void actionPerformed(ActionEvent e){

    }
}
