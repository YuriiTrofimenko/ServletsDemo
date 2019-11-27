/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.servletsdemo;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Yurii
 */
public class Order {
    private static Integer lastId = 0;
    public Integer id;
    public String goodName;
    public BigDecimal amount;
    public Date date;

    public Order(String goodName, BigDecimal amount) {
        this.id = ++lastId;
        this.goodName = goodName;
        this.amount = amount;
        date = new Date();
    }
}
