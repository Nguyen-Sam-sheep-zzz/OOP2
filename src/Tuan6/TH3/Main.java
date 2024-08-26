package Tuan6.TH3;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(1,"chanh",20);

        ProductProcess productProcess = new ProductProcess();
        String fileName = "object.dat";

        productProcess.writeObjectData(product, fileName);

        Product[] listProduct = productProcess.readObjectData(fileName);

        if (listProduct != null) {
            for (Product product3 : listProduct) {
                System.out.println(product3);
            }
        } else {
            System.out.println("Không có dữ liệu hoặc lỗi khi đọc dữ liệu.");
        }
    }
}