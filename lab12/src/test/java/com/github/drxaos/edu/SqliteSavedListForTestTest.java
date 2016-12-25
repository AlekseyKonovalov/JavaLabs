package com.github.drxaos.edu;

import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;


public class SqliteSavedListForTestTest {
    @Test
    public void test1() throws Exception {

        String tableName = "list1";
        // create list
        SqliteSavedListForTest<String> list = new SqliteSavedListForTest<String>(tableName);
        list.add("One");
        list.add("Two");
        list.add("Three");
        for (int i = 0; i < 100; i++) {
            list.add(1, "Hello " + i);
        }
        list.remove("Two");

        // check contents
        Assert.assertTrue(list.contains("Hello 50"));
        Assert.assertEquals(102, list.size());
        Assert.assertEquals("One", list.get(0));
        Assert.assertEquals("Hello 99", list.get(1));
        Assert.assertEquals("Hello 0", list.get(100));

        // create another list
        tableName = "list2";

        SqliteSavedListForTest<String> list2 = new SqliteSavedListForTest<String>(tableName);
        list2.add("One");
        list2.add("Two");
        list2.add("Three");

        // retain
        list.retainAll(list2);
        Assert.assertEquals(2, list.size());
    }

    @Test
    public void test2() throws Exception {

        String tableName = "list3";

        // create list
        SqliteSavedListForTest<String> list = new SqliteSavedListForTest<String>(tableName);
        list.add("One");
        list.add("Two");
        list.add("Three");
        for (int i = 0; i < 100; i++) {
            list.add(1, "Hello " + i);
        }
        list.remove("Two");
        list = null;

        // load list
        SqliteSavedListForTest<String> loadedList = new SqliteSavedListForTest<String>(tableName);

        Assert.assertTrue(DB.tableAndList.containsKey(tableName));
        Assert.assertTrue(loadedList.contains("Hello 50"));
        Assert.assertEquals(102, loadedList.size());
        Assert.assertEquals("One", loadedList.get(0));
        Assert.assertEquals("Hello 99", loadedList.get(1));
        Assert.assertEquals("Hello 0", loadedList.get(100));
    }

    @Test
    public void test3() throws Exception {
        String tableName = "list4";

        // create list
        SqliteSavedListForTest<String> list = new SqliteSavedListForTest<String>(tableName);
        list.add("One");
        list.add("Two");
        list.add("Three");
        for (int i = 0; i < 100; i++) {
            list.add(1, "Hello " + i);
        }
        list.remove("Two");

        // load list and remove elements
        SqliteSavedListForTest<String> loadedList = new SqliteSavedListForTest<String>(tableName);
        for (Iterator<String> iterator = loadedList.iterator(); iterator.hasNext(); ) {
            String next = iterator.next();
            if (next.contains("8")) {
                iterator.remove();
            }
        }
        Assert.assertEquals(83, loadedList.size());

        // reload
        Assert.assertFalse(list.isEmpty());
        list = new SqliteSavedListForTest<String>(tableName);
        Assert.assertEquals(83, list.size());

        // remove file
        DB.tableAndList.remove(tableName);

        // reload
        list = new SqliteSavedListForTest<String>(tableName);
        Assert.assertTrue(list.isEmpty());
        Assert.assertEquals(0, list.size());
    }


    @Test
    public void test4() throws Exception {
        String tableName = "list5";

        // create list
        SqliteSavedListForTest<Integer> list = new SqliteSavedListForTest<Integer>(tableName);
        list.add(1);
        list.add(2);
        list.add(3);
        list.set(0, 999);
        list = null;

        // load list
        SqliteSavedListForTest<Integer> loadedList = new SqliteSavedListForTest<Integer>(tableName);

        Assert.assertTrue(DB.tableAndList.containsKey(tableName));
        Assert.assertEquals(Integer.valueOf(999), loadedList.get(0));
        Assert.assertEquals(Integer.valueOf(2), loadedList.get(1));
        Assert.assertEquals(Integer.valueOf(3), loadedList.get(2));
        Assert.assertEquals(3, loadedList.size());
    }
}