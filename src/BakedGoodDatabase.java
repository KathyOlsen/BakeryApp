import java.util.ArrayList;
import java.util.List;

public class BakedGoodDatabase {
    private BakedGood bakedGood;
    private List<BakedGood> bakedGoods;
    private List<BakedGood> noGluten;
    private List<BakedGood> noDairy;
    private List<BakedGood> noNuts;
    private List<BakedGood> noSoy;

    public BakedGoodDatabase(){
        bakedGood = new BakedGood();
        bakedGoods = new ArrayList<>();
        noGluten = new ArrayList<>();
        noDairy = new ArrayList<>();
        noNuts = new ArrayList<>();
        noSoy = new ArrayList<>();
        bakedGoods.add(new BakedGood("Black Bean Brownie", 3.95, 9/20/19, false,
                false,false,false,10));
        bakedGoods.add(new BakedGood("Gluten-Free Herb Focaccia", 5.95, 9/18/19,
                false,false,false,false,10));
        bakedGoods.add(new BakedGood("Tangerine Tofu Trifle",3.95,9/22/19,false,
                false,false,true,5));
        bakedGoods.add(new BakedGood("Double-Fudge Brownie",2.45,9/20/19,true,
                true,false,false,25));
        bakedGoods.add(new BakedGood("Cinnamon Macadamia Nut Cookie",1.95,9/21/19,
                true,false,true,false,20));
        bakedGoods.add(new BakedGood("Amazing Almond Croissant",2.45,9/18/19,true,
                false,true,false,20));
        bakedGoods.add(new BakedGood("Caramel Peanut Butter Cookie",1.95,9/21/19,
                true,false,true,false,15));
        bakedGoods.add(new BakedGood("Crustless Pumpkin Cheesecake",3.95,9/23/19,
                false,false,false,false,15));
        bakedGoods.add(new BakedGood("Gluten-Free Banana Bread",2.95,9/23/19,false,
                false,false,false,15));
        bakedGoods.add(new BakedGood("Vegetable Empanada",5.95,9/25/19,true,
                false,false,false,20));
        bakedGoods.add(new BakedGood("Tantalizing Tiramisu Cake",4.95,9/20/19,true,
                false,false,false,20));
        bakedGoods.add(new BakedGood("Peach Thyme Tart",4.95,9/21/19,true,
                false,false,false,10));
        bakedGoods.add(new BakedGood("Gluten-Free Snickerdoodle",1.95,9/21/19,false,
                false,false,false,20));
        bakedGoods.add(new BakedGood("Raspberry Pie",4.95,9/22/19,true,
                false,false,false,20));
        bakedGoods.add(new BakedGood("Poppy Seed Brioche",1.95,9/21/19,true,
                false,false,false,15));
    }

    public List<BakedGood> getNoGluten() {
        for (BakedGood bakedGood : bakedGoods){
            if (bakedGood.isContainsGluten() == false){
                noGluten.add(bakedGood);
            }
        }
        return noGluten;
    }

    public List<BakedGood> getNoDairy() {
        for (BakedGood bakedGood : bakedGoods){
            if (bakedGood.isContainsDairy() == false){
                noDairy.add(bakedGood);
            }
        }
        return noDairy;
    }

    public List<BakedGood> getNoNuts() {
        for (BakedGood bakedGood : bakedGoods){
            if (bakedGood.isContainsNuts() == false){
                noNuts.add(bakedGood);
            }
        }
        return noNuts;
    }

    public List<BakedGood> getNoSoy() {
        for (BakedGood bakedGood : bakedGoods){
            if (bakedGood.isContainsSoy() == false){
                noSoy.add(bakedGood);
            }
        }
        return noSoy;
    }

    public List<BakedGood> getBakedGoods() {
        return bakedGoods;
    }

    public void setBakedGoods(List<BakedGood> bakedGoods){
        this.bakedGoods = bakedGoods;
    }
}
