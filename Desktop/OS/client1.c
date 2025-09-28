chaitanyadalvi@chaitanyas-MacBook-Air OS % gcc server1.c -o server
server1.c:21:28: error: call to undeclared function 'htnol'; ISO C99 and later do not support implicit function declarations [-Wimplicit-function-declaration]
        servaddr.sin_addr.s_addr= htnol(INADDR_ANY);
                                  ^
server1.c:31:78: warning: passing 'int *' to parameter of type 'socklen_t *' (aka 'unsigned int *') converts between pointers to integer types with different sign [-Wpointer-sign]
         int n=recvfrom(listenfd,buffer,sizeof(buffer),0,(struct sockaddr*)&cliaddr,&len);
                                                                                    ^~~~
/Library/Developer/CommandLineTools/SDKs/MacOSX.sdk/usr/include/sys/socket.h:732:27: note: passing argument to parameter here
    socklen_t * __restrict) __DARWIN_ALIAS_C(recvfrom);
                          ^
1 warning and 1 error generated.
chaitanyadalvi@chaitanyas-MacBook-Air OS % vi server1.c           
chaitanyadalvi@chaitanyas-MacBook-Air OS % clear                  






























chaitanyadalvi@chaitanyas-MacBook-Air OS % gcc server1.c -o server
server1.c:31:78: warning: passing 'int *' to parameter of type 'socklen_t *' (aka 'unsigned int *') converts between pointers to integer types with different sign [-Wpointer-sign]
         int n=recvfrom(listenfd,buffer,sizeof(buffer),0,(struct sockaddr*)&cliaddr,&len);
                                                                                    ^~~~
/Library/Developer/CommandLineTools/SDKs/MacOSX.sdk/usr/include/sys/socket.h:732:27: note: passing argument to parameter here
    socklen_t * __restrict) __DARWIN_ALIAS_C(recvfrom);
                          ^
1 warning generated.
chaitanyadalvi@chaitanyas-MacBook-Air OS % vi server1.c           


#include<stdio.h>
#include<string.h>
#include<sys/types.h>
#include<arpa/inet.h>
#include<sys/socket.h>
#include<netinet/in.h>
#define PORT 5000
#define MAXLINE 1000

//Driver code
int main() {
    char buffer[100];
    char *message = "Hello Client";
    int listenfd, len;
    struct sockaddr_in servaddr, cliaddr;
    bzero(&servaddr, sizeof(servaddr));

    //Create a UDP Socket
    listenfd = socket(AF_INET, SOCK_DGRAM, 0);

    servaddr.sin_addr.s_addr = htonl(INADDR_ANY);
    servaddr.sin_port = htons(PORT);
    servaddr.sin_family = AF_INET;

    //bind server address to socket descriptor
    bind(listenfd, (struct sockaddr*)&servaddr, sizeof(servaddr));

    //receive the datagram
    len = sizeof(cliaddr);
    int n = recvfrom(listenfd, buffer, sizeof(buffer), 0, (struct sockaddr*)&cliaddr, &len); // receive message from server
    buffer[n] = '\0';
    puts(buffer);

    //send the response
    sendto(listenfd, message, strlen(message), 0, (struct sockaddr*)&cliaddr, sizeof(cliaddr)); // fixed the argument
}
