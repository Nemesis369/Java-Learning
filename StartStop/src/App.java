package StartStop.src;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class StartAndStop {
    private JFrame frame;
    private javax.swing.Timer timer;

    public StartAndStop() {
        frame = new JFrame("StartAndStop");

        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 600);

        JButton button1 = new JButton("Start");
        JButton button2 = new JButton("Stop");

        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("+1");
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timer.start();
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (timer.isRunning()) {
                    timer.stop();
                    System.out.println("Stopped");
                    return;
                }
                System.out.println("Not Running");
            }
        });

        frame.add(button1);
        frame.add(button2);

        frame.setVisible(true);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        new StartAndStop();
    }
}
