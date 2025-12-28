
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class colection_framework{
    public static void main(String[] args) {
    //  System.out.println("Sant Rampal Ji Maharaj Ji Blessing ME");       

    List<String> fruite =  new  ArrayList<>();
   
   fruite.add("Apple");
   fruite.add("Banana");
   fruite.add("orange");
   fruite.add("carrot");
   fruite.add("candy finger");
   System.out.println("Fruites List " + fruite);
   System.out.println("list fruite " + fruite.get(0));
   fruite.remove("Banana");
   System.out.println("list fruite After Remove "+ fruite);

//    for(String frut : fruite){
//       System.out.println(frut);
//    }
//     if(fruite.contains("orange")){
//         System.out.println("Orange is in list");
//     } else{
//         System.out.println("No This contains in the list");
//     }

     fruite.forEach(f-> System.out.println(f));
     Collections.sort(fruite);
     System.out.println("sorted List " + fruite);
     Collections.sort(fruite,Collections.reverseOrder());
     System.out.println("un order " + fruite);

     List<String> filtred = fruite.stream().filter(f-> f.startsWith("A")).toList();
     System.out.println(filtred);

     List<String> filter2 = fruite.stream().filter(f->f.startsWith("o")).toList();
     System.out.println(filter2);

     fruite.removeIf(f->f.contains("carrot"));
     System.out.println(fruite);
     List<String> upper = fruite.stream().map(String::toUpperCase).toList();
     System.out.println(upper);

     List<Integer> nums = List.of(1,2,3,4);
  List<Integer> squre = nums.stream().map(n-> n*n).toList();

     
     System.out.println(squre);                      

    }
    
}