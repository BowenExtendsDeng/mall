package com.mall.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * <p>
 *
 * </p>
 *
 * @author bowen
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    private Integer code;
    private String msg;
    private Object data;

    public static Result success(int code, String msg, Object data) {
        return new Result(code, msg, data);
    }

    public static Result fail(String msg) {
        return new Result(200, msg, null);
    }
    @Contract("_, _ -> new")
    public static @NotNull Result success(String msg, Object data) {
        return new Result(200, msg, data);
    }
}
