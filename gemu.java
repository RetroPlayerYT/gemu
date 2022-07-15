import java.io.*;  
import java.awt.event.*;  
import java.awt.*;    
import javax.swing.*;  
public class gemu {  
public static void main(String[] args) {  
Image icon = Toolkit.getDefaultToolkit().getImage("logo.png");    
JFrame f=new JFrame();//creating instance of JFrame  
f.setTitle("Gemu");
f.setIconImage(icon);    

JLabel label = new JLabel("Welcome to Gemu");
label.setBounds(130,50,130, 40);

JLabel label1 = new JLabel("-Other-");
label1.setBounds(158,235,130, 40);
          
JButton b=new JButton("Slot 1");//creating instance of JButton  
b.setBounds(130,100,100, 40);//x axis, y axis, width, height  

JButton b1=new JButton("Slot 2");//creating instance of JButton  
b1.setBounds(130,150,100, 40);//x axis, y axis, width, height  

JButton b2=new JButton("Slot 3");//creating instance of JButton  
b2.setBounds(130,200,100, 40);//x axis, y axis, width, height  

JButton b3=new JButton("More...");//creating instance of JButton  
b3.setBounds(130,270,100, 40);//x axis, y axis, width, height  
          
f.add(b);//adding button in JFrame  
f.add(b1);//adding button in JFrame  
f.add(b2);//adding button in JFrame  
f.add(b3);//adding button in JFrame  
f.add(label);//adding button in JFrame  
f.add(label1);//adding button in JFrame  
          
f.setSize(380,420);//400 width and 500 height  
f.setLayout(null);//using no layout managers  
f.setVisible(true);//making the frame visible  


b.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){  
    String anyCommand="start run1.cmd";
    try {
        Runtime.getRuntime().exec("cmd /c start cmd.exe /K " + anyCommand);

    } catch (IOException ee) {
        ee.printStackTrace();
    }
}  

});

b1.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
        String anyCommand="start run2.cmd";
        try {
            Runtime.getRuntime().exec("cmd /c start cmd.exe /K " + anyCommand);
    
        } catch (IOException ee) {
            ee.printStackTrace();
        }
    }  
    
    });

b2.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
        String anyCommand="start run3.cmd";
        try {
            Runtime.getRuntime().exec("cmd /c start cmd.exe /K " + anyCommand);
        
        } catch (IOException ee) {
                ee.printStackTrace();
        }
    }  
        
    });

    b3.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
            String anyCommand="java -jar setup.jar";
            try {
                Runtime.getRuntime().exec("cmd /c start cmd.exe /K " + anyCommand);
            
            } catch (IOException ee) {
                    ee.printStackTrace();
            }
        }  
            
        });

} }