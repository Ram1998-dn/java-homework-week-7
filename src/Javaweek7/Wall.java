package Javaweek7;

/**
 * Write a class with the name Wall.
 * The class needs two fields (instance variables) with name width and height of type double.
 * The class needs to have two constructors.
 * The first constructor does not have any parameters (no-arg constructor).
 * The second constructor has parameters width and height of type double and it needs to initialize the fields.
 * In case the width is less than 0 it needs to set the width field value to 0, in case the height parameter is less than 0 it needs to set the height field value to 0.
 * Write the following methods (instance methods):
 *  Method named getWidth without any parameters, it needs to return the value of width field.
 * Method named getHeight without any parameters, it needs to return the value of height field.
 *  Method named setWidth with one parameter of type double, it needs to set the value of the width field.
 * If the parameter is less than 0 it needs to set the width field value to 0.
 * Method named setHeight with one parameter of type double, it needs to set the value of the height field.
 * If the parameter is less than 0 it needs to set the height field value to 0.
 * Method named getArea without any parameters, it needs to return the area of the wall.
 */
public class Wall {
    // Fields (instance variables)
    private double width;
    private double height;

    // No-arg constructor
    public Wall() {
        this.width = 0;
        this.height = 0;
    }

    // Constructor with parameters
    public Wall(double width, double height) {
        // Validate the width and height
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // Method to get the width
    public double getWidth() {
        return width;
    }

    // Method to set the width
    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    // Method to get the height
    public double getHeight() {
        return height;
    }

    // Method to set the height
    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // Method to calculate and return the area of the wall
    public double getArea() {
        return this.width * this.height;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating a Wall object with width=5 and height=4
        Wall wall = new Wall(5, 4);
        System.out.println("area= " + wall.getArea()); // Expected output: area= 20.0

        // Setting the height to -1.5 (which should set it to 0 due to validation)
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth()); // Expected output: width= 5.0
        System.out.println("height= " + wall.getHeight()); // Expected output: height= 0.0
        System.out.println("area= " + wall.getArea()); // Expected output: area= 0.0
    }
}
