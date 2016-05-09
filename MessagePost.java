import java.util.ArrayList;
/**
 * Write a description of class MessagePost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MessagePost
{
    private String userName;
    private String message;
    private long timeStamp;
    private int likes;
    private ArrayList<String> comments;
    /**
     * Constructor for objects of class MessagePost
     */
    public MessagePost(String author, String text)
    {
        userName = author;
        message = text;
        timeStamp = 0;
        likes = 0;
        comments = new ArrayList<>();
    }

    public void like()
    {
       
    }
    
    public void unLike()
    {
    
    }
    
    public void addComment(String text)
    {
        
    }
    
    public String getText()
    {
        return message;
    }
    
    public long getTimeStamp()
    {
        return timeStamp;
    }
    
    public void display()
    {
    
    }
    
    public String timeString(long time)
    {
        String timeString = "";
        return timeString;
    }
}