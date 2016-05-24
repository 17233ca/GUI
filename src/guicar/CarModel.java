/* 


 * Student Info: Name=AniketChoudhury, ID=Your17233

 * Subject: CS532B_HW01_SPRING_2016

 * Author: choud 

 * Filename: CarModel.java 

 * Date and Time: Jan 27, 2016 11:17:55 AM 

 * Project Name: GuiCar


 */
/**
 *
 * @author choud
 */
package guicar;

public class CarModel {
    private int width;
    private int height;
    private String bodyColor;
    private int wheelSize;
    private String wheelColor;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }

    public String getWheelColor() {
        return wheelColor;
    }

    public void setWheelColor(String wheelColor) {
        this.wheelColor = wheelColor;
    }

    public CarModel(int width, int height, int wheelSize) {
        this.width = width;
        this.height = height;
        this.wheelSize = wheelSize;
    }

    
    
    public CarModel()
    {
        

   height=130;
   width =610; 
   bodyColor="white";
   wheelSize=110;
    wheelColor="blue";
    }

}
