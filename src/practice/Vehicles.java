package practice;

public enum Vehicles {
    CAR(1200),
    BICYCLE(300),
    BUS(3500);

    private int cost;
    private String color;

    Vehicles(int cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return this.name() +
                ", cost=" + cost +
                ", color=" + getColor();
    }
}
