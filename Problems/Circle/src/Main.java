/*class M {
    public void main(String [] args) {
        Circle circle = new Circle();
        System.out.println(circle.getArea());
        System.out.println(circle.getLength());
        System.out.println(circle.radius);
        circle.radius = 20;
        System.out.println(circle.getArea());
        System.out.println(circle.getLength());
    }
}*/

class Circle {

    double radius;

    public double getLength() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
    // write methods here
}