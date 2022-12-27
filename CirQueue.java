import java.util.Scanner;

class opration{
    int f,r = -1;
    int max =  5;
    int [] cq = new int[max];

    void enqueue(int no){
        if((f==0 && r==max-1) || (f==r+1)){
            System.out.println("Overflow");
        }
        else if(f==-1){
            f=0;
        }
        else{
            r = (r+1)%max;
            cq[r]=no;
        }
    }

    void dequeue(){
        if(f==-1){
            System.out.println("underflow");
        }
        else if(f==r){
            f=r=-1;
        }
        else{
            f=(f+1)%max;
        }
    }

    void display(){
        if(f==-1){
            System.out.println("underflow");
        }
        else if(f>r){
            for(int i=f;i<=max-1;i++){
                System.out.println(cq[i]);
                for(i=0;i<=r;i++){
                    System.out.println(cq[i]);
                }
            }
        }
        else{
            for(int i=f;i<=r;i++){
                System.out.println(cq[i]);
            }
        }
    }
}

public class CirQueue{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        opration op= new opration();

        System.out.println("enter 1 for enqueue /n enter 2 for dequeue /n enter for display");
        int ch= sc.nextInt();

        while(true){
            switch(ch){
                case 1:
                int no = sc.nextInt();
                op.enqueue(no);
                break;

                case 2:
                op.dequeue();
                break;

                case 3:
                op.display();
                break;
            }
        }
    }
}