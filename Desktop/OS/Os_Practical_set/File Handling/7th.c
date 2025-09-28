// 7. Write a C program to read a file line by line and print each line.

#include <stdio.h>

int main() {
    FILE *file = fopen("1.txt", "r");
    if (file) {
        char line[256];
        while (fgets(line, sizeof(line), file)) {
            printf("%s", line);
        }
        fclose(file);
    } else {
        printf("Error opening file\n");
    }
    return 0;
}
