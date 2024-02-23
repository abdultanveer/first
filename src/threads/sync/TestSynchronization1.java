package threads.sync;

class TestSynchronization1{
    public static void main(String args[]){
        Table sharedObj = new Table();//only one object
        MyThread1 t1=new MyThread1(sharedObj);
        MyThread2 t2=new MyThread2(sharedObj);
        t1.start();
        t2.start();
    }
}