package fila_suporte_tecnico;

import java.util.ArrayList;

public class FilaClientes {
	
	private ArrayList<String> fila;

    public FilaClientes() {
        fila = new ArrayList<>();
    }

    public void enqueue(String elemento) {
        fila.add(elemento);
    }

    public String dequeue() {
        if (fila.isEmpty()) {
            throw new IllegalStateException("A fila está vazia.");
        }
        return fila.remove(0);
    }

    public boolean isEmpty() {
        return fila.isEmpty();
    }

    public int size() {
        return fila.size();
    }

    public String peek() {
        if (fila.isEmpty()) {
            throw new IllegalStateException("A fila está vazia.");
        }
        return fila.get(0);
    }
    
    public String get(int posicao) {
        if (posicao < 0 || posicao >= fila.size()) {
            throw new IndexOutOfBoundsException("Posição inválida.");
        }
        return fila.get(posicao);
    }
}
