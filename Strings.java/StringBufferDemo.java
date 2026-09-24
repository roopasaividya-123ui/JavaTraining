

public class StringBufferDemo {
    public static void main(String[] args){
        StringBuffer sb =new StringBuffer("Java");
        
        System.out.println("Original========"+sb);

        sb.append("Programming");

        System.out.println("After append========"+sb);

        sb.insert(5,"is");
         System.out.println("After insert========"+sb);

         sb.replace(0,5,"difficult");
         System.out.println("After replace========"+sb);

         sb.delete(3,6);
         System.out.println("After delete========"+sb);

         sb.reverse();
         System.out.println("After reverse========"+sb);

         System.out.println(sb.capacity());

         System.out.println(sb.indexOf("r"));

         System.out.println(sb.charAt(2));





    }
    
}
