(ns eu.euler0010-spec
  (:use speclj.core
        eu.euler010))

(describe "Project Euler problem 10"

  (it "should find the sum of primes below n"
    (should= 17 (euler010 10))))
