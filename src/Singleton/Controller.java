package Singleton;

public class Controller {
    public static void main(String[] args) {
        Controller con = new Controller();
        con.brincandoSingleton();
    }

    public void brincandoSingleton() {
        Usuario x1 = Usuario.getInstanciaunica();
        Usuario x2 = Usuario.getInstanciaunica();
        Usuario x3 = Usuario.getInstanciaunica();

        System.out.println(x1.getFrase());
        System.out.println(x2.getFrase());
        System.out.println(x3.getFrase());

        x3.setFrase(x3.getFrase().toLowerCase());

        System.out.println(x1.getFrase());
        System.out.println(x2.getFrase());
        System.out.println(x3.getFrase());

    }
}
