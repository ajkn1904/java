//       OOP Assignment, 1904_Anika
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JOptionPane;

public class MsgLstnr implements ActionListener {

  JLabel lbl1, lbl2;
  JTextField txt1, txt2;
  JButton button1, button2, button3, button4;

  MsgLstnr() {
    JFrame frm = new JFrame();

    JLabel lbl1 = new JLabel("1st Input: ");
    JLabel lbl2 = new JLabel("2nd Input: ");

    txt1 = new JTextField(15);
    txt2 = new JTextField(15);

    frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frm.setSize(new Dimension(200, 100));
    frm.setTitle("Frame Calculator");

    button1 = new JButton();
    button1.setText("SUM");
    button2 = new JButton();
    button2.setText("AVERAGE");
    button3 = new JButton();
    button3.setText("MAXIMUM");
    button4 = new JButton();
    button4.setText("MINIMUM");

    button1.addActionListener(this);
    button2.addActionListener(this);
    button3.addActionListener(this);
    button4.addActionListener(this);

    frm.add(lbl1);
    frm.add(txt1);
    frm.add(lbl2);
    frm.add(txt2);

    frm.add(button1);
    frm.add(button2);
    frm.add(button3);
    frm.add(button4);

    frm.setSize(500, 300);
    frm.setLocation(new Point(400, 100));
    frm.setLayout(new FlowLayout());
    //frm.pack();
    frm.setVisible(true);
  }

  public void actionPerformed(ActionEvent event) {
    String a = txt1.getText();
    String b = txt2.getText();
    double inpt1, inpt2;
    try {
      inpt1 = Double.parseDouble(a);
      inpt2 = Double.parseDouble(b);

      if (event.getSource() == button1) {
        double sum;
        sum = (inpt1 + inpt2);
        JOptionPane.showMessageDialog(null, "Sum is: " + (sum));
      } else if (event.getSource() == button2) {
        double avg;
        avg = (inpt1 + inpt2) / 2;
        JOptionPane.showMessageDialog(null, "Average is: " + (avg));
      } else if (event.getSource() == button3) {
        if (inpt1 > inpt2) JOptionPane.showMessageDialog(
          null,
          "Maximum is: " + (inpt1)
        ); else JOptionPane.showMessageDialog(null, "Maximum is: " + (inpt2));
      } else if (event.getSource() == button4) {
        if (inpt1 < inpt2) JOptionPane.showMessageDialog(
          null,
          "Minimum is: " + (inpt1)
        ); else JOptionPane.showMessageDialog(null, "Minimum is: " + (inpt2));
      }
    } catch (Exception e) {
      JOptionPane.showMessageDialog(
        null,
        "Input should be numerical. Please try again.",
        "Error",
        JOptionPane.ERROR_MESSAGE
      );
    }
  }

  public static void main(String[] args) {
    new MsgLstnr();
  }
}
