// 2. Write a C program to create, open, and close a text file.

#include <stdio.h>

int main() {
    FILE *file = fopen("1..txt", "w");
    if (file) {
        fclose(file);
        printf("File created and closed successfully.\n");
    } else {
        printf("Error creating file\n");
    }
    return 0;
}
