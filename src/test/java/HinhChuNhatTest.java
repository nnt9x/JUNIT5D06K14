import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class HinhChuNhatTest {

    @org.junit.jupiter.api.Test
    @DisplayName("Test case 1: Kiem tra gia tri mac dinh canh co bang 1.0")
    void getChieuDai() {
        // Tao doi tuong
        HinhChuNhat hcn = new HinhChuNhat();
        // So sanh ket qua thuc te - ket qua chap nhan (dung)
        Assertions.assertEquals(1.0, hcn.getChieuDai());
    }

    @org.junit.jupiter.api.Test
    void setChieuDai() {
        // TH1: Tạo 1 hình chữ nhật -> set cạnh 5 -> get ra thử
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.setChieuDai(5);
        // Lay ra test
        Assertions.assertEquals(5, hcn.getChieuDai() );

        // TH2: Set -> canh am
        // Neu dung nem ra 1 exception
        Exception exception = Assertions.assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                hcn.setChieuDai(-5);
            }
        });
        Assertions.assertEquals("Cạnh phải dương",exception.getMessage());
    }

    @org.junit.jupiter.api.Test
    void getChieuRong() {
    }

    @org.junit.jupiter.api.Test
    void setChieuRong() {
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Tính chu vi với cạnh 2.523 và 3.455, kết quả làm tròn 2 chữ số")
    void chuVi() {
        HinhChuNhat hcn = new HinhChuNhat(2.523, 3.455);
        Assertions.assertEquals(11.96, hcn.chuVi());
    }

    @org.junit.jupiter.api.Test
    void dienTich() {

    }
}