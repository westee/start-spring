package hello;

import hello.dao.UserMapper;
import hello.service.RankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class HelloController {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RankService rankService;

    @RequestMapping("/")
    @ResponseBody
    public Object search(HttpServletRequest request, HttpServletResponse response) {
        return rankService.getRank();
//        return userMapper.getUserById(1);
    }

}