package bo;

import dao.TestDAO;
import model.DTOMatBang;
import model.LoaiMatBang;
import model.MatBang;
import model.TrangThai;

import java.util.List;

public class TestBO implements ITestBO{
 TestDAO testDAO = new TestDAO();

    @Override
    public List<DTOMatBang> selectAllMatBang() {
        return testDAO.selectAllMatBang() ;
    }

    @Override
    public List<TrangThai> selectAllTrangThai() {
        return testDAO.selectAllTrangThai();
    }

    @Override
    public List<LoaiMatBang> selectAllLoaiMatBang() {
        return testDAO.selectAllLoaiMatBang();
    }

    @Override
    public void insertMatBang(MatBang matBang) {
        testDAO.insertMatBang(matBang);
    }


    @Override
    public boolean deleteCustomer(String ma_mat_bang) {
        return testDAO.deleteCustomer(ma_mat_bang);
    }

    @Override
    public List<DTOMatBang> searchByGia(double gia_tien) {
        return testDAO.searchByGia(gia_tien);
    }

    @Override
    public List<DTOMatBang> searchByTang(int tang) {
        return testDAO.searchByTang(tang);
    }

    @Override
    public List<DTOMatBang> searchByLoaiMatBang(String ten_loai_mat_bang) {
        return testDAO.searchByLoaiMatBang(ten_loai_mat_bang);
    }
}
