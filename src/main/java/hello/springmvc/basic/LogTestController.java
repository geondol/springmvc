package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
//이 어노테이션을 쓰면 그냥 데이터가 넘어감 return이
public class LogTestController {

    //private final Logger log = LoggerFactory.getLogger(LogTestController.class);

    @RequestMapping("/log-test")
    public String logTest(){
        String name = "Spring";

        log.trace("trace my log" + name);
        //위에 처럼 쓰게 되면 필요없는 리소스를 사용하게된다 연산을 하기떄문에

        log.trace("trace log = {}",name);
        //로그의 올바른 사용법은 치환해서 쓴다
        log.debug("debug log = {}",name);
        log.info("info log = {}" , name);
        log.warn("warn log = {}",name);
        log.error("error log = {}",name);

        return "ok";
    }

}
