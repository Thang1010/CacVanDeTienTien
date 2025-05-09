/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tinhdientich;

/**
 *
 * @author 84983
 */
public class AreaCalculator {
    public static double calculateTotalArea(Shape[] shapes) {
    double tong = 0;
    for (Shape shape : shapes) {
        tong += shape.calculateArea();
    }
    return tong;
    }
}
