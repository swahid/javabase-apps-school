package org.javabase.apps.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class DashboardController {
	
	private static final Logger log = LoggerFactory.getLogger(DashboardController.class);
	
	@RequestMapping(value = { "/dashboard"}, method = RequestMethod.GET)
	public String dashboard() {
		log.info("Welcome Dashboard! ");
		return "dashboard";
	}
	
}
