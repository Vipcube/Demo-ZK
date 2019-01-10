package tw.fondus.demo.zk.spring.boot.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String root() {
		return "index";
	}
	
	@RequestMapping(value = "/Hello", method = RequestMethod.GET)
	public String hello() {
		return "hello";
	}
}

