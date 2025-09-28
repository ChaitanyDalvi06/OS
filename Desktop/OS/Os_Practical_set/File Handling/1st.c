// 1. Write a C program to open a text file and read the first 10 bytes.

#include <stdio.h>

int main() {
    FILE *file = fopen("1.txt", "r");
    if (file) {
        char buffer[11] = {0}; // +1 for null-terminator
        fread(buffer, 1, 10, file);
        printf("%s\n", buffer);
        fclose(file);
    } else {
        printf("Error opening file\n");
    }
    return 0;
}
