(ns eu.math_spec
  (:use speclj.core
        eu.math))

(describe "Project Euler math"

  (it "should count upto"
    (should= '(1 2) (upto 1 3)))

  (it "should count downto"
    (should= '(3 2) (downto 3 1)))

  (it "should count to"
    (should= '(10 11 12 13 14 15 16 17 18 19) (to 10 20))
    (should= '(20 19 18 17 16 15 14 13 12 11) (to 20 10))
    (should= '(5 4 3 2 1 0 -1 -2 -3 -4) (to 5 -5))
    (should= '(1 2 3 4 5 6 7 8 9) (to 10)))

  (it "should be divisible"
    (should (divisible? 4 2))
    (should (divisible? 21 7)))

  (it "should return the square of a number"
    (should= 25 (square 5))
    (should= 144 (square 12)))

  (it "should return the cube of a number"
    (should= 8 (cube 2))
    (should= 125 (cube 5)))

  (it "should return x to the power of n"
    (should= 1 (exp 15 0))
    (should= 15 (exp 15 1))
    (should= 25 (exp 5 2))
    (should= 144 (exp 12 2))
    (should= 8 (exp 2 3))
    (should= 125 (exp 5 3))
    (should= 16807 (exp 7 5)))

  (it "should find the least number of a sequence"
    (should= 1 (least '(5 9 1 3))))

  (it "should find the greatest number of a sequence"
    (should= 9 (greatest '(5 9 1 3))))

  (it "should create a lazy sequence of the multiples of a number"
    (should= '(3 6 9 12 15 18) (take 6 (multiples 3))))

  (it "should find the common elements of two sequences"
    (should= '(1 2 3) (common '(1 2 3) '(1 2 3)))
    (should= '(1 2 3) (common '(1 2 3 4) '(1 2 3)))
    (should= '(1 2 3) (common '(1 4 7 3 8 2) '(5 6 1 3 9 2))))

  (it "should find the common multiples up to a * b"
    (should= '(6) (common-multiples 2 3))
    (should= '(15) (common-multiples 5 3))
    (should= '(12 24) (common-multiples 4 6)))

  (it "should find the least common multiple of 2 numbers"
    (should= 15 (lcm 3 5))
    (should= 12 (lcm 4 6)))

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

  (it "should find the product for a collection of integers"
    (should= 5 (product-of-collection '(5)))
    (should= 25 (product-of-collection '(5 5))))

  (it "splits a number into digits"
      (should= '(8 6 7 2 3) (digits 32768))))