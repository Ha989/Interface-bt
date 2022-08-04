package QuanLyBanHang;

import java.util.Date;

public class Customer extends CommonOb{
    private String phoneNumber;
    private Long idProduct;


    public Customer() {
    }

    public Customer(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Customer(String phoneNumber, Long idProduct) {
        this.phoneNumber = phoneNumber;
        this.idProduct = idProduct;
    }

    public Customer(Long id, String name, Date printDate, String phoneNumber, Long idProduct) {
        super(id, name, printDate);
        this.phoneNumber = phoneNumber;
        this.idProduct = idProduct;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void Infor() {
        System.out.println("Customer Information ");
        System.out.println(this.getId());
        System.out.println(this.getName());
        System.out.println(this.getPhoneNumber());
        System.out.println(this.getPrintDate());
    }

    @Override
    public int deleteInfor() {
        return 0;
    }

    @Override
    public void money(int quantity, float productPrice) {
        System.out.println("Total bill " + (quantity*productPrice));

    }

    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }
}
