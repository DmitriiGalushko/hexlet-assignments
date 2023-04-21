package exercise;

import java.util.List;
import org.junit.platform.commons.util.StringUtils;
import java.util.Arrays;

// BEGIN
public class App {
    public static int getCountOfFreeEmails(List<String> emailList) {
        int amount1 = (int) emailList.stream()
                .filter(email -> StringUtils.isNotBlank(email))
                .filter(email -> email.endsWith("gmail.com"))
                .count();
        int amount2 = (int) emailList.stream()
                .filter(email -> StringUtils.isNotBlank(email))
                .filter(email -> email.endsWith("yandex.ru"))
                .count();
        int amount3 = (int) emailList.stream()
                .filter(email -> StringUtils.isNotBlank(email))
                .filter(email -> email.endsWith("hotmail.com"))
                .count();
        return amount1 + amount2 + amount3;
    }
}
// END
