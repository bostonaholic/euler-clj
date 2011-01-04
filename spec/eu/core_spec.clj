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
    (should= '() (factors 3))
    (should= '(2 4) (factors 8))
    (should= '(3 5) (factors 15))
    (should= '(3) (factors 9))
    (should= '() (factors Integer/MAX_VALUE))
    (should= '() (factors 17)))

  (it "should be able to find a prime"
    (should-not (prime? -14))
    (should-not (prime? 0))
    (should-not (prime? 1))
    (should (prime? 2))
    (should (prime? 3))
    (should-not (prime? 6))
    (should (prime? 7))
    (should-not (prime? 9))
    (should (prime? 7907))
    (should-not (prime? 14))
    (should (prime? Integer/MAX_VALUE)))
  
  (it "should find the prime factors"
    (should= '(3 5) (prime-factors 15))
    (should= '(5 7 13 29) (prime-factors 13195))))
