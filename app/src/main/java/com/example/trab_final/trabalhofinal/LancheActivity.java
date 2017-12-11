package com.example.trab_final.trabalhofinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by samsung on 11/12/2017.
 */

public class LancheActivity extends AppCompatActivity {

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.activity_cardapio, container, false);
        ListView lst = (ListView) root.findViewById(R.id.lvtLanches);

        List<Lanche> samples = new ArrayList<>(10);
        samples.add(new Lanche(R.drawable.lanche, R.drawable.add, "Dispositivos Móveis", "+55 37 8847-6465: Vai ter aula a...", "20:04", null));
        samples.add(new Lanche(R.drawable.lanche, R.drawable.add, "Claudimaicon", "Você vai vim na cidade?", "19:46", null));
        samples.add(new Lanche(R.drawable.lanche, R.drawable.add, "Lanche Big Big", "Boa noite, está funcionando hoje?", "18:32", null));
        samples.add(new Lanche(R.drawable.lanche, R.drawable.add, "Eng Comp IFMG", "+55 37 9865-6139: Nem dupla...", "10:00", null));
        samples.add(new Lanche(R.drawable.lanche, R.drawable.add, "Jogos", "", "", null));
        samples.add(new Lanche(R.drawable.lanche, R.drawable.add, "Logística SETC", "Douglas: Então", "ONTEM", null));
        samples.add(new Lanche(R.drawable.lanche, R.drawable.add, "Trabalho Resistência", "Anderson: Está chegando ai pra...", "ONTEM", null));
        samples.add(new Lanche(R.drawable.lanche, R.drawable.add, "Para Sempre", "+55 8807-5464: pra que dia...", "21/11/17", null));
        samples.add(new Lanche(R.drawable.lanche, R.drawable.add, "Organização SETC", "+55 37 9105-7526: ah sim", "20/11/17", null));
        samples.add(new Lanche(R.drawable.lanche, R.drawable.add, "+55 37 9845-1342", "+55 37 9845-1342: oie S2", "18/11/17", null));

        LancheAdapter adapter = new LancheAdapter(samples, root.getContext());
        lst.setAdapter(adapter);

//        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Intent myIntent = new Intent(getBaseContext(), MessageActivity.class);
//                //myIntent.putExtra("test", "hello");
//                startActivity(myIntent);
//            }
//        });

        return root;
    }
}
