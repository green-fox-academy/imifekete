import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DrawingBox {

  public static void mainDraw(Graphics graphics){
    // draw a box that has different colored lines on each edge.

    graphics.setColor(Color.BLUE);
    graphics.drawLine(20, 20, 200, 20);
    graphics.setColor(Color.CYAN);
    graphics.drawLine(200, 20, 200, 250);
    graphics.setColor(Color.magenta);
    graphics.drawLine(200, 250, 20, 250);
    graphics.setColor(Color.red);
    graphics.drawLine(20, 250, 20, 20);





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