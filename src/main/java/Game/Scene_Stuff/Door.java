package Game.Scene_Stuff;

import Game.Item.Item;

//TODO:Develop Class Door
public class Door {
    Item item;
    String name,desc,keyID;

    public Door(String cName,String cDesc,String cKeyID,Item cItem)
    {
        this.name = cName;
        this.desc = cDesc;
        this.keyID = cKeyID;
        item = cItem;
    }

}
