package comicstore;


/**
 * 
 */
public class Comic {

    /**
     * Default constructor
     */
    public Comic() {
    }

    /**
     * 
     */
    private String id;

    /**
     * 
     */
    private String title;

    /**
     * 
     */
    private Publisher publisher;

    /**
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return
     */
    public Publisher getPublisher() {
        return publisher;
    }

    /**
     * @param publisher
     */
    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

}
