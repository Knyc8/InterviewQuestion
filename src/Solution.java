import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        ArrayList[] lines = new ArrayList[n];
        for (int i = 0; i < n; i++)
        {
            String d = s.nextLine();
            ArrayList<Integer> intList = new ArrayList<Integer>();
            while (d.indexOf(" ") != -1)
            {
                int num = Integer.parseInt(d.substring(0, d.indexOf(" ")));
                d = d.substring(d.indexOf(" ") + 1);
                intList.add(num);
            }
            intList.add(Integer.parseInt(d));
            lines[i] = intList;
        }

        ArrayList<String> output = new ArrayList<String>();
        int numQueries = Integer.parseInt(s.nextLine());
        for (int i = 0; i < numQueries; i++)
        {
            String query = s.nextLine();
            int row = Integer.parseInt(query.substring(0, query.indexOf(" "))) - 1;
            int col = Integer.parseInt(query.substring(query.indexOf(" ") + 1));
            if (col >= lines[row].size())
            {
                output.add("ERROR!");
            }
            else
            {
                output.add(lines[row].get(col).toString());
            }
        }

        for (String str : output)
        {
            System.out.println(str);
        }
    }
}
