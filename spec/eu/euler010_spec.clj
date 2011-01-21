(ns eu.euler010
  (:use [eu.euler010]
        [speclj.core]))

(describe "Project Euler problem 10"

  (it "should find the sum of primes below n"
    (should= 17 (euler010 10)))
          
  (it "should find the solution to euler010"
    (should= 142913828922 (euler010 2000000))))
