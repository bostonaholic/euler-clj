(ns eu.euler006
  (:use [eu.euler006]
        [speclj.core]))

(describe "Project Euler problem 6"

  (it "should find the sum of squares"
    (should= 385 (sum-of-squares 10)))
          
  (it "should find the square of sums"
    (should= 3025 (square-of-sums 10)))
          
  (it "should find the square of sums less sum of squares"
    (should= 2640 (euler006 10)))
    
  (it "should solve euler 6"
    (should= 25164150 (euler006 100))))
