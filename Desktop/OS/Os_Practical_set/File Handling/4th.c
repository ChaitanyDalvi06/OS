// 4. Write a C program to demonstrate the use of any 5 modes to open a text file.
#include <stdio.h>

int main() {
    FILE *file;
    // Mode: Read
    file = fopen("1.txt", "r");
    if (file) fclose(file);

    // Mode: Write
    file = fopen("1.txt", "w");
    if (file) fclose(file);

    // Mode: Append
    file = fopen("1.txt", "a");
    if (file) fclose(file);

    // Mode: Read and Write
    file = fopen("1.txt", "r+");
    if (file) fclose(file);

    // Mode: Write and Read
    file = fopen("1.txt", "w+");
    if (file) fclose(file);

    printf("File modes demonstrated.\n");
    return 0;
}
