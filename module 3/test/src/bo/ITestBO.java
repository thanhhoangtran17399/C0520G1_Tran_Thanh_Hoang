package bo;

import model.DTOMatBang;
import model.LoaiMatBang;
import model.MatBang;
import model.TrangThai;

import java.util.List;

public interface ITestBO {
    List<DTOMatBang> selectAllMatBang();

    List<TrangThai> selectAllTrangThai();

    List<LoaiMatBang> selectAllLoaiMatBang();

    void insertMatBang(MatBang matBang);

    boolean deleteCustomer(String ma_mat_bang);

    List<DTOMatBang> searchByGia (double gia_tien);

    List<DTOMatBang> searchByTang(int tang);

    List<DTOMatBang> searchByLoaiMatBang(String ten_loai_mat_bang);

}
