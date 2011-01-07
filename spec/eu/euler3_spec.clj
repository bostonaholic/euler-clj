(ns eu.euler3
  (:use [eu.euler3]
        [speclj.core]))

(describe "Project Euler problem 3"
  
  (it "should find the largest prime factor of 600851475143"
    (should= 6857 (euler3 600851475143))))
