package com.webs.exception;

/**
 * Created by windows10 on 2017/10/27.
 */
public class UserExistException extends Exception{
    public UserExistException() {
    }

    public UserExistException(String message) {
        super(message);
    }

    public UserExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserExistException(Throwable cause) {
        super(cause);
    }
}
