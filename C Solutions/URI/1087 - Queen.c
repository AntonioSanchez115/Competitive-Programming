#include <stdio.h>
#include <stdlib.h>

int main() {
    int a, b, x, y;
    while (scanf("%d %d %d %d", &a, &b, &x, &y) && (a + b + x + y) != 0) {
        if (a == x && b == y) printf("0\n");
        else if ((abs(a - x) == abs(b - y)) || (a == x || b == y)) printf("1\n");
        else printf("2\n");
    }
    return 0;
}
