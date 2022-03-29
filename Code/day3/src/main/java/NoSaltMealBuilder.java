public class NoSaltMealBuilder extends MealBuilderAbstract{
    @Override
    public void mainCourse(Items item){
        meal.itemList.add(item);
    }

    @Override
    public void beverage(Items item) {
        meal.itemList.add(item);
    }
}
