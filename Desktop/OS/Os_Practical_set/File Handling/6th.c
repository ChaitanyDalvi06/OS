// 6. Write a C program to append "End of File" to an existing text file.

#include <stdio.h>

int main() {
    FILE *file = fopen("file.txt", "a");
    if (file) {
        fprintf(file, "End of File\n");
        fclose(file);
        printf("Appended successfully.\n");
    } else {
        printf("Error opening file\n");
    }
    return 0;
}
