package com.cedric.jaxbparser.objects;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import javafx.beans.property.ListProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;

@XmlRootElement(name = "companyObject")
public class CompanyObject {
	private ObjectProperty<Long> id = new SimpleObjectProperty<>();

	private StringProperty companyName = new SimpleStringProperty("");
	private ObjectProperty<FXBasicObject> tradeObject = new SimpleObjectProperty<>();
	private ObjectProperty<ContactObject> contactObject = new SimpleObjectProperty<>();
	private ObjectProperty<FXCountry> country = new SimpleObjectProperty<>();
	private StringProperty street = new SimpleStringProperty();
	private StringProperty streetNr = new SimpleStringProperty();
	private StringProperty zipCode = new SimpleStringProperty();
	private StringProperty city = new SimpleStringProperty();
	private StringProperty comment = new SimpleStringProperty("");
	private ListProperty<ContactObject> contactObjectList = new SimpleListProperty<>();

	public CompanyObject() {

	}

	public final StringProperty companyNameProperty() {
		return this.companyName;
	}

	@XmlElement
	public final String getCompanyName() {
		return this.companyNameProperty().get();
	}

	public final void setCompanyName(final String companyName) {
		this.companyNameProperty().set(companyName);
	}

	public final ObjectProperty<FXBasicObject> tradeObjectProperty() {
		return this.tradeObject;
	}

	@XmlElement(name = "tradeObject", type = TradeObject.class)
	public final FXBasicObject getTradeObject() {
		return this.tradeObjectProperty().get();
	}

	public final void setTradeObject(final FXBasicObject taskAssignee) {
		this.tradeObjectProperty().set(taskAssignee);
	}

	public final StringProperty commentProperty() {
		return this.comment;
	}

	@XmlElement
	public final String getComment() {
		return this.commentProperty().get();
	}

	public final void setComment(final String comment) {
		this.commentProperty().set(comment);
	}

	public final ObjectProperty<ContactObject> contactObjectProperty() {
		return this.contactObject;
	}

	@XmlElement(name = "contactObject", type = ContactObject.class)
	public final ContactObject getContactObject() {
		return this.contactObjectProperty().get();
	}

	public final void setContactObject(final ContactObject contactPerson) {
		this.contactObjectProperty().set(contactPerson);
	}

	public final StringProperty streetProperty() {
		return this.street;
	}

	@XmlElement
	public final String getStreet() {
		return this.streetProperty().get();
	}

	public final void setStreet(final String street) {
		this.streetProperty().set(street);
	}

	public final StringProperty streetNrProperty() {
		return this.streetNr;
	}

	@XmlElement
	public final String getStreetNr() {
		return this.streetNrProperty().get();
	}

	public final void setStreetNr(final String streetNr) {
		this.streetNrProperty().set(streetNr);
	}

	public final StringProperty zipCodeProperty() {
		return this.zipCode;
	}

	@XmlElement
	public final String getZipCode() {
		return this.zipCodeProperty().get();
	}

	public final void setZipCode(final String zipCode) {
		this.zipCodeProperty().set(zipCode);
	}

	public final StringProperty cityProperty() {
		return this.city;
	}

	@XmlElement
	public final String getCity() {
		return this.cityProperty().get();
	}

	public final void setCity(final String city) {
		this.cityProperty().set(city);
	}

	public final ObjectProperty<FXCountry> countryProperty() {
		return this.country;
	}

	public final FXCountry getCountry() {
		return this.countryProperty().get();
	}

	public final void setCountry(final FXCountry country) {
		this.countryProperty().set(country);
	}

	public final ListProperty<ContactObject> contactObjectListProperty() {
		return this.contactObjectList;
	}

	public final ObservableList<ContactObject> getContactObjectList() {
		return this.contactObjectListProperty().get();
	}

	public final void setContactObjectList(final ObservableList<ContactObject> contactObjectList) {
		this.contactObjectListProperty().set(contactObjectList);
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
}
