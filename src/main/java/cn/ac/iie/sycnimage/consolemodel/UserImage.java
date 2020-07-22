package cn.ac.iie.sycnimage.consolemodel;

/**
 * Created by hongtao on 2019/10/21.
 */
public class UserImage {

    private String username;
    private String imageId;
    private String projectId;

    public UserImage() {
    }

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

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @Override
    public String toString() {
        return "UserImage{" +
                "username='" + username + '\'' +
                ", imageId='" + imageId + '\'' +
                ", projectId='" + projectId + '\'' +
                '}';
    }
}
