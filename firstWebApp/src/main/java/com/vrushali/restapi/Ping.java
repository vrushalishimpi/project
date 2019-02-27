package com.vrushali.restapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// http://localhost:8080/firstWebApp/ping/status
@Controller
@RequestMapping(value = "/ping")
public class Ping {

	@ResponseBody
	@RequestMapping(value = "/status")
	public String getStatus() {
		return "Succes";
	}
	
}
