

public class StringMethods {
    public static void main(String[] args){
        String str="Java Programming";

        System.out.println("Original*********"+str);
        System.out.println("length*********"+str.length());
        System.out.println("Character at index 2*********"+str.charAt(2));
        System.out.println("Uppercase*********"+str.toUpperCase());
        System.out.println("Lowercase*********"+str.toLowerCase());
        System.out.println("Equals*********"+str.equals("Java"));
        System.out.println("Contains*********"+str.contains("J"));
        System.out.println("Starts With*********"+str.startsWith("J"));
        System.out.println("Ends with*********"+str.endsWith("g"));
        System.out.println("Sub string*********"+str.substring(1,7));
        System.out.println("Index of*********"+str.indexOf("i"));
        System.out.println("LastIndex of*********"+str.lastIndexOf("w"));
        System.out.println("Trim*********"+str.trim());
        
        
        



    }
    
}
