package hello;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String search(@RequestParam("q") String searchKeyword,
                         @RequestParam(value="charset",required=false)String charset) {
        return "关键字是" + searchKeyword;
    }

}