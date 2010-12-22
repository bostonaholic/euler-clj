(ns eu.euler6
  (:use [eu.euler6]
        [speclj.core]))

(describe "Project Euler problem 6"

  (it "should find the sum of squares"
      (should= 385 (sum-of-squares 10)))
          
  (it "should find the square of sums"
      (should= 3025 (square-of-sums 10)))
          
  (it "should find the square of sums less sum of squares"
      (should= 2640 (euler6 10)))
    
  (it "should solve euler 6"
      (should= 25164150 (euler6 100))))
