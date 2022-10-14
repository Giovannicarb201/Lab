public class Main {
    public static void main(String[] args) {
        String[] words = {"", "a", "alice", "bob", "pippo", "pluto"};

        for (String word : words) {
            String results="";
            if(word.length()>0){
                String s1=word.substring(0,1);
                String s2=word.substring(1,word.length());
                s1=s1.toUpperCase();
                results=s1.concat(s2);
            }
            System.out.println(results);
        }
    }
}