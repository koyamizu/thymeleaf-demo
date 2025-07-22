package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.PhysicalExamination;
import com.example.demo.form.PhysicalExaminationForm;
import com.example.demo.helper.PhysicalExaminationConverter;

@Controller
@RequestMapping("/physical-examination")
public class PhysicalExaminationController {
	
	@GetMapping("form")
	public String showForm(PhysicalExaminationForm form, Model model) {
		model.addAttribute("form", form);
		return "demo/exam-form";
	}

	@PostMapping("result")
	public String showBmiResult(PhysicalExaminationForm form, Model model) {
		PhysicalExamination result = PhysicalExaminationConverter.convertPhysicalExaminationEntity(form);
		model.addAttribute("result", result);
		return "demo/bmi-result";
	}
}
