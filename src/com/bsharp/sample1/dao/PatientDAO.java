package com.bsharp.sample1.dao;

import java.sql.SQLException;
import java.util.List;

import com.bsharp.sample1.model.Patient;

public interface PatientDAO {

	public void addPatient(Patient patient)throws Exception;
	public void updatePatient(Patient patient)throws Exception;
	public List<Patient> getlistPatient() throws  Exception;
	public Patient getPatient(int healthRecord) throws Exception;;
	public int deletePatient(int healthRecord)throws Exception;

}
