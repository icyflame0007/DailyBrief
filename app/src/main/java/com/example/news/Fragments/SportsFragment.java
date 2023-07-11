package com.example.news.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.news.PriModelClass;
import com.example.news.R;
import com.example.news.RecyclerNewsAdapter;
import com.example.news.RetrofitClient;
import com.example.news.SecModelClass;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SportsFragment extends Fragment {

    String apikey ="f705dfa994cc451db396e09378a1dd38";
    ArrayList<SecModelClass> modelClassArrayList;
    RecyclerNewsAdapter adapter;
    private String category = "sports";
    String country = "in";

    private RecyclerView recyclerViewofsports;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View v = inflater.inflate(R.layout.fragment_sports, null);
        recyclerViewofsports = v.findViewById(R.id.recylviewsports);
        modelClassArrayList = new ArrayList<>();
        recyclerViewofsports.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new RecyclerNewsAdapter(getContext(),modelClassArrayList);
        recyclerViewofsports.setAdapter(adapter);

        findNews();
        // Inflate the layout for this fragment
        return v;
    }

    private void findNews() {


        RetrofitClient.getApiInterface().getCategoryNews(country,category,100,apikey).enqueue(new Callback<PriModelClass>() {
            @Override
            public void onResponse(Call<PriModelClass> call, Response<PriModelClass> response) {

                if(response.isSuccessful()){
                    modelClassArrayList.addAll(response.body().getArticles());
                    adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<PriModelClass> call, Throwable t) {

            }
        });

    }

}