
import javax.swing.JFrame;


public class Main {
    public static void main(String[] args) {
        FlowLayoutTester frame = new FlowLayoutTester();
        frame.initialize();
        frame.setSize(500, 300);
        frame.setTitle("Flow Layout Demo");
        frame.setLocation(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
