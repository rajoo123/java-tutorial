import  java.util.*;
class vector {
    public static void main(String[] args) {
        // System.out.println("Sant Rampal Ji Maharaj Ji Blessing Me ");
        ArrayList<String> list = new ArrayList<>();
        list.add("Adil");
        list.add("shoaib");
        list.add("Sunil");
         
        // System.out.println(list.get(1));
        // System.out.println(list.contains("Adil"));

      Vector<String> li = new Vector();
      li.addAll(list);
      System.out.println(li);
      // li.add("Adil");
      // li.add("sunil");
      // li.add("Adil");
      // li.set(0, "sajjad");
      // li.add(0, "sahaj dass");
      // li.remove(0);
      // li.firstElement();

      System.out.println(li);
    }
}