import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FillWithRectangles {

  public static void mainDraw(Graphics graphics){
    // draw four different size and color rectangles.

    graphics.setColor(Color.red);
    graphics.drawRect(0,0,200,90);
    graphics.setColor(Color.blue);
    graphics.drawRect(0,92,200,90);
    graphics.setColor(Color.green);
    graphics.drawRect(0,184,200,90);


  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(300, 300));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}