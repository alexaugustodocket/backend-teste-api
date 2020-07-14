package br.com.docket.desafiobackend.desafiobackend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@GetMapping
	public String links() {
		return "redirect:/api/v1/certidoes";
	}
}
