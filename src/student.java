import java.io.Serializable;

public class student implements Serializable {
    public String name;
    public int eng;
    public int math;

    public String getName() {
        return name;
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }

    @Override
    public String toString() {
        return "name=" + name +
                ", eng=" + eng +
                ", math=" + math;
    }
}

