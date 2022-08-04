package RunQlbh;

import QuanLyBanHang.Customer;
import QuanLyBanHang.Product;


import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

public class ChayChuongTrinh {
    static Scanner scanner = new Scanner(System.in);
   static LinkedList<Product> listProduct = new LinkedList<>() ;
   static LinkedList<Customer>linkedList = new LinkedList<>();
   static   int quantity = 0;
   static boolean check = true;
    public static void main(String[] args) {

        listProduct.add(new Product( 1L, "Mango", new Date("2022/8/3"), 300));
        listProduct.add(new Product(2L, "Banana", new Date("2022/8/3"), 200));
        listProduct.add(new Product(3L, "Guava", new Date("2022/8/3"), 250));
        listProduct.add(new Product(4L, "Watermelon", new Date("2022/8/3"), 150));



        while (check){
            System.out.println("1.nhập thông cho khách hàng ");
            System.out.println("2.Sửa thông tin");
            System.out.println("3.Thoát");
            System.out.println("sự lựa chọn của bạn");
            int numberSelect = scanner.nextInt();scanner.nextLine();
            selectOfCustom(numberSelect);

        }
    }

    public static void selectOfCustom(int numberSerlect){

        switch (numberSerlect){

            case 1:
                System.out.println(" How many do you want to buy?");
                quantity = scanner.nextInt();scanner.nextLine();
                System.out.println("Product Name ");
                String productName = scanner.nextLine();
                System.out.println("Input Id");
                Long id = scanner.nextLong();
                scanner.nextLine();
                System.out.println("Input Customer Name ");
                String name = scanner.nextLine();
                System.out.println(" Input Customer Phone Number");
                String phoneNumber = scanner.nextLine();
                Date printDate = new Date();
                Long idProduct =0L;
                for (Product product: listProduct) {
                    if (product.getName().equals(productName)){
                        idProduct = product.getId();
                    }
                }
                Customer customer = new Customer(id, name,printDate, phoneNumber,idProduct);
                customer.Infor();
                checkMoney(productName,customer);
                linkedList.add(customer);
                break;
            case 2:
                System.out.println("Nhập vào tên khách hàng cần update ");
                String nameCustormer = scanner.nextLine();
                String nameProductUpdate = null;
                //tìm ra đc cái thằng khác hàng đấy
                for (Customer customer1 : linkedList
                     ) {
                    if (customer1.getName().equals(nameCustormer)){
                        Customer customerResult = customer1;
                        System.out.println("bạn muốn muôn sửa cái j ");
                        System.out.println("1.sửa tên");
                        System.out.println("2.sửa product ");
                        int selectUpdate = scanner.nextInt();scanner.nextLine();
                        if (selectUpdate == 1){
                            System.out.println("Nhập lại tên ");
                            String nameUpdate = scanner.nextLine();
                            customerResult.setName(nameUpdate);

                        }else {
                            //sửa product
                            System.out.println("Nhập lại tên Product ");
                             nameProductUpdate = scanner.nextLine();

                            for (Product product: listProduct) {

                                if (product.getName().equals(nameProductUpdate)){
                                    customerResult.setIdProduct(product.getId());
                                }
                            }
                        }
                        customerResult.Infor();
                        checkMoney(nameProductUpdate,customerResult);

                    }
                }
                break;
            case 3:
                check =false;
                break;
        }
    }

    public static void checkMoney(String nameProduct,Customer customer){

        if (nameProduct.equals("Mango")) {
            customer.money(quantity, listProduct.get(0).getProductPrice());
        } else if (nameProduct.equals("Banana")) {
            customer.money(quantity,listProduct.get(1).getProductPrice());
        } else if (nameProduct.equals("Guava")){
            customer.money(quantity,listProduct.get(2).getProductPrice());
        } else if (nameProduct.equals("Watermelon")) {
            customer.money(quantity,listProduct.get(3).getProductPrice());
        } else {
            System.out.println("delete");
        }

    }
}
