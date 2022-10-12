import java.awt.*;
import java.awt.event.*;

public class CloseFrame1 extends Frame {
    Label label;
    CFListener cfl = new CFListener(this);

    public CloseFrame1(String title) {
        super(title);
        label = new Label("Close The Frame !");
        this.addWindowListener(cfl);
    }

    public void launchFrame() {
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        CloseFrame1 cf1 = new CloseFrame1("Close Window Example");
        cf1.launchFrame();
    }
}

// Inner Class
class CFListener extends WindowAdapter {
    CloseFrame1 ref;

    CFListener(CloseFrame1 ref) {
        this.ref = ref;
    }

    public void windowClosing(WindowEvent e) {
        ref.dispose();
        System.exit(1);
    }
}
