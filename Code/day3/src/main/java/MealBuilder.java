public class MealBuilder {
    private Meal meal = new Meal();
    public void reset(){
        this.meal = new Meal();
    }
    public Meal getMeal(){
        return meal;
    }
    public void mainCourse(Items item){
        meal.itemList.add(item);
    }
    public void beverage(Items item){
        meal.itemList.add(item);
    }
}
