// 10. Write a C program to check if a file exists before attempting to open it.
#include <stdio.h>

int main() {
    const char *filename = "1.txt";
    FILE *file = fopen(filename, "r");
    if (file) {
        printf("File exists\n");
        fclose(file);
    } else {
        printf("File does not exist\n");
    }
    return 0;
}
