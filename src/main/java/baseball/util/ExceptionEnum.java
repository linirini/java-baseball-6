package baseball.util;

public enum ExceptionEnum {
    DUPLICATED_NUMBERS("중복된 숫자를 입력할 수 없습니다.");


    private static final String ERROR = "[ERROR] ";
    private String message;

    ExceptionEnum(String message) {
        this.message = ERROR + message;
    }

    public String getMessage() {
        return message;
    }
}
