#include<stdio.h>
#include<time.h>
void main(){
    clock_t start, end;
    double cpu_time_used;
    start = clock();

    FILE *fp;
    int a[10],i=0;
    fp = fopen("abc.txt","r");

    // EOE = End of File
    while(fscanf(fp,"%d",&a[i])!=EOF){
        printf("%d\n",a[i]);
        i++;
    }
    fclose(fp);

    end = clock();
    cpu_time_used = ((double)(end-start))/CLOCKS_PER_SEC;
    printf("Time %f",cpu_time_used);
}