package com.optus.ob.psc.portlet.clock;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TimeZone;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletMode;
import javax.portlet.PortletPreferences;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Controller for Clock Portlet
 * @author Changjiang.Wang
 *
 */
@Controller
public class ClockController {

	@RequestMapping("VIEW")
	public String view(RenderRequest request, RenderResponse response, Model model) {
		PortletPreferences prefs = request.getPreferences();
		String city = prefs.getValue("city", "Australia/Sydney");
		long now = System.currentTimeMillis();
		long offset = TimeZone.getTimeZone(city.replace(' ', '_')).getOffset(now);
		String offsetString = (double) offset / 1000 / 60 / 60 + "";
		model.addAttribute("city", city.substring(city.indexOf("/") + 1));
		model.addAttribute("offset", offsetString);
		return "clock";
	}

	@RequestMapping("EDIT")
	public String edit(RenderRequest request, RenderResponse response, Model model) {
		PortletPreferences prefs = request.getPreferences();
		model.addAttribute("city", prefs.getValue("city", ""));
		
		String cities = prefs.getValue("cities", "");
		Map<String, String> cityMap = new LinkedHashMap<String, String>();
		for (String city : cities.split(";")) {
			cityMap.put(city.substring(city.indexOf("/") + 1), city);
		}
		model.addAttribute("cities", cityMap);
		
		return "clockedit";
	}

	@RequestMapping(value="EDIT", params="action=changeCity")
	public void changeCity(ActionRequest request, ActionResponse response,
			@RequestParam String city) throws Exception {
		PortletPreferences prefs = request.getPreferences();
		prefs.setValue("city", city);
		prefs.store();
		response.setPortletMode(PortletMode.VIEW);
	}
	
	@RequestMapping("HELP")
	public String help(RenderRequest request, RenderResponse response) {
		return "help";
	}
	
}