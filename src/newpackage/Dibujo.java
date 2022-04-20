
package newpackage;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.*;

public class Dibujo extends JPanel{
    
    private int pointCount = 0;
    private Point[] puntos = new Point[100000000];
    
    public Dibujo(){
        
        addMouseMotionListener(new MouseMotionAdapter() {
            
            @Override
            public void mouseDragged(MouseEvent evento){
                if(pointCount < puntos.length){
                    puntos[pointCount] = evento.getPoint();
                    ++pointCount;
                    repaint();
                }
            }
        });
    }
    
    @Override
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        for(int i = 0; i < pointCount; i++){
            g.fillOval(puntos[i].x,puntos[i].y, 4, 4);
        }
    }
}
