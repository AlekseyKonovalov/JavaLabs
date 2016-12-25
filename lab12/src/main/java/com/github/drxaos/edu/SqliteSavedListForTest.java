package com.github.drxaos.edu;



import java.io.*;
import java.util.*;
import java.util.List;

public class SqliteSavedListForTest<E extends Serializable> extends AbstractList<E> {

    private List list=new ArrayList();
    String tableName;
    private Map<E,List<E>> tableAndLis= new HashMap<E, List<E>>();

    public SqliteSavedListForTest(String table) throws ClassNotFoundException {

        this.tableName = table;
        int count = 0;

        if (DB.DBTable(tableName))
        {
            list.clear();
            load();
        }
        else
        {
           DB.tableAndList.put(table,new LinkedList<Object>());
        }
    }

    public void load() {
        if (true) {
            list.addAll(DB.tableAndList.get(tableName).subList(0, DB.tableAndList.get(tableName).size()));
        }
    }

    protected void deleteFromTable(int id) {
        DB.tableAndList.get(tableName).remove(id);
    }

    protected void saveToTable(){
        DB.tableAndList.get(tableName).clear();
        DB.tableAndList.get(tableName).addAll(list.subList(0,list.size()));
    }

    protected void updateTable(int id, E elem){
        DB.tableAndList.get(tableName).set(id,elem);
    }

    @Override
    public E get(int index) {
        return (E) list.get(index);
    }

    @Override
    public E set(int index, E element) {
        list.set(index, element);
        updateTable(index, element);
        return this.get(index);
    }

    @Override
    public void add(int index, E element) {
        list.add(index, element);
        saveToTable();

    }

    @Override
    public boolean add(E elem) {
        list.add(elem);
        saveToTable();

        return false;
    }

    @Override
    public E remove(int index) {
        E obj=(E) this.list.remove(index);
        deleteFromTable(index);

        return obj;
    }

    @Override
    public int size() {
        return list.size();
    }
    public void reload() throws FileOperationException {
        //list.clear();
        load();
    }
}