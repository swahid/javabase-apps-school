/**
 * 
 */
package org.javabase.apps.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;

/**
 * @author medisys
 *
 */
@ControllerAdvice
public class BaseError {

	@ExceptionHandler(NoHandlerFoundException.class)
	public String handle(Exception ex) {
	    return "redirect:/404";
	}
}
