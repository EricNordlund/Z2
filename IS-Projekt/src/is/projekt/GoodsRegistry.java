/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package is.projekt;

import is.controller.Controller;
import is.controller.ListItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;

/**
 *
 * @author anna_thernfrid
 */
public class GoodsRegistry {

    private HashMap<Integer, Goods> goodsList = new HashMap<>();
    private int goodsKeyCount = 0;
    private Controller controller;
    private ReferenceHandler referenceHandler;

    private HashMap<Integer, Goods> getGoodsList() {
        return goodsList;
    }

    private int getNewGoodsKey() {
        goodsKeyCount++;
        return goodsKeyCount;
    }

    protected Goods getGoods(int goodsID) {

        Goods g;

        g = getGoodsList().get(goodsID);

        return g;

    }

    public void editGoods(int goodsID, String name, double price, String description) {

        Goods g = new Goods(goodsID, name, price, description);

        getGoodsList().put(goodsID, g);
    }

    public void removeGoods(Integer goodsID) {
        this.getGoodsList().remove(goodsID);
    }

    public String[] getGoodsData(Integer goodsID) {

        String[] goodsData = getGoods(goodsID).getDataArray();

        return goodsData;

    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void addGoods(String name, double price, String description) {
        
        int goodsID = this.getNewGoodsKey();
        
        Goods g = new Goods(goodsID, name, price, description);

        getGoodsList().put(goodsID, g);

    }

    void setReferenceHandler(ReferenceHandler aThis) {
        this.referenceHandler = aThis;
    }

    public ListModel getGoodsListModel() {
        HashMap<Integer, Goods> hm = this.getGoodsList();

        DefaultListModel lm = new DefaultListModel();

        Iterator it = hm.entrySet().iterator();

        while (it.hasNext()) {

            Map.Entry e = (Map.Entry) it.next();

            Integer key = (Integer) e.getKey();

            String displayString = e.getValue().toString();

            ListItem item = new ListItem(key, displayString);

            lm.addElement(item);

        }

        return lm;
    }
}
