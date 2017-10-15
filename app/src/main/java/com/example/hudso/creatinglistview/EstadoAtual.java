package com.example.hudso.creatinglistview;

public enum EstadoAtual {

    FAZENDO {
        @Override
        public String toString() {
            return "Fazendo";
        }
    },
    FINALIZADO {
        @Override
        public String toString() {
            return "finalizado";
        }
    };
}