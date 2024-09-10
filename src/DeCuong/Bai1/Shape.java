package DeCuong.Bai1;

abstract class Shape {
    private String shapeName;
    private String color;

    Shape() {

    }

    Shape(String shapeName, String color) {
        this.shapeName = shapeName;
        this.color = color;
    }

    public String getShapeName() {
        return shapeName;
    }                                                                                                                              ]

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    abstract double calArea();


    @Override
    public String toString() {
        return "Shape[" +
                "Shape Name='" + shapeName + '\'' +
                ", color='" + color + '\'' +
                ']';
    }

}
