import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingApplication extends JFrame implements ActionListener {
    private int numClick = 0;
    private JLabel lbl;
    private JButton btn;

    public SwingApplication() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 1));
        lbl = new JLabel("0");
        lbl.setHorizontalAlignment(JLabel.CENTER);
        add(lbl);
        btn = new JButton("I'm Swing Button");
        btn.addActionListener(this);
        add(btn);
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        numClick++;
        lbl.setText(String.valueOf(numClick));
    }

    public static void main(String[] args) {
        new SwingApplication();
    }
}
