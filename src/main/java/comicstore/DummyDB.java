package comicstore;


import java.util.ArrayList;
import java.util.List;

public class DummyDB {
	private List<Comic> all_comics;
	private List<User> all_users;
	
	public DummyDB() {
		all_comics = new ArrayList<Comic>();
		Comic comic = new Comic();
		comic.setTitle("Batman");
		comic.setId("1234");
		all_comics.add(comic);
		
		all_users = new ArrayList<User>();
		CustomerSupport support = new CustomerSupport();
		support.setUsername("Sabri");
		support.setPassword("SABRI12345");
		all_users.add(support);
	}

	public Comic comicSearch(String id, String title) {
		return all_comics.stream().filter(comic -> comic.getId().equals(id) && 
				comic.getTitle().equals(title)).findFirst().orElse(null);
	}

	public String comicCreate(String id, String title) {
		Comic comic = new Comic();
		comic.setId(id);
		comic.setTitle(title);
		all_comics.add(comic);
		return "Успешно създаване на комикс";
	}

}
