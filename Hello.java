import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
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

      List<Integer> list=Arrays.asList(1,5,3,5,9,9,2,5);

      int[] arr=new int[]{1,5,2,4,2,5,1,6,4,6};

      Hello h=new Hello();
      h.bystreams(map);
      h.secondlargest(list);
      h.removeduplicates(arr);
      h.removebylist(arr);
      

    }

    private void bystreams(Map<String,Integer> map) {
        Map<String,Integer> sortedmap=map.entrySet().stream().sorted((i1,i2)->i1.getKey().compareTo(i2.getKey())).
        collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));

        System.out.println(sortedmap);
    }

    private void secondlargest(List<Integer> list){
      int second=list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
      System.out.println(second);
    }

    private void removeduplicates(int[] arr){
      int[] temp=new int[arr.length];
      Arrays.sort(arr);
      int count=0;
      for(int i=0;i<arr.length-1;i++){
       
          if(arr[i]==arr[i+1]){
            temp[count]=arr[i];
            count++;
          }
        }
        temp[count]=arr[arr.length-1];
        count++;
        for(int i=0;i<count;i++){
          arr[i]=temp[i];
        }
      
      System.out.println("==============================\n");
      for(int i=0;i<count-1;i++) {
        System.out.println(arr[i]);
      }
     
    }

    private void removebylist(int[] arr){
      // List<Integer> list=Arrays.stream(arr).boxed().distinct().sorted().collect(Collectors.toList());
      // System.out.println("===============");
      // list.stream().distinct().sorted().forEach(System.out::println);
      // System.out.println(list);
      int second=Arrays.stream(arr).boxed().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
      System.out.println("Second== "+second);
    }
}