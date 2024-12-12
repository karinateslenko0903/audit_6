abstract class Shape {

    public final double getArea() {
        return calculateArea();
    }


    protected abstract double calculateArea();

     final void displayInfo() {
        System.out.println("Це геометрична фігура з площею: " + getArea());
    }
}
