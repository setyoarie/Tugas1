import java.awt.*;
import java.awt.event.*;

public class CloseFrame extends Frame implements WindowListener {
    Label label;

    // konstrutor
    CloseFrame(String title) {
        super(title); // title pada frame
        // event source
        label = new Label("Tutup Frame"); // membuat label
        // Event listener
        this.addWindowListener(this);
    }

    // membuat frame
    void launchFrame() {
        setSize(300, 300);
        setVisible(true);
    }

    // event handler
    // Override
    public void windowActivated(WindowEvent e) {
    }

    public void windowClosed(WindowEvent e) {
    }

    public void windowClosing(WindowEvent e) {
        setVisible(false);
        System.exit(0);
    }

    public void windowDeactivated(WindowEvent e) {
    }

    public void windowDeiconified(WindowEvent e) {
    }

    public void windowIconified(WindowEvent e) {
    }

    public void windowOpened(WindowEvent e) {
    }

    public static void main(String[] args) {
        CloseFrame close = new CloseFrame("Tester Close Frame");
        close.launchFrame();
    }
}
