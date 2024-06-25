package program;
import javax.swing.JFrame;
import java.awt.*;


public class p1frame extends JFrame {

    p1frame() {
        initWindow();
    }

    public void initWindow() {
        this.setTitle("Tren-gram");
        this.getContentPane().setBackground(new Color(23, 23, 23));
        this.setSize(1280, 720);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}








