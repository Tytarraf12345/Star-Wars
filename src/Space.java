import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import java.util.Timer;
import java.util.TimerTask;

public class Space extends JPanel {
   final int marginX;
   final int marginY;
   private Hero hero;
   private Enemy enemy ;
   private Timer timer;

public Space() {
    super();
    marginX = 1;
    marginY = 1;
    hero = new Hero(600, 480, Color.YELLOW, 20 , "Ty");
    enemy = new Enemy (200,200, Color.RED, 20,"Enemy");
     timer = new Timer();
     timer.scheduleAtFixedRate(new ScheduleTask(), 100, 100);
    
}
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.BLACK);
        
        g.setColor(Color.YELLOW);
        drawStars(g);
        
        hero.draw(g);
        enemy.draw(g);
     
       //g.dispose();  
    }
        private class ScheduleTask extends TimerTask {
    
        @Override
        public void run() {
            
        hero.update();
        enemy.update();
        repaint();
        }
    }
   
        
        
        
    public void run () {
        
        repaint();
    }
    public void keyPressed (KeyEvent e){
        
        if (e.getKeyCode()  == KeyEvent.VK_RIGHT) {
             hero.setDX(5);
        }
        run ();
        
        if (e.getKeyCode()  == KeyEvent.VK_LEFT) {
             hero.setDX(-5);
        }
        run ();
        
        if (e.getKeyCode()  == KeyEvent.VK_UP) {
            hero.setDY(-5);
        }
        run ();
        
        if (e.getKeyCode()  == KeyEvent.VK_DOWN) {
            hero.setDY(5);
        }
        run ();
        
    }
    
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT)
            hero.setDX(0);
       
        if (e.getKeyCode() == KeyEvent.VK_LEFT)
            hero.setDX(0);
       
        if (e.getKeyCode() == KeyEvent.VK_UP)
            hero.setDY(0);
       
        if (e.getKeyCode() == KeyEvent.VK_DOWN)
            hero.setDY(0);
    }
    
    
    
    
    private void drawStars(Graphics g) {
       int random = 0;
        int x = 0;
        int y = 0;
     
        for (int i = 0; i < 500; i++) {
           int color = (int)(Math.random()*6 +1);
           if(color == 1) {
                g.setColor(Color.CYAN);
            }
           else if(color == 2){
                g.setColor(Color.YELLOW);
            }
            else if(color == 3) {
                g.setColor(Color.RED);
            }
           else if(color == 4) {
                g.setColor(Color.WHITE);
            }
           else if(color == 5) {
                g.setColor(Color.MAGENTA);
           }
           

            
            
          x = (int) (Math.random() * 1100);
          y = (int) (Math.random() * 860);
          
          g.fillOval(x, y, 2, 2);
          
          System.out.println (x+" "+y);
          if ( x > 1100 || y > 860) {
              break;
          }
    }
    }
        
    /**
     * Makes the hero and enemy bounce off walls
     */    
    private void wallCollissions() {
        //TODO Implement this method
    }
}
