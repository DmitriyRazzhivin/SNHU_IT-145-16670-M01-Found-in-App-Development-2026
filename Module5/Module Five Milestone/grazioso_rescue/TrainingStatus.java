package grazioso_rescue;

public enum TrainingStatus {
    WILD,
    NEWBY,
    TRAINED_L1,
    MASTER;

    public static TrainingStatus fromString(String s) {
        if (s == null || s.isEmpty()) {
            return null;
        }
        return TrainingStatus.valueOf(s.toUpperCase());
    }
}
