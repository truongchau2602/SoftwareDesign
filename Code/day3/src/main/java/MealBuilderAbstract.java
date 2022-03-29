public abstract class MealBuilderAbstrac {
    protected Meal meal= new Meal();
    public void reset(){
        this.meal= new Meal();
    }
    public void setMeal(Meal meal){
        this.meal= meal;
    }
    public Meal getMeal(){
        return meal;
    }
    public abstract void mainCourse(Items item);
    public abstract void beverage(Items item);
}
