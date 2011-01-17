(ns eu.euler007
  (:use [eu.euler007]
        [speclj.core]))

(describe "Project Euler problem 7"

  (it "should find the 10001st prime number"
    (should= 104743 (euler007 10001))))
