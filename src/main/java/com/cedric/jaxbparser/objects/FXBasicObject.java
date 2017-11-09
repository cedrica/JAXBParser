package com.cedric.jaxbparser.objects;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class FXBasicObject {
	private ObjectProperty<Long> id = new SimpleObjectProperty<>();
	private ObjectProperty<Long> parentId = new SimpleObjectProperty<>();
	private StringProperty name = new SimpleStringProperty();
	private ObjectProperty<Object> data = new SimpleObjectProperty<>();

	public FXBasicObject() {
	}

	public FXBasicObject(Long id, String name) {
		setId(id);
		setName(name);
	}

	public FXBasicObject(Long id, String name, Object data) {
		setId(id);
		setName(name);
		setData(data);
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

	public final StringProperty nameProperty() {
		return this.name;
	}

	public final String getName() {
		return this.nameProperty().get();
	}

	public final void setName(final String name) {
		this.nameProperty().set(name);
	}

	public final ObjectProperty<Object> dataProperty() {
		return this.data;
	}

	public final Object getData() {
		return this.dataProperty().get();
	}

	public final void setData(final Object data) {
		this.dataProperty().set(data);
	}

	public final ObjectProperty<Long> parentIdProperty() {
		return this.parentId;
	}

	public final Long getParentId() {
		return this.parentIdProperty().get();
	}

	public final void setParentId(final Long parentId) {
		this.parentIdProperty().set(parentId);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (getId() ^ (getId() >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FXBasicObject other = (FXBasicObject) obj;
		if (getId() != other.getId())
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FXBasicObject [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", data=");
		builder.append(data);
		builder.append("]");
		return builder.toString();
	}
}
