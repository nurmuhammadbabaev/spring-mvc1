package web.model;




public class  Car {
    int id ;
    String name;
    String madeIn;

    public Car() {
    }

    public Car(int id, String name, String madeIn) {
        this.id = id;
        this.name = name;
        this.madeIn = madeIn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    @Override
    public String toString() {
        return  id +
                " " + name +
                " " + madeIn;
    }
}
