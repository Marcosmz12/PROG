package concesionario;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GestorCoches implements CRUD<Coche, String> {
    private File fichero;
    ArrayList<Coche> misCoches = new ArrayList<>();

    public GestorCoches(File fichero) {
        if (fichero.exists()) this.fichero = fichero;
        else {
            try {
                fichero.createNewFile();
            } catch (Exception e) {
                System.out.println("No se pudo crear el fichero.");
            } 
        }
    }

    @Override
    public ArrayList<Coche> recuperarTodos() {
        misCoches.clear();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fichero));
            String linea = "";
            while ((linea = br.readLine()) != null) {
                Coche coche = new Coche(linea);
                misCoches.add(coche);
            }
            br.close();
            return misCoches;
        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe.getMessage());
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
        return null;
    }

    @Override
    public Coche recuperarUno(String id) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(fichero));
            Coche coche = new Coche("", "", 0); 
            String linea = "";
            while ((linea = br.readLine()) != null) {
                coche.deserializar(linea); // En lugar de ocupar más memoria con coches nuevos, reutilizamos siempre el mismo.
                if (coche.getMatrícula().equals(id)) {
                    br.close();
                    return coche;
                }
            }
            br.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe.getMessage());
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
        return null;        
    }

    @Override
    public Coche añadir(Coche coche) {
        if (recuperarUno(coche.getMatrícula()) != null) {
            System.out.println("El coche ya estaba registrado y no se ha añadido al fichero");
            return null;
        } else {
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(fichero, true));
                bw.write(coche.serializar() + "\n");
                bw.close();
            } catch (FileNotFoundException fnfe) {
                System.out.println(fnfe.getMessage());
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
            return coche;
        }
    }

    @Override
    public Coche eliminar(String id) {
        Coche cocheABorrar = recuperarUno(id);
        Coche coche = new Coche("","",0);
        if (cocheABorrar == null) {
            System.out.println("La matrícula no se encuentra en el fichero y no se ha podido realizar el borrado.");
            return null;
        } else {
            try {
                String nombreOriginalFichero = fichero.getName(); 
                File ficheroModificado = new File(nombreOriginalFichero + ".tmp");
                
                if (!fichero.renameTo(ficheroModificado)) {
                    System.out.println("Problema al renombrar el fichero original.");
                    return null;
                }
                // Creamos un fichero nuevo 
                fichero = new File(nombreOriginalFichero);
                if (!fichero.exists()) {
                    try {
                        fichero.createNewFile();
                    } catch (Exception e) {
                        System.out.println("No se pudo crear el fichero.");
                        throw new IOException();
                    } 
                }

                BufferedReader br = new BufferedReader(new FileReader(ficheroModificado));
                BufferedWriter bw = new BufferedWriter(new FileWriter(fichero));
                String linea = "";
                while ((linea = br.readLine()) != null) {
                    coche.deserializar(linea);
                    if (!coche.getMatrícula().equalsIgnoreCase(id)) bw.write(linea + "\n");
                }
                br.close();
                bw.close();
                ficheroModificado.delete();            
            } catch (FileNotFoundException fnfe) {
                System.out.println(fnfe.getMessage());
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
            return cocheABorrar;
        }   
    }

    @Override
    public Coche modificar(Coche cocheAModificar) {
        Coche coche = recuperarUno(cocheAModificar.getMatrícula());
        if (coche == null) {
            System.out.println("La matrícula no se encuentra en el fichero y no se han podido realizar las modificaciones.");
            return null;
        } else {
            try {
                String nombreOriginalFichero = fichero.getName(); 
                File ficheroModificado = new File(nombreOriginalFichero + ".tmp");
                
                if (!fichero.renameTo(ficheroModificado)) {
                    System.out.println("Problema al renombrar el fichero original.");
                    return null;
                }
                // Creamos un fichero nuevo 
                fichero = new File(nombreOriginalFichero);
                if (!fichero.exists()) {
                    try {
                        fichero.createNewFile();
                    } catch (Exception e) {
                        System.out.println("No se pudo crear el fichero.");
                        throw new IOException();
                    } 
                }

                BufferedReader br = new BufferedReader(new FileReader(ficheroModificado));
                BufferedWriter bw = new BufferedWriter(new FileWriter(fichero));
                String linea = "";
                while ((linea = br.readLine()) != null) {
                    coche.deserializar(linea);
                    if (coche.getMatrícula().equalsIgnoreCase(cocheAModificar.getMatrícula())) {
                        bw.write(cocheAModificar.serializar() + "\n");
                  } else bw.write(linea + "\n");
                }
                br.close();
                bw.close();
                ficheroModificado.delete();            
            } catch (FileNotFoundException fnfe) {
                System.out.println(fnfe.getMessage());
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
            return cocheAModificar;
        }   
    }
}