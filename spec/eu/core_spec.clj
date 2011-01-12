(ns eu.core
  (:use [eu.core]
        [speclj.core]))

(describe "Project Euler eu.core tests"

  (it "should be divisible"
    (should (divisible? 4 2))
    (should (divisible? 21 7)))

  (it "should return first x items in fibonacci sequence"
    (should= '(0 1 1) (fib 3))
    (should= '(0 1 1 2 3 5 8 13) (fib 8)))

  (it "should return items in fib sequence less than x"
    (should= '(0) (fib-less-than 1))
    (should= '(0 1 1 2 3 5) (fib-less-than 8)))
  
  (it "should return the square of a number"
    (should= 25 (square 5))
    (should= 144 (square 12)))

  (it "should create a sequence up to n"
    (should= '(1 2 3 4 5) (seq-upto 5)))

  (it "should find all factors"
    (should= '() (factors 2))
    (should= '() (factors 3))
    (should= '(2) (factors 4))
    (should= '() (factors 5))
    (should= '(2 3) (factors 6))
    (should= '() (factors 7))
    (should= '(2 4) (factors 8))
    (should= '(3) (factors 9))
    (should= '(3 5) (factors 15))
    (should= '(2 3 4 6 8 12) (factors 24))
    (should= '() (factors 37))
    (should= '(2 4 11 22) (factors 44))
    (should= '() (factors Integer/MAX_VALUE)))

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

  (it "should recognize a palindrome"
    (should (palindrome? 1))
    (should-not (palindrome? 12))
    (should (palindrome? 121))
    (should (palindrome? 12321))
    (should (palindrome? 1221))
    (should-not (palindrome? 122334533221)))

  (it "should find the smallest number of a sequence"
    (should= 1 (least '(5 9 1 3))))

  (it "should find the largest number of a sequence"
    (should= 9 (largest '(5 9 1 3))))

  (it "should find the common multiples up to a * b"
    (should= '(6) (common-multiples 2 3))
    (should= '(15) (common-multiples 5 3))
    (should= '(12 24) (common-multiples 4 6)))

  (it "should find the least common multiple of 2 numbers"
    (should= 15 (lcm 3 5))
    (should= 12 (lcm 4 6))))
