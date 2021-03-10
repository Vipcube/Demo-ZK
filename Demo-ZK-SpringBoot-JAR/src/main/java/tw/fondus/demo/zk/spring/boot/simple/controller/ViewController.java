package tw.fondus.demo.zk.spring.boot.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
	@GetMapping( value = "/frame" )
	public String hello() {
		return "frame";
	}
}
