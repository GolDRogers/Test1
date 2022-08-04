import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Hello{
    public static void main(String[] args) {
      Map<String,Integer> map=new HashMap<>();
      map.put("E", 1);
      map.put("D", 2);
      map.put("C", 3);
      map.put("B", 4);
      map.put("A", 5);
      Hello h=new Hello();
      h.bystreams(map);

    }

    private void bystreams(Map<String,Integer> map) {
        Map<String,Integer> sortedmap=map.entrySet().stream().sorted((i1,i2)->i1.getKey().compareTo(i2.getKey())).
        collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));

        System.out.println(sortedmap);
    }
}