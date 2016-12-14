package com.github.drxaos.edu;

import java.io.*;
import java.util.AbstractList;
import java.util.ArrayList;

public class SavedList<E extends Serializable> extends AbstractList<E> implements Reloadable {

    private ArrayList<E> listItems;
    private File file;

    public SavedList(File file) throws IOException, ClassNotFoundException {

        listItems=new ArrayList<E>();

        if (file.exists()){
            this.file=file;
            reload();
        }
        else{
            this.file=new File(file.getAbsolutePath());
        }
    }

    public void reload() throws FileOperationException, IOException, ClassNotFoundException {
        listItems.clear();
        if(file.exists()) {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            listItems = (ArrayList<E>) objectInputStream.readObject();
            objectInputStream.close();
        }
    }

    @Override
    public E get(int index) {
        return listItems.get(index);
    }

    @Override
    public E set(int index, E element) {
        listItems.set(index, element);
        try {
            save();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return element;
    }

    @Override
    public int size() {
        return listItems.size();
    }

    @Override
    public void add(int index, E element) {
        listItems.add(index,element);
        try {
            save();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public E remove(int index) {
        E temp=listItems.remove(index);
        try {
            save();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return temp;
    }

    public void save() throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
        objectOutputStream.writeObject(listItems);
        objectOutputStream.close();
    }
}
