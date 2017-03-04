import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Hasan on 04.03.2017
 */

@Controller
@EnableAutoConfiguration
public class TestController {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(TestController.class, args);
    }

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World";
    }
}
