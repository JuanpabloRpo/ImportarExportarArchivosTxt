public class Persona {
        private String nombre;
        private int edad;
        private char sexo;
        private int cedula;

    public Persona() {
    }

    public Persona(String nombre, int edad, char sexo, int cedula) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
}
