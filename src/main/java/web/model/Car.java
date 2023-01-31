package web.model;

public class Car {
    private long id;
    private String series;
    private int model;

    public Car() {

    }
    public Car(long id, String series, int model) {
        this.id = id;
        this.series = series;
        this.model = model;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", series='" + series + '\'' +
                ", model=" + model +
                '}';
    }
}
