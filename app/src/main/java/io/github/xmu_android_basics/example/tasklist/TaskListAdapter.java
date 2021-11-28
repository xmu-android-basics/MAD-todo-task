package io.github.xmu_android_basics.example.tasklist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import io.github.xmu_android_basics.example.tasklist.databinding.TaskItemBinding;

public class TaskListAdapter extends ListAdapter<Task, TaskListAdapter.TaskViewHolder> {

    protected TaskListAdapter() {
        super(new TaskDiff());
    }

    @NonNull
    @Override
    public TaskViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return TaskViewHolder.create(parent);
    }

    @Override
    public void onBindViewHolder(@NonNull TaskViewHolder holder, int position) {
        holder.bind(getItem(position));
    }

    static class TaskDiff extends DiffUtil.ItemCallback<Task> {
        @Override
        public boolean areItemsTheSame(@NonNull Task oldItem, @NonNull Task newItem) {
            return oldItem == newItem;
        }

        @Override
        public boolean areContentsTheSame(@NonNull Task oldItem, @NonNull Task newItem) {
            if (oldItem.equals(newItem)) {
                return true;
            }
            return false;
        }

    }


    static class TaskViewHolder extends RecyclerView.ViewHolder {

        TaskItemBinding _binding;

        public TaskViewHolder(View itemView) {
//            _binding = binding;
            super(itemView);
        }

        private void bind(Task task) {
            _binding.setTask(task);
        }

        public static TaskViewHolder create(@NonNull ViewGroup parent) {
            return new TaskViewHolder(
                    DataBindingUtil.inflate(
                            LayoutInflater.from(parent.getContext()),
                            R.layout.task_item, parent, false
                    ).getRoot()
            );
        }
    }
}

