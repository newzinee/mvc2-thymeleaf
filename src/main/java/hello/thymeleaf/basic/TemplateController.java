package hello.thymeleaf.basic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yjjung
 * @version 0.1.0
 * @since 2021/08/08
 */
@RequestMapping("/template")
public class TemplateController {


    @GetMapping("/fragment")
    public String tempalate() {
        return "template/fragment/fragmentMain";
    }
}
