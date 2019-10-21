package cn.ac.iie.sycnimage.basemodel;

import java.io.Serializable;

/**
 * Created by hongtao on 2019/10/21.
 */
public class HttpResponseTemp<T> implements Serializable {

    private T result;
    private int resultCode;
    private String resultMsg = "";

    /**
     * !!note!!
     * the construct function must be non-public to make sure that
     * this should be created by ResultStat
     * Example:ResultStat.OK.wrap(data, msg)
     * @param data
     * @param code
     * @param msg
     */
    HttpResponseTemp(T data, ResultStat code, String msg) {
        this.result = data;
        this.resultCode = code.responseCode;
        this.resultMsg = msg;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }
}
