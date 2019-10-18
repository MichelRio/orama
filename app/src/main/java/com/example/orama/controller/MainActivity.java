package com.example.orama.controller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.orama.ItemAdapter;
import com.example.orama.R;
import com.example.orama.api.Client;
import com.example.orama.api.Service;
import com.example.orama.model.Item;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    TextView Disconnected;
    ProgressDialog pd;
    private SwipeRefreshLayout swipeContainer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        swipeContainer = (SwipeRefreshLayout) findViewById(R.id.swipeContainer);
        swipeContainer.setColorSchemeResources(android.R.color.holo_red_dark);
        swipeContainer.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                loadJSON();
                Toast.makeText(MainActivity.this, "Buscando resultados", Toast.LENGTH_SHORT).show();
            }
        });


    }
    private void initViews(){
        pd = new ProgressDialog(this);
        pd.setMessage("Buscando Dados");
        pd.setCancelable(false);
        pd.show();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.smoothScrollToPosition(0);
        loadJSON();
    }


    private void loadJSON(){

        Disconnected = (TextView) findViewById(R.id.disconnected);
        try{
            Client Client = new Client();
            Service apiService =
                    Client.getClient().create(Service.class);
            Call<List<Item>> call = apiService.getItems();
            call.enqueue(new Callback<List<Item>>() {
                @Override
                public void onResponse(Call<List<Item>> call, Response<List<Item>> response) {

                    List<Item> fundList = response.body();
                    String[] fundNames = new String[fundList.size()];
                    List<Item> items = response.body();

                    //Apenas pra consultas do que usar
//                    for (int i = 0; i < fundList.size(); i++) {
//                        fundNames[i] = fundList.get(i).getSimple_name();
//                        fundNames[i] = fundList.get(i).getFund_manager().getLogo();
//                        fundNames[i] = fundList.get(i).getDescription().getStrengths();
//                        fundNames[i] = fundList.get(i).getFull_name();
//                        fundNames[i] = fundList.get(i).getDescription().getObjective();
//                    }
//                    System.out.println("respostas"+Arrays.toString(fundNames));


                    recyclerView.setAdapter(new ItemAdapter(getApplicationContext(), items));
                    recyclerView.smoothScrollToPosition(0);
                    swipeContainer.setRefreshing(false);
                    pd.hide();
                }

                @Override
                public void onFailure(Call<List<Item>>call, Throwable t) {
                    Log.d("Error", t.getMessage());
                    Toast.makeText(MainActivity.this, "Falha ao buscar as informações!", Toast.LENGTH_SHORT).show();
                    Disconnected.setVisibility(View.VISIBLE);
                    pd.hide();

                }
            });

        }catch (Exception e){
            Log.d("Error", e.getMessage());
            Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show();
        }
    }


}