package SP;

import java.util.Scanner;

public class SanPham 
{
	String tenSp;
	double donGia,giamGia;
	public SanPham(String tenSp,double donGia,double giamGia) 
	{
		this.tenSp=tenSp;
		this.donGia=donGia;
		this.giamGia=giamGia;
	}
	public SanPham(String tenSp,double donGia) {
		this.tenSp=tenSp;
		this.donGia=donGia;
		this.giamGia=0;
	}
	public String getTenSp() {
		return tenSp;
	}
	public void setTenSp(String tenSp) {
		this.tenSp=tenSp;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia=donGia;
	}
	public double getGiamGia() {
		return giamGia;
	}
	public void setGiamgia(double giamgia) {
		this.giamGia=giamGia;
	}
	public double getThueNhapKhau() {
		return donGia*0.1;
	}
	public void nhap() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Nhập tên sản phẩm: ");
		tenSp=sc.nextLine();
		System.out.print("Nhập đơn giá: ");
		donGia=sc.nextDouble();
		System.out.print("Nhập giảm giá: ");
		giamGia=sc.nextDouble();
	}
	public void xuat() {
		  System.out.print("Tên sản phẩm: "+getTenSp());
		  System.out.print("Đơn giá: "+getDonGia());
		  System.out.print("Giảm giá: "+getGiamGia());
		  System.out.print("Thuế nhập khẩu: "+getThueNhapKhau());
	}
	public SanPham() 
	{
		
	}
}
