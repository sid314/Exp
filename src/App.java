
class Numbers {
    public static String removeDecimal(String s) {
      String r = new String();
      for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == '.')
          continue;
        r = r + s.charAt(i);
      }
      return r;
    }
  
    public static String addDecimal(String s, int a) {
      String r = new String();
      for (int i = 0; i < s.length(); i++) {
        if (i == a)
          r = r + ".";
        r = r + s.charAt(i);
      }
      return r;
    }
  
    public static byte multiply(byte a, byte b) {
      byte s = 0;
      for (byte i = 1; i <= a; i++)
        s += b;
      return s;
    }
  
    public static short multiply(short a, short b) {
      short s = 0;
      for (short i = 1; i <= a; i++)
        s += b;
      return s;
    }
  
    public static int multiply(int a, int b) {
      int s = 0;
      for (int i = 1; i <= a; i++)
        s += b;
      return s;
    }
  
    public static double multiply(double a, double b) {
      String sa = a + "", sb = b + "";
      int na = sa.indexOf('.'), nb = sb.indexOf('.');
      long la = Long.parseLong(removeDecimal(sa)),
          lb = Long.parseLong(removeDecimal(sb));
      long rl = multiply(la, lb);
      int ri = na + nb - 1;
      String r = addDecimal(rl + "", ri);
      return Double.parseDouble(r);
    }
  
    public static float multiply(float a, float b) {
      return (float) multiply(a + 0.0, b + 0.0);
    }
  
    public static double multiply(byte a, double b) {
      double s = 0.0;
      for (short i = 1; i <= a; i++)
        s += b;
      return s;
    }
  
    public static double multiply(short a, double b) {
      double s = 0.0;
      for (byte i = 1; i <= a; i++)
        s += b;
      return s;
    }
  
    public static double multiply(int a, double b) {
      double s = 0.0;
      for (int i = 1; i <= a; i++)
        s += b;
      return s;
    }
  
    public static double multiply(long a, double b) {
      double s = 0.0;
      for (long i = 1; i <= a; i++)
        s += b;
      return s;
    }
  
    public static double multiply(double a, byte b) {
      return multiply(a, b + 0.0);
    }
  
    public static double multiply(double a, short b) {
      return multiply(a, b + 0.0);
    }
  
    public static double multiply(double a, int b) {
      return multiply(a, b + 0.0);
    }
  
    public static double multiply(double a, long b) {
      return multiply(a, b + 0.0);
    }
  
    public static long multiply(long a, long b) {
      long s = 0;
      for (long i = 1; i <= a; i++)
        s += b;
      return s;
    }
  
    public static int pow(int a, int b) {
      int r = 1;
      for (int i = 1; i <= b; i++)
        r = multiply(r, a);
      return r;
    }
  
    public static boolean prime(int n) {
      int m = n, c = 0, i = 1;
      do {
        if (m % i == 0)
          c++;
        i++;
      } while (i <= m);
      return c == 2;
    }
  
    public static int reverse(int n) {
      int r = 0;
      for (int c = n; c != 0; c /= 10)
        r = multiply(r, 10) + (c % 10);
      return r;
    }
  
    public static boolean emirp(int n) {
      return prime(n) && prime(reverse(n));
    }
  
    public static boolean automorphic(int n) {
      int sq = pow(n, 2), k = 0, m = n;
      while (m != 0) {
        k++;
        m /= 10;
      }
      int r = sq % pow(10, k);
      return r == n;
    }
  
    public static boolean palindrome(int n) {
      return reverse(n) == n;
    }
  
    public static boolean superPalindrome(int n) {
      return palindrome(n) && palindrome(pow(n, 2));
    }
  
    public static boolean palprime(int n) {
      return palindrome(n) && prime(n);
    }
  
    public static int evenDigit(int n) {
      int m = n, c = 0;
      while (m != 0) {
        int d = m % 10;
        if (d % 2 == 0) {
          c++;
        }
        m /= 10;
      }
      return c;
    }
  
    public static int oddDigit(int n) {
      int m = n, c = 0;
      while (m != 0) {
        int d = m % 10;
        if (d % 2 == 1) {
          c++;
        }
        m /= 10;
      }
      return c;
    }
  
    public static int sumOfEvenDigits(int n) {
      int m = n, s = 0;
      while (m != 0) {
        int d = m % 10;
        if (d % 2 == 0)
          s = s + d;
        m /= 10;
      }
      return s;
    }
  
    public static int sumOfOddDigits(int n) {
      int m = n, s = 0;
      while (m != 0) {
        int d = m % 10;
        if (d % 2 == 1)
          s = s + d;
        m /= 10;
      }
      return s;
    }
  
    public static int sumOfDigits(int n) {
      int m = n, s = 0;
      while (m != 0) {
        int d = m % 10;
  
        s = s + d;
        m /= 10;
      }
      return s;
    }
  
    public static boolean spy(int n) {
      int m = n, s = 0, p = 1;
      while (m != 0) {
        int d = m % 10;
        s += d;
        p = multiply(p, d);
        m /= 10;
      }
      return s == p;
    }
  
    public static boolean niven(int n) {
      int m = n, s = 0;
      while (m != 0) {
        int d = m % 10;
        s += d;
        m /= 10;
      }
      return n % s == 0;
    }
  
    public static boolean neon(int n) {
      int m = pow(n, 2), s = 0;
      while (m != 0) {
        int d = m % 10;
        s += d;
        m /= 10;
      }
      return s == n;
    }
  
    public static boolean buzz(int n) {
      return (n % 7 == 0) || (n % 10 == 7);
    }
  
    public static boolean pronic(int n) {
      int f = 0;
      for (int i = 1; i <= n; i++) {
        if (multiply(i, i + 1) == n) {
          f = 1;
          break;
        }
      }
      return f == 1;
    }
  
    public static boolean special(int n) {
      int m = n, s = 0;
      while (m != 0) {
        int d = m % 10;
        int f = 1;
        for (int i = 1; i <= d; i++) {
          f = multiply(f, i);
        }
        s += f;
        m /= 10;
      }
      return s == n;
    }
  
    public static boolean fascinating(int n) {
      String s = (("" + n) + multiply(n, 2)) + multiply(n, 3);
      boolean ans = false;
      int c = 0;
      for (char i = '1'; i <= '9'; i++) {
        boolean flag = false;
        for (int j = 0; j < s.length(); j++) {
          if (s.charAt(j) == i || s.charAt(j) == 0) {
            flag = true;
            if (s.charAt(j) == i) {
              c++;
            }
          }
        }
        if (flag == false) {
          break;
        }
      }
      if (c == 9) {
        ans = true;
      }
      return ans;
    }
  
    public static boolean duck(int n) {
      boolean flag = false;
      while (n != 0) {
        int d = n % 10;
        if (d == 0) {
          flag = true;
          break;
        }
        n /= 10;
      }
      return flag;
    }
  
    public static boolean disarium(int n) {
      int copy = n, numberOfDigits = 0;
      double sum = 0.0;
      while (copy != 0) {
        numberOfDigits++;
        copy /= 10;
      }
      copy = n;
      while (copy != 0) {
        int d = copy % 10;
        sum += Math.pow(d, numberOfDigits--);
        copy /= 10;
      }
      return sum == n;
    }
  
    public static boolean happy(int n) {
      int c = n;
      while (c > 9) {
        int s = 0;
        while (c != 0) {
          int d = c % 10;
          s += pow(d, 2);
          c /= 10;
        }
        c = s;
      }
      return c == 1;
    }
  
    public static boolean sad(int n) {
      return !happy(n);
    }
  
    public static boolean magic(int n) {
      int c = n;
      while (c > 9) {
        int s = 0;
        while (c != 0) {
          int d = c % 10;
          s += d;
          c /= 10;
        }
        c = s;
      }
      return c == 1;
    }
  
    public static boolean unique(int n) {
      boolean flag = false;
      for (int i = 0; i <= 9; i++) {
        int c = n, k = 0;
        while (c != 0) {
          int d = c % 10;
          if (d == i) {
            k++;
          }
          c /= 10;
        }
        if (k > 1) {
          flag = true;
        }
      }
      return !flag;
    }
  
    public static boolean deficient(int n) {
      int sum = 0;
      for (int i = 1; i < n; i++) {
        if (n % i == 0) {
          sum += i;
        }
      }
      return sum < n;
    }
  
    public static boolean hasEvenDigits(int n) {
      return (n + "").length() % 2 == 0;
    }
  
    public static boolean tech(int n) {
      if (hasEvenDigits(n)) {
        String ns = n + "";
        int h1 = Integer.parseInt(ns.substring(0, ns.length() / 2));
        int h2 = Integer.parseInt(ns.substring(ns.length() / 2, ns.length()));
        return pow(h1 + h2, 2) == n;
  
      } else
        return false;
    }
  
    public static void main(String[] args) {
      System.out.println(multiply(3, 2.3));
    }
  }