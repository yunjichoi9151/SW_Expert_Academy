#include <stdio.h>

int main()
{
    int numArr[200], n, temp = 0;

    scanf("%d", &n);

    for (int i = 0; i < n; i++)
        scanf("%d", &numArr[i]);

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n - 1; j++) {
            if (numArr[j] > numArr[j + 1]) {
                temp = numArr[j];
                numArr[j] = numArr[j + 1];
                numArr[j + 1] = temp;
            }
        }
    }

    printf("%d", numArr[n / 2]);

    return 0;
}