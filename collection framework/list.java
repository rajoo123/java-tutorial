import java.util.*;

class list{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        // System.out.println("Sant Rampal Ji Maharaj Ji Blessing ME");

    //   List<String> list = new ArrayList<>();

    //   list.add("Banana");
    //   list.add("Apple");
    //   list.add("orange");
    //   System.out.println(list.get(0));
    //   System.out.println(list.getClass());

    List<String> fruites = new ArrayList<>();
    fruites.add("Apple");
    fruites.add("Banana");
    fruites.add("orange");
    fruites.add("cali flower");
    fruites.add("Mango");
    fruites.add(2,"annar");
    fruites.set(2, "lemon");
    fruites.remove(4);
    System.out.println(fruites);

    System.out.println("Enter one item");
    String item = sc.nextLine();
    System.out.println("Enter third item");
    String item1 = sc.nextLine();
    System.out.println("Enter fourth item");
    String item2 = sc.nextLine();

    List<String>ad = new ArrayList<>();
    
    ad.add(item);
    ad.add(item1);
    ad.add(item2);
    System.out.println(ad);


    }
}