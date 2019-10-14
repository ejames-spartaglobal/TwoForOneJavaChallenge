package TwoOne;

import java.util.Arrays;

public class TwoForOneSolution
{
    public static void main(String[] args) {
        String string1="gjoccemfjeosm";
        String string2="gnvdnfn";

        longest(string1,string2);
    }

    public static String longest (String s1, String s2) {

        StringBuilder stringBuilder = new StringBuilder();

        String string3 = s1+s2;
        char[] characters=string3.toCharArray();
        //string3.chars().distinct().forEach(c->stringBuilder.append((char) c));
        Arrays.sort(characters);
        String sortedString= new String(characters);
        sortedString.chars().distinct().forEach(c->stringBuilder.append((char) c));
        System.out.println(sortedString);

        return sortedString;
    }
}
