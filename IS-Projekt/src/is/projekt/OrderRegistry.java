/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package is.projekt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * @author svalan
 */
public class OrderRegistry extends HashMap{

    private List<Order> orderList = new ArrayList<>();

    public List getOrderList() {

        return orderList;

    }

    public void addOrder(Order orderToAdd) {

        getOrderList().add(orderToAdd);

    }

    private int createOrderNumber() {

        int biggestNumber = 0;

        Iterator<Order> iter = orderList.iterator();

        while (iter.hasNext()) {

            Order o = iter.next();

            if (o.getIdNumber() > biggestNumber) {

                biggestNumber = o.getIdNumber();
            }

        }

        return biggestNumber + 1;
    }

    private Order getNewSellOrder() {

        Order newOrder = new BuyOrder(createOrderNumber());

        getOrderList().add(newOrder);

        return newOrder;

    }

    private Order getNewBuyOrder() {

        Order newOrder = new BuyOrder(createOrderNumber());

        getOrderList().add(newOrder);

        return newOrder;
    }

}
