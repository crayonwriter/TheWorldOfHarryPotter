public class Entity {
    private static final int NO_IMAGE_PROVIDED = -1;
    private String mName;
    private String mDescription;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constructor for an Entity object
     *
     * @param name
     * @param description
     */
    public Entity(String name, String description) {
        mName = name;
        mDescription = description;
    }

    /**
     * Second constructor for an Entity object that includes an image
     *
     * @param name
     * @param description
     * @param imageResourceId
     */
    public Entity(String name, String description, int imageResourceId) {
        mName = name;
        mDescription = description;
        mImageResourceId = imageResourceId;
    }

    /**
     * Methods for the Entity class
     */
    public String getDescription() {
        return mDescription;
    }

    public String getName() {
        return mName;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}