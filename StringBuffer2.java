class StringBuffer2{
    public static void main(String[] args) {
       StringBuilder sb = new StringBuilder("Hello");
   sb.append(" World");
//    sb.append(" Do You Know Sant Rampal ji Maharaj Ji Is My Real God");

   System.out.println(sb);   // Hello World

//    sb.insert(1, "java");
//    sb.insert(2, "java");

   sb.replace(0, 3, "Hello wolrd ");
   sb.delete(0, 5);
   System.out.println(sb);
   StringBuilder d = new StringBuilder("java");
   // d.deleteCharAt(0);
   // d.delete(0, 2);
   // d.reverse();
   // d.capacity();
   // d.length();
   // System.out.println(d.capacity());
   System.out.println(d.charAt(1));

    }
}