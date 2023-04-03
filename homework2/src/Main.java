interface pos{
    void printinfo();
}
class director implements pos{
    @Override
    public void printinfo() {
        System.out.println(" директор  ");
    }
}
class buhalter implements pos{
    @Override
    public void printinfo() {
        System.out.println(" бухгалтер ");
    }
}
class worker implements pos{
    @Override
    public void printinfo() {
        System.out.println(" рабочий ");
    }
}
public class Main {

    public static void main(String[] args) {
        director director = new director();
        buhalter buhalter = new buhalter();
        worker worker = new worker();
        director.printinfo();
        buhalter.printinfo();
        worker.printinfo();
    }
}