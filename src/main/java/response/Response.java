package response;

import enums.ResponseCodeEnum;

/**
 * @author: KongKongBaby
 * @create: 2020-05-17 09:42
 * @description: 返回格式统一
 **/

public class Response<T> {
    private ResponseCodeEnum msg;
    private T data;

    public Response(ResponseCodeEnum msg, T data) {
        this.msg = msg;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Response{" +
                "code=" + msg.getCode() +
                ", msg=" + msg.getMsg() +
                ", data=" + data +
                '}';
    }
}
