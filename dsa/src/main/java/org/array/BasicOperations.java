  package org.array;

  import java.util.Arrays;

  public class BasicOperations {

    public static void main(String[] args) {
      String[] groceries = {"apples","oranges","mangoes","bananas","grapes"};
      System.out.println(groceries[0]); // Reading array element

      System.out.println(search("bananas",groceries));
      System.out.println(search("papaya",groceries));

     Arrays.stream(insert("papaya",groceries.length,groceries)).forEach(System.out::println); // Inserting at end
    }

    private static String search(String item, String[] groceries) {
      for (int i=0; i<groceries.length; i++) {
        if(groceries[i].equals(item)) return item+" found at index "+i;
      }
      return item+" not found";
    }

    private static String[] insert(String item, int index, String[] oldGroceries) {
      String[] newGroceries = new String[oldGroceries.length + 1];
      for(int i=0; i<newGroceries.length; i++) {
        if(i==index)
          newGroceries[i] = item;
        else
          newGroceries[i] = oldGroceries[i];
      }
      return newGroceries;
    }
  }
