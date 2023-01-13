package com.example.exemplorecyclerview.data;

import com.example.exemplorecyclerview.model.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroLista {

    private List<Carro> listaCarros;

    public CarroLista() {
       listaCarros = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            listaCarros.add(new Carro(i, String.valueOf(i)));
        }
    }

    public List<Carro> getListaCarros() {
        return listaCarros;
    }

    public void setListaCarros(List<Carro> listaCarros) {
        this.listaCarros = listaCarros;
    }
}
