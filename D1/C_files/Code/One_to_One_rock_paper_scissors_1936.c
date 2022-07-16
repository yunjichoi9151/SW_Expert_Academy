#include <stdio.h>

int main()
{
    int a, b;

    scanf("%d %d", &a, &b);

    if (a > b)
        printf("%s", (b == a - 1) ? "A" : "B");
    else
        printf("%s", (a == b - 1) ? "B" : "A");

    return 0;

}