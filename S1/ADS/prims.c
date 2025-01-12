#include <stdio.h>
#include <limits.h>

int a[100][100], visited[100] = {0};

void main()
{
    int i, j, n;
    printf("enter the number of nodes:");
    scanf("%d", &n);
    // adjacent matrix
    printf("enter the cost:\n");
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < n; j++)
        {
            printf("A[%d][%d]:", i, j);
            scanf("%d", &a[i][j]);
            // no connection between egdes assign them to larger values.
            if (!a[i][j])
            {
                a[i][j] = INT_MAX;
            }
        }
    }

    // prims
    int e = 0;
    int cost = 0, u, v, min;
    visited[0] = 1;
    while (e < n - 1)
    {
        for (i = 0; i < n; i++)
        {
            if (visited[i] == 1)
            {
                min = INT_MAX;
                for (j = 0; j < n; j++)
                {
                    if (a[i][j] < min && !visited[j])
                    {
                        min = a[i][j];
                        u = i;
                        v = j;
                    }
                }
            }
        }
        visited[v] = 1;
        printf("cost of (%d,%d)=%d\n", u, v, min);
        cost += min;
        e++;
    }
    printf("\nminimum cost:%d", cost);
}