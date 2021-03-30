public enum ColorBackground {
    ANSI_BLACK_BACKGROUND("\u001B[40m"), ANSI_RED_BACKGROUND("\u001B[41m"), ANSI_GREEN_BACKGROUND("\u001B[42m"), ANSI_YELLOW_BACKGROUND("\u001B[43m"), ANSI_BLUE_BACKGROUND("\u001B[44m"), ANSI_PURPLE_BACKGROUND("\u001B[45m"), ANSI_CYAN_BACKGROUND("\u001B[46m"), ANSI_WHITE_BACKGROUND("\u001B[47m"), ANSI_ORANGE_BACKGROUND("\033[48;2;255;165;0m"), RESET("\\u001b[0m");
    final String key;


    ColorBackground(String key) {
        this.key = key;
    }
}
