static int fibonacci(int n) {
    if (n == 0 || n == 1) {
      return n;
    }
    return fibonacci(n - 2) + fibonacci(n - 1);
  }

  public static void main(String[] args) {
    int n = 8;
    System.out.println("fibonacci series of : " + n + " term is:");
    for (int i = 0; i <= n; i++) {
      System.out.println(fibonacci(i));
    }

  }