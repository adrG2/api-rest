package com.ddd.user.domain.exception;

import com.ddd.shared.ConstantsErrors;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseBody
@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = ConstantsErrors.USER_NOT_FOUND)
public final class UserNotFoundException extends RuntimeException {

    private static final long serialVersionUID = -7992282805146114983L;

    public UserNotFoundException() {
        super();
    }

    public UserNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserNotFoundException(String message) {
        super(message);
    }

    public UserNotFoundException(Throwable cause) {
        super(cause);
    }
}
