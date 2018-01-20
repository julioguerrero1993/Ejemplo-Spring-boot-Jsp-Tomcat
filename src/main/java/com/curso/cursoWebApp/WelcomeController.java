package com.curso.cursoWebApp;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.curso.model.Alumno;

@Controller
public class WelcomeController {
	private Alumno alumno; 
	private String mensage = "Mi curso";
	
	@RequestMapping("/")
	public String index(Map<String, Object>model) {
		this.alumno = generateAlumno();
		model.put("message", this.alumno);
		return "index";
	}
	
	@RequestMapping("/prueba")
	private String pruebaConModel(Model model) {
		ArrayList<Alumno> alumnos = generateArrayAlumnos();
		model.addAttribute("alumnos", alumnos);
		return "index";
	}
	
	private Alumno generateAlumno() {
		return new Alumno("juanitoperez",24);
	}
	
	private ArrayList<Alumno> generateArrayAlumnos() {
		ArrayList<Alumno> alumnos = new ArrayList<>();
		try {
			String[]nombres = new String[3];
			nombres[0]="julio";
			nombres[1]="juan";
			nombres[2]="hola";
			for (int i = 0; i < nombres.length; i++) {
				alumnos.add(new Alumno(nombres[i], i)); 
			}
		} catch (Exception e) {
			alumnos = null;
		}
		return alumnos;
	}
	
}
