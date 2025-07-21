package com.example.demo.helper;

import com.example.demo.entity.PhysicalExamination;
import com.example.demo.form.PhysicalExaminationForm;

public class PhysicalExaminationConverter {

	public static PhysicalExamination convertPhysicalExaminationEntity(PhysicalExaminationForm form) {
		return new PhysicalExamination(form.getHeight(),form.getWeight());
	}
}
