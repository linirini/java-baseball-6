package baseball.util;

public enum ExceptionEnum {
    DUPLICATED_NUMBERS("중복된 숫자를 입력할 수 없습니다."),
    INVALID_NUMBER_LENGTH("3자리의 숫자만 입력할 수 있습니다."),
    NOT_IN_RANGE("1부터 9 사이 숫자만 입력할 수 있습니다."),
    NOT_NUMBER("숫자만 입력할 수 있습니다."),
    INVALID_RESTART_OPTION("재시작 여부는 1 또는 2만 입력할 수 있습니다.");


    private static final String ERROR = "[ERROR] ";
    private String message;

    ExceptionEnum(String message) {
        this.message = ERROR + message;
    }

    public String getMessage() {
        return message;
    }
}
