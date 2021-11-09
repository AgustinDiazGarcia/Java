package empresa;

public class EmpleadoProduccion extends Empleado{
    private int tiempoExperiencia;

    @Override
    public void trabajar() {
        System.out.println("Empleado de Marketing " + getNombre() + "trabajando");
    }

    public EmpleadoProduccion(String nombre, String apellido, String dni, int tiempoExperiencia) {
        super(nombre, apellido, dni);
        this.tiempoExperiencia = tiempoExperiencia;
    }
}
