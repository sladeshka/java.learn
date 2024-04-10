package Lesson2;


public class Car {
    private String brand;
    private String model;
    private Integer seatPlace;
    private Double engineCapacity;
    private Boolean isNew;
    private Color color;
    private int doorsCount;
    private Long price;

    public Car() {}

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Car(String brand, Color color) {
        this.brand = brand;
        this.color = color;
    }

    public Car(Color color, String brand) {
        this.brand = brand;
        this.color = color;
    }

    public Car(String brand, String model, Integer seatPlace, Double engineCapacity, Boolean isNew, Color color, int doorsCount, Long price) {
        this.brand = brand;
        this.model = model;
        this.seatPlace = seatPlace;
        this.engineCapacity = engineCapacity;
        this.isNew = isNew;
        this.color = color;
        this.doorsCount = doorsCount;
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSeatPlace(Integer seatPlace) {
        this.seatPlace = seatPlace;
    }

    public void setEngineCapacity(Double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setDoorsCount(int doorsCount) {
        this.doorsCount = doorsCount;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getSeatPlace() {
        return seatPlace;
    }

    public Double getEngineCapacity() {
        return engineCapacity;
    }

    public Boolean getNew() {
        return isNew;
    }

    public Color getColor() {
        return color;
    }

    public int getDoorsCount() {
        return doorsCount;
    }

    public Long getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", seatPlace=" + seatPlace +
                ", engineCapacity=" + engineCapacity +
                ", isNew=" + isNew +
                ", color=" + color +
                ", doorsCount=" + doorsCount +
                ", price=" + price +
                '}';
    }
}
