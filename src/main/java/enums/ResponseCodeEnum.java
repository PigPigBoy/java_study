package enums;

/**
 * @author: KongKongBaby
 * @create: 2020-05-17 09:30
 * @description: 返回状态码枚举类
 **/

public enum ResponseCodeEnum {

    SUCCESS(200, "请求已正常处理"),
    SERVER_EXCEPTION(500, "服务器异常");

    private int code;
    private String msg;

    ResponseCodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
