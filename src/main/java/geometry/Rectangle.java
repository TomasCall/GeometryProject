package geometry;

public class Rectangle {
    private double aSide;
    private double bSide;

    public Rectangle(double aSide, double bSide) {
        setASide(aSide);
        setBSide(bSide);
    }

    public double getArea() {
        return aSide * bSide;
    }

    public double getPerimeter() {
        return 2 * (aSide + bSide);
    }

    public double getASide() {
        return aSide;
    }

    public void setASide(double aSide) {
        this.aSide = aSide;
    }

    public double getBSide() {
        return bSide;
    }

    public void setBSide(double bSide) {
        this.bSide = bSide;
    }
}

