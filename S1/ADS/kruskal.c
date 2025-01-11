#include <stdio.h>
#include <limits.h>
#define max 100

int parent[max];

int find(int x)
{
    while (parent[x] != x)
    {
        x = parent[x];
    }
    return x;
}

int union_(int x, int y)
{
    int u, v;
    u = find(x);
    v = find(y);
    parent[v] = u;
}

void main()
{
    int adj[max][max] = {0};
    int res[max][max] = {0};
    int n, i, j;
    printf("enter the number of nodes:");
    scanf("%d", &n);
    for (i = 0; i < n; i++)
    {
        parent[i] = i;
    }
    printf("enter edge weights:\n");
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < n; j++)
        {
            printf("A[%d][%d]=", i, j);
            scanf("%d", &adj[i][j]);
        }
    }

    int e = 0;
    int u, v, min,cost=0;
    while (e < n - 1)
    {
        min = INT_MAX;
        for (i = 0; i < n; i++)
        {
            for (j = 0; j < n; j++)
            {
                if (adj[i][j] < min && adj[i][j] != 0)
                {
                    min = adj[i][j];
                    u = i;
                    v = j;
                }
            }
        }
        printf("selected edge: (%d,%d) -> weight %d\n", u, v, min);
        if (find(u) != find(v))
        {
            union_(u, v);
            res[u][v] = adj[u][v];
            res[v][u] = adj[v][u];
            e++;
            cost+=min;
            printf("Added edge to spanning tree: (%d, %d)\n", u, v);

        }
        else
        {
            printf("edges (%d,%d) creates a cycle and is skipped.\n", u, v);
        }
        adj[u][v] = 0;
        adj[v][u] = 0;
    }
    printf("spanning tree:\n");
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < n; j++)
        {
            printf("%d\t", res[i][j]);
        }
        printf("\n");
    }
}