package org.javabase.apps.controller.institutionSettings;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/institution")
public class InstitutionController {
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
    public String studentPage() {
        return "institution/institution";
    }
	
}
