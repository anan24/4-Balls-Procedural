import processing.core.PApplet;

public class ProceduralChallenge extends PApplet{

    public static final int WIDTH = 648;
    public static final int HEIGHT = 488;
    public static final int DIAMETER = 10;

    int x = 0;
    int y = 0;

    int initialSpeed = 1;

    public static void main(String[] args) {
        PApplet.main("ProceduralChallenge",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
//        super.setup();
//        ellipse(WIDTH/2,HEIGHT/2,100,100);
    }

    @Override
    public void draw() {
//        super.draw();
//        paintBackground(); //as soon as you move the mouse the backgruond is coloured white and the other ellipses disappear

        drawEllipse(1);
        drawEllipse(2);
        drawEllipse(3);
        drawEllipse(4);
    }

    private void drawEllipse(int ballNo) {
//        ellipse(mouseX,mouseY, DIAMETER, DIAMETER);
        y = (ballNo*HEIGHT)/5;
        ellipse(x*ballNo,y, DIAMETER, DIAMETER);
        x++;
    }

    private void paintBackground() {
        background(255);
    }

}
