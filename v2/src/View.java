import javax.swing.*;
import java.awt.*;

public class View extends JPanel {

    public View(JPanel gameField, JPanel preview){

        JFrame frame = new JFrame("Tetris");
        frame.setSize(new Dimension(1000, 940));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);

        this.setLayout(new GridLayout(1,2));

        JPanel leftPanel = new JPanel(new BorderLayout());
        leftPanel.add(gameField, BorderLayout.CENTER);

        JPanel rightPanel = new JPanel(new GridLayout(2,1));
        rightPanel.add(preview);

        // ADD SCORE HERE
        rightPanel.setBackground(Color.gray);

        this.add(leftPanel);
        this.add(rightPanel);
        frame.add(this);
    }
}
