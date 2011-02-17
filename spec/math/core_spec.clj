(ns math.core
  (:use [speclj.core]))

(describe "math.core tests"

  (it "should be divisible"
    (should (divisible? 4 2))
    (should (divisible? 21 7)))

  (it "should return the square of a number"
    (should= 25 (square 5))
    (should= 144 (square 12)))

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
    (should= 25 (product-of-collection '(5 5)))))

