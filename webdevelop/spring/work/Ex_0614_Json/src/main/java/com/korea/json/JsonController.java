package com.korea.json;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import vo.PersonVO;

@Controller
public class JsonController {
	@RequestMapping("/vo_to_json")
	@ResponseBody
	public PersonVO voJson() {
		PersonVO vo = new PersonVO();
		vo.setName("홍길동");
		vo.setAge(30);
		vo.setAddr("인천시 부평구");
		return vo;
	}
	
	@RequestMapping("/map_to_json")
	@ResponseBody
	public HashMap<String, Object> mapJson(){
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		map.put("name", "김길동");
		map.put("age", 20);
		
		HashMap<String, String> tel_map = new HashMap<String, String>();
		tel_map.put("home", "010-1111-1111");
		tel_map.put("tel", "010-2222-2222");
		
		map.put("tel", tel_map);
		
		return map;
 	}
	
	@RequestMapping("/list_to_json")
	@ResponseBody
	public List<PersonVO> listJson(){
		List<PersonVO> list = new ArrayList<PersonVO>();
		
		PersonVO p1 = new PersonVO();
		p1.setName("홍길동");
		p1.setAge(30);
		p1.setAddr("인천시 부평구");
		
		PersonVO p2 = new PersonVO();
		p2.setName("홍길동");
		p2.setAge(30);
		p2.setAddr("인천시 부평구");
		
		list.add(p1);
		list.add(p2);
		
		return list;
 	}
	
	@RequestMapping("/json_to_object")
	public String jsonObject(Model model) throws JsonParseException, JsonMappingException, IOException {
//		String jsonArrStr = "[{\"name\":\"Anna\", \"age\":30, \"addr\":\"인천시 부평구\" },{\"name\":\"James\", \"age\":20, \"addr\":\"인천시 계양구\"}]";
		String jsonStr = "{\"name\":\"Anna\", \"age\":30, \"addr\":\"인천시 부평구\"}";
		ObjectMapper objectMapper = new ObjectMapper();
		
		PersonVO vo = objectMapper.readValue(jsonStr, PersonVO.class);
		System.out.println(vo.getName());
		System.out.println(vo.getAge());
		System.out.println(vo.getAddr());
		
		model.addAttribute("vo", vo);
		return "jsonTest";
		
	}
	
	@RequestMapping("/json_to_map")
	public String jsonMap(Model model) throws JsonParseException, JsonMappingException, IOException {
//		String jsonArrStr = "[{\"name\":\"Anna\", \"age\":30, \"addr\":\"인천시 부평구\" },{\"name\":\"James\", \"age\":20, \"addr\":\"인천시 계양구\"}]";
		String jsonStr = "{\"name\":\"Anna\", \"age\":30, \"addr\":\"인천시 부평구\"}";
		ObjectMapper objectMapper = new ObjectMapper();
		
		Map<String, Object> jsonMap = objectMapper.readValue(jsonStr, new TypeReference<Map<String, Object>>(){});
		
		model.addAttribute("jsonMap",jsonMap);
		return "jsonTest";
		
	}
	
	@RequestMapping("/json_to_list")
	public String jsonList(Model model) throws JsonParseException, JsonMappingException, IOException {
		String jsonArrStr = "[{\"name\":\"Anna\", \"age\":30, \"addr\":\"인천시 부평구\" },{\"name\":\"James\", \"age\":20, \"addr\":\"인천시 계양구\"}]";
		ObjectMapper objectMapper = new ObjectMapper();
		
		List<PersonVO> list = objectMapper.readValue(jsonArrStr, new TypeReference<ArrayList<PersonVO>>() {});
		
		model.addAttribute("list", list);
		
		return "jsonTest2";
	}
	
	@RequestMapping("/outer_json")
	public String outerJson() {
		return "jsonTest3";
	}
	
}
