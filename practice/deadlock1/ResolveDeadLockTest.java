package deadlock1;

public class ResolveDeadLockTest {

    public static void main(String[] args) {
        ResolveDeadLockTest test = new ResolveDeadLockTest();

        final A a = test.new A();
        final B b = test.new B();

        // Thread-1
        Runnable block1 = new Runnable() {
            public void run() {
                System.out.println("[Thread-1] run() start!");

                System.out.println("[Thread-1] 'b' 쓸꺼야! ");
                synchronized (b) {
                    System.out.println("[Thread-1] 'b' 쓰는 중... ");

                    System.out.println("[Thread-1] 'a' 쓸꺼야! ");
                    synchronized (a) { // Thread-1 have A but need B also
                        System.out.println("[Thread-1] 'a' 쓰는 중 ");
                    }
                    System.out.println("[Thread-1] 'a' 다 씀! ");
                }
                System.out.println("[Thread-1] 'b' 다 씀!");
                System.out.println("[Thread-1] run() end");
            }
        };

        // Thread-2
        Runnable block2 = new Runnable() {
            public void run() {
                System.out.println("-----------------[Thread-2] run() start!");
                System.out.println("-----------------[Thread-2] 'b' 쓸꺼야! ");

                synchronized (b) {
                    System.out.println("-----------------[Thread-2] 'b' 쓰는 중... ");

                    System.out.println("-----------------[Thread-2] 'a' 쓸꺼야! ");
                    synchronized (a) { // Thread-2 have B but need A also
                        System.out.println("-----------------[Thread-2] 'a' 쓰는 중 ");
                    }
                    System.out.println("-----------------[Thread-2] 'a' 다 씀! ");
                }
                System.out.println("-----------------[Thread-2] 'b' 다 씀! ");
                System.out.println("-----------------[Thread-2] run() end ");
            }
        };

        new Thread(block1).start();
        new Thread(block2).start();
    }

    // Resource A
    private class A {
        private int i = 10;

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }
    }

    // Resource B
    private class B {
        private int i = 20;

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }
    }
}

