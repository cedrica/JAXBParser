package com.cedric.jaxbparser;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.cedric.jaxbparser.objects.CompanyObject;
import com.cedric.jaxbparser.objects.EmployeeObject;
import com.cedric.jaxbparser.objects.FXBasicObject;
import com.cedric.jaxbparser.objects.TaskObject;

@XmlRootElement
public class Data {
	
	private List<CompanyObject> companies = new ArrayList<>();
	private List<FXBasicObject> tradeObjects = new ArrayList<>();
	private List<TaskObject> taskObjects = new ArrayList<>();
	private List<EmployeeObject> employeeObjects = new ArrayList<>();
	
	@XmlElement(name="companyObject", type=CompanyObject.class)
	public List<CompanyObject> getCompanies() {
		return companies;
	}
	public void setCompanies(List<CompanyObject> companies) {
		this.companies = companies;
	}
	public List<FXBasicObject> getTradeObjects() {
		return tradeObjects;
	}
	public void setTradeObjects(List<FXBasicObject> taskAssigneeObjects) {
		this.tradeObjects = taskAssigneeObjects;
	}
	
	@XmlElement(name="taskObject", type=TaskObject.class)
	public List<TaskObject> getTaskObjects() {
		return taskObjects;
	}
	public void setTaskObjects(List<TaskObject> taskObjects) {
		this.taskObjects = taskObjects;
	}
	@XmlElement(name="employeeObject", type=EmployeeObject.class)
	public List<EmployeeObject> getEmployeeObjects() {
		return employeeObjects;
	}
	public void setEmployeeObjects(List<EmployeeObject> employeeObjects) {
		this.employeeObjects = employeeObjects;
	}
	
	
			
}
