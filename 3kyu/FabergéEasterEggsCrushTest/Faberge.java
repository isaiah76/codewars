import java.math.BigInteger;

public class Faberge {
    public static BigInteger height(BigInteger n, BigInteger m) {
      if (n.compareTo(BigInteger.ZERO) == 0 || m.compareTo(BigInteger.ZERO) == 0) return BigInteger.ZERO;
      // min n and m
      BigInteger t = n.min(m);
      BigInteger sum = BigInteger.ZERO;
      BigInteger c = BigInteger.ONE; // start -> c(m,0) = 1

      for (BigInteger k = BigInteger.ONE; k.compareTo(t) <= 0; k = k.add(BigInteger.ONE)) {
          // c(m, k) = c(m, k-1) * (m - k + 1) / k
          BigInteger term = m.subtract(k).add(BigInteger.ONE);
          c = c.multiply(term).divide(k);
          sum = sum.add(c);
      }
      return sum;
    }
}
