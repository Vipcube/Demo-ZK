package tw.fondus.demo.zk.spring.boot.mvvm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
	@GetMapping( value = "/basic" )
	public String basic() {
		return "basic";
	}

	@GetMapping( value = "/template" )
	public String template() {
		return "template";
	}

	@GetMapping( value = "/global_command" )
	public String globalCommand() {
		return "global_command";
	}

	@GetMapping( value = "client_binding" )
	public String clientBinding(){
		return "client_binding";
	}

	@GetMapping( value = "flow_control" )
	public String flowsControl(){
		return "flow_control";
	}
}
