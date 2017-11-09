package com.cedric.jaxbparser.objects;

import java.time.LocalDateTime;

import javafx.beans.property.LongProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class TaskCommentaryObject {
    private LongProperty id = new SimpleLongProperty();

    private StringProperty comment = new SimpleStringProperty();

    private ObjectProperty<LocalDateTime>  createdAt = new SimpleObjectProperty<>();

    private StringProperty createdBy = new SimpleStringProperty();

    private ObjectProperty<EmployeeObject> employee = new SimpleObjectProperty<>();

    private ObjectProperty<TaskObject> task = new SimpleObjectProperty<>();

	public final LongProperty idProperty() {
		return this.id;
	}
	

	public final long getId() {
		return this.idProperty().get();
	}
	

	public final void setId(final long id) {
		this.idProperty().set(id);
	}
	

	public final StringProperty commentProperty() {
		return this.comment;
	}
	

	public final String getComment() {
		return this.commentProperty().get();
	}
	

	public final void setComment(final String comment) {
		this.commentProperty().set(comment);
	}
	

	public final ObjectProperty<LocalDateTime> createdAtProperty() {
		return this.createdAt;
	}
	

	public final LocalDateTime getCreatedAt() {
		return this.createdAtProperty().get();
	}
	

	public final void setCreatedAt(final LocalDateTime createdAt) {
		this.createdAtProperty().set(createdAt);
	}
	

	public final StringProperty createdByProperty() {
		return this.createdBy;
	}
	

	public final String getCreatedBy() {
		return this.createdByProperty().get();
	}
	

	public final void setCreatedBy(final String createdBy) {
		this.createdByProperty().set(createdBy);
	}
	

	public final ObjectProperty<EmployeeObject> employeeProperty() {
		return this.employee;
	}
	

	public final EmployeeObject getEmployee() {
		return this.employeeProperty().get();
	}
	

	public final void setEmployee(final EmployeeObject employee) {
		this.employeeProperty().set(employee);
	}
	

	public final ObjectProperty<TaskObject> taskProperty() {
		return this.task;
	}
	

	public final TaskObject getTask() {
		return this.taskProperty().get();
	}
	

	public final void setTask(final TaskObject task) {
		this.taskProperty().set(task);
	}
	
    
    
}
