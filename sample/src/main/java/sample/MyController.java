package sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping("/hello")
	public ModelAndView displayMsg()
	{
		String msg="This is an example of Spring mvc!";
		ModelAndView mv=new ModelAndView("hello","message",msg);
		return mv;
	}
	
	@RequestMapping("/xyz")
	public String getAboutPage()
	{
		return "AboutUsPage";
	}

}
