#include <stdio.h>
#include <stdlib.h>
 
int main() {
    int f, d, t, value, sum=0, i;
 
    printf("Enter the number of terms in AP series\n");
    scanf("%d", &t);
 
    printf("Enter first term and common difference of AP series\n");
    scanf("%d %d", &f, &d);
    value = f;
    printf("AP SERIES\n");
    for(i = 0; i < t; i++) {
        printf("%d ", value);
        sum += value;
        value = value + d;
    }
 
    printf("\nSum of the AP series till %d terms is %d\n", t, sum);
 
    
 return 0;
}
