function show() {
    let ketQua;
    let tien = document.getElementById("soTien").value;
    let banDau = document.getElementById("from").value;
    let sauKhiDoi = document.getElementById("to").value;
    if (banDau == "VietNam"){
        if (sauKhiDoi == "USD") {
            ketQua = tien / 23000;
        }else ketQua = tien;
    }
    if (banDau == "USD") {
        if (sauKhiDoi == "VietNam"){
            ketQua = tien * 23000;
        }else ketQua = tien;
    }
    alert("Ket qua: " +ketQua);
}