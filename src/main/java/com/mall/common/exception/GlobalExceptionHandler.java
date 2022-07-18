package com.mall.common.exception;
;
import com.mall.common.Result;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.ShiroException;
import org.jetbrains.annotations.NotNull;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * <p>
 *
 * </p>
 *
 * @author bowen
 * @email 2631702650@qq.com
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = RuntimeException.class)
    public Result handler(@NotNull RuntimeException e) {
        log.error("运行异常：{}", e.getMessage());
        return Result.fail(e.getMessage());
    }

    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler(value = ShiroException.class)
    public Result handler(@NotNull ShiroException e) {
        log.error("运行异常：{}", e.getMessage());
        return Result.fail(e.getMessage());
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public Result handler(@NotNull MethodArgumentNotValidException e) {
        log.error("运行异常：{}", e.getMessage());
        BindingResult bindingResult = e.getBindingResult();
        bindingResult.getAllErrors().stream().findFirst().get();
        return Result.fail(e.getMessage());
    }
}
