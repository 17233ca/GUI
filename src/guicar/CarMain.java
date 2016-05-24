/* 


 * Student Info: Name=AniketChoudhury, ID=Your17233

 * Subject: CS532B_HW01_SPRING_2016

 * Author: choud 

 * Filename: CarMain.java 

 * Date and Time: Jan 27, 2016 11:17:55 AM 

 * Project Name: GuiCar


 */
/**
 *
 * @author choud
 */
package guicar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class CarMain extends JFrame implements ActionListener{
      private CarModel model1=new CarModel();
      
      JFrame f=new JFrame();
     JPanel p=new JPanel();
     
        JButton conbtn=new  JButton("Controller");
        JButton viewbtn=new JButton("View");

        CarMain()
        {
        p.add(conbtn);
        p.add(viewbtn);
        add(p);
        setSize(300,200);
       setVisible(true);
        conbtn.addActionListener(this);
        viewbtn.addActionListener(this);

        }
    public static void main(String[] args) {
      CarMain cm=new CarMain();
      cm.setTitle("Car Design");    
      cm.setSize(600,400);
      cm.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

  if(e.getSource()==conbtn)
  {

      JFrame fc=new JFrame();
      fc.setTitle("Controller");
      CarController cc=new CarController();
      fc.add(cc);
      fc.setVisible(true);
      fc.setSize(600,400);
  }
    if(e.getSource()==viewbtn)
    {

      JFrame fc=new JFrame();
      fc.setTitle("View");
      CarView cv=new CarView(model1);
      fc.add(cv);
      fc.setVisible(true);
      fc.setSize(800,400);
    }

    }
}