package ugtp.utils;

import java.util.UUID;

/**
 * UUID工具类
 *
 * @author 杜清胜
 * @date 2021/11/16 6:21
 */
public class UUIDUtils {

    /**
     * 返回一个没有中划线的32位字符串
     * @return
     */
    public static String getUUID32(){
        return UUID.randomUUID().toString().replace("-","");
    }
}
