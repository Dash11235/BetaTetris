import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Controller implements KeyListener {

    private static GamePanel gamePanel;
    private static View view;
    private static Model model;

    public Controller() {
        gamePanel = new GamePanel();
        view = new View(gamePanel, new PreviewPanel());
        model = new Model();
    }

    public static void main(String[] args) throws InterruptedException {
        new Controller();

        while(true)placePiece();
    }

    public static void placePiece() throws InterruptedException {

        Random random = new Random();

        gamePanel.setColor(random.nextInt(7));

        int rnd = random.nextInt(7);

        gamePanel.drawShape(rnd);
        model.addPiece(rnd);

        int end = rnd == 2 ? 19 : 18;

        for(int i = 0; i < end; i++){
            view.repaint();

            int[] p1 = {gamePanel.getShapeID()[0][0], gamePanel.getShapeID()[0][1]+40};
            int[] p2 = {gamePanel.getShapeID()[1][0], gamePanel.getShapeID()[1][1]+40};
            int[] p3 = {gamePanel.getShapeID()[2][0], gamePanel.getShapeID()[2][1]+40};
            int[] p4 = {gamePanel.getShapeID()[3][0], gamePanel.getShapeID()[3][1]+40};

            gamePanel.setShapeID(p1, p2, p3, p4);

            TimeUnit.MILLISECONDS.sleep(500);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
