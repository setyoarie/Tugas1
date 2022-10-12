import java.awt.*;
import java.awt.event.*;

import javax.swing.plaf.metal.MetalBorders.TextFieldBorder;

import org.w3c.dom.Text;

public class MouseEventsDemo extends Frame implements MouseListener, MouseMotionListener {

    TextField tf;

    public MouseEventsDemo(String title) {
        super(title);
        tf = new TextField(60);
        addMouseListener(this);
    }

    public void launchFrame() {
        // menambahkan komponen pada frame
        add(tf, BorderLayout.SOUTH);
        setSize(300, 300);
        setVisible(true);
    }

    public void mouseClicked(MouseEvents me) {
        String msg = "Mouse clicked";
        tf.setText(msg);
    }

    public void mouseEntered(MouseEvents me) {
        String msg = "Mouse entered component";
        tf.setText(msg);
    }

    // dan seterusnya lengkapi untuk overriding menthod nya
    public static void main(String[] args) {
        MouseEventsDemo med = new MouseEventsDemo("Mouse Event Demo");
        med.launchFrame();
    }
}