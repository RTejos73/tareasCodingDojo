package com.rtejos.listaestudiantes2.service;

import org.springframework.stereotype.Service;

import com.rtejos.listaestudiantes2.repository.BedroomRepository;

@Service
public class BedroomService {
	
	private final BedroomRepository bedroomRepo;

	public BedroomService(BedroomRepository bedroomRepo) {
		this.bedroomRepo = bedroomRepo;
	}
	
	

}
