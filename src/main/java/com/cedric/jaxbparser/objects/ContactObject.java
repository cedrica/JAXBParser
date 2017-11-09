package com.cedric.jaxbparser.objects;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

@XmlRootElement(name = "contactObject")
public class ContactObject {

	private ObjectProperty<Long> id = new SimpleObjectProperty<>();
	private ObjectProperty<Long> companyId = new SimpleObjectProperty<>();

	private StringProperty firstName = new SimpleStringProperty();
	private StringProperty lastName = new SimpleStringProperty();

	private StringProperty email = new SimpleStringProperty();
	private StringProperty phone = new SimpleStringProperty();
	private StringProperty mobile = new SimpleStringProperty();

	private ObjectProperty<FXBasicObject> degree = new SimpleObjectProperty<>();
	private ObjectProperty<FXBasicObject> salutation = new SimpleObjectProperty<>();

	private ObjectProperty<Long> serviceProviderCompanyTradeContactId = new SimpleObjectProperty<>();


	public ContactObject() {

	}

	public String getName() {
		return getLastName() + ", " + getFirstName();
	}

	public final StringProperty firstNameProperty() {
		return this.firstName;
	}

	@XmlElement
	public final String getFirstName() {
		return this.firstNameProperty().get();
	}

	public final void setFirstName(final String firstName) {
		this.firstNameProperty().set(firstName);
	}

	public final StringProperty lastNameProperty() {
		return this.lastName;
	}

	@XmlElement
	public final String getLastName() {
		return this.lastNameProperty().get();
	}

	public final void setLastName(final String surname) {
		this.lastNameProperty().set(surname);
	}


	public final ObjectProperty<FXBasicObject> degreeProperty() {
		return this.degree;
	}

	public final FXBasicObject getDegree() {
		return this.degreeProperty().get();
	}

	public final void setDegree(final FXBasicObject degree) {
		this.degreeProperty().set(degree);
	}

	public final ObjectProperty<FXBasicObject> salutationProperty() {
		return this.salutation;
	}

	public final FXBasicObject getSalutation() {
		return this.salutationProperty().get();
	}

	public final void setSalutation(final FXBasicObject salutation) {
		this.salutationProperty().set(salutation);
	}

	public final ObjectProperty<Long> idProperty() {
		return this.id;
	}

	public final Long getId() {
		return this.idProperty().get();
	}

	public final void setId(final Long id) {
		this.idProperty().set(id);
	}

	public final ObjectProperty<Long> companyIdProperty() {
		return this.companyId;
	}

	public final Long getCompanyId() {
		return this.companyIdProperty().get();
	}

	public final void setCompanyId(final Long companyId) {
		this.companyIdProperty().set(companyId);
	}

	public final StringProperty emailProperty() {
		return this.email;
	}

	public final String getEmail() {
		return this.emailProperty().get();
	}

	public final void setEmail(final String email) {
		this.emailProperty().set(email);
	}

	public final StringProperty phoneProperty() {
		return this.phone;
	}

	public final String getPhone() {
		return this.phoneProperty().get();
	}

	public final void setPhone(final String phone) {
		this.phoneProperty().set(phone);
	}

	public final StringProperty mobileProperty() {
		return this.mobile;
	}

	public final String getMobile() {
		return this.mobileProperty().get();
	}

	public final void setMobile(final String mobile) {
		this.mobileProperty().set(mobile);
	}

	public final ObjectProperty<Long> serviceProviderCompanyTradeContactIdProperty() {
		return this.serviceProviderCompanyTradeContactId;
	}

	public final Long getServiceProviderCompanyTradeContactId() {
		return this.serviceProviderCompanyTradeContactIdProperty().get();
	}

	public final void setServiceProviderCompanyTradeContactId(final Long serviceProviderCompanyTradeContactId) {
		this.serviceProviderCompanyTradeContactIdProperty().set(serviceProviderCompanyTradeContactId);
	}
}
