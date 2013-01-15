package is.model;

import is.model.listitems.GoodsListItem;
import is.model.listitems.ListItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;

/**
 *
 * @author Viktor Voigt
 * @author Anna Thernfrid
 * @author Eric Nordlund
 */
public class GoodsRegistry {

    private HashMap<Integer, Goods> goodsList = new HashMap<>(100);
    private int goodsKeyCount = 0;
    private ReferenceHandler referenceHandler;

    private int getNewGoodsKey() {
        goodsKeyCount++;
        return goodsKeyCount;
    }
    
    private HashMap<Integer, Goods> getGoodsList() {
        return goodsList;
    }

    private Iterator<Entry<Integer, Goods>> getGoodsListIterator() {

        return this.goodsList.entrySet().iterator();

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

    public void removeGoods(int goodsID) {
        this.getGoodsList().remove(goodsID);
    }

    public String[] getGoodsData(int goodsID) {

        String[] goodsData = getGoods(goodsID).getDataArray();

        return goodsData;

    }

    public void addGoods(String name, double price, String description) {

        int goodsID = this.getNewGoodsKey();

        Goods g = new Goods(goodsID, name, price, description);

        getGoodsList().put(goodsID, g);

    }

    void setReferenceHandler(ReferenceHandler aThis) {
        this.referenceHandler = aThis;
    }

    public ListModel<ListItem> getSimpleGoodsListModel() {

        DefaultListModel<ListItem> lm = new DefaultListModel<>();

        Iterator<Entry<Integer, Goods>> it = this.getGoodsListIterator();

        while (it.hasNext()) {

            Map.Entry<Integer, Goods> e = it.next();

            Goods g = e.getValue();

            ListItem listItem = g.getSimpleListItem();

            lm.addElement(listItem);

        }

        return lm;
    }

    public GoodsListItem getGoodsListItem(int goodsID) {

        Goods g = this.getGoods(goodsID);

        GoodsListItem gli = g.getGoodsListItem();

        return gli;

    }
}
