public class Testsave {
    public static void main(String[] args) {
        student x1;
        student x2;
        grade c1;
        grade c2;

        x1 = new student();
        x1.name = "Tom";
        x1.eng = 100;
        x1.math = 99;

        x2 = new student();
        x2.name ="Amy";
        x2.eng = 90;
        x2.math = 95;

        c1 = new grade();
        c1.gradename = "android班";
        c1.加入學生(x1);
        c1.加入學生(x2);
        c1.show();

        AppData appData;
        appData = new AppData();
        appData.setgrade(c1);

        try {
            appData.save();
            System.out.println("save success");
        }catch(Exception e){
            System.out.println("save failed");
            System.out.println(e.toString());

        }

    }
}
