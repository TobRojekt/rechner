import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RechnerTest 
{
    public static void main(String [] args) {

    JFrame f=new JFrame("Rechner"); 
   
        JButton plus=new JButton("+");    
        plus.setBounds(20,100,50, 50); 
        JButton minus=new JButton("-");    
        minus.setBounds(80,100,50, 50); 
        JButton mal=new JButton("*");    
        mal.setBounds(140,100,50, 50); 
        JButton geteilt=new JButton("/");    
        geteilt.setBounds(200,100,50, 50); 

        JButton plus2=new JButton("test +");    
        plus2.setBounds(20,160,50, 50); 

        JLabel label01 = new JLabel();        
        label01.setText("Input 1");
        label01.setBounds(10, 10, 100, 20);
        JLabel label02 = new JLabel();
        label02.setText("Input 2");
        label02.setBounds(10, 50, 100, 20); 

        JLabel label1 = new JLabel();
        label1.setBounds(210, 110, 200, 100);

        JTextField textfield1= new JTextField();
        textfield1.setBounds(110, 10, 130, 30);
        JTextField textfield2= new JTextField();
        textfield2.setBounds(110, 50, 130, 30); 

        f.add(label1);
        f.add(textfield1);
        f.add(textfield2);
        f.add(label01);
        f.add(label02);
        f.add(plus);   
        f.add(minus);
        f.add(mal);
        f.add(geteilt); 
        f.setSize(400,300);    
        f.setLayout(null);    
        f.setVisible(true);    
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   

        plus.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                label1.setText(Integer.parseInt(textfield1.getText()) + 
                " + " + 
                Integer.parseInt(textfield2.getText()) + 
                " = " + 
                (Integer.parseInt(textfield1.getText()) + 
                Integer.parseInt(textfield2.getText())));               
            }
          });      

        minus.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                label1.setText(Integer.parseInt(textfield1.getText()) + 
                " - " + 
                Integer.parseInt(textfield2.getText()) + 
                " = " + 
                (Integer.parseInt(textfield1.getText()) - 
                Integer.parseInt(textfield2.getText())));               
            }     
          });

        mal.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                label1.setText(Integer.parseInt(textfield1.getText()) + 
                " * " + 
                Integer.parseInt(textfield2.getText()) + 
                " = " + 
                (Integer.parseInt(textfield1.getText()) * 
                Integer.parseInt(textfield2.getText())));              
            }                     
          });
        geteilt.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                label1.setText(Integer.parseInt(textfield1.getText()) + 
                " / " + 
                Integer.parseInt(textfield2.getText()) + 
                " = " + 
                (Integer.parseInt(textfield1.getText()) / 
                Integer.parseInt(textfield2.getText())) + 
                " R " + 
                (Integer.parseInt(textfield1.getText()) % 
                Integer.parseInt(textfield2.getText())));               
            }                     
          });

    }



}

