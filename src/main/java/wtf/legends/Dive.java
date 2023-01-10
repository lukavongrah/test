package wtf.legends;

public class Dive {
    private int logNumber;
    private  long startTimeEpoch;

    public int getLogNumber() {
        return logNumber;
    }

    public void setLogNumber(int logNumber) {
        this.logNumber = logNumber;
    }

    public void setStartTimeEpoch(long startTimeEpoch) {
        this.startTimeEpoch = startTimeEpoch;
    }

    public void setDiveDuration(int diveDuration) {
        this.diveDuration = diveDuration;
    }

    public void setNoDeco(boolean noDeco) {
        this.noDeco = noDeco;
    }

    public void setDiveMode(int diveMode) {
        this.diveMode = diveMode;
    }

    public void setDiveRecordCount(int diveRecordCount) {
        this.diveRecordCount = diveRecordCount;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public void setDiveDayNumber(int diveDayNumber) {
        this.diveDayNumber = diveDayNumber;
    }

    public void setMaxDepth(int maxDepth) {
        this.maxDepth = maxDepth;
    }

    public long getStartTimeEpoch() {
        return startTimeEpoch;
    }

    public int getDiveDuration() {
        return diveDuration;
    }

    public boolean isNoDeco() {
        return noDeco;
    }

    public int getDiveMode() {
        return diveMode;
    }

    public int getDiveRecordCount() {
        return diveRecordCount;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public int getDiveDayNumber() {
        return diveDayNumber;
    }

    public int getMaxDepth() {
        return maxDepth;
    }

    private  int diveDuration;
    private  boolean noDeco;
    private    int diveMode;
    private    int diveRecordCount;
    private   int minTemperature;
    private int diveDayNumber;
    private  int maxDepth;
    private int otu;

    public int getOtu() {
        return otu;
    }

    public void setOtu(int otu) {
        this.otu = otu;
    }
}
