package cn.ac.iie.sycnimage.basemodel;

/**
 * Created by hongtao on 2019/10/21.
 */
public enum ResultStat {
    /**
     * if you need new result code, add it here and give it a good name
     */
    OK(200),
    SERVER_INTERNAL_ERROR(500),

    PARAM_ERROR(400),

    FORBIDDEN(403),

    RESOURCE_NOT_EXIST(404),

    IMAGE_NOT_EXIST(1001),
    USER_NOT_EXIST(1002),
    INSERT_IMAGE_FAILED(1003);

    //!!----------------do not modify code below------------------!!
    public final int responseCode;

    public <T> HttpResponseTemp<T> wrap(T data) {
        return wrap(data, null);
    }

    /**
     * wrap the result with a result code and result message
     * @param data result data
     * @param msg result message
     * @param <T> result type
     * @return
     */
    public <T> HttpResponseTemp<T> wrap(T data, String msg) {
        String message = this.name();
        if (msg != null) {
            message = message + ":" + msg;
        }

        return new HttpResponseTemp<>(data, this, message);
    }

    private ResultStat(int code) {
        this.responseCode = code;
    }
}