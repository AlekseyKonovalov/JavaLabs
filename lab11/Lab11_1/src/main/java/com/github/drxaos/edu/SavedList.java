package com.github.drxaos.edu;

import java.io.*;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public interface SavedList <E extends Serializable>  {

    public void reload();

    public E get(int index);


    public E set(int index, E element);


    public int size();


    public void add(int index, E element);

    public E remove(int index) ;

}
