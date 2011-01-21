(ns math.prime
  (:use [math.prime]
        [speclj.core]))

(describe "math.prime tests"

  (it "should be able to find a prime"
    (should-not (prime? -14))
    (should-not (prime? 0))
    (should-not (prime? 1))
    (should (prime? 2))
    (should (prime? 3))
    (should-not (prime? 6))
    (should (prime? 7))
    (should-not (prime? 9))
    (should (prime? 37))
    (should (prime? 7907))
    (should-not (prime? 14))
    (should (prime? Integer/MAX_VALUE)))
  
  (it "should find the prime factors"
    (should= '(3 5) (prime-factors 15))
    (should= '(2 3) (prime-factors 24))
    (should= '(5 7 13 29) (prime-factors 13195)))

  (it "should return the nth prime number"
    (should= 2 (nth-prime 1))
    (should= 13 (nth-prime 6)))

  (it "should find the list of primes below n"
    (should= '(2 3 5 7) (primes-below-n 10))))

