/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tinhdientich;

/**
 *
 * @author 84983
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(5),new Rectangle(4, 6)};
        double tongArea = AreaCalculator.calculateTotalArea(shapes);
        System.out.println("Tong dien tich: " + tongArea);
    }
    
}
