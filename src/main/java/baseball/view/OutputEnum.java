package baseball.view;

public enum OutputEnum {
    ;

    private String message;

    OutputEnum(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
