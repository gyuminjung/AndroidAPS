package info.nightscout.androidaps.plugins.Overview;

import java.util.Date;

/**
 * Created by mike on 03.12.2016.
 */

public class Notification {
    public static final int URGENT = 0;
    public static final int NORMAL = 1;
    public static final int LOW = 2;
    public static final int INFO = 3;

    public static final int PROFILE_SET_FAILED = 0;
    public static final int PROFILE_SET_OK = 1;

    public int id;
    public Date date;
    public String text;
    public int level;
    public Date validTo = new Date(0);

    public Notification() {
    }

    public Notification(int id, Date date, String text, int level, Date validTo) {
        this.id = id;
        this.date = date;
        this.text = text;
        this.level = level;
        this.validTo = validTo;
    }

    public Notification(int id, String text, int level, int validMinutes) {
        this.id = id;
        this.date = new Date();
        this.text = text;
        this.level = level;
        this.validTo = new Date(new Date().getTime() + validMinutes * 60 * 1000L);
    }

    public Notification(int id, String text, int level) {
        this.id = id;
        this.date = new Date();
        this.text = text;
        this.level = level;
        this.validTo = new Date(0);
    }
}
