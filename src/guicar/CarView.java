/* 


 * Student Info: Name=AniketChoudhury, ID=Your17233

 * Subject: CS532B_HW01_SPRING_2016

 * Author: choud 

 * Filename: CarView.java 

 * Date and Time: Jan 27, 2016 11:17:55 AM 

 * Project Name: GuiCar


 */
/**
 *
 * @author choud
 */
package guicar;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class CarView extends JPanel {
    private CarModel model=new CarModel();
    int rect_width;
    int rect_height;
    int oval_width;
    int oval_height;
    JPanel p=new JPanel();

    public CarView(CarModel model1)
    {
    model=model1;
        add(p);
        setVisible(true);

        System.out.println(rect_height);
        System.out.println(model.getWheelSize());
         System.out.println(model1.getHeight());
        repaint();
    }

    public CarModel getModel() {
        return model;
    }

    public void setModel(CarModel model) {
        this.model = model;
    }
    //public void 
    public void paintComponent(Graphics g)
    {
        
        super.paintComponent(g);
        g.setColor(Color.ORANGE);
        g.fillRect(150, 150,model.getWidth(), model.getHeight());
        g.setColor(Color.BLACK);
        g.fillOval(250, 250,model.getWheelSize(),model.getWheelSize());
        g.fillOval(550,250,model.getWheelSize(),model.getWheelSize());

}    


}

    

