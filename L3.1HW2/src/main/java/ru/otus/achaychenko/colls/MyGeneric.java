package ru.otus.achaychenko.colls;

public class MyGeneric<T> {
    private T value;

    public MyGeneric(T value){
        this.value = value;
    }

    public T getValue(){
        return this.value;
    }
}
