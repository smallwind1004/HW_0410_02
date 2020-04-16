import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.event.*;

public class MainFrame extends JFrame {
    private JLabel jlb = new JLabel("@_@");
    private JButton jbtn_push = new JButton("push");
    private JButton jbtn_sub = new JButton("sub");
    private Container cp;
    private int x = 1;

    public MainFrame() {
        init();
    }

    private void init() {
        this.setSize(500, 400);
        this.setLocation(100, 100);
        this.setTitle("Demo Window");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        cp = this.getContentPane();
        cp.setLayout(null);
        // jlb.setLocation(100, 50);
        // jlb.setSize(120, 25);
        jlb.setBounds(150, 50, 120, 25);
        cp.add(jlb);

        jbtn_push.setBounds(50, 50, 80, 25);
        jbtn_sub.setBounds(300, 50, 80, 25);
        cp.add(jbtn_push);
        cp.add(jbtn_sub);
        jbtn_push.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                x++;
                jlb.setText(Integer.toString(x));
            }
        });
        jbtn_sub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                x--;
                jlb.setText(Integer.toString(x));
            }
        });
    }
}