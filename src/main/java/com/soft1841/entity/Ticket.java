package com.soft1841.entity;

/**
 * 小票类
 *2018.12.26
 */

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleLongProperty;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Ticket {
    private final SimpleLongProperty ticketId = new SimpleLongProperty();
    private final SimpleLongProperty cashierId = new SimpleLongProperty();
    private final SimpleLongProperty vipId = new SimpleLongProperty();
    private final SimpleDateFormat date = new SimpleDateFormat();
    private final SimpleDoubleProperty count = new SimpleDoubleProperty();

    public Ticket() {
    }

    public Ticket(long ticketId, long cashierId, long vipId, DateFormat date, double count){
    }

    public long getTicketId() {
        return ticketId.get();
    }

    public SimpleLongProperty ticketIdProperty() {
        return ticketId;
    }

    public void setTicketId(long ticketId) {
        this.ticketId.set(ticketId);
    }

    public long getCashierId() {
        return cashierId.get();
    }

    public SimpleLongProperty cashierIdProperty() {
        return cashierId;
    }

    public void setCashierId(long cashierId) {
        this.cashierId.set(cashierId);
    }

    public long getVipId() {
        return vipId.get();
    }

    public SimpleLongProperty vipIdProperty() {
        return vipId;
    }

    public void setVipId(long vipId) {
        this.vipId.set(vipId);
    }

    public SimpleDateFormat getDate() {
        return date;
    }

    public double getCount() {
        return count.get();
    }

    public SimpleDoubleProperty countProperty() {
        return count;
    }

    public void setCount(double count) {
        this.count.set(count);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId=" + ticketId +
                ", cashierId=" + cashierId +
                ", vipId=" + vipId +
                ", date=" + date +
                ", count=" + count +
                '}';
    }
}
