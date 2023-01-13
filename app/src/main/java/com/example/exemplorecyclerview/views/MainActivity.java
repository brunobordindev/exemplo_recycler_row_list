package com.example.exemplorecyclerview.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.exemplorecyclerview.R;
import com.example.exemplorecyclerview.adapter.CarroListAdapter;
import com.example.exemplorecyclerview.data.CarroLista;
import com.example.exemplorecyclerview.model.Carro;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewHolder.rv_carros = findViewById(R.id.rv_carros);

        CarroLista carroLista = new CarroLista();
        List<Carro> listaCarros = new ArrayList<>();
        listaCarros.addAll(carroLista.getListaCarros());

        //adapter
        CarroListAdapter carroListAdapter = new CarroListAdapter(listaCarros);
        mViewHolder.rv_carros.setAdapter(carroListAdapter);

        //layout
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mViewHolder.rv_carros.setLayoutManager(linearLayoutManager);
    }

    private static class  ViewHolder{
        RecyclerView rv_carros;
    }
}