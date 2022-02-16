import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Controller implements KeyListener {

    private GamePanel gamePanel;
    private View view;
    private Model model;

    private int x = 0;
    private int y = 0;
    private int rot = 0;

    public Controller() throws InterruptedException {
        gamePanel = new GamePanel();
        view = new View(gamePanel, new PreviewPanel());
        model = new Model();

        while(true)placePiece();
    }

    public static void main(String[] args) throws InterruptedException {
        new Controller();
    }

    public void placePiece() throws InterruptedException {

        Random random = new Random();

        int rndShape = random.nextInt(7);
        int color = random.nextInt(7);

        for(int i = 0; i < (rndShape == 2 ? 20 : 19); i++){

            // *** UPDATE ***

            model.addPiece(rndShape, color, y, x, rot);
            model.remPiece(rndShape, y, x, rot);

            TimeUnit.MILLISECONDS.sleep(500);
            y++;
        }
        model.addPiece(rndShape, color, y-1, x, rot);

        x = 0;
        y = 0;
        rot = 0;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
