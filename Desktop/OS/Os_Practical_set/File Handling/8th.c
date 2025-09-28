// 8. Write a C program to copy the contents of one file to another.

#include <stdio.h>

int main() {
    FILE *source = fopen("file.txt", "r");
    FILE *dest = fopen("hello.txt", "w");
    if (source && dest) {
        char buffer[256];
        while (fgets(buffer, sizeof(buffer), source)) {
            fputs(buffer, dest);
        }
        fclose(source);
        fclose(dest);
        printf("File copied successfully.\n");
    } else {
        printf("Error opening files\n");
    }
    return 0;
}
