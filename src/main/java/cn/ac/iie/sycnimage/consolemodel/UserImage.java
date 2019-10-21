package cn.ac.iie.sycnimage.consolemodel;

/**
 * Created by hongtao on 2019/10/21.
 */
public class UserImage {

    private String username;
    private String imageId;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    @Override
    public String toString() {
        return "UserImage{" +
                "username='" + username + '\'' +
                ", imageId='" + imageId + '\'' +
                '}';
    }
}
