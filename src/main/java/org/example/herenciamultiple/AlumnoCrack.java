package org.example.herenciamultiple;

public class AlumnoCrack extends alumno implements deportista,artista{
    private int idActividadesExtra;
    private String deporte;
    private String arte;

    public AlumnoCrack() {
    }

    public AlumnoCrack(String nombre, int edad, int numeroCuenta, String carrera, double promedio, int idActividadesExtra, String deporte, String arte) {
        super(nombre, edad, numeroCuenta, carrera, promedio);
        this.idActividadesExtra = idActividadesExtra;
        this.deporte = deporte;
        this.arte = arte;
    }

    public int getIdActividadesExtra() {
        return idActividadesExtra;
    }

    public void setIdActividadesExtra(int idActividadesExtra) {
        this.idActividadesExtra = idActividadesExtra;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getArte() {
        return arte;
    }

    public void setArte(String arte) {
        this.arte = arte;
    }

    @Override
    public String toString() {

        return super.toString() +
                "Alumnocrack{" +
                "idActividadesExtra=" + idActividadesExtra +
                ", deporte='" + deporte + '\'' +
                ", arte='" + arte + '\'' +
                '}';
    }

    @Override
    public int ensayar(String disciplina){
        System.out.println("El alumno esta ensayando " + this.arte);
        return 3;
    }

    @Override
    public boolean presentarObra() {
        System.out.println(getNombre() + " esta presentando su obra");
        return true;
    }

    @Override
    public int entrenar() {
        System.out.println(getNombre() + " esta entrenando el deporte " + deporte);
        return 2;
    }

    @Override
    public boolean presentarCompetencia(String ubicacion) {
        System.out.println(getNombre() + " esta en competencia del deporte " + deporte);
        return true;
    }
}
