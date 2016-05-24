/* 


 * Student Info: Name=AniketChoudhury, ID=Your17233

 * Subject: CS532B_HW01_SPRING_2016

 * Author: choud 

 * Filename: CarController.java 

 * Date and Time: Jan 27, 2016 11:17:55 AM 

 * Project Name: GuiCar


 */
/**
 *
 * @author choud
 */
package guicar;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class CarController extends JPanel implements ActionListener{


    
   private CarModel model=new  CarModel();

    JPanel ConPanel;

    JLabel lengthlabel;

    JTextField length;

    JLabel heightlabel;

    JTextField height;

     JLabel wheelSizelabel;

    JTextField wheelSize;


     public CarController()
     {
       // Scanner sc = new Scanner(System.in);
       ConPanel=new JPanel(new GridLayout(11,1));

       lengthlabel =new JLabel("Length");
      // JLabel jl =new JLabel("Length");
       length=new JTextField(10);
       //int length = sc.nextInt();
       
       heightlabel=new JLabel("Height");
       //JLabel jl1=new JLabel("Height");
       height=new JTextField(10);
        //int height = sc.nextInt();
       
        wheelSizelabel=new JLabel("Wheel Size");
        wheelSize=new JTextField(10);
        //int wheelsize = sc.nextInt();
        
        
       JLabel l1=new JLabel("Body Color");

       JComboBox cb1=new JComboBox();

       cb1.addItem("Orange");

       cb1.addItem("Blue");

       cb1.addItem("Green");

       JLabel l2=new JLabel("Wheel Color");

       JComboBox cb2=new JComboBox();

       cb2.addItem("Pink");

       cb2.addItem("Yellow");

       cb2.addItem("Black");

    

       ConPanel.add(lengthlabel);

       ConPanel.add(height);

       ConPanel.add(heightlabel);

       ConPanel.add(length);

       ConPanel.add(wheelSizelabel);

       ConPanel.add(wheelSize);

       ConPanel.add(l1);

       ConPanel.add(cb1);

       ConPanel.add(l2);

       ConPanel.add(cb2);

       

         add(ConPanel);

            setVisible(true);

            setSize(300,200);

          
     }

     public CarController(CarModel model)
     {
         
           String ws=wheelSize.getText();
           int a =Integer.parseInt(ws);
          model.setWheelSize(a);
     }
    public CarModel getModel() {

        return model;
    }

    public void setModel(CarModel model) {

        this.model = model;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
      repaint();
    }
}