package org.app.foodappbackend.dto;

public class ApiDelivery<T> {

    private int status;
    private String message;
    private boolean success;
    private T data;
    private Object error;

    public ApiDelivery(Object error, T data, boolean success, String message, int status) {
        this.error = error;
        this.data = data;
        this.success = success;
        this.message = message;
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Object getError() {
        return error;
    }

    public void setError(Object error) {
        this.error = error;
    }
}
