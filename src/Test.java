class A extends Thread {
    public void run() {
        for(int i = 0; i <= 5; i++)
            System.out.println("thread A, i = " + i);
        System.out.println("End of thread A");
    }
}
class B extends Thread {
    public void run() {
        for(int j = 0; j <= 5; j++)
            System.out.println("thread B, i = " + j);
        System.out.println("End of thread B");
    }
}
class C extends Thread {
    public void run() {
        for(int k = 0; k <= 5; k++)
            System.out.println("thread C,i = " + k);
        System.out.println("End of thread C");
    }
}
class Test {
    public static void main(String[] args) {
        new A().start();
        new B().start();
        new C().start();
    }
}