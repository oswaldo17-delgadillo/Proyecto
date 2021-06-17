
package proyecto;


public class Huesped {
    private String nombre;
    private String habitacion;

    public Huesped(String nombre, String habitacion) {
        this.nombre = nombre;
        this.habitacion = habitacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }
    
}
