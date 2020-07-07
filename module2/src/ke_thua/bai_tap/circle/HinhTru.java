package ke_thua.bai_tap.circle;

public class HinhTru extends HinhTron {
    private float chieuCao;

    public HinhTru(float banKinh, String mauSac, float chieuCao ) {
        super(banKinh, mauSac);
        this.chieuCao = chieuCao;
    }

    public HinhTru() {

    }

    public float getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(float chieuCao) {
        this.chieuCao = chieuCao;
    }
    public double theTich(){
        return dienTich() * getChieuCao();
    }

    @Override
    public String toString() {
        return "Ban kinh day: "+getBanKinh()+"\nmau sac: "+getMauSac()+"\nDien tich day: "+dienTich()+"\nThe tich hinh tru: "+theTich();
    }
}
