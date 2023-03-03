package innerexam;
class LocalTest {
   String name = "Java";
   void pr(String s) {
      int su = 100;      
      System.out.println(s + " : " + su);
      class Local {
         void pr(String ls) {
            System.out.println("s : " + s);   	
            System.out.println("ls : " + ls);   	      
            System.out.println(name);        	
            System.out.println(su);				
            //su++;
         }
      }          
      Local lt = new Local();
      lt.pr("Local Call");
   }
}   
public class InnerTest2 {
   public static void main(String args[]) {
      LocalTest l = new LocalTest();
      l.pr("Main Call");
   }
}





