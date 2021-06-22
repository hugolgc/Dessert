public abstract class Ingredient
{
  private String name;
  private double price;

  public Ingredient(String name, double price)
  {
    this.setName(name);
    this.setPrice(price);
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

  public void setPrice(double price)
  {
    this.price = price;
  }
}