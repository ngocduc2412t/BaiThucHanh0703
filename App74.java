public static void main(String[] args) {​

  int n;​

  Scanner scanner = new Scanner(System.in);​

    do {​

     System.out.println("Nhập vào số phần tử của mảng: ");​

     n = scanner.nextInt();​

    } while (n < 0);​

  int A[] = new int[n];​

  System.out.println("Nhập các phần tử cho mảng: ");​

  for (int i = 0; i < n; i++) {​

  System.out.print("Nhập phần tử thứ "+i + ": ");​