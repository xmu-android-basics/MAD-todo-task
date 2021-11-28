package io.github.xmu_android_basics.example.tasklist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavHost;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import java.util.List;

import io.github.xmu_android_basics.example.tasklist.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding _binding;

    TaskListModel taskListModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        _binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(_binding.getRoot());




//        RecyclerView taskListView = _binding.taskList;
//        taskListView.setLayoutManager(new LinearLayoutManager(this));
//        TaskListAdapter taskListAdapter = new TaskListAdapter();
//        taskListView.setAdapter(taskListAdapter);
//
//        taskListModel = new ViewModelProvider(this).get(TaskListModel.class);
//        taskListModel.getTasksData().observe(this, new Observer<List<Task>>() {
//            @Override
//            public void onChanged(List<Task> tasks) {
//                taskListAdapter.submitList(tasks);
//            }
//        });
    }

    public void addTask(View view) {
//        String task = _binding.newTask.getText().toString();
//
//        taskListModel.addTask(task);
//
//        _binding.newTask.setText("");

        Navigation.findNavController(this, R.id.fragmentContainerView)
                .navigate(R.id.action_taskListFragment_to_addTaskFragment);
    }
}