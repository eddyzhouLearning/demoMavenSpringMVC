package cn.zz.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class TestController {
	
	@RequestMapping("/hello")
	public ModelAndView test(ModelMap modelMap,@RequestParam(value="test",required=false)String test) throws Exception{
		ModelAndView view = new ModelAndView();
//		view.addObject("helloMsg", "From ModelAndView!");
		modelMap.addAttribute("helloMsg", "From ModelAndView!!!");
		System.out.println(test);
		view.setViewName("hello");
		return view;
	}
}
