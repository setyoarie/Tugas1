import java.awt.*;
import java.awt.event.*;

public class CloseFrame2 extends Frame {
    Label label;

    CloseFrame2(String title) {
        super(title);
        label = new Label("Close the frame.");
        this.addWindowListener(new CFListener());
    }

    void launchFrame() {
        setSize(300, 300);
        setVisible(true);
    }

    class CFListener extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            dispose();
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        CloseFrame2 cf = new CloseFrame2("Close Window Example");
        cf.launchFrame();
    }
}
