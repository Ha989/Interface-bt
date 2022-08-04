package QuanLyBanHang;

import java.util.Date;

public class Product extends CommonOb {
    private float productPrice;


    public Product() {
    }

    public Product(float productPrice) {
        this.productPrice = productPrice;
    }

    public Product(Long id, String name, Date printDate, float productPrice) {
        super(id, name, printDate);
        this.productPrice = productPrice;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public void Infor() {
        System.out.println(" Product details ");
        System.out.println(this.getId());
        System.out.println(this.getName());
        System.out.println(this.getPrintDate());
        System.out.println(this.getProductPrice());

    }

    @Override
    public int deleteInfor() {
        return 0;
    }

    @Override
    public void money(int quantity, float productPrice) {

    }

}
