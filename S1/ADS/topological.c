#include <stdio.h>

int i, j, n, a[20][20] = {0};

void main()
{
    printf("enter the number of nodes:");
    scanf("%d", &n);
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < n; j++)
        {
            printf("A[%d][%d]:", i, j);
            scanf("%d", &a[i][j]);
        }
        printf("\n");
    }

    // topological sorting

    int visited[20]={0};
    int e = 0;

    printf("Topological order is:");
    while (e < n)
    {
        for (i = 0; i < n; i++)
        {
            int flag = 0;
            for (j = 0; j < n; j++)
            {
                if (a[j][i] == 0)
                {
                    continue;
                }
                else
                {
                    flag = 1;
                    break;
                }
            }
            if(flag==1){
                continue;
            }
                
            if (!visited[i])
            {
                visited[i] = 1;
                for (int k = 0; k < n; k++)
                {
                    a[i][k] = 0;
                }
                printf("%d ", i);
                break;
            }
        }
        e++;
    }
}