import java.util.ArrayList;
/**
 * Write a description of class PhotoPost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PhotoPost
{
    private String userName;
    private String fileName;
    private String caption;
    private long timeStamp;
    private int likes;
    private ArrayList<String> comments;
    /**
     * Constructor for objects of class PhotoPost
     */
    public PhotoPost(String author, String fileName, String caption)
    {
        userName = author;
        this.fileName = fileName;
        this.caption = caption;
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

    public String getImageFile()
    {
        String imageFile = "";
        return imageFile;
    }

    public String getCaption()
    {
        return caption;
    }

    public long getTimeStamp()
    {
        return timeStamp;
    }

    public void display()
    {

    }

    public long timeString(long time)
    {
        long timeString = 0;
        return timeString;
    }
}

