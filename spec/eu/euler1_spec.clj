(ns eu.euler1
  (:use [eu.euler1] :reload
        [speclj.core]))

(describe "Project Euler problem 1"

  (it "should return true for mod 3 or 5"
      (should (mod3or5 3))
      (should (mod3or5 5))
      (should (mod3or5 9))
      (should (mod3or5 15))
      (should-not (mod3or5 7)))

  (it "should be 23 for 1 to 10"
      (should= 23 (euler1 10)))

  (it "should find for 1 to 1000"
      (should= 233168 (euler1 1000))))

;(run-specs)
