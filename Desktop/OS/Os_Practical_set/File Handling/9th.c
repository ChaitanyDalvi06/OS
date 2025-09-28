// Write a C program to count the number of lines in a text file.

#include <stdio.h>

int main() {
    FILE *file = fopen("1.txt", "r");
    if (file) {
        int lines = 0;
        char buffer[256];
        while (fgets(buffer, sizeof(buffer), file)) {
            lines++;
        }
        fclose(file);
        printf("Number of lines: %d\n", lines);
    } else {
        printf("Error opening file\n");
    }
    return 0;
}
