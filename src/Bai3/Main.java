package Bai3;

public class Main {
    public static void main(String[] args) {
        LazyPrimeFactorization lazyPrimeFactorization = new LazyPrimeFactorization("Lazy");
        OptimizedPrimeFactorization optimizedPrimeFactorization = new OptimizedPrimeFactorization("Optimized");

        lazyPrimeFactorization.start();
        optimizedPrimeFactorization.start();
    }
}
