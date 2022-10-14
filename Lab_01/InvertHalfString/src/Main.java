public class Main {
   public static void main(String[] args) {
      String[] words = {"c","ac","ciao","pippo"};

      for (String word : words) {
         String result;

         if(word.length()<2){
            result="Stringa corta";
         }else{
            String s1=word.substring(0,word.length()/2);
            String s2=word.substring(word.length()/2);
            result=s2.concat(s1);
         }

         System.out.println(result);
      }
   }
}