import java.util.HashSet;
public class List05_05 {
    public static void main(String[] args) {
        HashSet<String>set=new HashSet<String>();
        System.out.println(set.add("Jan"));
        System.out.println(set.add("Feb"));
        System.out.println(set.add("Feb"));
        System.out.println(set.add("Mar"));
        System.out.println(set.add("Apr"));
        
        System.out.println(set);
        
        System.out.println(set.contains("Jan"));
        System.out.println(set.contains("Jun"));
    }
}