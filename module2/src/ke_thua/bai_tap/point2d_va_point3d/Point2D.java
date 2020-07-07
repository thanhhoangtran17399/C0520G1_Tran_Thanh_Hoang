package ke_thua.bai_tap.point2d_va_point3d;

public class Point2D {
    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double[] getXY() {
        double arr[] = new double[2];
        arr[0] = getX();
        arr[1] = getY();
        return arr;
    }

    @Override
    public String toString() {
        return "x =" + getX() + "; y =" + getY() + "\nxy(" + getXY()[0] + "; " + getXY()[1] + ")";
    }
}
