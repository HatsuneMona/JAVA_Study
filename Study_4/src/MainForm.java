import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {
    private JPanel MainPanel;
    private JTextField 汪汪汪;
    private JButton 嘤嘤嘤;
    private JLabel 喵喵喵;

    public MainForm() {
        嘤嘤嘤.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(汪汪汪.getText().length()!=0){
                    喵喵喵.setText(汪汪汪.getText());
                    汪汪汪.setText(null);
                }
                else{
                    喵喵喵.setText("文本框内容为空");
                }
                汪汪汪.requestFocus();
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
