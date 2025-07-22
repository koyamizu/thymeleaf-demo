package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Person;

@Controller
@RequestMapping("list")
public class PersonController {

	@GetMapping("name")
	public String showNames(Model model) {
		List<String> names=List.of("掛谷","薄井","酒井","金子","高江");
		model.addAttribute("names",names);
		return "demo/name-list";
	}
	
	@GetMapping("person")
	public String showPersons(Model model) {
		List<Person> persons=List.of(
				new Person("掛谷","37","教師")
				,new Person("薄井","25","システムエンジニア")
				,new Person("酒井","40","料理人")
				,new Person("金子","50","内装工")
				,new Person("高江","30","秘書")
				);
		model.addAttribute("persons",persons);
		return "demo/person-list";
	}
	
	public void sample() {
		List<Person> persons=List.of(
				new Person("掛谷","37","教師")
				,new Person("薄井","25","システムエンジニア")
				,new Person("酒井","40","料理人")
				,new Person("金子","50","内装工")
				,new Person("高江","30","秘書")
				);
		for(Person p:persons) {
			System.out.println("こんにちは、"+p.getName()+"（年齢："+p.getAge()+"歳、職業："+p.getOccupation()+"）さん！");
		}
	}
}
