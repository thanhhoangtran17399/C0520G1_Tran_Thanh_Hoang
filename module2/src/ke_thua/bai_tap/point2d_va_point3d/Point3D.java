package ke_thua.bai_tap.point2d_va_point3d;

public class Point3D extends Point2D {
    private double z;

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void setXYZ(double x, double y, double z) {
        this.setX(x);
        this.setY(y);
        this.setZ(z);
    }

    public double[] getXYZ() {
        double[] arr = new double[3];
        arr[0] = super.getX();
        arr[1] = super.getY();
        arr[2] = getZ();
        return arr;
    }

    @Override
    public String toString() {
        return "x = " + getX() + "; y = " + getY() + "; z = " + getZ() + "\nxyz(" + getXYZ()[0] + "; " + getXYZ()[1] + "; " + getXYZ()[2] + ")";
    }
}
