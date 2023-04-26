import java.io.Serializable;
import java.util.ArrayList;

public class grade implements Serializable {
    public String gradename;
    public ArrayList<student> students;

    public grade() {
        this.students = new ArrayList<student>();
        System.out.println("班級建構完成");
    }

    public void 加入學生(student x) {
        this.students.add(x);
        System.out.println("加入學生" + x.name);
    }

    public void show() {
        System.out.println("-----" + this.gradename + "顯示資料-----");
        for (student x : students) {
            System.out.println(x.toString());
        }
    }
}