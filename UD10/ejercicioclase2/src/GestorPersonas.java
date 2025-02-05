import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GestorPersonas {
    HashMap<String, ArrayList<Persona>> mHashMap = new HashMap<>();

    public void añadirPersona(String colorDePelo, Persona mPersona) {
        if (!mHashMap.containsKey(colorDePelo)) {
            ArrayList<Persona> mArrayList = new ArrayList<>();
            mArrayList.add(mPersona);
            mHashMap.put(colorDePelo, mArrayList);
            System.out.println("Persona: " + colorDePelo + " " + mPersona);
        } else {
            ArrayList<Persona> mArrayList = mHashMap.get(colorDePelo);
            int i = 0;
            boolean encontrarPersona = false;
            while (!encontrarPersona && i < mArrayList.size()) {
                Persona personaenLista = mArrayList.get(i);
                if (personaenLista.toString().equals(personaenLista.toString())) {
                    encontrarPersona = true;
                    i++;
                }
            }
            if (!encontrarPersona) {
                mArrayList.add(mPersona);
                System.out.println("Persona añadida " + colorDePelo + " " + mPersona);
                encontrarPersona = true;
            }
        }
    }

    public void eliminarColordePelo(String colordePelo) {
        if (mHashMap.containsKey(colordePelo)) {
            mHashMap.remove(colordePelo);
            System.out.println("Se ha eliminado ese color de pelo " + colordePelo);
        } else {
            System.out.println("Ese color de pelo no esta registrado " + colordePelo);
        }
    }

    public void borrarPersona(String colorDePELo, Persona mPersona) {
        if (mHashMap.containsKey(colorDePELo)) {
            ArrayList<Persona> mArrayList = mHashMap.get(colorDePELo);
            mArrayList.removeIf(miPersonaenLista -> miPersonaenLista.toString().equals(mPersona.toString()));
            System.out.println("Persona borrada");
        }
    }

    public void mostrarColordePelo(String colordePelo) {
        if (mHashMap.containsKey(colordePelo)) {
            ArrayList<Persona> mArrayList = mHashMap.get(colordePelo);
            System.out.println("Personas " + colordePelo + ": ");
            for (Persona persona : mArrayList) {
                System.out.println(persona);
            }
        } else {
            System.out.println("No hay persona con ese color de pelo");
        }
    }

    public void mostrarPersonas() {
        for (Map.Entry<String, ArrayList<Persona>> parejaCV : mHashMap.entrySet()) {
            ArrayList<Persona> mArrayList = parejaCV.getValue();
            System.out.println("Personas:" + parejaCV.getKey() + ": ");
            for (Persona persona : mArrayList) {
                System.out.println(persona);
            }
            System.out.println();
        }
    }
}
