import java.util.Scanner;

public class MainMS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = -1;
        int energy;
        String mF, color, id;
        double height, width, thickness;
        Mobile mB = new Mobile("Nokia", "Vàng", "M001", 10, 6, 1, 100);
        Mobile mB1 = new Mobile("Iphone", "Đỏ", "M002", 11, 5, 0.5, 80);
        Mobile mB2 = new Mobile("Samsung", "Hồng", "M003", 13, 6, 0.7, 70);
        Mobile mB3 = new Mobile("Vivo", "Xanh", "M004");
        MobileStore mS = new MobileStore();
        mS.importStock(mB);
        mS.importStock(mB1);
        mS.importStock(mB2);
        mS.importStock(mB3);
        do {
            System.out.println("====Thông tin cửa hàng====");
            System.out.println("1. Hiển thị danh sách điện thoại");
            System.out.println("2. Số lượng lưu trữ");
            System.out.println("3. Thêm điện thoại mới");
            System.out.println("4. Bán điện thoại");
            System.out.println("5. Cập nhật điện thoại");
            System.out.println("6. Tìm kiếm điện thoại");
            System.out.println("0. End");
            i = sc.nextInt();
            switch (i) {
                case 1:
                    mS.displayInfo();
                    break;
                case 2:
                    mS.displayWare();
                    break;
                case 3:
                    int newPhone = sc.nextInt();
                    int arrPhone[] = new int[newPhone];
                    for (i = 0; i < arrPhone.length; i++) {
                        System.out.println("Nhập thông tin điện thoại: ");
                        sc.nextLine();
                        System.out.print("Mã: ");
                        id = sc.nextLine();
                        System.out.print("Hãng sản xuất: ");
                        mF = sc.nextLine();
                        System.out.print("Màu : ");
                        color = sc.nextLine();
                        System.out.print("Độ dài: ");
                        height = sc.nextDouble();
                        System.out.print("Độ rộng: ");
                        width = sc.nextDouble();
                        System.out.print("Độ dày: ");
                        thickness = sc.nextDouble();
                        System.out.print("Mức năng lượng: ");
                        energy = sc.nextInt();
                        Mobile push = new Mobile(mF, color, id, height, width, thickness, energy);
                        mS.importStock(push);
                    }
                    mS.displayInfo();
                    break;
                case 4:
                    System.out.println("Nhập mã điện thoại bán: ");
                    sc.nextLine();
                    id = sc.nextLine();
                    mS.dltMobile(id);
                    break;
                case 5:
                    System.out.println("Nhập mã điện thoại cần cập nhật: ");
                    sc.nextLine();
                    id = sc.nextLine();
                    mS.updateCheck(id);
                    System.out.print("Hãng sản xuất: ");
                    mF = sc.nextLine();
                    System.out.print("Màu : ");
                    color = sc.nextLine();
                    System.out.print("Độ dài: ");
                    height = sc.nextDouble();
                    System.out.print("Độ rộng: ");
                    width = sc.nextDouble();
                    System.out.print("Độ dày: ");
                    thickness = sc.nextDouble();
                    System.out.print("Mức năng lượng: ");
                    energy = sc.nextInt();
                    Mobile update = new Mobile(mF, color, id, height, width, thickness, energy);
                    mS.update(update);
                    mS.displayUpdate();
                    break;
                case 6:
                    System.out.println("Nhập điện thoại cần tìm: ");
                    sc.nextLine();
                    id = sc.nextLine();
                    mS.search(id);
                    break;
                case 0:
                    System.exit(0);
                    break;
            }

        } while (i > 0);
    }
}
