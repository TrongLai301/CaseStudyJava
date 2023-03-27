public class Mobile {
    public String id;
    public String manufacturer;
    public String color;
    public double height;
    public double width;
    public double thickness;
    public int energy;

    public Mobile() {
        this.manufacturer = "nokia";
        this.color = "xanh";
        this.width = 30;
        this.height = 60;
        this.thickness = 1;
        this.energy = 10;
    }

    public Mobile(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Mobile(String manufacturer, String color) {
        this.manufacturer = manufacturer;
        this.color = color;
    }

    public Mobile(String manufacturer, String color, String id) {
        this.manufacturer = manufacturer;
        this.color = color;
        this.id = id;
    }

    public Mobile(String manufacturer, String color, String id,  double height, double width, double thickness, int energy) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.color = color;
        this.height = height;
        this.width = width;
        this.thickness = thickness;
        this.energy = energy;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getThickness() {
        return thickness;
    }

    public void setThickness(double doDay) {
        this.thickness = doDay;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        if (energy > 100 || energy < 0) {
            System.out.println("Dung lượng pin nằm trong khoảng 0-100");
        } else {
            this.energy = energy;
            System.out.println("Năng lượng: " + energy);
        }
    }

    public void displayInfo() {
        System.out.println("");
        System.out.println("");
        System.out.println("===MobilePhone===");
        System.out.println("Mã id: " + this.id);
        System.out.println("Hãng sản xuất: " + this.manufacturer);
        System.out.println("Màu: " + this.color);
        System.out.println("Chiều dài: " + this.height);
        System.out.println("Chiều rộng: " + this.width);
        System.out.println("Độ dày: " + this.thickness);
    }
}
