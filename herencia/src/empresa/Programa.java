package empresa;

public class Programa {
    public static void main(String[] args) {
        EmpleadoMarketing empl1 = new EmpleadoMarketing("Pedro", "Sanchez", "1234", "Redes Sociales");
        empl1.trabajar();
        empl1.trabajar(4);
    }
}
