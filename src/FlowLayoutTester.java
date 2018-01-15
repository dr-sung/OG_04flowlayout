
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// Flow Layout Demo
public class FlowLayoutTester extends JFrame {

    private JButton upButton;
    private JButton downButton;

    public void initialize() {

        // contentPane's default layout manager --> Border Layout
        Container contentPane = getContentPane();

        upButton = new JButton("UP");
        downButton = new JButton("Down");

        ButtonObserver observer = new ButtonObserver();
        upButton.addActionListener(observer);
        downButton.addActionListener(observer);

        // Composite design pattern
        // Composite: JPanel
        // Leaf: JButton
        JPanel panel = new JPanel(); // JPanel's default layout manager: FlowLayout
        contentPane.add(panel, BorderLayout.SOUTH);
        panel.add(upButton); // use preferred size
        panel.add(downButton); // use preferred size
    }

    class ButtonObserver implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            Object source = event.getSource();
            if (source == upButton) {
                System.out.println("Up button pressed");
            } else if (source == downButton) {
                System.out.println("Down button pressed");
            } else {
                System.out.println("Mom! I need a new computer!");
            }
        }
    }
}
