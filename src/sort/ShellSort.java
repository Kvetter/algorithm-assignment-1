package sort;

import entities.Card;

import java.util.ArrayList;

// Java implementation of ShellSort
public class ShellSort
{

    /* function to sort arr using shellSort */
    public int sort(ArrayList<Card> arr)
    {
        int n = arr.size();

        for (int gap = n/2; gap > 0; gap /= 2)
        {
            for (int i = gap; i < n; i += 1)
            {
                Card temp = arr.get(i);
                int j;
                for (j = i; j >= gap && arr.get(j - gap).compareTo(temp) > 0; j -= gap) {
                    arr.set(j, (arr.get(j - gap)));
                }

                arr.set(j, temp);
            }
        }
        return 0;
    }

}
