package ui;

import org.apache.commons.lang.StringUtils;

import comicstore.Comic;
import comicstore.DummyDB;

public class SearchingComicForm {

	private String id;
	private String title;
	private String message;
	private Comic searchResult;

	public void search() {
		boolean isAnyFieldFilled = StringUtils.isNotBlank(id) || StringUtils.isNotBlank(title);
		if (isAnyFieldFilled) {
			searchResult = new DummyDB().comicSearch(id, title);

		} else {
			message = "Въведете данните за комикс";
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

	public Comic getSearchResult() {
		return searchResult;
	}

}
