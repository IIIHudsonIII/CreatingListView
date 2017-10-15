package com.example.hudso.creatinglistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListaDeCursosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_de_cursos);

        List<Curso> cursos = todosOsCursos();

        ListView listaDeCursos = (ListView) findViewById(R.id.lista);

        /** TODO HUDSON Adaptador simples, que recebe o array e apresenta a lista em tela **/
        ArrayAdapter<Curso> adapter = new ArrayAdapter<Curso>(this, android.R.layout.simple_list_item_1, cursos);

        listaDeCursos.setAdapter(adapter);

    }
    private List<Curso> todosOsCursos() {
        List<Curso> cursos = new ArrayList<>();

        Curso curso1 = new Curso("HTML5 Básico", "Curso básico de programação WEB.", EstadoAtual.FAZENDO);
        Curso curso2 = new Curso("ReactJS", "ReactJS a revolução do front-end.", EstadoAtual.FAZENDO);
        Curso curso3 = new Curso("CSS3", "CSS3 e uma internet mais bela.", EstadoAtual.FINALIZADO);

        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);

        return cursos;
    }
}