package com.optus.ob.psc.portlet.hello;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller for Hello Portlet
 * @author Changjiang.Wang
 *
 */
@Controller
public class HelloController {

	@RequestMapping("VIEW")
	public String hello(RenderRequest request, RenderResponse response, Model model) {
		model.addAttribute("name", "Mate");
		return "hello";
	}

}