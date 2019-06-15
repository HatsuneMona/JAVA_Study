import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {
    private JPanel MainPanel;
    private JTextField textfield;
    private JButton button;
    private JLabel label;

    public MainForm() {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textfield.getText().length()!=0){
                    label.setText(textfield.getText());
                    textfield.setText(null);
                }
                else{
                    label.setText("文本框内容为空");
                }
                textfield.requestFocus();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MainForm");
        frame.setContentPane(new MainForm().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
