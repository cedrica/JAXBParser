package com.cedric.jaxbparser;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.cedric.jaxbparser.objects.CompanyObject;
import com.cedric.jaxbparser.objects.EmployeeObject;
import com.cedric.jaxbparser.objects.FXBasicObject;
import com.cedric.jaxbparser.objects.TaskObject;

public class DummyData {
	public static List<CompanyObject> someCompanies() {
		try {
			ClassLoader classLoader = DummyData.class.getClassLoader();
			File file = new File(classLoader.getResource("data.xml").getFile());
			JAXBContext jaxbContext = JAXBContext.newInstance(Data.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Data data = (Data) jaxbUnmarshaller.unmarshal(file);
			return data.getCompanies();
		} catch (JAXBException e) {
			e.printStackTrace();
		}

		return null;
	}

	public static List<TaskObject> someTaskObjects() {
		try {
			ClassLoader classLoader = DummyData.class.getClassLoader();
			File file = new File(classLoader.getResource("data.xml").getFile());
			JAXBContext jaxbContext = JAXBContext.newInstance(Data.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Data data = (Data) jaxbUnmarshaller.unmarshal(file);
			return data.getTaskObjects();
		} catch (JAXBException e) {
			e.printStackTrace();
		}

		return null;
	}
	
	public static List<FXBasicObject> someTaskAssigneeObjects() {
		try {
			ClassLoader classLoader = DummyData.class.getClassLoader();
			File file = new File(classLoader.getResource("data.xml").getFile());
			JAXBContext jaxbContext = JAXBContext.newInstance(Data.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Data data = (Data) jaxbUnmarshaller.unmarshal(file);
			return data.getTradeObjects();
		} catch (JAXBException e) {
			e.printStackTrace();
		}

		return null;
	}

	public static List<EmployeeObject> someEmployeeObjects() {
		try {
			ClassLoader classLoader = DummyData.class.getClassLoader();
			File file = new File(classLoader.getResource("data.xml").getFile());
			JAXBContext jaxbContext = JAXBContext.newInstance(Data.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Data data = (Data) jaxbUnmarshaller.unmarshal(file);
			return data.getEmployeeObjects();
		} catch (JAXBException e) {
			e.printStackTrace();
		}

		return null;
	}
	public static void updateDummyDatas(Data data) {
		try {
			ClassLoader classLoader = DummyData.class.getClassLoader();
			File file = new File(classLoader.getResource("data.xml").getFile());
			JAXBContext jaxbContext = JAXBContext.newInstance(Data.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(data, file);
			// jaxbMarshaller.marshal(data, System.out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}
}
