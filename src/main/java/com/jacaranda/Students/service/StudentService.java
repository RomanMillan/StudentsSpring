package com.jacaranda.Students.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jacaranda.Students.model.Student;

@Service
public class StudentService {

	private List<Student> lista;
	
	public StudentService() {
		lista = new ArrayList<Student>();
		lista.add(new Student("Inma","Olias",25));
		lista.add(new Student("Paco","Olias",45));
		lista.add(new Student("Juan","Olias",33));
		lista.add(new Student("Marta","Olias",15));
	}
	
	public List<Student> getStudents(){
		return lista;
	}
	
	public boolean addStudent(Student e) {
		return lista.add(e);
	}
	
	public boolean removeStudent(Student e) {
		return lista.remove(e);
	}
	
	public Student getStudent(String nombre, String apellido) {
		Boolean encontrado = false;
		Student resultado = null;
		
		Iterator<Student> puntero = this.lista.iterator();
		while(puntero.hasNext()&& !encontrado) {
			resultado = puntero.next();
			if(resultado.getName().equals(nombre) && resultado.getSurname().equals(apellido)) {
				encontrado = true;
			}
		}
		if(encontrado == true)
			return resultado;
		else
			return null;
	}
	
	public Boolean updateStudent(String nombre, String apellido, int edad) {
		Boolean encontrado = false;
		Student resultado = null;
		
		Iterator<Student> puntero = this.lista.iterator();
		while(puntero.hasNext()&& !encontrado) {
			resultado = puntero.next();
			if(resultado.getName().equals(nombre) && resultado.getSurname().equals(apellido)) {
				resultado.setAge(edad);
				encontrado = true;
			}
		}
		return encontrado;
	}
	
	
	
}
