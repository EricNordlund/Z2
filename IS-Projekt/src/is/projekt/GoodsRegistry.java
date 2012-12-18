/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package is.projekt;

import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * @author anna_thernfrid
 */
public class GoodsRegistry {
    
    private HashMap<Integer, Goods> goodsRegistry = new HashMap<>();
    private int goodsKeyCount = 0;
    
    public HashMap<Integer, Goods> getGoodsRegistry() {
        return goodsRegistry;
    }
    private int getNewGoodsKey() {
        goodsKeyCount++;
        return goodsKeyCount;
    }
    public void addGoods(Goods g) {

        getGoodsRegistry().put(this.getNewGoodsKey(), g);
    }
 public void editGoods(Integer goodsID, Goods g) {
        getGoodsRegistry().put(goodsID, g);
    }

    public void removeGoods(Integer goodsID) {
        this.getGoodsRegistry().remove(goodsID);
    }
}
