import java.util.HashSet;
import java.util.Iterator;
public class List05_06 {
    public static void main(String[] args) {
        HashSet<String>set=new HashSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        
        Iterator<String> it=set.iterator();
        while(it.hasNext()) {
            String str=it.next();
            System.out.println(str);
        }
    }

}