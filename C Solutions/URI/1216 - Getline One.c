#include <stdio.h>
#include <stdlib.h>

int main() {
    char name[256];
    double dist, total = 0, n = 0;
    while (scanf("%[^\n]s", name) != EOF) {
        scanf("%lf", & dist);
        total += dist;
        n++;
    }
    printf("%.1lf\n", total / n);
    return 0;
}
