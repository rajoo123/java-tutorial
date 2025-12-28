
import java.util.*;



class set{
    public static void main(String[] args) {
        System.out.println("Sant Rampal Ji Maharaj Ji is the Complete God");

        Set<String> set = new HashSet<>();  
        set.add("java");
        set.add("spring boot");
        set.add("java");
        set.add("designer");
        set.add("Application");
        set.add("front end");
        

        System.out.println(set);

        Set<String> set2 = new LinkedHashSet<>();

        set2.add("java");
        set2.add("developer");
        set2.add("spring boot");
        set2.add("front End");
        set2.add("desingner");
        // set2.addAll(set);

        System.out.println(set2);




              
        
    }
}