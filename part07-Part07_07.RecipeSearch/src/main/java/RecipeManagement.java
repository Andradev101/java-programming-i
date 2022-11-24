import java.util.ArrayList;

public class RecipeManagement {

    private ArrayList<Recipe> recipeList;

    public RecipeManagement() {
        recipeList = new ArrayList<>();
    }
    //actions
    public void treatData(String dataString) {

        String[] recipesArr = dataString.split("::"); //all recipes
        for (String recipe : recipesArr) {
            createRecipeObject(recipe);
        }
    }
    
    public String listRecipes() {
        String outString = "";
        for (int i = 0; i < this.recipeList.size(); i++) {
            outString += recipeList.get(i).toString();
            
            if(i < recipeList.size() - 1) {
                outString += "\n";
            }
        }

        return outString;
    }

    public String getRecipesByName(String searchKey) {
        String outString = "";
        for (int i = 0; i < this.recipeList.size(); i++) {  
            if(containsTitle(this.recipeList.get(i), searchKey)){
                outString += recipeList.get(i).toString();
                if(i < recipeList.size() - 1) {
                    outString += "\n";
                }
            }
        }

        return outString;
    }

    public String getRecipesByCookingTime(int searchKey) {
        String outString = "";
        for (int i = 0; i < this.recipeList.size(); i++) {  
            if(hasExceededCookingTime(this.recipeList.get(i), searchKey)){
                outString += recipeList.get(i).toString();
                if(i < recipeList.size() - 1) {
                    outString += "\n";
                }
            }
        }

        return outString;
    }

    public String getRecipesByIngredient(String searchKey) {
        String outString = "";
        for (int i = 0; i < this.recipeList.size(); i++) {  
            if(hasIngredient(this.recipeList.get(i), searchKey)){
                outString += recipeList.get(i).toString();
                if(i < recipeList.size() - 1) {
                    outString += "\n";
                }
            }
        }

        return outString;
    }

    //helpers
    private void createRecipeObject(String recipeDetails) {
        String[] recipe = recipeDetails.split(":");
        ArrayList<String> ingredients = new ArrayList<>();

        String title = recipe[0];
        int cookingTime = Integer.valueOf(recipe[1]);
        for (int i = 2; i < recipe.length; i++) {
            ingredients.add(recipe[i]);
        }

        Recipe recipeObj = new Recipe(title, cookingTime, ingredients);
        recipeList.add(recipeObj);
    }

    private boolean containsTitle(Recipe recipe, String searchKey) {
        return recipe.getTitle().toLowerCase().contains(searchKey.toLowerCase());
    }

    private boolean hasExceededCookingTime(Recipe recipe, int searchKey) {
        return recipe.getCookingTime() <= searchKey;
    }

    private boolean hasIngredient(Recipe recipe, String searchKey) {
        Boolean found = false;
        ArrayList<String> ingredientsList = recipe.getIngredients();
        for (String ingredient : ingredientsList) {
            if(ingredient.equals(searchKey)) {
                found = true;
                break;
            }
        }
        return found;
    }
}
