package skypro.employeeBook.dto.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "Превышен лимит сотрудников.")
public class EmployeeStorageIsFullException extends RuntimeException{
}
