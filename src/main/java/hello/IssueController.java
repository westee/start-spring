package hello;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("repos") // 指定根路径
public class IssueController {
    @DeleteMapping("/{owner}/{repo}/issues/{issueNumber}/lock")
    public void unlock(
            @PathVariable("owner") String owner,
            @PathVariable("repo") String repo,
            @PathVariable("issueNumber") String issueNumber
    ){
        System.out.println(owner);
        System.out.println(repo);
        System.out.println(issueNumber);
    }

    @PostMapping("/{owner}/{repo}/issues")
    public void create(
            @PathVariable("owner") String owner,
            @PathVariable("repo") String repo,
            @RequestBody Object object
    ){
        System.out.println(object);
    }
}
