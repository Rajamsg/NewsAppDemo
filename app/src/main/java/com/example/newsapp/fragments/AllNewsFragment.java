package com.example.newsapp.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.newsapp.R;
import com.example.newsapp.adapter.AllNewsAdapterClass;
import com.example.newsapp.basicutility.ProgressBarClass;
import com.example.newsapp.databinding.FragmentAllNewsBinding;
import com.example.newsapp.databinding.FragmentFollowingBinding;
import com.example.newsapp.modalClass.AllNewsResponse;
import com.example.newsapp.modalClass.News;
import com.example.newsapp.webServices.RetroFitConnectionClass;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class AllNewsFragment extends Fragment {
    FragmentAllNewsBinding binding;
    AllNewsAdapterClass allNewsAdapterClass;
    List<News> newsList;
    ProgressBarClass progressBarClass;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_following, container, false);
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_all_news, container, false);
        progressBarClass = new ProgressBarClass();

        getAllNews();

        return binding.getRoot();
    }

    public void getAllNews(){
        progressBarClass.showProgress(getActivity());
        RetroFitConnectionClass.getApiCall().getAllNews().enqueue(new Callback<AllNewsResponse>() {
            @Override
            public void onResponse(Call<AllNewsResponse> call, Response<AllNewsResponse> response) {
                progressBarClass.dismissProgress();
                if(response.body() != null){
                 String pod=   response.body().getData().getNewslist().get(0).getPosition();
                    newsList=  response.body().getData().getNewslist();
                    LinearLayoutManager horizontalLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
                    binding.allNews.setLayoutManager(horizontalLayoutManager);
                    allNewsAdapterClass = new AllNewsAdapterClass(newsList, getActivity());
                    binding.allNews.setAdapter(allNewsAdapterClass);
                }
                else
                    Toast.makeText(getActivity(), "Something Went Wrong...", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(Call<AllNewsResponse> call, Throwable t) {
                progressBarClass.dismissProgress();
            }
        });
    }


}


