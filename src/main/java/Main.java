import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj rozmiar tablicy: ");
        int rozmiar = scanner.nextInt();
        int[] tablica = new int[rozmiar];

        System.out.println("Wprowadź liczby całkowite:");
        for (int i = 0; i < rozmiar; i++) {
            tablica[i] = scanner.nextInt();
        }


      

        for (int i = 0; i < rozmiar - 1; i++) {
            for (int j = 0; j < rozmiar - i - 1; j++) {
                if (tablica[j] > tablica[j + 1]) 
                {
                    int temp = tablica[j];
                    tablica[j] = tablica[j + 1];
                    tablica[j + 1] = temp;
                }
            }
        }

        System.out.println("Posortowana liczby:");
        for (int i = 0; i < rozmiar; i++) {
            System.out.print(tablica[i] + " ");
        }
    }
}