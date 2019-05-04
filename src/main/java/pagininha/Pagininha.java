package pagininha;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Pagininha {
	
//	@RequestMapping("/hi")
//	public @ResponseBody String hiThere() {
//		return "Hello World!";
//	}
	
	@RequestMapping("/hi/{name}")
	public String hiThere( Map model, @PathVariable String name) {		
		model.put("name", name);
		return "hello";
	}
	
	@RequestMapping("/tokens")
	public String tokens(Model model) {
		
		Token token = new Token();		
		model.addAttribute("token", token);
		
		return "tokens";
	}
	
	@RequestMapping(value = "/validarTokens", method=RequestMethod.POST)
	public String processForm(@ModelAttribute(value="token") Token token) {
		
		System.out.println("...passando pelo validarTokens...");
//		System.out.println(token.getIddev());
//		System.out.println(token.getTokendev());
//		System.out.println(token.getIdhom());
//		System.out.println(token.getTokenHom());
//		System.out.println(token.getIdprod());
//		System.out.println(token.getTokenProd());
		
		TokensCommand command = new TokensCommand();

		command.validarCredenciais(token);

		return "tokens";
	}	

}
