package com.turing.base.activity.dataStore.sharedPreference;

import java.io.Serializable;

/**
 * MyApp
 *
 * @author Mr.Yang on 2016-02-21  17:08.
 * @version 1.0
 * @desc  必须可序列化，需要实现Serializable
 */
public class Product implements Serializable
{
    public String name;
    public int price;
}
