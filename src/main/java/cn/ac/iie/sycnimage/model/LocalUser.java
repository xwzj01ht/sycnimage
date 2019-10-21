package cn.ac.iie.sycnimage.model;

import java.util.Date;

/**
 * Created by hongtao on 2019/10/21.
 */
public class LocalUser {

    private int id;
    private String userId;
    private String domainId;
    private String name;
    private int failedAuthCount;
    private Date failedAuthAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFailedAuthCount() {
        return failedAuthCount;
    }

    public void setFailedAuthCount(int failedAuthCount) {
        this.failedAuthCount = failedAuthCount;
    }

    public Date getFailedAuthAt() {
        return failedAuthAt;
    }

    public void setFailedAuthAt(Date failedAuthAt) {
        this.failedAuthAt = failedAuthAt;
    }

    @Override
    public String toString() {
        return "LocalUser{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", domainId='" + domainId + '\'' +
                ", name='" + name + '\'' +
                ", failedAuthCount=" + failedAuthCount +
                ", failedAuthAt=" + failedAuthAt +
                '}';
    }
}
