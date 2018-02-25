/**
 * Created by lokesh y r on 2/21/2018.
 */
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.RenderingHints;
import java.awt.Toolkit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import java.awt.image.BufferedImage;
import java.awt.image.DirectColorModel;
import java.awt.image.WritableRaster;

import java.io.File;
import java.io.IOException;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.LinkedList;
import java.util.TreeSet;
import java.util.NoSuchElementException;
import javax.imageio.ImageIO;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.util.Scanner;

public class HeartDraw {

    public static void HeartShapeRenderer()
    {

        double[] xcoor={0.1058,0.1846,0.125+(1*0.02)};
        double[] ycoor={0.495,0.495,0.439};
        StdDraw.setCanvasSize(1000, 1000);
        StdDraw.clear(Color.cyan);
        StdDraw.setPenColor(Color.RED);
        StdDraw.setPenRadius(0.006);
        StdDraw.filledCircle(0.125,0.5,0.02);
        StdDraw.filledCircle((0.125+(2*0.02)),0.5,0.02);
        StdDraw.filledPolygon(xcoor,ycoor);
    }
    public static void HeartShapeWithBorder(int n)
    {
        int j=n;
        double devn=0.0015;
        HeartShapeRenderer();

            while(j!=0)
            {
                double diff=(0.02/(j*3));
                double diffrad=0.02+diff;
                double angdiff=diffrad/360.0;
                StdDraw.arc(0.1253,0.5,diffrad+devn,0.0+angdiff,230.0+angdiff);
                StdDraw.arc(0.125+(2*0.02),0.5,diffrad+devn,-30.0+angdiff,-210.0+angdiff);
                StdDraw.line(0.125-diffrad+devn,0.4835,0.125+diffrad+devn,0.43);
                StdDraw.line(0.125+diffrad+devn,0.43,0.125+(3*(diffrad)),0.5-(0.875*devn));
                j--;
            }

    }

    public static void main(String[] args) {
       Scanner ip=new Scanner(System.in);
       int param=ip.nextInt();
       HeartShapeWithBorder(param);
    }
}
