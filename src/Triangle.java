public class Triangle {
    private int side1;
    private int side2;
    private int side3;

    public Triangle() {}

    public Triangle(int side1, int side2, int side3) throws IllegalTriangleException {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new IllegalTriangleException("Cạnh của tam giác phải là số nguyên dương");
        }
        if (side1 + side2 < side3 || side2 + side3 < side1 || side3 + side1 < side2) {
            throw new IllegalTriangleException("Tổng của 2 cạnh nhỏ hơn cạnh thứ 3");
        }
    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }

    @Override
    public String toString() {
        return "Tam giác 3 cạnh là: a = " + side1 + ", b = " + side2 + ", c = " + side3;
    }
}
