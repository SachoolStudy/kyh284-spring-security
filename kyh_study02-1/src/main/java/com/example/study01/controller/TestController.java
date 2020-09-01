package com.example.study01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.study01.service.TestService;
import com.example.study01.vo.TestVO;

@RestController
public class TestController {
	@Autowired
	private TestService testService;
	
	@RequestMapping("/getMold")
	public List<TestVO> getMold() throws Exception{
		
		return testService.getMold();
	}
	
	@RequestMapping(value="/test")
    public ModelAndView test() throws Exception{
        return new ModelAndView("test");
    };
    
    @GetMapping("/loginSuccess")
	public String loginSuccess() {
		return "success";
	}
}
