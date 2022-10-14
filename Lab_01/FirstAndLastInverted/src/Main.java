public class Main {
    public static void main(String[] args) {
        String[] words = {"c","ac","pippo"};

        for (String word : words) {
            String result;
            if(word.length()<2){
                result="Stringa corta";
            }else {
                    String s1 = word.substring(0, 1);
                    String s2 = word.substring(word.length() - 1);
                    String s3 = "";
                    if(word.length()>2){
                        s3=word.substring(1, word.length() - 1);
                    }
                    result=s2+s3+s1;
            }
            System.out.println(result);
        }
    }
}