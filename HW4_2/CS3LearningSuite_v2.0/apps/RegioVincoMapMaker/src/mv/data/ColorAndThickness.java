/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mv.data;

import java.util.HashMap;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.ObservableList;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

/**
 *
 * @author Jihye
 */
public class ColorAndThickness {
    DoubleProperty LINE_THICKNESS;
    ObjectProperty LINE_COLOR;
    HashMap<String, Color> subRegionToColorMappings;
    
    public ColorAndThickness(){
        this.LINE_THICKNESS = new SimpleDoubleProperty();
        this.LINE_COLOR = new SimpleObjectProperty();
        LINE_THICKNESS.setValue(0.05);
        LINE_COLOR.setValue(Color.BLACK);
    }
    
    public void changeColor(Color lineColor){
        LINE_COLOR.setValue(lineColor);
    }
    public void changeThinkness(double Thinkness){
        LINE_THICKNESS.setValue(Thinkness);
    }
     
    public DoubleProperty getThickness(){
        return LINE_THICKNESS;
    }
    public HashMap<String, Color> getSubRegionToColorMappings(){
        return subRegionToColorMappings;
    }
}
