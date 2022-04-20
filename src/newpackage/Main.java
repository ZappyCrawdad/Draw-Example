
package newpackage;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        
        JFrame aplication = new JFrame("aplicación de dibujo simple");
        Dibujo paintPanel = new Dibujo();
        aplication.add(paintPanel, BorderLayout.CENTER);
        aplication.add(new JLabel("Draw the mouse to draw"), BorderLayout.SOUTH);
        
        aplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplication.setSize(400, 200);
        aplication.setVisible(true);
    }
    //Ejemplo del Libro
}
