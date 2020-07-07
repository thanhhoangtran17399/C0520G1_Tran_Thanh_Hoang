package ke_thua.bai_tap.circle;

public class HinhTron {
    private float banKinh;
    private String mauSac;

    public HinhTron(){

    }

    public HinhTron(float banKinh, String mauSac){
        this.banKinh = banKinh;
        this.mauSac = mauSac;
    }

    public float getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(float banKinh) {
        this.banKinh=banKinh;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }
    public double dienTich(){
        return Math.pow(this.banKinh,2) * Math.PI;
    }

    @Override
    public String toString() {
        return "Ban kinh hinh tron la: "+getBanKinh()+"\nHinh tron co mau: "+getMauSac()+"\nDien tich: "+dienTich();
    }
}
