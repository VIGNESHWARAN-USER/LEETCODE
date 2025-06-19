import java.util.ArrayList;
public class Permutation {

    public static void permute(int[] arr, int i,int n, ArrayList<Integer> ans)
    {
        if(i == n) System.out.println(ans);
        for(int j = i; j<n; j++)
        {

        }
    }


    public static void main(String args[])
    {
        int[] arr = {1, 2, 3};
        ArrayList<Integer> ans = new ArrayList<>();
        permute(arr, 0, arr.length, ans);
    }
}
