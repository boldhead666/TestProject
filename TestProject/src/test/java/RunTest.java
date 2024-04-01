import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class RunTest {
    @Test
    public void openTest(){
        System.out.println("Go");
        open("https://www.google.ru/?hl=ru");
    }
}
