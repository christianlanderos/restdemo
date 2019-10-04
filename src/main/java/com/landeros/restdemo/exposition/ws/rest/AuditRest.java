package com.landeros.restdemo.exposition.ws.rest;

import java.util.Date;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.landeros.restdemo.exposition.api.dto.ResultDTO;

@RestController
@CrossOrigin(origins = "http://localhost:9080")
@RequestMapping(value="/audit-trails")
public class AuditRest {

	
	@RequestMapping("/secured")
    public String secured(){
        System.out.println("Inside secured()");
        return "Hello user !!! : " + new Date();
    }
	
	@RequestMapping(method=RequestMethod.POST, consumes="application/json", produces="application/json")
	public ResultDTO create(@RequestBody String message) {
		
		ResultDTO resultDTO = new ResultDTO();
		resultDTO.setResponseMessage("Success");
		resultDTO.setResponseCode(200);

		System.out.println("######### Mensaje: " + message);
		
		return resultDTO;
	}
}
