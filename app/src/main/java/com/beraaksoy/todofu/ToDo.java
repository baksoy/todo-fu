package com.beraaksoy.todofu;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by beraaksoy on 6/6/16.
 */
public class ToDo implements Serializable {
    int _id;
    String title;
    Date date;
    String note;
    String priority; // today, tomorrow, later
    String status; // done, pending

    public ToDo(int _id, String title) {
        this._id = _id;
        this.title = title;
        this.date = new Date();
    }

    public ToDo(String title, String priority) {
        this.title = title;
        this.priority = priority;
        this.date = new Date();
    }

    public ToDo(String title, String priority, String status, String note) {
        this.title = title;
        this.priority = priority;
        this.status = status;
        this.note = note;
        this.date = new Date();
    }

    public int get_id() {
        return _id;
    }

    public String getPriority() {
        return priority;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
