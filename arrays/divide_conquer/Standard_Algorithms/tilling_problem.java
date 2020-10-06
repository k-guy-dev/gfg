package arrays.divide_conquer.Standard_Algorithms;

class tilling_problem {
    static int a = 0, b = 0, size_of_grid, cnt = 0;
    static int arr[][];

    public static void place(int x1, int y1, int x2, int y2, int x3, int y3) {
        cnt++;
        arr[x1][y1] = cnt;
        arr[x2][y2] = cnt;
    }

    public int tile(int n, int x, int y)
    {
        int r=0, c = 0;
        if(n==2)
        {
            cnt++;
            for(int i =0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(arr[x+i][y+j] == 0)
                    {
                        arr[x+i][y+j] = cnt;
                    }
                }
            }
            return 0;
        }
        for(int i=x;i<n;i++)// finding location of hole
        {
            for(int j = y;j<n;j++)
            {
                if(arr[i][j] !=0)
                {
                    r =i;
                    c=j;
                }
            }
        }
        //If missing tile is in first quadrant
        if(r<x + n/2 && c < y + n/2)
        {
            place(x+n/2, y+(n/2)-1, x + n/2, y + n/2, x +(n/2)-1, y+(n/2));
        }
        else if(r>=x+n/2 && c < y + n/2)
        {
            place((x + n / 2, y + (n / 2) - 1, x + n / 2, 
            y + n / 2, x + n / 2 - 1, y + n / 2 - 1);
        }
        else if(r < x + n / 2 && c >= y + n / 2)
        {
            place(x + (n / 2) - 1, y + (n / 2), x + (n / 2), 
              y + n / 2, x + (n / 2) - 1, y + (n / 2) - 1); 
            }
  
    // If missing Tile is in 4st quadrant 
    else if (r >= x + n / 2 && c >= y + n / 2) 
       {
        place(x + (n / 2) - 1, y + (n / 2), x + (n / 2), 
        y + (n / 2) - 1, x + (n / 2) - 1, y + (n / 2) - 1); 
       }
       tile(n / 2, x, y + n / 2); 
    tile(n / 2, x, y); 
    tile(n / 2, x + n / 2, y); 
    tile(n / 2, x + n / 2, y + n / 2); 
  
    return 0; 
    }
}