import java.util.Scanner;
public class mojihikaku_equals {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
    	
    	String foo = "foo";
    	String bar = "bar";
    	if(foo.equals(bar)) {
    		System.out.println("fooとbar一緒です。");
    	}else {
    		System.out.println("fooとbar違いです。");
    	}
    	System.out.println("fooと入力⇒");
    	String bar2=stdin.next();
    	
    	if (foo == bar2) {
   	 	   System.out.println("fooとbar2一緒です。");
   	    }else {
   		   System.out.println("fooとbar2違いです。");
   	    }
    	stdin.close();
    }

}
