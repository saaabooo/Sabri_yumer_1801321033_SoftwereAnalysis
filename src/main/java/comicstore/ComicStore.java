package comicstore;


import java.util.Set;

public class ComicStore {

    /**
     * Default constructor
     */
    public ComicStore() {
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
    private Set<Publisher> publishers;

    /**
     * 
     */
    private Set<CustomerSupport> customerSupports;

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
    public String getName() {
    	return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
    	this.name=name;
    }

    /**
     * @return
     */
    public Set<Publisher> getPublishers() {
        // TODO implement here
        return publishers;
    }

    /**
     * @param publishers
     */
    public void setPublishers(Set<Publisher> publishers) {
        this.publishers = publishers;
    }

    /**
     * @return
     */
    public Set<CustomerSupport> getCustomerSupports() {
        return customerSupports;
    }

    /**
     * @param customerSupports
     */
    public void setCustomerSupports(Set<CustomerSupport> customerSupports) {
        this.customerSupports = customerSupports;
    }

}
