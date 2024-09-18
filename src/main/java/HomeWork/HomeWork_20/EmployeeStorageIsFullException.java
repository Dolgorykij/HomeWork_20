package HomeWork.HomeWork_20;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus (HttpStatus.CONFLICT)
public class EmployeeStorageIsFullException extends RuntimeException {
    public EmployeeStorageIsFullException() {
    }

    public EmployeeStorageIsFullException(String message) {
        super(message);
    }

    public EmployeeStorageIsFullException(String message, Throwable cause) {
        super(message, cause);
    }
}
