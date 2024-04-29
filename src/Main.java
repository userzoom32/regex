import java.util.Map;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String str1 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        str1 = "and";
        str2 = " and";
        str3 = "and ";
        str4 = " and ";
        str5 = "  and   ";
        String regex1 = "and";
        System.out.println(str1.matches(regex1));
        System.out.println(str2.matches(regex1));
        System.out.println(str3.matches(regex1));
        System.out.println(str4.matches(regex1));
        System.out.println(str5.matches(regex1));
        String regex2 = " and ";
        System.out.println();
        System.out.println(str1.matches(regex2));
        System.out.println(str2.matches(regex2));
        System.out.println(str3.matches(regex2));
        System.out.println(str4.matches(regex2));
        System.out.println(str5.matches(regex2));
        System.out.println();
        String regex3 = " ?and ?";
        System.out.println(str1.matches(regex3));
        System.out.println(str2.matches(regex3));
        System.out.println(str3.matches(regex3));
        System.out.println(str4.matches(regex3));
        System.out.println(str5.matches(regex3));
        System.out.println();
        String regex4 = " *and *";
        System.out.println(str1.matches(regex4));
        System.out.println(str2.matches(regex4));
        System.out.println(str3.matches(regex4));
        System.out.println(str4.matches(regex4));
        System.out.println(str5.matches(regex4));
        System.out.println();
        String regex5 = "[abc]?";
        str1 = "a";
        str2 = "b";
        str3 = "c";
        str4 = "";
        str5 = "ab";
        System.out.println(str1.matches(regex5));
        System.out.println(str2.matches(regex5));
        System.out.println(str3.matches(regex5));
        System.out.println(str4.matches(regex5));

        str1 = "+375";
        str2 = "80";
        String regex6 = "\\+375|80";
        System.out.println();
        System.out.println(str1.matches(regex6));
        System.out.println(str2.matches(regex6));

        str1 = "+375291234567";
        str2 = "+375449876546";
        str3 = "+375339876543";
        str4 = "+37529987654";
        str5 = "+375889876541";
        System.out.println();
        String regex7 = "\\+375(29|44|33|66)[0-9]{7}";
        System.out.println(str1.matches(regex7));
        System.out.println(str2.matches(regex7));
        System.out.println(str3.matches(regex7));
        System.out.println(str4.matches(regex7));
        System.out.println(str5.matches(regex7));

        str1 = "+375 29 1234567";
        str2 = "+375(44)9876546";
        str3 = "+375339876543";
        str4 = "+37529987654";
        str5 = "+375449876541";

        String regex8 = "\\+375[ (]?(29|44|33|66)[ )]?[0-9]{7}";
        System.out.println(str1.matches(regex8));
        System.out.println(str2.matches(regex8));
        System.out.println(str3.matches(regex8));
        System.out.println(str4.matches(regex8));
        System.out.println(str5.matches(regex8));

        String regex9 = "(\\+375|80)[ (]?(29|44|33|66)[ )]?[0-9]{7}";

        str1 = "+375 29 1234567";
        str2 = "+375(44)9876546";
        str3 = "+375339876543";
        str4 = "+37529987654";
        str5 = "80449876541";
        System.out.println();

        System.out.println(str1.matches(regex9));
        System.out.println(str2.matches(regex9));
        System.out.println(str3.matches(regex9));
        System.out.println(str4.matches(regex9));
        System.out.println(str5.matches(regex9));



        String regex10 = "[A-Z][a-z]+ +[A-Z][a-z]+ +[A-Z][a-z]+";
        str1="Ivanov Ivan Ivanivich";
        str2="ivanov Ivan Ivanovich";
        str3= "I Ivan Ivanbovich";
        str4 = "Ivan Ivanovich";
        str5="Iv Iv Iv";
        System.out.println();

        System.out.println(str1.matches(regex10));
        System.out.println(str2.matches(regex10));
        System.out.println(str3.matches(regex10));
        System.out.println(str4.matches(regex10));
        System.out.println(str5.matches(regex10));

        System.out.println();
        String regex11 = "([A-Z][a-z]+\\s*){3}";
        System.out.println(str1.matches(regex11));
        System.out.println(str2.matches(regex11));
        System.out.println(str3.matches(regex11));
        System.out.println(str4.matches(regex11));
        System.out.println(str5.matches(regex11));

    }
}
