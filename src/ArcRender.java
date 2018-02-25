import java.awt.*;

/**
 * Created by lokesh y r on 2/21/2018.
 */
public class ArcRender {
    public static void main(String[] args) {
        StdDraw.setPenColor(Color.red);
        StdDraw.setPenRadius(0.006);
        StdDraw.arc(0.125,0.5,0.02,0.0,230.0);
        StdDraw.arc(0.125+(2*0.02),0.5,0.02,-30.0,-200.0);
        StdDraw.line(0.125-0.02,0.495,0.125+0.02,0.43);
        StdDraw.line(0.125+0.02,0.43,0.125+(3*0.02),0.495);
    }
}
