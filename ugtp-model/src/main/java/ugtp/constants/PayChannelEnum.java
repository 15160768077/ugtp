package ugtp.constants;

/**
 * 维修订单状态枚举类
 *
 * @author 杜清胜
 * @date 2021/11/15 0:34
 */
public enum PayChannelEnum {
    CASH(1, "现金"),
    CARD(2, "刷卡"),
    ALIPAY(3, "支付宝"),
    WECHAT(10, "微信");

    Integer code;
    String msg;

    PayChannelEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }


    public static PayChannelEnum getByCode(Integer code) {
        if (code == null) {
            return null;
        }
        for (PayChannelEnum e : PayChannelEnum.values()) {
            if (code.equals(e.code)) {
                return e;
            }
        }
        return null;
    }
}

