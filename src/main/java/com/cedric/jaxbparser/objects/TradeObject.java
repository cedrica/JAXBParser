package com.cedric.jaxbparser.objects;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import javafx.beans.property.LongProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
@XmlRootElement(name="taskAssigneeObject")
public class TradeObject {
	private LongProperty id = new SimpleLongProperty();

	private StringProperty assigneeName = new SimpleStringProperty();

	public final LongProperty idProperty() {
		return this.id;
	}

	public final long getId() {
		return this.idProperty().get();
	}

	public final void setId(final long id) {
		this.idProperty().set(id);
	}

	public final StringProperty assigneeNameProperty() {
		return this.assigneeName;
	}

	@XmlElement
	public final String getAssigneeName() {
		return this.assigneeNameProperty().get();
	}
	public final void setAssigneeName(final String assigneeName) {
		this.assigneeNameProperty().set(assigneeName);
	}

}
