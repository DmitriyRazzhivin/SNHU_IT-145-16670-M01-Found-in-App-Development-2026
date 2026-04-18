package grazioso_rescue;

public enum Gender {
    MALE,
    FEMALE;

    public static Gender fromString(String s) {
        if (s == null || s.isEmpty()) {
            return null;
        }
        return Gender.valueOf(s.toUpperCase());
    }
}
