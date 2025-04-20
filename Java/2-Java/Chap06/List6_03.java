class StudentCard1 {
    int id;
    String name; 
     StudentCard1(){
            System.out.println("引数のないコンストラクタが実行されました");
            this.id=0;
            this.name="未定";
         }
     StudentCard1(String name){
            System.out.println("引数が1つのコンストラクタが実行されました");
            this.id=0;
            this.name=name;
         }
     StudentCard1(int id,String name){
            System.out.println("引数が2つのコンストラクタが実行されました");
            this.id=id;
            this.name=name;
         }
     }
public class List6_03 {
     public static void main(String[] args) {
         StudentCard1 a = new StudentCard1 ();
         System.out.println("aのidの値は " + a.id);
            System.out.println("aのnameの値は " + a.name);
      
            StudentCard1 b = new StudentCard1 ("Sanjid");
            System.out.println("bのidの値は " + b.id);
               System.out.println("bのnameの値は " + b.name);
                 
             StudentCard1 c = new StudentCard1 (1235, "Ian");
          System.out.println("cのidの値は " + c.id);
               System.out.println("cのnameの値は " + c.name);       
     }
}