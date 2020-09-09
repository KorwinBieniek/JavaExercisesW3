package pl.korwinbieniek.Method16Exercises;

public class Met13 {
    public double calculateTriangleArea(double side1, double side2, double side3)
    {
        if(isValid(side1, side2, side3))
        {
            double area = 0;
            double s = (side1 + side2 + side3)/2;
            area = Math.sqrt(s*(s - side1)*(s - side2)*(s - side3));
            return area;
        }
        return -1;
    }

    public boolean isValid(double side1, double side2, double side3) {
        return (side1 + side2) > side3 && (side3 + side2) > side1 && (side1 + side3) > side2;
    }

}
