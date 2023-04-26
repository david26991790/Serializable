import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class AppData {

    private grade c;
    private final String filename;

    public AppData() {
        filename = "app.data";
    }

    public void save() throws Exception {
        FileOutputStream fos = new FileOutputStream(filename);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(this.c);
        oos.close();
        fos.close();
    }

    public void load()throws Exception {
        FileInputStream fis = new FileInputStream(filename);
        ObjectInputStream ois = new ObjectInputStream(fis);
        this.c = (grade) ois.readObject();
        ois.close();
        fis.close();
    }

    public void setgrade(grade c) {
        this.c = c;
    }

    public grade getgrade(grade c) {
        return c;
    }
}
