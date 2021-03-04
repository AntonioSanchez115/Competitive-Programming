#include <stdio.h>
#include <stdlib.h>

int main() {
    int h1, h2, m1, m2, minute, currentMinute, finalMinute;
    while (scanf("%d %d %d %d", &h1, &m1, &h2, &m2) && (h1 + h2 + m1 + m2) != 0) {
        minute = 0, currentMinute = (h1 * 60) + m1, finalMinute = (h2 * 60) + m2;
        while (1) {
            if (currentMinute == finalMinute) break;
            if (currentMinute == 1440) currentMinute = 0;
            currentMinute++;
            minute++;
        }
        printf("%d\n", minute);
    }
    return 0;
}
