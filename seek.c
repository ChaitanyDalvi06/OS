#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<fcntl.h>
#include<unistd.h>

int main()
{	
	int sz, seek_pos=0,seek_pos1,seek_end,l;
	char buff[100],buff1[100];
	int fd= open("1.txt",O_RDWR);

if(fd<0)
{
	perror("Error occured during open");
	exit(1);
}

	seek_pos= lseek(fd,0,SEEK_SET);
	printf("\n Initalized Offset position:(%d)\n",seek_pos);

	seek_pos= lseek(fd,2,SEEK_SET);
	printf("\n Offset position:(%d)\n",seek_pos);

	seek_pos= lseek(fd,6,SEEK_SET);
	printf("\n Offset position:(%d)\n",seek_pos);

	sz=read(fd,buff,10);
	printf("\n read bytes from file after lseek is=(%d)\n",sz);
	buff[sz]='\0';
	printf("Read bytes are as follows:\n%s\n,buff");
	
	seek_end = lseek(fd,0,SEEK_END);
        seek_pos1=lseek(fd,11,SEEK_SET);
        l=(seek_end-seek_pos1)+1;
        sz=read(fd,buff1,l);
        printf("\n read bytes from file after lseek is = (%d) \n",sz);
        buff1[sz]='\0';
        printf("Characters from after 11th to end read bytes are as follows: \n%s\n",buff);	

	seek_pos=lseek(fd,0,SEEK_END);
        printf("\n Offset position after (SEEK_END+0) :(%d) \n", seek_pos);

        strcpy(buff,"New string appeded after seek end\n");
        sz=write(fd,buff,strlen(buff));
	
	

        close(fd);

        return 0;

}













