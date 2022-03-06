package Test1;

public class Main extends Student {
    @Override
    public void introE() {
        System.out.println("Employee");
    }

    @Override
    public void IntroT() {
        System.out.println("Teacher");
    }

    @Override
    public void IntroS() {
        System.out.println("Student");
    }

    public static void main(String[] args) {
        Main obj=new Main();
        obj.introE();
        obj.IntroT();
        obj.IntroS();
    }

}
