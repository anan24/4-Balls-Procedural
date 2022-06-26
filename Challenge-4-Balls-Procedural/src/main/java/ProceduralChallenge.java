import processing.core.PApplet;

public class ProceduralChallenge extends PApplet{

    public static final int WIDTH = 648;
    public static final int HEIGHT = 488;
    public static final int DIAMETER = 10;

    int ball1Pos = 0;
    int ball2Pos = 0;
    int ball3Pos = 0;
    int ball4Pos = 0;
    int y = 0;

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
        super.setup();
    }

    @Override
    public void draw() {
        drawEllipse();
    }

    private void drawEllipse() {
        ellipse(ball1Pos,1*HEIGHT/5, DIAMETER, DIAMETER);
        ball1Pos++;
        ellipse(ball2Pos,2*HEIGHT/5, DIAMETER, DIAMETER);
        ball2Pos+=2;
        ellipse(ball3Pos,3*HEIGHT/5, DIAMETER, DIAMETER);
        ball3Pos+=3;
        ellipse(ball4Pos,4*HEIGHT/5, DIAMETER, DIAMETER);
        ball4Pos+=4;
    }

    private void paintBackground() {
        background(255);
    }

}
