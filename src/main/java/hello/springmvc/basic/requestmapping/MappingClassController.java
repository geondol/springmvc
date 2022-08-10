package hello.springmvc.basic.requestmapping;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mapping/users")
public class MappingClassController {

    @GetMapping
    public String user(){
        return "get users";
    }

    @PostMapping
    public String addUser(){
        return "post user";
    }

    @GetMapping("/{userid}")
    public String findUser(@PathVariable String userid){
        return "get userId=" + userid;
    }

    @PatchMapping ("/{userid}")
    public String updateUser(@PathVariable String userid){
        return "update userId=" + userid;
    }

    @DeleteMapping  ("/{userid}")
    public String deleteUser(@PathVariable String userid){
        return "delete userId=" + userid;
    }
}
