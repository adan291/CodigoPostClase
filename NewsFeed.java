import java.util.ArrayList;
/**
import java.util.ArrayList;
 * Write a description of class NewsFeed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NewsFeed
{
    private ArrayList<MessagePost> messages;
    private ArrayList<PhotoPost> photos; 

    /**
     * Constructor for objects of class NewsFeed
     */
    public NewsFeed()
    {
       messages = new ArrayList<>();
       photos = new ArrayList<>();
    }

    
    public void addMessagePost(MessagePost message)
    {
        messages.add(message);
    }
    
    public void addPhotoPost(PhotoPost photo)
    {
        photos.add(photo);
    }
    
    public void show()
    {
        for (PhotoPost photo: photos)
        {
            photo.display();
        }
        
        for (MessagePost message: messages)
        {
            message.display();
        }
    }
}