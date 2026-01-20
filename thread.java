// class MyThread extends Thread{
//     public void run(){
//     System.out.println(Thread.currentThread(),getName());
//     for(int i=0;i=10;i++){
//     System.out.println(i + "t1");
//     try {
//         Thread.sleep(2000);
//     } catch (Exception e) {
//     }
// }
// }
// class Main {
//     public static void main(String[] args) {
//         MyThread t1=new MyThread();
//         t1.start();
//         for(int i=0;i<5;i++){
//             System.out.println(i +"main");
//         }
//     }
//     
