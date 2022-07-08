package com.mts.service;

import java.time.LocalDate;
import java.util.List;

import com.mts.entity.Admission;
import com.mts.exception.AdmissionNotGrantedException;

public interface IAdmissionService {

public	Admission addAdmission(Admission admission);

public	Admission updateAdmission(Admission admission) throws AdmissionNotGrantedException;

public	Admission cancelAdmission(int admissionId) throws AdmissionNotGrantedException;

public	List<Admission> showAllAdmissionByCourseId(int courseId);

public	List<Admission> showAllAdmissionByDate(LocalDate admissionDate);

public List<Admission> showAllAdmissionByCourseId();

	
}
	