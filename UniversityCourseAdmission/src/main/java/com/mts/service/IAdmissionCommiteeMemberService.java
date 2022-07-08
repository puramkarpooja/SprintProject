package com.mts.service;

import java.util.List;

import com.mts.entity.Admission;
import com.mts.entity.AdmissionCommiteeMember;
import com.mts.entity.Applicant;

public interface IAdmissionCommiteeMemberService {
	public  AdmissionCommiteeMember addCommiteeMember(AdmissionCommiteeMember member);
	public AdmissionCommiteeMember updateCommiteeMember(AdmissionCommiteeMember member);
	public AdmissionCommiteeMember viewCommiteeMember(int adminId);
	public void removeCommiteeMember(int adminId);
	public List<AdmissionCommiteeMember> viewAllCommiteeMembers();
	public void provideAdmissionResult(Applicant applicant, Admission admission);
}

