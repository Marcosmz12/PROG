import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GestorCP {
    HashMap<String, ArrayList<Integer>> miHashMap = new HashMap<>();

    public void añadir(String provincia, Integer cp) {
        if (!miHashMap.containsKey(provincia)) {
            ArrayList<Integer> mArrayList = new ArrayList<>();
            mArrayList.add(cp);
            miHashMap.put(provincia, mArrayList);
        } else {
            ArrayList<Integer> mArrayList = miHashMap.get(provincia);
            if (!mArrayList.contains(cp)) {
                mArrayList.add(cp);
            }
        }
    }

    public void borrarProv(String provincia) {
        if (miHashMap.containsKey(provincia)) {
            miHashMap.remove(provincia);
        } else {
            System.out.println("Esa provincia no esta registrada.");
        }
    }

    public void borrarCP(String provincia, Integer cp) {
        if (miHashMap.containsKey(provincia)) {
            ArrayList<Integer> mArrayList = miHashMap.get(provincia);
            mArrayList.remove(cp);
            System.out.println("Se ha borrado el cp de la provincia de " + provincia);
        } else {
            System.out.println("El " + cp + " que ha introducido no exixte en esta provincia de " + provincia);
        }
    }

    public void listarCpdeProv(String provincia) {
        if (miHashMap.containsKey(provincia)) {
            ArrayList<Integer> mArrayList = miHashMap.get(provincia);
            System.out.println("Provincia: " + provincia + "tiene los cp: ");
            for (Integer miCP : mArrayList) {
                System.out.println(miCP + " ");
            }
            System.out.println();
        }
    }

    public void listarTodo() {
        for (Map.Entry<String, ArrayList<Integer>> porValores : miHashMap.entrySet()) {
            System.out.println("Provincia: " + porValores.getKey() + " tiene los cp: ");

            for (int i = 0; i < porValores.getValue().size(); i++) {
                System.out.println(porValores.getValue().get(i));
                if (i < porValores.getValue().size() - 1) {
                    System.out.println(", ");
                }
            }
        }
    }

}
