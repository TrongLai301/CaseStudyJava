
public class MobileStore extends Mobile {
    private Mobile[] wareHouse;
    private int mobileShip;

    public MobileStore() {
        wareHouse = new Mobile[100];
        this.mobileShip = 0;
    }

    public MobileStore(Mobile[] wareHouse) {
        this.wareHouse = wareHouse;
    }

    public boolean importStock(Mobile imS) {
        if (mobileShip > 100) {
            System.out.println("Quá số lượng cho phép");
            return false;
        }
        this.wareHouse[mobileShip++] = imS;

        return true;
    }

    public void displayInfo() {
        for (int i = 0; i < mobileShip; i++) {
            System.out.println("===" + (i + 1) + "===");
            System.out.println("Mã: " + this.wareHouse[i].getId() + " " + this.wareHouse[i].getManufacturer() + " " + this.wareHouse[i].getColor() + " " + this.wareHouse[i].getHeight() + "/" + this.wareHouse[i].getWidth() + "/" + this.wareHouse[i].getThickness());
        }
        System.out.println(" ");
        System.out.println(" ");
    }

    public boolean dltMobile(String id) {
        int i, j, k;
        if (mobileShip > 0) {
            for (i = 0; i < mobileShip; i++) {
                if (id.equals(this.wareHouse[i].getId())) {
                    mobileShip--;
                    for (j = i; j < mobileShip; j++) {
                        this.wareHouse[j].setId(this.wareHouse[j + 1].getId());
                    }
                    System.out.println("Số điện thoại còn lại sau khi bán là: ");
                    for (k = 0; k < mobileShip; k++) {
                        System.out.println(this.wareHouse[k].getId());
                        this.wareHouse[mobileShip].setId("");
                    }
                }
            }
            return true;
        } else {
            System.out.println("Không có điện thoại để bán");
            return false;
        }
    }

    public void updateCheck(String id) {
        this.id = id;
        for (int i = 0; i < mobileShip; i++) {
            if (this.id.equals(this.wareHouse[i].getId())) {
                displayUpdateCheck();
            }
        }
    }

    public void displayUpdateCheck() {
        for (int i = 0; i < mobileShip; i++) {
            if (this.id.equals(this.wareHouse[i].getId())) {
                System.out.println("Chi tiết điện thoại được cập nhật mới: ");
                System.out.println("Mã: " + this.wareHouse[i].getId() + " " + this.wareHouse[i].getManufacturer() + " " + this.wareHouse[i].getColor() + " " + this.wareHouse[i].getHeight() + "/" + this.wareHouse[i].getWidth() + "/" + this.wareHouse[i].getThickness());
                System.out.println(" ");
                System.out.println(" ");
            }
        }
    }

    public boolean update(Mobile mobile) {
        int i;
        for (i = 0; i < mobileShip; i++) {
            if (this.id.equals(this.wareHouse[i].getId())) {
                this.wareHouse[i] = mobile;
            }
        }
        return true;
    }

    public void displayUpdate() {
        for (int i = 0; i < mobileShip; i++) {
            if (this.id.equals(this.wareHouse[i].getId())) {
                System.out.println("Điện thoại sau khi được cập nhật mới: ");
                System.out.println("Mã: " + this.wareHouse[i].getId() + " " + this.wareHouse[i].getManufacturer() + " " + this.wareHouse[i].getColor() + " " + this.wareHouse[i].getHeight() + "/" + this.wareHouse[i].getWidth() + "/" + this.wareHouse[i].getThickness());
                System.out.println(" ");

            }
        }
    }

    public Mobile[] search(String search) {
        Mobile[] mobiles = new Mobile[mobileShip];
        int count_search = 0;
        this.id = search;
        this.manufacturer = search;
        this.color = search;
        for (int i = 0; i < mobileShip; i++) {
            if (this.wareHouse[i].getId().contains(this.id.toUpperCase()) || this.wareHouse[i].getId().contains(this.id.toLowerCase())
                    || this.wareHouse[i].getManufacturer().contains(this.manufacturer.toUpperCase()) || this.wareHouse[i].getManufacturer().contains(this.manufacturer.toLowerCase()) || this.wareHouse[i].getManufacturer().contains(this.manufacturer)
                    || this.wareHouse[i].getColor().contains(this.color.toUpperCase()) || this.wareHouse[i].getColor().contains(this.color.toLowerCase()) || this.wareHouse[i].getColor().contains(this.color)
            ) {
                mobiles[count_search++] = this.wareHouse[i];
            }
        }
        System.out.println("Số lượng điện thoại tìm được là: " + count_search);
        displaySearch();
        return mobiles;
    }

    public void displaySearch() {
        System.out.println("Điện thoại tìm được là : ");
        for (int i = 0; i < mobileShip; i++) {
            if (this.wareHouse[i].getId().contains(this.id.toUpperCase()) || this.wareHouse[i].getId().contains(this.id.toLowerCase()) || this.wareHouse[i].getId().contains(this.id)
                    || this.wareHouse[i].getManufacturer().contains(this.manufacturer.toUpperCase()) || this.wareHouse[i].getManufacturer().contains(this.manufacturer.toLowerCase()) || this.wareHouse[i].getManufacturer().contains(this.manufacturer)
                    || this.wareHouse[i].getColor().contains(this.color.toUpperCase()) || this.wareHouse[i].getColor().contains(this.color.toLowerCase()) || this.wareHouse[i].getColor().contains(this.color)
            ) {

                System.out.println("Mã: " + this.wareHouse[i].getId() + " " + this.wareHouse[i].getManufacturer() + " " + this.wareHouse[i].getColor() + " " + this.wareHouse[i].getHeight() + "/" + this.wareHouse[i].getWidth() + "/" + this.wareHouse[i].getThickness());
            }
        }
        System.out.println(" ");
        System.out.println(" ");
    }

    public void displayWare() {
        System.out.println("số lượng lưu trữ trong kho là: " + mobileShip + "/100");
        System.out.println(" ");
        System.out.println(" ");
    }
}
