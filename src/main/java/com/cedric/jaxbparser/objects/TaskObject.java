package com.cedric.jaxbparser.objects;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import javafx.beans.property.ListProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;

@XmlRootElement(name = "taskObject")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class TaskObject {
	private ObjectProperty<Long> id = new SimpleObjectProperty<>();
	private StringProperty taskName = new SimpleStringProperty();
	private StringProperty taskDescription = new SimpleStringProperty();
	private StringProperty updatedBy = new SimpleStringProperty();
	private ObjectProperty<Integer> leadDays = new SimpleObjectProperty<>();
	private ObjectProperty<Integer> durationDays = new SimpleObjectProperty<>();
	private ObjectProperty<EmployeeObject> taskCreator = new SimpleObjectProperty<>();
	private ObjectProperty<EmployeeObject> taskWorker = new SimpleObjectProperty<>();private ObjectProperty<FXBasicObject> taskStatus = new SimpleObjectProperty<>();
	private ObjectProperty<FXBasicObject> taskType = new SimpleObjectProperty<>();
	private ObjectProperty<List<TaskObject>> childTasks = new SimpleObjectProperty<>(new ArrayList<>());
	private ObjectProperty<LocalDate> creationDate = new SimpleObjectProperty<>();
	private ListProperty<TaskCommentaryObject> taskCommentaryObjects = new SimpleListProperty<>();

	private ObjectProperty<Long> projectTreeId = new SimpleObjectProperty<>();

	private ObjectProperty<FXBasicObject> trade = new SimpleObjectProperty<>();

	public final StringProperty taskNameProperty() {
		return this.taskName;
	}

	public final String getTaskName() {
		return this.taskNameProperty().get();
	}

	public final void setTaskName(final String taskName) {
		this.taskNameProperty().set(taskName);
	}

	public final StringProperty taskDescriptionProperty() {
		return this.taskDescription;
	}

	@XmlElement
	public final String getTaskDescription() {
		return this.taskDescriptionProperty().get();
	}

	public final void setTaskDescription(final String taskDescription) {
		this.taskDescriptionProperty().set(taskDescription);
	}

	public final ObjectProperty<Integer> leadDaysProperty() {
		return this.leadDays;
	}

	@XmlElement
	public final Integer getLeadDays() {
		return this.leadDaysProperty().get();
	}

	public final void setLeadDays(final Integer leadDays) {
		this.leadDaysProperty().set(leadDays);
	}

	public final ObjectProperty<Integer> durationDaysProperty() {
		return this.durationDays;
	}

	@XmlElement
	public final Integer getDurationDays() {
		return this.durationDaysProperty().get();
	}

	public final void setDurationDays(final Integer durationDays) {
		this.durationDaysProperty().set(durationDays);
	}

	public final ObjectProperty<FXBasicObject> taskStatusProperty() {
		return this.taskStatus;
	}

	public final FXBasicObject getTaskStatus() {
		return this.taskStatusProperty().get();
	}

	public final void setTaskStatus(final FXBasicObject taskStatus) {
		this.taskStatusProperty().set(taskStatus);
	}

	public final ObjectProperty<FXBasicObject> taskTypeProperty() {
		return this.taskType;
	}

	public final FXBasicObject getTaskType() {
		return this.taskTypeProperty().get();
	}

	public final void setTaskType(final FXBasicObject taskType) {
		this.taskTypeProperty().set(taskType);
	}

	public final ObjectProperty<List<TaskObject>> childTasksProperty() {
		return this.childTasks;
	}

	public final List<TaskObject> getChildTasks() {
		return this.childTasksProperty().get();
	}

	public final void setChildTasks(final List<TaskObject> childTasks) {
		this.childTasksProperty().set(childTasks);
	}

	public final ObjectProperty<FXBasicObject> tradeProperty() {
		return this.trade;
	}

	public final FXBasicObject getTrade() {
		return this.tradeProperty().get();
	}

	public final void setTrade(final FXBasicObject trade) {
		this.tradeProperty().set(trade);
	}

	public final ObjectProperty<Long> projectTreeIdProperty() {
		return this.projectTreeId;
	}

	public final Long getProjectTreeId() {
		return this.projectTreeIdProperty().get();
	}

	public final void setProjectTreeId(final Long projectTreeId) {
		this.projectTreeIdProperty().set(projectTreeId);
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

	public final ListProperty<TaskCommentaryObject> taskCommentaryObjectsProperty() {
		return this.taskCommentaryObjects;
	}

	public final ObservableList<TaskCommentaryObject> getTaskCommentaryObjects() {
		return this.taskCommentaryObjectsProperty().get();
	}

	public final void setTaskCommentaryObjects(final ObservableList<TaskCommentaryObject> taskCommentaryObjects) {
		this.taskCommentaryObjectsProperty().set(taskCommentaryObjects);
	}

	public final ObjectProperty<EmployeeObject> taskCreatorProperty() {
		return this.taskCreator;
	}
	

	public final EmployeeObject getTaskCreator() {
		return this.taskCreatorProperty().get();
	}
	

	public final void setTaskCreator(final EmployeeObject taskCreator) {
		this.taskCreatorProperty().set(taskCreator);
	}
	

	public final ObjectProperty<EmployeeObject> taskWorkerProperty() {
		return this.taskWorker;
	}
	

	public final EmployeeObject getTaskWorker() {
		return this.taskWorkerProperty().get();
	}
	

	public final void setTaskWorker(final EmployeeObject taskWorker) {
		this.taskWorkerProperty().set(taskWorker);
	}

	public final ObjectProperty<LocalDate> creationDateProperty() {
		return this.creationDate;
	}
	

	public final LocalDate getCreationDate() {
		return this.creationDateProperty().get();
	}
	

	public final void setCreationDate(final LocalDate creationDate) {
		this.creationDateProperty().set(creationDate);
	}

	public final StringProperty updatedByProperty() {
		return this.updatedBy;
	}
	

	public final String getUpdatedBy() {
		return this.updatedByProperty().get();
	}
	

	public final void setUpdatedBy(final String updatedBy) {
		this.updatedByProperty().set(updatedBy);
	}
	
	
	

}
