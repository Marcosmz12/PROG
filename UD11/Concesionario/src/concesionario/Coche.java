package concesionario;

public class Coche implements Serializable {
    private String matrícula;
    private String marca;
    private int año;

    public Coche(String matrícula, String marca, int año){
        this.matrícula = matrícula;
        this.marca = marca;
        this.año = año;
    }

    public Coche(String línea) {
        this.deserializar(línea);
    }

    public String getMatrícula() {
        return this.matrícula;
    }

    @Override
    public boolean equals(Object o){
        return this==o || (this.getClass()==o.getClass() && this.matrícula == ((Coche)o).matrícula);
    }
    
    @Override
    public String serializar(){
        return String.format("%s;%s;%d", this.matrícula, this.marca, this.año);
    }

    @Override
    public void deserializar(String línea){
        String[] datos = línea.split(";");
        this.matrícula = datos[0];
        this.marca = datos[1];
        try {
            this.año = Integer.parseInt(datos[2]);
        } catch (Exception e) {
            this.año = 0;
        }
    }
    
    @Override
    public String toString(){
        return String.format("Matrícula: %s; Marca: %s; Año matriculación: %d", this.matrícula, this.marca, this.año);
    }
}