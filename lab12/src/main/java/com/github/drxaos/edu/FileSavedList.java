package com.github.drxaos.edu;

import java.io.*;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class  FileSavedList <E extends Serializable> extends AbstractList<E> implements Reloadable {


    private File file;
    private List listItems;

    public FileSavedList(File file) throws IOException, ClassNotFoundException {
        this.listItems=new ArrayList();

        if (file==null)
            this.file = new File("savedList.dat");
        else
        {
            this.file = file;
            try {
                reload();
            } catch (FileOperationException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public void reload() throws FileOperationException, IOException, ClassNotFoundException {
        listItems.clear();
        try{
            FileInputStream fileInStream = new FileInputStream(this.file);
            ObjectInputStream objectInStream=new ObjectInputStream(fileInStream);
            listItems = (List) objectInStream.readObject();
            fileInStream.close();
            objectInStream.close();
        }
        catch(Exception ex){}
    }

    @Override
    public E get(int index) {
        return (E)  listItems.get(index);
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
        E temp=(E) listItems.remove(index);
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
