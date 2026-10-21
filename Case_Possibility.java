import java.util.*;
public class Case_Possibility{
    public static List<String> Permutation(String s){
        List<String> result = new ArrayList<>();
        generate(s.toCharArray(), 0, result);
        return result;
    }
    public static void generate(char[] chars, int index, List<String> result){
        if (index == chars.length){
            result.add(new String(chars));
            return;
        }
        if (Character.isLetter(chars[index])){
            chars[index] = Character.toLowerCase(chars[index]);
            generate(chars, index + 1, result);

            chars[index] = Character.toUpperCase(chars[index]);
            generate(chars, index + 1, result);
        }else{
            generate(chars, index + 1, result);
        }
    }
    public static void main(String[] args) {
        String s = "Tawseef Mamun Aayan";
        List<String> result = Permutation(s);
        System.out.println(result);
    }
}