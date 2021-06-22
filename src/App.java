public class App
{
    public static void main(String[] args) throws Exception
    {
        Crepe crepe = new Crepe();
        crepe.addIngredient(new Chocolat());
        crepe.addIngredient(new Chantille());

        System.out.println("\n\nDessert : " + crepe.getName());

        System.out.println("\nIngredients :");
        for (Ingredient ingredient : crepe.getIngredients())
        {
            System.out.println("- " + ingredient.getName());
        }

        System.out.println("\nPour un total de " + crepe.getPrice() + "€\n");


        /////////////////////////////////////////////////////////////////////


        Gauffre gauffre = new Gauffre();
        gauffre.addIngredient(new Chocolat());

        System.out.println("\n\nDessert : " + gauffre.getName());

        System.out.println("\nIngredient :");
        for (Ingredient ingredient : gauffre.getIngredients())
        {
            System.out.println("- " + ingredient.getName());
        }

        System.out.println("\nPour un total de " + gauffre.getPrice() + "€\n");
    }
}