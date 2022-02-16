import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class GamePanel extends JPanel {

    private Map<Character, Color> colorMap;
    private static char[][] toDraw = {};

    public GamePanel(){


        this.setSize(400, 800);
        this.setBackground(Color.darkGray);

        colorMap = new HashMap<>()
        {{
            put('C', Color.cyan);
            put('B', Color.blue);
            put('O', Color.orange);
            put('Y', Color.yellow);
            put('G', Color.green);
            put('M', Color.magenta);
            put('R', Color.red);
            put(' ', Color.black);
        }};
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graphics2D = (Graphics2D) g.create();

        int x = 50;
        int y = 50;

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                graphics2D.setColor(Color.black);
                graphics2D.fillRect(x, y, 40, 40);
                x += 40;
            }
            x = 50;
            y += 40;
        }
    }

//    private Map<int[][], Integer> shapeMap = new HashMap<>();
//
//    private int[][] shapeID;
//
//    private boolean place;
//
//    private int color;
//
//
//    @Override
//    public void paintComponent(Graphics g){
//        super.paintComponent(g);
//        Graphics2D graphics2D = (Graphics2D) g.create();
//
//        int x = 50;
//        int y = 50;
//
//        for(int i = 0; i < 20; i++){
//            for(int j = 0; j < 10; j++) {
//                graphics2D.setColor(Color.black);
//                graphics2D.fillRect(x, y, 40, 40);
//                x+=40;
//            }
//            x=50;
//            y+=40;
//        }
//
//        for(int i = 0; place && (i < 4); i++){
//            for (Map.Entry<int[][], Integer> entry : shapeMap.entrySet()) {
//                switch (entry.getValue()) {
//                    case 0:
//                        graphics2D.setColor(Color.cyan);
//                        break;
//                    case 1:
//                        graphics2D.setColor(Color.blue);
//                        break;
//                    case 2:
//                        graphics2D.setColor(Color.orange);
//                        break;
//                    case 3:
//                        graphics2D.setColor(Color.yellow);
//                        break;
//                    case 4:
//                        graphics2D.setColor(Color.green);
//                        break;
//                    case 5:
//                        graphics2D.setColor(Color.magenta);
//                        break;
//                    case 6:
//                        graphics2D.setColor(Color.RED);
//                        break;
//                }
//                graphics2D.fillRect(entry.getKey()[i][0], entry.getKey()[i][1], 40, 40);
//            }
//        }
//    }
//
//    public void drawShape(int shape){
//        place = true;
//        switch(shape) {
//            case 0:
//                shapeID = new int[][]{
//                        {210, 50},
//                        {250, 50},
//                        {290, 50},
//                        {210, 90}
//                };
//                break;
//            case 1:
//                shapeID = new int[][]{
//                        {210, 50},
//                        {250, 50},
//                        {290, 50},
//                        {290, 90}
//                };
//                break;
//            case 2:
//                shapeID = new int[][]{
//                        {170, 50},
//                        {210, 50},
//                        {250, 50},
//                        {290, 50}
//                };
//                break;
//            case 3:
//                shapeID = new int[][]{
//                        {210, 50},
//                        {250, 50},
//                        {210, 90},
//                        {250, 90}
//                };
//                break;
//            case 4:
//                shapeID = new int[][]{
//                        {210, 90},
//                        {250, 90},
//                        {250, 50},
//                        {290, 50}
//                };
//                break;
//            case 5:
//                shapeID = new int[][]{
//                        {210, 50},
//                        {250, 50},
//                        {250, 90},
//                        {290, 90}
//                };
//                break;
//            case 6:
//                shapeID = new int[][]{
//                        {250, 50},
//                        {210, 90},
//                        {250, 90},
//                        {290, 90}
//                };
//                break;
//        }
//        shapeMap.put(shapeID, color);
//    }
//
//    public void setColor(int color){
//        this.color = color;
//    }
//
//    public void setShapeID(int[] p1, int[] p2, int[] p3, int[] p4){
//        shapeID[0] = p1;
//        shapeID[1] = p2;
//        shapeID[2] = p3;
//        shapeID[3] = p4;
//    }
//
//    public int[][] getShapeID(){
//        return shapeID;
//    }

}
