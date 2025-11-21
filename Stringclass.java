class Stringclass{
    public static void main(String args[]){
        // System.out.println("Samrath Sat Kabir");
        // System.out.println("Sant Rampal Ji Maharaj blessing me ");

     String a = "hello";
     String b = "hello";
     System.out.println(a+ " "+b);
     System.out.println(a==b);
     System.out.println("");

     String x = new String("java");

     String y = new String("java");
// compare the value thats is same 
    //  System.out.println( a.equals(b));
    String s = "hello";
    System.out.println(" length "+s.length());
    System.out.println("charAt "+  s.charAt(1));
    System.out.println("equal "+ s.equals("hello"));
    System.out.println("equalsignorecase "+ s.equalsIgnoreCase("java"));
    System.out.println("compare to "+ s.compareTo("world"));
    System.out.println ("substring "+ s.substring(3));
    System.out.println("contains "+ s.contains("R"));
    System.out.println("indexof " + s.indexOf("o"));
    System.out.println("lastindexof "+ s.lastIndexOf("l"));
    System.out.println("indexof "+ s.indexOf("l"));
    System.out.println("uppercase "+ s.toUpperCase());
    System.out.println("trim "+ s.trim());
    System.out.println(s.replace("hello", "God is one he is a Kabir saheb ji "));
    String [] arr = s.split(" ");
    for(String item : arr){
    System.out.println(item);
    s = s.concat(" world");
    System.out.println(s);
    

    }



    }
}