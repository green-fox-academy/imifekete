import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class Board extends JComponent implements KeyListener {

  int testBoxX = 0;
  int testBoxY = 0;

  public static final int DIMENSION = 72;

  int[][] tilesMap = new int[][]{
          {0, 0, 0, 1, 0, 1, 0, 0, 0, 0,},
          {0, 0, 0, 1, 0, 1, 0, 1, 1, 0,},
          {0, 1, 1, 1, 0, 1, 0, 1, 1, 0,},
          {0, 0, 0, 0, 0, 1, 0, 0, 0, 0,},
          {1, 1, 1, 1, 0, 1, 1, 1, 1, 0,},
          {0, 0, 0, 1, 0, 1, 0, 0, 0, 0,},
          {0, 0, 0, 1, 0, 1, 0, 1, 1, 0,},
          {0, 1, 1, 1, 0, 1, 0, 1, 1, 0,},
          {0, 0, 0, 0, 0, 1, 0, 0, 0, 0,},
          {1, 1, 1, 1, 0, 1, 1, 1, 1, 0,},
          {1, 1, 1, 1, 0, 1, 1, 1, 1, 0,}
  };

  public Board() {
    setPreferredSize(new Dimension(DIMENSION *10, DIMENSION * 11));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    PositionedImage hero = new PositionedImage("pictures/hero-down.png", testBoxX, testBoxY);

    int posX = 0;
    int posY = 0;
    for (int i = 0; i < 11; i ++) {
      for (int j = 0; j < 10; j ++) {
        if (tilesMap[i][j] == 0) {
          PositionedImage image = new PositionedImage("Pictures/floor.png", posX, posY);
          image.draw(graphics);
        }else{
          PositionedImage image = new PositionedImage("Pictures/wall.png", posX, posY);
          image.draw(graphics);
        }
        posX +=DIMENSION;
      }
      posX = 0;
      posY += DIMENSION;
    }
    hero.draw(graphics);
  }

  // To be a KeyListener the class needs to have these 3 methods in it
  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {

  }

  // But actually we can use just this one for our goals here
  @Override
  public void keyReleased(KeyEvent e) {
    // When the up or down keys hit, we change the position of our box
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      testBoxY -= 72;
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      testBoxY += 72;
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      testBoxY += 72;
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      testBoxY += 72;
      // and redraw to have a new picture with the new coordinates
      repaint();
    }
  }
}