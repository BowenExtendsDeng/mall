package com.mall.common.exception;
;
import com.mall.common.Result;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * <p>
 *
 * </p>
 *
 * @author bowen
 * @email 2631702650@qq.com
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    public Result handler(RuntimeException e) {
        return Result.fail(e.getMessage());
    }
}
