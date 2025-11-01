public class StringTut{  // String is a in-built class in java 
    public static void main(String[] args){ // static int

        String s1=new String("Hello");
        System.out.println(s1);
        // String buffer gives 16 byotes of extra storage

        StringBuffer sb=new StringBuffer("Hello"); 
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append(" Bitch");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.hashCode());

        
        //String Builder : not thread-safe
        StringBuilder sbuild=new StringBuilder("Hello"); 
        System.out.println(sbuild.length());
        System.out.println(sbuild.capacity());
    }
    
}