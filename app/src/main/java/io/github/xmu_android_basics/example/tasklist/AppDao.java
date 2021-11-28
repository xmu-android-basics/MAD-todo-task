package io.github.xmu_android_basics.example.tasklist;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface AppDao {

    @Query("SELECT * FROM task_table")
    public LiveData<List<Task>> getAllTask();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    public void insert(Task task);

    @Query("DELETE FROM task_table")
    public void deleteAll();
}
