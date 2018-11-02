package unl.cis.tt.model;

public class Picture {
    private String picture;
    private String username;

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Picture(String picture, String username, String time) {

        this.picture = picture;
        this.username = username;
        this.time = time;
    }

    private String time ;
}
