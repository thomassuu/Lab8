package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size plus
     one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    @Test
    public void hasCityTest() {
        list = MockCityList();
        list.addCity(new City("Estevan", "SK"));
        assertTrue(list.hasCity(new City("Estevan", "SK")));
    }

    @Test
    public void deleteCityTest() {
        list = MockCityList();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(1, list.getCount());
        list.delete(new City("Estevan", "SK"));
        assertEquals(0, list.getCount());
    }

    @Test
    public void countCityTest() {
        list = MockCityList();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(1, list.countCity());
    }

}
