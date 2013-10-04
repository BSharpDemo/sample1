package com.bsharp.sample1.service;

import java.sql.SQLException;
import java.util.List;

import com.bsharp.sample1.model.Patient;


public interface PatientService {

	public void savePatient(Patient patient,String action) throws Exception;
	public List<Patient> listPatient() throws Exception;
	public Patient getPatient(int healthRecord)throws Exception;
	public int deletePatient(int healthRecord)throws Exception;
}
