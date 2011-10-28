(ns eu.euler001-spec
  (:use [eu.euler001]
        [speclj.core]))

(describe "Project Euler problem 1"
          
  (it "should be divisible"
    (should (divisible? 4 2))
    (should (divisible? 21 7)))

  (it "should return true for mod 3 or 5"
    (should (mod3or5 3))
    (should (mod3or5 5))
    (should (mod3or5 9))
    (should (mod3or5 15))
    (should-not (mod3or5 7)))

  (it "should be 23 for 1 to 10"
    (should= 23 (euler001 10)))

  (it "should find for 1 to 1000"
    (should= 233168 (euler001 1000))))
