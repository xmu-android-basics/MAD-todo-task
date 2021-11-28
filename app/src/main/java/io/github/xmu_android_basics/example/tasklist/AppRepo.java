package io.github.xmu_android_basics.example.tasklist;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

public class AppRepo {
    private AppDao mDao;

    private LiveData<List<Task>> mAllTask;

    public AppRepo(Application application) {
        AppDatabase db = AppDatabase.getDatabase(application);

        mDao = db.getDao();

        mAllTask = mDao.getAllTask();
    }

    public LiveData<List<Task>> getAllTask() {
        return mAllTask;
    }

    public void insertTask(Task task) {
        AppDatabase.dbWriteExecutor.execute(() -> mDao.insert(task));
    }
}
