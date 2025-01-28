package Ejericio2;

public class Coche extends Vehiculo {
    

    //CONSTRUCTOR
    public Coche(int kilometrosRecorridos){
        
        super(kilometrosRecorridos);
        
    }

    //METODOS

    public void quemaRueda(){
        System.out.println("El coche está quemando rueda");
    }

    @Override
    public void anda(int km){
        System.out.println("El coche está andando " + km + " Kms.");
        kilometrosRecorridos+=km;
        kilometrosTotales+=km;

    }
}
