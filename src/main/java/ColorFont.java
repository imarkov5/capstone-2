public enum ColorFont {
    ANSI_BLACK("\u001B[30m"), ANSI_BLUE("\u001B[34m"), ANSI_CYAN("\u001B[36m"), ANSI_GREEN("\u001B[32m"), ANSI_MAGENTA("\u001B[35m"), ANSI_RED("\u001B[31m"), ANSI_RESET("\u001B[0m"), ANSI_WHITE("\u001B[37m"), ANSI_YELLOW("\u001B[33m"), ANSI_PURPLE("\033[95m");
    final String code;

    ColorFont(String code) {
        this.code = code;
    }
}
