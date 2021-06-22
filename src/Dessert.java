import java.util.ArrayList;
import java.util.List;

public abstract class Dessert
{
  private String name;
  private double price;
  private List<Ingredient> ingredients;

  public Dessert(String name, double price)
  {
    this.setName(name);
    this.setPrice(price);
    this.setIngredients(new ArrayList <Ingredient>());
  }

  public String getName()
  {
    return this.name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public double getPrice()
  {
    return this.price;
  }

  private void setPrice(double price)
  {
    this.price = price;
  }

  public List<Ingredient> getIngredients()
  {
    return this.ingredients;
  }

  private void setIngredients(List<Ingredient> ingredients)
  {
    this.ingredients = ingredients;
  }

  public void addIngredient(Ingredient ingredient)
  {
    this.ingredients.add(ingredient);
    this.setPrice(this.getPrice() + ingredient.getPrice());
  }
}