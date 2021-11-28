package io.github.xmu_android_basics.example.tasklist;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class TaskListModel extends AndroidViewModel {
    private AppRepo appRepo;


    private LiveData<List<Task>> tasksData;

    public TaskListModel(@NonNull Application application) {
        super(application);
        appRepo = new AppRepo(application);

        tasksData = appRepo.getAllTask();
    }

    public void addTask(String taskName) {
        List<Task> tasks = tasksData.getValue();

        Task task = new Task(taskName, "", false);

        appRepo.insertTask(task);
    }

    public LiveData<List<Task>> getTasksData() {
        return tasksData;
    }
}
