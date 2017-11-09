package com.cedric.jaxbparser.objects;

import java.net.URL;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class FXCountry  {

	private StringProperty abbrev = new SimpleStringProperty();

	public FXCountry() {

	}

	public FXCountry(Long id, String name, String abbrev) {
		setAbbrev(abbrev);
	}

	public final StringProperty abbrevProperty() {
		return this.abbrev;
	}

	public final String getAbbrev() {
		return this.abbrevProperty().get();
	}

	public final void setAbbrev(final String abbrev) {
		this.abbrevProperty().set(abbrev);
	}

	public ImageView getFlag() {
		ImageView imageView = new ImageView();
		if (getAbbrev() != null) {
			String abbrevUpperCase = getAbbrev().toUpperCase();
			imageView.setImage(createFlagImage("FLAG_" + abbrevUpperCase + ".png"));
		}
		imageView.setFitHeight(16);
		imageView.setFitWidth(16);
		return imageView;
	}

	private Image createFlagImage(String name) {
		URL resource = getClass().getResource("/icons/flag/" + name);
		if(resource != null){
			return new Image(resource.toExternalForm());
		}
		return new Image(getClass().getResource("/icons/flag/FLAG_DEFAULT.png").toExternalForm());
	}


}
