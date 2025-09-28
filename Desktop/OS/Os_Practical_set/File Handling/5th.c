// 5. Write a C program to write "Hello, World!" to a new text file.

#include <stdio.h>

int main() {
    FILE *file = fopen("hello.txt", "w");
    if (file) {
        fprintf(file, "Hello, World!\n");
        fclose(file);
        printf("Written successfully.\n");
    } else {
        printf("Error creating file\n");
    }
    return 0;
}
