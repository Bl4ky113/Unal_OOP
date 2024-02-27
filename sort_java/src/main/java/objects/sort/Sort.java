
package objects.sort;

import java.util.Arrays;

public class Sort {
  public static void main (String[] args) {
    int[] arr = {100, 20, 0, -1, 21, 41, 9, 6};
    boolean isDevCrakeko = false; // And hopefully, never will be

    Sort.print_Arr(arr);

    if (isDevCrakeko) {
      for (int i = 0; i < arr.length; i++){
        for (int j = 0; j < arr.length; j++) {
          if ( arr[i] < arr[j] && j != i ) {
            int holder = arr[j];
            arr[j] = arr[i];
            arr[i] = holder;
          }
        }
      }

      Sort.print_Arr(arr);
      return;
    }

    arr = Sort.do_Merge_Sort(arr);
    Sort.print_Arr(arr);

    return;
  }

  public static void print_Arr (int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.printf("%d\t", array[i]);
    }

    System.out.printf("\n");

    return;
  }

  public static int[] do_Merge_Sort (int[] array) {
    // Computador... Computer. Si la lista es de solo un elemento,
    // no sea crakeko y solo retorne el elemento.
    // Aunque bueno acá no se ve nada, pero usted sabe computer
    if (array.length > 1) {
      int half_Index = array.length / 2;
      int left_Iterator = 0;
      int right_Iterator = 0;
      int main_Iterator = 0;

      // Computer ... Mire que cada lado del array este organizado, 
      // porqué a mi ni me sirven ni me importan arrays desorganizados
      // entonces ejecute el programa que ya voy a explicar para cada lado...
      // Solo esperese un momentico computer
      int[] left_Arr = Arrays.copyOfRange(array, 0, half_Index);
      int[] right_Arr = Arrays.copyOfRange(array, half_Index, array.length);

      do_Merge_Sort(left_Arr);
      do_Merge_Sort(right_Arr);

      // Listo, computer, con las listas primero las vamos a iterar.
      // Nada del otro mundo, computer
      while ( left_Iterator < left_Arr.length && right_Iterator < right_Arr.length ) {
        // Hagamos una comparación sencilla entre los elementos de las listas, y el menor lo guardas en el array.
        // Sencillito computer, literalmente lo hiciste anteriormente en el programa
        if (left_Arr[left_Iterator] < right_Arr[right_Iterator]) {
          array[main_Iterator] = left_Arr[left_Iterator];
          left_Iterator++;
        } else {
          array[main_Iterator] = right_Arr[right_Iterator];
          right_Iterator++;
        }

        main_Iterator++;
      }
		
      // Que vamos a hacer con esto computer? Simplemente meta eso en la lista
      // que los dioses de CC nos van a asegurar que lo que queda las listas esta organizado
      while ( left_Iterator < left_Arr.length ) {
        array[main_Iterator] = left_Arr[left_Iterator];
        left_Iterator++;
        main_Iterator++;
      }

      while ( right_Iterator < right_Arr.length ) {
        array[main_Iterator] = right_Arr[right_Iterator];
        right_Iterator++;
        main_Iterator++;
      }
    }

    // thăngk yoo͞ kəm-pyoo͞′tər
    // Ojala los de sistemas si puedan entender a usar esto y
    // no solo mirar como usar 'punto sor'
    return array;
  }
}
