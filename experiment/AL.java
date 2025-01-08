import java.awt.*;
import java.awt.event.*;

public class AL extends Frame implements ActionListener {

    Button button;

    public AL() {
        setTitle("Test Window");
        setSize(400, 400);
        setLayout(new FlowLayout());

        button = new Button("Exit");
        add(button);
        button.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            System.exit(0);
        }
    }
}
