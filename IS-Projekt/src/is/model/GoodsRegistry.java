package is.model;

import is.model.listitems.GoodsListItem;
import is.model.listitems.ListItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;

/**
 *
 * @author Viktor Voigt
 * @author Anna Thernfrid
 * @author Eric Nordlund
 */
public class GoodsRegistry {

    private HashMap<Integer, Goods> goodsList = new HashMap<>();
    private int goodsKeyCount = 0;
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
        
        HashMap<Integer, Goods> hm = this.getGoodsList();

        DefaultListModel<ListItem>  lm = new DefaultListModel<>();

        Iterator it = hm.entrySet().iterator();

        while (it.hasNext()) {

            Map.Entry e = (Map.Entry) it.next();

            int key = (Integer) e.getKey();

            Goods g = (Goods) e.getValue();
            
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