package ui;

import org.apache.commons.lang.StringUtils;

import comicstore.DummyDB;

public class CreatingComicForm {
	
	private String id;
	private String title;
	private String message;
	
	public void create() {
		boolean isAnyFilled = StringUtils.isNotBlank(id) && StringUtils.isNotBlank(title);
		if (isAnyFilled) {
			message = new DummyDB().comicCreate(id, title);

		} else {
			message = "Въведете всички данни";
		}
		
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getMessage() {
		return message;
	}
	
}
