package com.fsoft.cicd.controllers;

import com.fsoft.cicd.models.Models;
import com.fsoft.cicd.services.Services;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controllerss {
	Services services = new Services();
	 @GetMapping("/model")
	    @ResponseBody
	    public List<Models> getAll() {
	        return services.getAll();
	    }
}
