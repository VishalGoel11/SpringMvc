package springmvc4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	@RequestMapping(value="/hello")
	public String display() {
		System.out.println("This is vishal goel ");
		return "hello";
	}

}
