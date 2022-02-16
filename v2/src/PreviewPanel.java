import javax.swing.*;
import java.awt.*;

public class PreviewPanel extends JPanel {

    public PreviewPanel(){
        this.setSize(400, 370);
        this.setBackground(Color.darkGray);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D graphics2D = (Graphics2D) g.create();


    }

}