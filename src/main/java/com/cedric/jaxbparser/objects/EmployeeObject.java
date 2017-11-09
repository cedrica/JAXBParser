package com.cedric.jaxbparser.objects;

import java.time.LocalDate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
@XmlRootElement(name="employeeObject")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class EmployeeObject {

    private ObjectProperty<Long> id = new SimpleObjectProperty<>();

    private StringProperty accountName = new SimpleStringProperty();

    private StringProperty firstname = new SimpleStringProperty();

    private StringProperty lastname = new SimpleStringProperty();
    
    private StringProperty phone = new SimpleStringProperty();

    private StringProperty mobile = new SimpleStringProperty();

    private StringProperty mail = new SimpleStringProperty();

    private ObjectProperty<LocalDate> startingTrackDate = new SimpleObjectProperty<LocalDate>();

    private ObjectProperty<Double> startingDuration = new SimpleObjectProperty<>();

    public EmployeeObject() {
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

    public final StringProperty accountNameProperty() {
        return this.accountName;
    }
    public final String getAccountName() {
        return this.accountNameProperty().get();
    }

    public final void setAccountName(final String accountName) {
        this.accountNameProperty().set(accountName);
    }

    public final StringProperty firstnameProperty() {
        return this.firstname;
    }
    @XmlElement
    public final String getFirstname() {
        return this.firstnameProperty().get();
    }

    public final void setFirstname(final String firstname) {
        this.firstnameProperty().set(firstname);
    }

    public final StringProperty lastnameProperty() {
        return this.lastname;
    }
    @XmlElement
    public final String getLastname() {
        return this.lastnameProperty().get();
    }

    public final void setLastname(final String lastname) {
        this.lastnameProperty().set(lastname);
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

    public final StringProperty mailProperty() {
        return this.mail;
    }

    public final String getMail() {
        return this.mailProperty().get();
    }

    public final void setMail(final String mail) {
        this.mailProperty().set(mail);
    }

    public final ObjectProperty<LocalDate> startingTrackDateProperty() {
        return this.startingTrackDate;
    }

    public final LocalDate getStartingTrackDate() {
        return this.startingTrackDateProperty().get();
    }

    public final void setStartingTrackDate(final LocalDate startingTrackDate) {
        this.startingTrackDateProperty().set(startingTrackDate);
    }

    public final ObjectProperty<Double> startingDurationProperty() {
        return this.startingDuration;
    }

    public final Double getStartingDuration() {
        return this.startingDurationProperty().get();
    }

    public final void setStartingDuration(final Double startingDuration) {
        this.startingDurationProperty().set(startingDuration);
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

}
