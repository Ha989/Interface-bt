package QuanLyBanHang;

import java.util.Date;

public abstract class CommonOb {
    private Long id;
    private String name;
    private Date printDate;

    public CommonOb() {
    }

    public CommonOb(Long id, String name, Date printDate) {
        this.id = id;
        this.name = name;
        this.printDate = printDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getPrintDate() {
        return printDate;
    }

    public void setPrintDate(Date printDate) {
        this.printDate = printDate;
    }

    public abstract void Infor();
    public abstract int deleteInfor();
    public abstract void money(int quantity, float productPrice);

}
