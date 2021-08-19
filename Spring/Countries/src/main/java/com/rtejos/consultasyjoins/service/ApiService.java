package com.rtejos.consultasyjoins.service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rtejos.consultasyjoins.repository.Consulta1Repo;

@Service
public class ApiService {
	
	@Autowired
	Consulta1Repo consulta1Repo;
	
	//1
	public List<String> busqueda1(){
		List<String> resp = new ArrayList<String>();
		List<Object[]> lista = consulta1Repo.buscapaiseshablaSloveno();
		for (Object[] row : lista) {
			String country_name = (String) row[0];
			String language_language = (String) row[1];
			float language_percentage = (float) row[2];
			resp.add(country_name + ":" + language_language + ":" + language_percentage);
		}
		System.out.println(resp);
		return resp;
	}
	
	
	//2
	public List<String> busqueda2(){
		List<String> resp = new ArrayList<String>();
		List<Object[]> lista = consulta1Repo.buscaCuidadesPorPais();
		for (Object[] row : lista) {
			String country_name = (String) row[0];
			BigInteger quantity_cities = (BigInteger) row[1];
			resp.add(country_name + ":" + quantity_cities);
		}
		System.out.println(resp);
		return resp;
	}
	
	
	//3
	public List<String> busqueda3(){
		List<String> resp = new ArrayList<String>();
		List<Object[]> lista = consulta1Repo.ciudadesMexicoMayoresA();
		for (Object[] row : lista) {
			String country_code = (String) row[0];
			String city_name = (String) row[1];
			int city_population = (int) row[2];
			resp.add(country_code + ":" + city_name + ":" + city_population);
		}
		System.out.println(resp);
		return resp;
	}
	
	//4
	public List<String> busqueda4(){
		List<String> resp = new ArrayList<String>();
		List<Object[]> lista = consulta1Repo.lenguajesPaisMayor89();
		for (Object[] row : lista) {
			String country_name = (String) row[0];
			String language_language = (String) row[1];
			float language_percentage = (float) row[2];
			resp.add(country_name + ":" + language_language + ":" + language_percentage);
		}
		System.out.println(resp);
		return resp;
	}
	
	//5
	public List<String> busqueda5(){
		List<String> resp = new ArrayList<String>();
		List<Object[]> lista = consulta1Repo.paisesSurfacePopulation();
		for (Object[] row : lista) {
			String country_name = (String) row[0];
			float country_surfaceAre = (float) row[1];
			int country_population = (int) row[2];
			resp.add(country_name + ":" + country_surfaceAre + ":" + country_population);
		}
		System.out.println(resp);
		return resp;
	}
	
	//6
	public List<String> busqueda6(){
		List<String> resp = new ArrayList<String>();
		List<Object[]> lista = consulta1Repo.paisesConstitutionalMonarchy();
		for (Object[] row : lista) {
			String country_name = (String) row[0];
			String country_governmentForm = (String) row[1];
			float sourface_area = (float) row[2];
			float country_lifeExpectancy = (float) row[3];
			resp.add(country_name + ":" + country_governmentForm + ":" + sourface_area + ":" + country_lifeExpectancy);
		}
		System.out.println(resp);
		return resp;
	}
	
	//7
	public List<String> busqueda7(){
		List<String> resp = new ArrayList<String>();
		List<Object[]> lista = consulta1Repo.ciudadeArgBAires();
		for (Object[] row : lista) {
			String country_name = (String) row[0];
			String city_name = (String) row[1];
			String city_district = (String) row[2];
			int city_population = (int) row[3];
			resp.add(country_name + ":" + city_name + ":" + city_district + ":" + city_population);
		}
		System.out.println(resp);
		return resp;
	}
	
	//8
	public List<String> busqueda8(){
		List<String> resp = new ArrayList<String>();
		List<Object[]> lista = consulta1Repo.ciudadesPorRegion();
		for (Object[] row : lista) {
			String country_region = (String) row[0];
			BigInteger countries_quantity = (BigInteger) row[1];
			resp.add(country_region + ":" + countries_quantity);
		}
		System.out.println(resp);
		return resp;
	}
	
	

}
