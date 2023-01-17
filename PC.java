import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PC {
    public static void main(String[] args) {
        String reg = "/(\\.|[^[/\\\n]|\\[(\\.|[^\\]\\\n])*])+/([gim]+\\b|\\B);";
        System.out.println("Regex: " + reg);
        String input = "/\\s+/;";
        System.out.println("Input: " + input);
        Pattern pattern = Pattern.compile(reg, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        System.out.println("Result: "+ matcher.find());

    }
}
