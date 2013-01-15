package is.model;

import is.model.listitems.GoodsListItem;
import is.model.listitems.ListItem;
import is.model.tools.StringFormatter;

/**
 * En klass som representerar likformiga varor som tillbehör och reservdelar.
 */
public class Goods extends Product {

    private String name;

    protected Goods(int goodsID, String name, double price, String description) {

        super(goodsID, price, description);
        this.name = name;

    }

    private String getName() {

        return this.name;

    }

    protected String[] getDataArray() {

        String[] a = new String[3];

        a[0] = this.getName();
        a[1] = this.getPriceString();
        a[2] = getDescription();

        return a;

    }

    @Override
    protected String getDisplayName() {

        return this.name;
    }

    protected ListItem getSimpleListItem() {

        String nameString = this.getDisplayName();

        nameString = StringFormatter.rightPad(nameString, 35);

        String priceString = StringFormatter.formatPriceString(this.getPrice());

        priceString = StringFormatter.leftPad(priceString, 10);

        String displayString = nameString + " " + priceString;

        ListItem listItem = new ListItem(this.getProductID(), displayString);

        return listItem;

    }

    GoodsListItem getGoodsListItem() {

        int goodsID = this.getProductID();

        String displayName = this.getDisplayName();

        double price = this.getPrice();

        //Skapar ett GoodsListItem
        GoodsListItem gli = new GoodsListItem(goodsID, displayName, price, 1);

        return gli;


    }
}
