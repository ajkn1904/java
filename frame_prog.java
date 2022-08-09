import java.awt.*;
import java.awt.event.*;
import javax.swing.*;




class MsgLstnr implements ActionListener{

    public void actionPerformed(ActionEvent event){
        String txt1 = JOptionPane.showInputDialog(null, "First Input:");
        String txt2 = JOptionPane.showInputDialog(null, "Second Input:");
        try{
     double inpt1 = Double.parseDouble(txt1);
     double inpt2 = Double.parseDouble(txt2);

        JOptionPane.showMessageDialog(null, "Sum is: " +(inpt1+inpt2));
    }
    catch(Exception ob){
        JOptionPane.showMessageDialog(null, "Input should be numerical. Please try again.");
    }
}
}
class MsgLstnr2 implements ActionListener{

    public void actionPerformed(ActionEvent event){
        String txt1 = JOptionPane.showInputDialog(null, "First Input:");
        String txt2 = JOptionPane.showInputDialog(null, "Second Input:");
        try{
     double inpt1 = Double.parseDouble(txt1);
     double inpt2 = Double.parseDouble(txt2);

     double avg= (inpt1+inpt2)/2;
        JOptionPane.showMessageDialog(null, "Average is: " +(avg));
    }   
    
    catch(Exception ob){
        JOptionPane.showMessageDialog(null, "Input should be numerical. Please try again.");
    }   }
}
class MsgLstnr3 implements ActionListener{

    public void actionPerformed(ActionEvent event){
        String txt1 = JOptionPane.showInputDialog(null, "First Input:");
        String txt2 = JOptionPane.showInputDialog(null, "Second Input:");
    try{  
     double inpt1 = Double.parseDouble(txt1); 
     double inpt2 = Double.parseDouble(txt2);

        
     if(inpt1>inpt2){
        JOptionPane.showMessageDialog(null, "Maximum is: " +(inpt1));
     }
     else
     JOptionPane.showMessageDialog(null, "Maximum is: " +(inpt2));
   }
catch(Exception ob){
    JOptionPane.showMessageDialog(null, "Input should be numerical. Please try again.");
} }
}
class MsgLstnr4 implements ActionListener{

    public void actionPerformed(ActionEvent event){
        String txt1 = JOptionPane.showInputDialog(null, "First Input:");
        String txt2 = JOptionPane.showInputDialog(null, "Second Input:");
        try{
     double inpt1 = Double.parseDouble(txt1);
     double inpt2 = Double.parseDouble(txt2);

     if(inpt1<inpt2){
        JOptionPane.showMessageDialog(null, "Minimum is: " +(inpt1));
     }
     else
     JOptionPane.showMessageDialog(null, "Minimum is: " +(inpt2));
    } 
    catch(Exception ob){
        JOptionPane.showMessageDialog(null, "Input should be numerical. Please try again.");
    } }

}


public class frame_prog{
    public static void main(String[] args) {
      
      JFrame frm= new JFrame();
      frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frm.setSize(new Dimension(300,100));
      frm.setTitle("My Frame");

      

     
      JButton button1 = new JButton();
      button1.setText("SUM");
      
      frm.add(button1);


     
      JButton button2 = new JButton();
      button2.setText("AVERAGE");
      
      frm.add(button2);


     
      JButton button3 = new JButton();
      button3.setText("MAXIMUM");
      
      frm.add(button3);
      
      
      
      JButton button4 = new JButton();
      button4.setText("MINIMUM");
      
      frm.add(button4);

      frm.setLayout(new FlowLayout());

      button1.addActionListener(new MsgLstnr());
      button2.addActionListener(new MsgLstnr2());
      button3.addActionListener(new MsgLstnr3());
      button4.addActionListener(new MsgLstnr4());


     
      frm.setVisible(true);

    }
} 