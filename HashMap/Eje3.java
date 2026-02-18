import java.util.HashMap;

public class Eje3 {

     public static void main(String[] args) {
        HashMap<Integer, String> datos = new HashMap<>();
        datos.put(1, "A");
        datos.put(2, "B");
        for (Integer k : datos.keySet()) {
            System.out.println(k + " - " + datos.get(k));
        }
    }
}