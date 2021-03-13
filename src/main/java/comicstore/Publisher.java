package comicstore;


import java.util.Set;

public class Publisher {
	/**
     * Default constructor
     */
    public Publisher() {
    }

    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private Set<Comic> comics;

    /**
     * 
     */
    private ComicStore comicStore;

    /**
     * @return
     */
    public Long getId() {
       
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
    	this.id = id;
    }

    /**
     * @return
     */
    public String getName() {
      
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */
    public ComicStore getComicStore() {
        // TODO implement here
        return comicStore;
    }

    /**
     * @param comicStore
     */
    public void setComicStore(ComicStore comicStore) {
        this.comicStore = comicStore;
    }

    /**
     * @return
     */
    public Set<Comic> getComics() {
        // TODO implement here
        return null;
    }

    /**
     * @param comics
     */
    public void setComics(Set<Comic> comics) {
        // TODO implement here
    }
}
