package com.jpa_project.common;

import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Order
@ControllerAdvice()
public class GestionPrenotazioneExceptionHandler extends ResponseEntityExceptionHandler{

	public GestionPrenotazioneExceptionHandler() {
		super();
		// TODO Auto-generated constructor stub
	}

}
