package com.minderest.user.domain.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.minderest.shared.ConstantsErrors;

@ResponseBody
@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = ConstantsErrors.USER_NOT_VALIDATE)
public class UserValidationException extends RuntimeException {

    private static final long serialVersionUID = -634907570923850002L;

    public UserValidationException() {
	super();
    }

    public UserValidationException(String message, Throwable cause) {
	super(message, cause);
    }

    public UserValidationException(String message) {
	super(message);
    }

    public UserValidationException(Throwable cause) {
	super(cause);
    }
}
