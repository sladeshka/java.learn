package Lesson2;

public enum Color {
    BLUE("BLUE"),
    BLACK("BLACK"),
    WHITE("WHITE"),
    RED("RED");

    private final String desctiption;

    Color(String desctiption) {
        this.desctiption = desctiption;
    }

    public String getDesctiption() {
        return desctiption;
    }

}
