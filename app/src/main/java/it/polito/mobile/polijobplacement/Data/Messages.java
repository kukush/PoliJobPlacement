package it.polito.mobile.polijobplacement.Data;

import com.parse.ParseClassName;
import com.parse.ParseObject;

/**
 * Created by user on 5/13/2015.
 */
@ParseClassName("Messages")
public class Messages extends ParseObject {
   public Messages(){}
       public App_User getFromUser() {
        return (App_User)get(JobApplication.MESSAGE_FROM);
    }

    public void setFromUser(App_User user) {
        put(JobApplication.MESSAGE_FROM,user);
    }

    public App_User getToUser() {
        return (App_User)get(JobApplication.MESSAGE_FROM);
    }

    public void setToUser(App_User user) {
        put(JobApplication.MESSAGE_TO,user);
    }

    public String getTitle() {
        return getString(JobApplication.MESSAGE_TITLE);
    }

    public void setTitle(String title) {
        put(JobApplication.MESSAGE_TITLE,title);
    }

    public String getContent() {
        return getString(JobApplication.MESSAGE_CONTENT);
    }

    public void setContent(String content) {
        put(JobApplication.MESSAGE_CONTENT,content);
    }
}
