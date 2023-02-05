# Stack-reverse-of-number-series
In this java file, it shows how to reverse a number series by using Stack Data Structure. Here inputs are taken from the user

Here i will give a full documentaion regarding this code

***01***
public boolean isFull(){
        if(top==arr_size-1){
            return true;
        }
        else{
            return false;
        }
   }

***This method checks whether the stack is full***

***02***

public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        else{
            return false;
        }
   }
   
***This method checks whether the Stack is Empty***

***03***

public void push(int x){
    if(isFull()==true){
        System.out.println("Stack is Full");
    }
    else{
        top++;
        arr[top]=x;
    }
   }
 ***This method is used to enter the values to the Stack***
 
 ***04***
 
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
 
***This Method is uded to get out the values which are already in the stack

***05***

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
   
   
   ***This is the main method, here all the numerical values are taken from the user***
 
