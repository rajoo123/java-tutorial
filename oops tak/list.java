
import java.util.ArrayList;
import java.util.List;

class User{
    int id ;
    String Name;

    public User(int id , String Name) {

        this.id= id;
        this.Name = Name;
    }

    public String toString(){

        return  "User{id"+id+ ", name='" + Name+"'}";
    }

}
class list{

    public static void main(String[] args) {
        // System.out.println("Sant Rampal Ji Maharaj Is My Real God Blessing ME ");
 
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("orange");
        list.add("Apple");
        list.add("Bag");

        System.out.println(list.get(0));
        System.out.println(list.size());
        for(String s : list)      
        System.out.println(s);
       
        List<String> filter = list.stream().filter(f->f.startsWith("A")).toList();
        System.out.println(filter);
       
       List<User> users = new ArrayList<>();
       users.add(new User(1,"Adil"));
       users.add(new User(2,"sunil"));
       users.add(new User(3,"Sajjad"));
      
    

    //    System.out.println(users);

    // Iterator<User> it = users.iterator();
    // while(it.hasNext()){
    //     User u = it.next();
    //     System.out.println(u.id + u.Name);
    // }

    // for(int i=0 ; i < list.size();i++){
    //    System.out.println("the for loop " + list.get(i));
    // }

    // Iterator <String> it = list.iterator();

    // while(it.hasNext()){
          
    //       String s = it.next();
    //     if(s.equals("Apple")){
    //         it.remove();
    //     }

    //     System.out.println("iteratot " + it.next());
    // }

    }
}