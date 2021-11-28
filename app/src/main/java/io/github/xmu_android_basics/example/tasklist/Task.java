package io.github.xmu_android_basics.example.tasklist;

// data class Task(var task: String, var dateTime: String, var done: Boolean)

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Objects;

@Entity(tableName = "task_table")
public class Task {
//    public long id;

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "task")
    private String task;

    @ColumnInfo(name = "date_time")
    private String dateTime;

    @ColumnInfo(name = "done")
    private boolean done;

    public Task(String task, String dateTime, boolean done) {
        this.task = task;
        this.dateTime = dateTime;
        this.done = done;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task1 = (Task) o;
        return done == task1.done && task.equals(task1.task) && Objects.equals(dateTime, task1.dateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(task, dateTime, done);
    }
}
