import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        
        Map<String, Country> map = new HashMap<String, Country>();
        map.put("AR", new Country("Argentina", 54, "ARG"));
        map.put("UY", new Country("Uruguay", 598, "UY"));
        map.put("CL", new Country("Chile", 56, "CL"));
        map.put("BO", new Country("Bolivia", 591, "BO"));
        map.put("PE", new Country("Peru", 51, "PE"));
        map.put("PY", new Country("Paraguay", 596, "PY"));
        map.put("CO", new Country("Colombia", 57, "CO"));

        
        System.out.println(new Date());
        System.out.println("Ingrese el codigo del pais: ");
        String code = System.console().readLine().toUpperCase();
        while (!map.containsKey(code)) {
            System.out.println("Ingrese un codigo valido: ");
            code = System.console().readLine();
        }
        System.out.println("NOMBRE DEL PAIS: " + map.get(code).getName());
        System.out.println("CODIGO DEL PAIS: " + map.get(code).getCode());
        System.out.println(new Date());
    }
}