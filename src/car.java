interface CarStart{
    void start();
}
interface CarStop{
    void stop();
}
  class bar implements CarStart,CarStop {
      public void start() {
          System.out.println("the engin Start");
      }

      public void stop() {
          System.out.println("engine stops");
      }
  }

      public class car {
          public static void main(String[] args) {
              bar c = new bar();
              c.start();
              c.stop();

          }
      }



