import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyGUI extends JFrame implements ActionListener {
    JButton button;
    JTextField textField;

    MyGUI() {
        setLayout(new FlowLayout());
        setSize(300, 200);

        textField = new JTextField(15);
        button = new JButton("Click Me");

        add(textField);
        add(button);

        button.addActionListener(this);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        textField.setText("Hello from Swing!");
    }

    public static void main(String[] args) {
        new MyGUI();
    }
}
