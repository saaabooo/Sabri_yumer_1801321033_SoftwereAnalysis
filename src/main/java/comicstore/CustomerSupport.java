package comicstore;


public class CustomerSupport extends User{

    /**
     * Default constructor
     */
    public CustomerSupport() {
    }

    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private String firstName;

    /**
     * 
     */
    private String lastName;

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
    	this.id=id;
    }

    /**
     * @return
     */
    public String getFirstName() {
    	return firstName;
    }

    /**
     * @param firstName
     */
    public void setFirstName(String firstName) {
    	this.firstName=firstName;
    }

    /**
     * @return
     */
    public String getLastName() {
    	 return lastName;
    }

    /**
     * @param lastName
     */
    public void setLastName(String lastName) {
    	this.lastName=lastName;
    }

    /**
     * @return
     */
    public ComicStore getComicStore() {
        return comicStore;
    }

    /**
     * @param comicStore
     */
    public void setComicStore(ComicStore comicStore) {
        this.comicStore=comicStore;
    }

}