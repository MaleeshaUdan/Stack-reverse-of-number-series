import java.util.Scanner;

class NewStack{
    int arr_size;
    int[]arr;
    int top=-1;

   public boolean isFull(){
        if(top==arr_size-1){
            return true;
        }
        else{
            return false;
        }
   }

   public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        else{
            return false;
        }
   }

   public void push(int x){
    if(isFull()==true){
        System.out.println("Stack is Full");
    }
    else{
        top++;
        arr[top]=x;
    }
   }

   public void pop(){
    if(isEmpty()==true){
        System.out.println("Stack Is Empty");
    }
    else{
        int temp=arr[top];
        top--;
        System.out.println(temp);
    }
   }

   public static void main(String[] args) {
    NewStack ns=new NewStack();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the total count of numbers");
    int tot_num=sc.nextInt();
    ns.arr_size=tot_num;
    ns.arr=new int[tot_num];
    int[]fir_arr=new int[tot_num];

    for (int i = 0; i < tot_num; i++) {
        System.out.println("Enter the "+(i+1)+" number");
        fir_arr[i]=sc.nextInt();
    }

    for (int i = 0; i < tot_num; i++) {
        ns.push(fir_arr[i]);
    }

    System.out.println("Reverse Order");

    for (int i = 0; i < tot_num; i++) {
        ns.pop();
    }
   }
}
