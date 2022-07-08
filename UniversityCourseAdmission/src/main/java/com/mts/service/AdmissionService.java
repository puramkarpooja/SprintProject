package com.mts.service;

import java.time.LocalDate;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mts.entity.Admission;
import com.mts.exception.AdmissionNotGrantedException;
import com.mts.repository.IAdmissionRepository;

@Service
public class AdmissionService implements  IAdmissionService {
	
	@Autowired
	IAdmissionRepository repo;
	public Admission addAdmission(Admission admission) {
		return repo.save(admission);
	}
	public Admission updateAdmission(Admission admission) throws AdmissionNotGrantedException{
		Admission admission1 = repo.findById(admission.getAdmissionId()).orElseThrow(()->new AdmissionNotGrantedException("Admission details for given Id not found !"));
		admission1.setCourseId(admission.getCourseId());
		admission1.setApplicantId(admission.getApplicantId());
		admission1.setAdmissionDate(admission.getAdmissionDate());
		admission1.setStatus(admission.getStatus());
		return repo.save(admission1);
		
	}
	
	public Admission cancelAdmission(int admissionId) throws  AdmissionNotGrantedException {
		Admission admission1=repo.findById(admissionId).orElseThrow(()->new  AdmissionNotGrantedException("Admission Id not found"));
		repo.delete(admission1);
		return admission1;
	}
	
	
	 
	public List<Admission> showAllAdmissionByDate(LocalDate admissionDate){
		return repo.findByadmissionDate(admissionDate);
	}
	@Override
	public List<Admission> showAllAdmissionByCourseId(int courseId) {
		// TODO Auto-generated method stub
		return repo.findByCourseId(courseId);
	}
	@Override
	public List<Admission> showAllAdmissionByCourseId() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
	
	
  
}
