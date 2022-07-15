import java.io.*;  
import java.awt.event.*;  
import java.awt.*;    
import javax.swing.*;  
public class gemubase {  
public static void main(String[] args) {  
Image icon = Toolkit.getDefaultToolkit().getImage("logo.png");    
JFrame f=new JFrame();//creating instance of JFrame  
f.setTitle("Gemu - More Options");
f.setIconImage(icon);    
          
JButton b=new JButton("Install Node.js");//creating instance of JButton   
b.setBounds(130,100,150, 40);//x axis, y axis, width, height  

JButton b1=new JButton("Install Harp");//creating instance of JButton   
b1.setBounds(130,150,150, 40);//x axis, y axis, width, height  

JButton b2=new JButton("Documentation");//creating instance of JButton   
b2.setBounds(130,200,150, 40);//x axis, y axis, width, height  

JButton b3=new JButton("Controls");//creating instance of JButton   
b3.setBounds(130,250,150, 40);//x axis, y axis, width, height  

JButton b4=new JButton("Attribution");//creating instance of JButton   
b4.setBounds(130,300,150, 40);//x axis, y axis, width, height  

b.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
        String anyCommand="start https://nodejs.org";
        try {
            Runtime.getRuntime().exec("cmd /c start cmd.exe /K " + anyCommand);
    
        } catch (IOException ee) {
            ee.printStackTrace();
        }
    }  
    
    });

b1.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
        String anyCommand="npm install -g harp";
        try {
            Runtime.getRuntime().exec("cmd /c start cmd.exe /K " + anyCommand);
    
        } catch (IOException ee) {
            ee.printStackTrace();
        }
    }  
    
    });

b2.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
        String anyCommand="start https://gemudocumentation-0169.notaku.site/";
        try {
            Runtime.getRuntime().exec("cmd /c start cmd.exe /K " + anyCommand);
        
        } catch (IOException ee) {
            ee.printStackTrace();
        }
    }  
        
    });

    b3.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
            String anyCommand="start Controls.chm";
            try {
                Runtime.getRuntime().exec("cmd /c start cmd.exe /K " + anyCommand);
            
            } catch (IOException ee) {
                ee.printStackTrace();
            }
        }  
            
        });

        b4.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                String anyCommand="start Attributions.chm";
                try {
                    Runtime.getRuntime().exec("cmd /c start cmd.exe /K " + anyCommand);
                
                } catch (IOException ee) {
                    ee.printStackTrace();
                }
            }  
                
            });
          
f.add(b);//adding button in JFrame  
f.add(b1);//adding button in JFrame  
f.add(b2);//adding button in JFrame  
f.add(b3);//adding button in JFrame  
f.add(b4);//adding button in JFrame  
          
f.setSize(420,490);//400 width and 500 height  
f.setLayout(null);//using no layout managers  
f.setVisible(true);//making the frame visible  
}  
}  