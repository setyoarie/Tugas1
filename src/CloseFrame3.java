import java.awt.*;
import java.awt.event.*;

public class CloseFrame3 extends Frame {
    Label label;

    CloseFrame3(String title) {
        super(title);
        label = new Label("Close the frame.");
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(1);
            }
        });
    }

    void launchFrame() {
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        CloseFrame3 cf = new CloseFrame3("Close Window Example");
        cf.launchFrame();
    }
}
