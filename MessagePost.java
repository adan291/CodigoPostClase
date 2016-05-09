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
        timeStamp = System.currentTimeMillis();
        likes = 0;
        comments = new ArrayList<>();
    }

    public void like()
    {
        likes++;
    }

    public void unLike()
    {
        if (likes-- < 0)
        {
            likes = 0;
        }
        else
        {
            likes--;
        }
    }

    public void addComment(String text)
    {
        comments.add(text);
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
        System.out.println("Usuario: " + userName);
        System.out.println("Mensaje: " + message);
        System.out.println("Enviado hace: " + (timeString(System.currentTimeMillis())));
        System.out.println(likes + " Me gusta ");
        if(comments.size() == 0)
        {
            System.out.println("No hay ningun comentario");            
        }
        else
        {
            System.out.println("Comentarios: ");
            for(int i = 0; i < comments.size(); i++)
            {
                System.out.println(i+1 + ": " + comments.get(i));
            }
        }
    }

    public String timeString(long time)
    {
        long elapsedTime = (time - timeStamp);
        float minutes = (float)(elapsedTime / 60000);
        float seconds = (minutes - (int) minutes) * 60;
        return "Han transcurrido " + (int)minutes + " minutos " + (int)seconds + " segundos.";
    }
}