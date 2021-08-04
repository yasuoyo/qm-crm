package demo.demodao;

/**
 * @program: qm-crm
 * @description:
 * @author: Zqm
 * @create: 2021-08-04 09:41
 **/
public class ReposneMessage {

    private String msg;

    private Integer code;

    private Boolean isSuccess;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Boolean getSuccess() {
        return isSuccess;
    }

    public void setSuccess(Boolean success) {
        isSuccess = success;
    }
}
