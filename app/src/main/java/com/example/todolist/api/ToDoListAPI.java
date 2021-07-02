package com.example.todolist.api;

import com.example.todolist.dto.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ToDoListAPI {
    @GET("/posts")
    Call<List<Post>> getToDoList();
}
