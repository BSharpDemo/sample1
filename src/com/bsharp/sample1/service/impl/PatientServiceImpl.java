package com.bsharp.sample1.service.impl;


import java.sql.SQLException;
import java.util.List;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import com.bsharp.sample1.dao.PatientDAO;
import com.bsharp.sample1.dao.impl.PatientDAOJDBCImpl;
import com.bsharp.sample1.model.Patient;
import com.bsharp.sample1.service.PatientService;

public class PatientServiceImpl implements PatientService {

	///////////////////////////////////////////
	//      BUISINESS LOGIC GOES HERE        //
	//////////////////////////////////////////
	
	private final Logger log = Logger.getLogger(PatientServiceImpl.class);

	public void savePatient(Patient patient,String action)throws Exception{		
		log.debug("savePatient Service method called...");
		PatientDAO patientDao=new PatientDAOJDBCImpl();
		if(action.equals("Save")){			
			patientDao.addPatient(patient);
		}else if(action.equals("Update")){
			patientDao.updatePatient(patient);
		}						
	}
		
    public List<Patient> listPatient() throws  Exception{
		
		//BasicConfigurator.configure();
		log.debug("listPatient Service method called...");
        PatientDAO patientDAO=new PatientDAOJDBCImpl();
        List<Patient> patientList = null;
        patientList = patientDAO.getlistPatient();
        return patientList;
	}
    
	@Override
	public Patient getPatient(int healthRecord) throws Exception{
		PatientDAO patientDAO=new PatientDAOJDBCImpl();
		Patient patient=patientDAO.getPatient(healthRecord);
		return patient;		
	}
	
	@Override
	public int deletePatient(int healthRecord) throws Exception{
		PatientDAO patientDAO=new PatientDAOJDBCImpl();
		int count=patientDAO.deletePatient(healthRecord);
		return count;
	}
	
}
